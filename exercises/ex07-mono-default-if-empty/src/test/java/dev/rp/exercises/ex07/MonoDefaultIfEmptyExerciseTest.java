package dev.rp.exercises.ex07;

import org.junit.jupiter.api.Test;
import reactor.core.publisher.Mono;
import reactor.test.StepVerifier;

class MonoDefaultIfEmptyExerciseTest {

    @Test
    void shouldReturnInputWhenPresent() {
        StepVerifier.create(MonoDefaultIfEmptyExercise.greeting(Mono.just("  hola  ")))
            .expectNext("hola")
            .verifyComplete();
    }

    @Test
    void shouldReturnDefaultWhenBlank() {
        StepVerifier.create(MonoDefaultIfEmptyExercise.greeting(Mono.just("   ")))
            .expectNext("hola-reactive")
            .verifyComplete();
    }
}
