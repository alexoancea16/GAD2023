package FluxInReactor;

import reactor.core.publisher.Flux;
import java.time.Duration;
import java.util.Arrays;
import java.util.List;

public  class FRef {
    // TODO Return an empty Flux
    static Flux<String> emptyFlux() {
        return Flux.empty();
    }

    // TODO Return a Flux that contains 2 values "foo" and "bar" without using an array or a collection
    static Flux<String> fooBarFluxFromValues() {
        return Flux.just("foo", "bar");
    }

// TODO Create a Flux from a List that contains 2 values "foo" and "bar"
    static Flux<String> fooBarFluxFromList() {
        List<String> list = Arrays.asList("foo", "bar");
        return Flux.fromIterable(list);
    }

// TODO Create a Flux that emits an IllegalStateException
    static Flux<String> errorFlux() {
        return Flux.error(new IllegalStateException("Illegal state"));
    }

// TODO Create a Flux that emits increasing values from 0 to 9 each 100ms
    static Flux<Long> counter() {
        return Flux.interval(Duration.ofMillis(100))
                .take(10);
    }
}
