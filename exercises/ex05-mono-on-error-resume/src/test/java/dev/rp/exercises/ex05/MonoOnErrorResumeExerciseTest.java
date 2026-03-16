package dev.rp.exercises.ex05;

import org.junit.jupiter.api.Test;
import reactor.core.publisher.Mono;
import reactor.test.StepVerifier;

class MonoOnErrorResumeExerciseTest {

    @Test
    void shouldParseSuccessfully() {
        StepVerifier.create(MonoOnErrorResumeExercise.safeParseInt(Mono.just("42")))
            .expectNext(42)
            .verifyComplete();
    }

    @Test
    void shouldFallbackToMinusOneOnError() {
        StepVerifier.create(MonoOnErrorResumeExercise.safeParseInt(Mono.just("oops")))
            .expectNext(-1)
            .verifyComplete();
    }
}
