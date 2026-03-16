package dev.rp.exercises.ex15;

import reactor.core.publisher.Mono;

public final class MonoFilterBlankExercise {
    private MonoFilterBlankExercise() {
    }

    public static Mono<String> nonBlank(Mono<String> input) {
        throw new UnsupportedOperationException("Implement me");
    }
}
