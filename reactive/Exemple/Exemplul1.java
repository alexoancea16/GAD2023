package Exemple;

import reactor.core.publisher.Flux;

import java.time.Duration;

public class Exemplul1 {
    public static void main(String[] args) throws InterruptedException {
        Flux.interval(Duration.ofMillis(250))
                .map(input -> {
                    if (input < 3)
                        return "tick" + input;
                    throw new RuntimeException("boom");
                })
                .retry(1)
                .onErrorReturn("error occurred")
                .elapsed()
                .subscribe(System.out::println, System.err::println);

        Thread.sleep(3000);
    }
}
