package dev.rp.exercises.ex23;

import reactor.core.publisher.Mono;

public final class MonoContextGreetingExercise {
    private MonoContextGreetingExercise() {
    }

    public static Mono<String> greetWithContext(Mono<String> name) {
        throw new UnsupportedOperationException("Implement me");
    }
}
