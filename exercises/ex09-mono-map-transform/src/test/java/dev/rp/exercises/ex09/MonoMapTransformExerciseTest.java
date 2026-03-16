package dev.rp.exercises.ex09;

import org.junit.jupiter.api.Test;
import reactor.core.publisher.Mono;
import reactor.test.StepVerifier;

class MonoMapTransformExerciseTest {

    @Test
    void shouldDecorateUser() {
        StepVerifier.create(MonoMapTransformExercise.decorate(Mono.just("  lucia  ")))
            .expectNext("USER:LUCIA")
            .verifyComplete();
    }
}
