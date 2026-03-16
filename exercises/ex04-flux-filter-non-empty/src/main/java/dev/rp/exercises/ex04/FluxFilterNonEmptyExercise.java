package dev.rp.exercises.ex04;

import reactor.core.publisher.Flux;

public final class FluxFilterNonEmptyExercise {
    private FluxFilterNonEmptyExercise() {
    }

    public static Flux<String> keepNonEmpty(Flux<String> input) {
        throw new UnsupportedOperationException("Implement me");
    }
}
