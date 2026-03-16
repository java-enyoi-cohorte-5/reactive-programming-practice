package dev.rp.exercises.ex01;

import org.junit.jupiter.api.Test;
import reactor.core.publisher.Mono;
import reactor.test.StepVerifier;

class MonoJustOrEmptyExerciseTest {

    @Test
    void shouldTrimWhenValueExists() {
        StepVerifier.create(MonoJustOrEmptyExercise.resolveName(Mono.just("  Ana  ")))
            .expectNext("Ana")
            .verifyComplete();
    }

    @Test
    void shouldReturnAnonymousWhenEmpty() {
        StepVerifier.create(MonoJustOrEmptyExercise.resolveName(Mono.empty()))
            .expectNext("anonymous")
            .verifyComplete();
    }

    @Test
    void shouldReturnAnonymousWhenBlank() {
        StepVerifier.create(MonoJustOrEmptyExercise.resolveName(Mono.just("   ")))
            .expectNext("anonymous")
            .verifyComplete();
    }
}
