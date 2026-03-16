package dev.rp.exercises.ex14;

import org.junit.jupiter.api.Test;
import reactor.core.publisher.Flux;
import reactor.test.StepVerifier;

class FluxBufferBatchesExerciseTest {

    @Test
    void shouldBatchInPairs() {
        StepVerifier.create(FluxBufferBatchesExercise.batchToCsv(Flux.just("a", "b", "c", "d")))
            .expectNext("a,b", "c,d")
            .verifyComplete();
    }
}
