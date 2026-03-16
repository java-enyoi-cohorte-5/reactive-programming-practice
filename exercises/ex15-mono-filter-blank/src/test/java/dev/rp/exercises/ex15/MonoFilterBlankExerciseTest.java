package dev.rp.exercises.ex15;

import org.junit.jupiter.api.Test;
import reactor.core.publisher.Mono;
import reactor.test.StepVerifier;

class MonoFilterBlankExerciseTest {

    @Test
    void shouldEmitWhenNotBlank() {
        StepVerifier.create(MonoFilterBlankExercise.nonBlank(Mono.just("  ok  ")))
            .expectNext("ok")
            .verifyComplete();
    }

    @Test
    void shouldCompleteWhenBlank() {
        StepVerifier.create(MonoFilterBlankExercise.nonBlank(Mono.just("   ")))
            .verifyComplete();
    }
}
