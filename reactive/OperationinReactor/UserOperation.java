package OperationinReactor;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
public class UserOperation {
    public static void main(String[] args) {
        // Test the methods
        User user = new User("john", "doe", "johndoe");
        Mono<User> mono = Mono.just(user);
        Flux<User> flux = Flux.just(user);

        capitalizeOne(mono).subscribe(System.out::println);
        capitalizeMany(flux).subscribe(System.out::println);
        asyncCapitalizeMany(flux).subscribe(System.out::println);
    }


    static Mono<User> capitalizeOne(Mono<User> mono) {
        return mono.map(user -> new User(
                capitalizeString(user.getFirstName()),
                capitalizeString(user.getLastName()),
                capitalizeString(user.getUsername())
        ));
    }

    static Flux<User> capitalizeMany(Flux<User> flux) {
        return flux.map(user -> new User(
                capitalizeString(user.getFirstName()),
                capitalizeString(user.getLastName()),
                capitalizeString(user.getUsername())
        ));
    }
    static Flux<User> asyncCapitalizeMany(Flux<User> flux) {
        return flux.flatMapSequential(user -> asyncCapitalizeUser(user));
    }

    static Mono<User> asyncCapitalizeUser(User user) {
        return Mono.fromCallable(() -> new User(
                capitalizeString(user.getFirstName()),
                capitalizeString(user.getLastName()),
                capitalizeString(user.getUsername())
        ));
    }

    static String capitalizeString(String str) {
        return str.substring(0, 1).toUpperCase() + str.substring(1);
    }
}
