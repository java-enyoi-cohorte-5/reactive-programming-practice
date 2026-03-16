package dev.rp.exercises.ex12;

import org.junit.jupiter.api.Test;
import reactor.core.publisher.Flux;
import reactor.test.StepVerifier;

class FluxSkipElementsExerciseTest {

    @Test
    void shouldSkipFirstTwoElements() {
        StepVerifier.create(FluxSkipElementsExercise.skipFirstTwo(Flux.just("a", "b", "c", "d")))
            .expectNext("c", "d")
            .verifyComplete();
    }
}
