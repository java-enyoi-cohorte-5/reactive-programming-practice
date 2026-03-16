package dev.rp.exercises.ex12;

import reactor.core.publisher.Flux;

public final class FluxSkipElementsExercise {
    private FluxSkipElementsExercise() {
    }

    public static Flux<String> skipFirstTwo(Flux<String> input) {
        throw new UnsupportedOperationException("Implement me");
    }
}
