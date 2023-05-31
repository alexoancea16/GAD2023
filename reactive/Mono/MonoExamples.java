package Mono;
import reactor.core.publisher.Mono;
public class MonoExamples {
    public static void main(String[] args) {
        Mono<String> empty = emptyMono();
        empty.subscribe(
                value -> System.out.println("Empty Mono value: " + value),
                error -> System.err.println("Empty Mono error: " + error),
                () -> System.out.println("Empty Mono completed")
        );

        Mono<String> noSignal = monoWithNoSignal();
        noSignal.subscribe(
                value -> System.out.println("No Signal Mono value: " + value),
                error -> System.err.println("No Signal Mono error: " + error),
                () -> System.out.println("No Signal Mono completed")
        );

        Mono<String> foo = fooMono();
        foo.subscribe(
                value -> System.out.println("Foo Mono value: " + value),
                error -> System.err.println("Foo Mono error: " + error),
                () -> System.out.println("Foo Mono completed")
        );
    }

    // TODO Return an empty Mono
    static Mono<String> emptyMono() {
        return Mono.empty();
    }

    // TODO Return a Mono that never emits any signal
    static Mono<String> monoWithNoSignal() {
        return Mono.never();
    }

    // TODO Return a Mono that contains a "foo" value
    static Mono<String> fooMono() {
        return Mono.just("foo");
    }

    // TODO Create a Mono that emits an IllegalStateException
    static Mono<String> errorMono() {
        return Mono.error(new IllegalStateException("Example error"));
    }
}
