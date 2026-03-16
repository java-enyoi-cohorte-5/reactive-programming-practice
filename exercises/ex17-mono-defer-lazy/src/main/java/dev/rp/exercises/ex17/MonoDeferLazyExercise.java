package dev.rp.exercises.ex17;

import java.util.function.Supplier;
import reactor.core.publisher.Mono;

public final class MonoDeferLazyExercise {
    private MonoDeferLazyExercise() {
    }

    public static Mono<String> lazyUpper(Supplier<String> supplier) {
        throw new UnsupportedOperationException("Implement me");
    }
}
