package dev.rp.exercises.ex02;

import org.junit.jupiter.api.Test;
import reactor.core.publisher.Flux;
import reactor.test.StepVerifier;

class FluxMapFilterExerciseTest {

    @Test
    void shouldTrimFilterAndUppercase() {
        StepVerifier.create(FluxMapFilterExercise.normalize(Flux.just("  a", "", " b ", " ")))
            .expectNext("A", "B")
            .verifyComplete();
    }
}
