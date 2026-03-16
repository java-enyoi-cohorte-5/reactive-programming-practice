package dev.rp.exercises.ex22;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import reactor.core.publisher.Flux;

class FluxGroupByInitialExerciseTest {

    @Test
    void shouldGroupByInitialCharacter() {
        var result = FluxGroupByInitialExercise.groupByInitial(Flux.just("Ana", "Bob", "Alba", "Bruno", ""))
            .block();

        assertThat(result).containsKeys('a', 'b');
        assertThat(result.get('a')).containsExactly("Ana", "Alba");
        assertThat(result.get('b')).containsExactly("Bob", "Bruno");
    }
}
