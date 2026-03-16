package dev.rp.exercises.ex26;

import org.junit.jupiter.api.Test;
import reactor.core.publisher.Flux;
import reactor.test.StepVerifier;

class FluxPublishOnExerciseTest {

    @Test
    void shouldUppercaseAllValues() {
        StepVerifier.create(FluxPublishOnExercise.publishOnParallelUpper(Flux.just("a", "b", "c")))
            .expectNext("A", "B", "C")
            .verifyComplete();
    }
}
