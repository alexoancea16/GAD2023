package FluxInReactor;

import reactor.core.publisher.Flux;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Flux<String> flux1 = FRef.emptyFlux();
        Flux<String> flux2 = FRef.fooBarFluxFromValues();
        Flux<String> flux3 = FRef.fooBarFluxFromList();
        Flux<String> flux4 = FRef.errorFlux();
        Flux<Long> flux5 = FRef.counter();
        flux1.subscribe(
                value -> System.out.println("emptyFluxExample: " + value),
                error -> System.err.println("emptyFluxExample Error: " + error),
                () -> System.out.println("Completed ! ")
        );
        flux2.subscribe(
                value -> System.out.println("fooBarFluxFromValuesExample: " + value),
                error -> System.err.println("fooBarFluxFromValuesExample Error: " + error),
                () -> System.out.println("Completed ! ")
        );
        flux3.subscribe(
                value -> System.out.println("fooBarFluxFromListExample: " + value),
                error -> System.err.println("fooBarFluxFromListExample Error: " + error),
                () -> System.out.println("Completed ! ")
        );
        flux4.subscribe(
                value -> System.out.println("errorFluxExample: " + value),
                error -> System.err.println("errorFluxExample Error: " + error),
                () -> System.out.println("Completed ! ")
        );
        flux5.subscribe(
                value -> System.out.println("counterExample: " + value),
                error -> System.err.println("counterExample Error: " + error),
                () -> System.out.println("Completed ! ")
        );
        Thread.sleep(500);
    }
}