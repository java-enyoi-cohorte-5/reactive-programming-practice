package dev.rp.exercises.ex24;

import reactor.core.publisher.Flux;

public final class FluxLimitRateExercise {
    private FluxLimitRateExercise() {
    }

    public static Flux<Integer> limitRatePassThrough(Flux<Integer> input) {
        throw new UnsupportedOperationException("Implement me");
    }
}
