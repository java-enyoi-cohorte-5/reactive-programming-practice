# Reactive Programming Practice in Java

Curso practico estilo Exercism con 27 ejercicios para dominar Project Reactor usando Mono y Flux.

## Objetivo

Practicar programacion reactiva idiomatica en Java usando:
- Mono y Flux
- Transformaciones con map, filter, flatMap
- Manejo de errores reactivo
- Composicion y operadores avanzados
- Testing con StepVerifier

## Ruta de aprendizaje

- Fundamentos (ex01 a ex10)
- Intermedio (ex11 a ex18)
- Avanzado (ex19 a ex27)

## Mini-curso rapido de Reactor

1. Mono representa 0..1 elementos y Flux representa 0..N elementos.
2. Un pipeline reactivo describe transformaciones y no ejecuta nada hasta suscribirse.
3. `StepVerifier` permite validar emisiones (`onNext`) y terminaciones (`onComplete`/`onError`).
4. Operadores clave: `map`, `filter`, `flatMap`, `switchIfEmpty`, `onErrorResume`, `buffer`, `window`, `scan`, `timeout`.
5. Concurrencia reactiva se controla con `subscribeOn` y `publishOn`.

## Como ejecutar

```bash
./gradlew test
```

Ejecutar solo un ejercicio:

```bash
./gradlew :ex01-mono-just-or-empty:test
```

Script de verificacion global:

```bash
./verify_reactive.sh
```

Script de verificacion por modulo:

```bash
./verify_reactive.sh ex14-flux-buffer-batches
```

## Ejercicios

Ver indice completo en exercises/README.md.

### Fundamentos

1. `ex01-mono-just-or-empty` - `switchIfEmpty` para defaults
2. `ex02-flux-map-filter` - limpieza con `map` y `filter`
3. `ex03-mono-flatmap-chain` - composicion con `flatMap`
4. `ex04-flux-filter-non-empty` - filtrado declarativo
5. `ex05-mono-on-error-resume` - fallback con `onErrorResume`
6. `ex06-flux-distinct-stable` - deduplicacion estable
7. `ex07-mono-default-if-empty` - defaults con `defaultIfEmpty`
8. `ex08-flux-concat-values` - secuencias con `concatWithValues`
9. `ex09-mono-map-transform` - transformaciones puras
10. `ex10-flux-take-limit` - limitacion con `take`
 .
#.## Intermedio

11. `ex11-mono-switch-if-empty` - alternar fuente con `switchIfEmpty`
12. `ex12-flux-skip-elements` - desplazamiento con `skip`
13. `ex13-mono-handle-parse` - control fino de emision con `handle`
14. `ex14-flux-buffer-batches` - batching con `buffer`
15. `ex15-mono-filter-blank` - filtrado de valores invalidos
16. `ex16-flux-window-batches` - ventanas con `window`
17. `ex17-mono-defer-lazy` - evaluacion lazy con `defer`
18. `ex18-flux-reduce-join` - reduccion con `reduce`
  .
### Avanzado

19. `ex19-mono-on-error-return` - recuperacion simple con `onErrorReturn`
20. `ex20-flux-scan-running-total` - acumulados con `scan`
21. `ex21-mono-timeout-fallback` - tiempo y fallback con `timeout`
22. `ex22-flux-group-by-initial` - agrupacion con `groupBy`
23. `ex23-mono-context-greeting` - metadata con Reactor Context
24. `ex24-flux-limit-rate` - control de demanda con `limitRate`
25. `ex25-mono-subscribe-on` - scheduler de suscripcion
26. `ex26-flux-publish-on` - scheduler de procesamiento
27ex27-imperative-to-reactive` - refactor declarativo end-to-end
