package dev.rp.exercises.ex19;

import org.junit.jupiter.api.Test;
import reactor.core.publisher.Mono;
import reactor.test.StepVerifier;

class MonoOnErrorReturnExerciseTest {

    @Test
    void shouldDivideWhenValid() {
        StepVerifier.create(MonoOnErrorReturnExercise.safeDivide(Mono.just(8), 2))
            .expectNext(4)
            .verifyComplete();
    }

    @Test
    void shouldReturnZeroWhenDivisionFails() {
        StepVerifier.create(MonoOnErrorReturnExercise.safeDivide(Mono.just(8), 0))
            .expectNext(0)
            .verifyComplete();
    }
}
