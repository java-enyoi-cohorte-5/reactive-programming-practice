package dev.rp.exercises.ex21;

import java.time.Duration;
import org.junit.jupiter.api.Test;
import reactor.core.publisher.Mono;
import reactor.test.StepVerifier;

class MonoTimeoutFallbackExerciseTest {

    @Test
    void shouldFallbackOnTimeout() {
        StepVerifier.withVirtualTime(() -> MonoTimeoutFallbackExercise.withTimeout(Mono.never(), Duration.ofSeconds(3), "fallback"))
            .thenAwait(Duration.ofSeconds(3))
            .expectNext("fallback")
            .verifyComplete();
    }

    @Test
    void shouldPassThroughWhenFastEnough() {
        StepVerifier.withVirtualTime(() -> MonoTimeoutFallbackExercise.withTimeout(Mono.delay(Duration.ofSeconds(1)).map(i -> "ok"), Duration.ofSeconds(3), "fallback"))
            .thenAwait(Duration.ofSeconds(1))
            .expectNext("ok")
            .verifyComplete();
    }
}
