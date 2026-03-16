package dev.rp.exercises.ex03;

import org.junit.jupiter.api.Test;
import reactor.core.publisher.Mono;
import reactor.test.StepVerifier;

class MonoFlatMapChainExerciseTest {

    @Test
    void shouldCreateSlug() {
        StepVerifier.create(MonoFlatMapChainExercise.toSlug(Mono.just("  Hello Reactor World  ")))
            .expectNext("hello-reactor-world")
            .verifyComplete();
    }
}
