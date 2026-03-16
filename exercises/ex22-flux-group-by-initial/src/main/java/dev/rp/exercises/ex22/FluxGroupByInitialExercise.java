package dev.rp.exercises.ex22;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public final class FluxGroupByInitialExercise {
    private FluxGroupByInitialExercise() {
    }

    public static Mono<Map<Character, List<String>>> groupByInitial(Flux<String> input) {
        throw new UnsupportedOperationException("Implement me");
    }
}
