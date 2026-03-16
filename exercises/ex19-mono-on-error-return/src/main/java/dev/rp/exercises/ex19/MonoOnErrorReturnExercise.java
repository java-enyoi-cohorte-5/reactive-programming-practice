package dev.rp.exercises.ex19;

import reactor.core.publisher.Mono;

public final class MonoOnErrorReturnExercise {
    private MonoOnErrorReturnExercise() {
    }

    public static Mono<Integer> safeDivide(Mono<Integer> dividend, int divisor) {
        throw new UnsupportedOperationException("Implement me");
    }
}
