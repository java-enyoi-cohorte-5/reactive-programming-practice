package dev.rp.exercises.ex21;

import java.time.Duration;
import reactor.core.publisher.Mono;

public final class MonoTimeoutFallbackExercise {
    private MonoTimeoutFallbackExercise() {
    }

    public static Mono<String> withTimeout(Mono<String> source, Duration timeout, String fallback) {
        throw new UnsupportedOperationException("Implement me");
    }
}
