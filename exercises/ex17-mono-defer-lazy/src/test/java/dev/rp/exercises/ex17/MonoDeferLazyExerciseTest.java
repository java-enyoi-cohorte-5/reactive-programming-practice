package dev.rp.exercises.ex17;

import java.util.concurrent.atomic.AtomicInteger;
import org.junit.jupiter.api.Test;
import reactor.test.StepVerifier;

class MonoDeferLazyExerciseTest {

    @Test
    void shouldBeLazyUntilSubscription() {
        AtomicInteger calls = new AtomicInteger(0);

        var mono = MonoDeferLazyExercise.lazyUpper(() -> {
            calls.incrementAndGet();
            return "reactive";
        });

        org.assertj.core.api.Assertions.assertThat(calls.get()).isZero();

        StepVerifier.create(mono)
            .expectNext("REACTIVE")
            .verifyComplete();

        org.assertj.core.api.Assertions.assertThat(calls.get()).isEqualTo(1);
    }
}
