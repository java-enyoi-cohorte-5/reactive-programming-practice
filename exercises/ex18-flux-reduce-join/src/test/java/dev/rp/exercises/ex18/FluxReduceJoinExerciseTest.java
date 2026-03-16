package dev.rp.exercises.ex18;

import org.junit.jupiter.api.Test;
import reactor.core.publisher.Flux;
import reactor.test.StepVerifier;

class FluxReduceJoinExerciseTest {

    @Test
    void shouldJoinWithDash() {
        StepVerifier.create(FluxReduceJoinExercise.joinWithDash(Flux.just("a", "b", "c")))
            .expectNext("a-b-c")
            .verifyComplete();
    }
}
