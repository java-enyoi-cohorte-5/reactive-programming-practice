package dev.rp.exercises.ex16;

import org.junit.jupiter.api.Test;
import reactor.core.publisher.Flux;
import reactor.test.StepVerifier;

class FluxWindowBatchesExerciseTest {

    @Test
    void shouldWindowInPairs() {
        StepVerifier.create(FluxWindowBatchesExercise.windowToCsv(Flux.just("a", "b", "c", "d")))
            .expectNext("a,b", "c,d")
            .verifyComplete();
    }
}
