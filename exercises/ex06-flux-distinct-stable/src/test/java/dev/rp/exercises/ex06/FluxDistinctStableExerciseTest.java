package dev.rp.exercises.ex06;

import org.junit.jupiter.api.Test;
import reactor.core.publisher.Flux;
import reactor.test.StepVerifier;

class FluxDistinctStableExerciseTest {

    @Test
    void shouldKeepFirstAppearanceOnly() {
        StepVerifier.create(FluxDistinctStableExercise.uniqueInOrder(Flux.just("a", "b", "a", "c", "b")))
            .expectNext("a", "b", "c")
            .verifyComplete();
    }
}
