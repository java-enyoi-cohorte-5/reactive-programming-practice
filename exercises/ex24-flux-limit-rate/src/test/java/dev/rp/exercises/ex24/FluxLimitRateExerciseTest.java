package dev.rp.exercises.ex24;

import org.junit.jupiter.api.Test;
import reactor.core.publisher.Flux;
import reactor.test.StepVerifier;

class FluxLimitRateExerciseTest {

    @Test
    void shouldEmitAllValuesInOrder() {
        StepVerifier.create(FluxLimitRateExercise.limitRatePassThrough(Flux.just(1, 2, 3, 4, 5)))
            .expectNext(1, 2, 3, 4, 5)
            .verifyComplete();
    }
}
