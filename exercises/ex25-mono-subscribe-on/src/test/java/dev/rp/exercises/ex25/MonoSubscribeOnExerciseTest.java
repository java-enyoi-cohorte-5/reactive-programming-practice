package dev.rp.exercises.ex25;

import org.junit.jupiter.api.Test;
import reactor.core.publisher.Mono;
import reactor.test.StepVerifier;

class MonoSubscribeOnExerciseTest {

    @Test
    void shouldUppercaseValue() {
        StepVerifier.create(MonoSubscribeOnExercise.asyncUpper(Mono.just("reactor")))
            .expectNext("REACTOR")
            .verifyComplete();
    }
}
