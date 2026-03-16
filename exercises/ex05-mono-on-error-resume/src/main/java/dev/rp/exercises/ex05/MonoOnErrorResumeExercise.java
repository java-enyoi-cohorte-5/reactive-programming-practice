package dev.rp.exercises.ex05;

import reactor.core.publisher.Mono;

public final class MonoOnErrorResumeExercise {
    private MonoOnErrorResumeExercise() {
    }

    public static Mono<Integer> safeParseInt(Mono<String> input) {
        throw new UnsupportedOperationException("Implement me");
    }
}
