package dev.rp.exercises.ex20;

import org.junit.jupiter.api.Test;
import reactor.core.publisher.Flux;
import reactor.test.StepVerifier;

class FluxScanRunningTotalExerciseTest {

    @Test
    void shouldEmitRunningTotals() {
        StepVerifier.create(FluxScanRunningTotalExercise.runningTotal(Flux.just(1, 2, 3, 4)))
            .expectNext(1, 3, 6, 10)
            .verifyComplete();
    }
}
