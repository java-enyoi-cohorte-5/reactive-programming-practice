package dev.rp.exercises.ex27;

import org.junit.jupiter.api.Test;
import reactor.core.publisher.Flux;
import reactor.test.StepVerifier;

class ImperativeToReactiveExerciseTest {

    @Test
    void shouldParseFilterEvenAndDouble() {
        StepVerifier.create(ImperativeToReactiveExercise.parseFilterDouble(Flux.just("1", "2", "x", "4", "7")))
            .expectNext(4, 8)
            .verifyComplete();
    }
}
