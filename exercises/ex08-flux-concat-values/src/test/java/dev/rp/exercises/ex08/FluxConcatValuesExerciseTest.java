package dev.rp.exercises.ex08;

import org.junit.jupiter.api.Test;
import reactor.core.publisher.Flux;
import reactor.test.StepVerifier;

class FluxConcatValuesExerciseTest {

    @Test
    void shouldAppendDoneToken() {
        StepVerifier.create(FluxConcatValuesExercise.appendDone(Flux.just("A", "B")))
            .expectNext("A", "B", "DONE")
            .verifyComplete();
    }
}
