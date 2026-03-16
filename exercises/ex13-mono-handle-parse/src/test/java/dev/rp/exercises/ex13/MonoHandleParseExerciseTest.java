package dev.rp.exercises.ex13;

import org.junit.jupiter.api.Test;
import reactor.core.publisher.Mono;
import reactor.test.StepVerifier;

class MonoHandleParseExerciseTest {

    @Test
    void shouldEmitPositiveInteger() {
        StepVerifier.create(MonoHandleParseExercise.parsePositive(Mono.just("9")))
            .expectNext(9)
            .verifyComplete();
    }

    @Test
    void shouldCompleteEmptyForInvalid() {
        StepVerifier.create(MonoHandleParseExercise.parsePositive(Mono.just("oops")))
            .verifyComplete();
    }
}
