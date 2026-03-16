package dev.rp.exercises.ex10;

import org.junit.jupiter.api.Test;
import reactor.core.publisher.Flux;
import reactor.test.StepVerifier;

class FluxTakeLimitExerciseTest {

    @Test
    void shouldEmitOnlyFirstThree() {
        StepVerifier.create(FluxTakeLimitExercise.firstThree(Flux.just("a", "b", "c", "d", "e")))
            .expectNext("a", "b", "c")
            .verifyComplete();
    }
}
