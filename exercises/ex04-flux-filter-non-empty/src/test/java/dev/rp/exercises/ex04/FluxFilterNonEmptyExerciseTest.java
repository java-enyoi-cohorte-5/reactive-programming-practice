package dev.rp.exercises.ex04;

import org.junit.jupiter.api.Test;
import reactor.core.publisher.Flux;
import reactor.test.StepVerifier;

class FluxFilterNonEmptyExerciseTest {

    @Test
    void shouldKeepOnlyNonEmptyValues() {
        StepVerifier.create(FluxFilterNonEmptyExercise.keepNonEmpty(Flux.just("x", " ", "y", "")))
            .expectNext("x", "y")
            .verifyComplete();
    }
}
