package dev.rp.exercises.ex11;

import org.junit.jupiter.api.Test;
import reactor.core.publisher.Mono;
import reactor.test.StepVerifier;

class MonoSwitchIfEmptyExerciseTest {

    @Test
    void shouldReturnInputWhenPresent() {
        StepVerifier.create(MonoSwitchIfEmptyExercise.ensureValue(Mono.just("  x  ")))
            .expectNext("x")
            .verifyComplete();
    }

    @Test
    void shouldSwitchToFallbackWhenEmpty() {
        StepVerifier.create(MonoSwitchIfEmptyExercise.ensureValue(Mono.empty()))
            .expectNext("fallback")
            .verifyComplete();
    }
}
