package dev.rp.exercises.ex07;

import reactor.core.publisher.Mono;

public final class MonoDefaultIfEmptyExercise {
    private MonoDefaultIfEmptyExercise() {
    }

    public static Mono<String> greeting(Mono<String> input) {
        throw new UnsupportedOperationException("Implement me");
    }
}
