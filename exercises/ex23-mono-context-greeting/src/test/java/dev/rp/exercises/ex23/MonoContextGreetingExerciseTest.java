package dev.rp.exercises.ex23;

import org.junit.jupiter.api.Test;
import reactor.core.publisher.Mono;
import reactor.test.StepVerifier;

class MonoContextGreetingExerciseTest {

    @Test
    void shouldUseDefaultPrefixWhenMissing() {
        StepVerifier.create(MonoContextGreetingExercise.greetWithContext(Mono.just("Lia")))
            .expectNext("Hi Lia")
            .verifyComplete();
    }

    @Test
    void shouldUsePrefixFromContext() {
        StepVerifier.create(MonoContextGreetingExercise.greetWithContext(Mono.just("Lia")).contextWrite(ctx -> ctx.put("prefix", "Hola")))
            .expectNext("Hola Lia")
            .verifyComplete();
    }
}
