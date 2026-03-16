# Fase 2 - Guia de Testing Reactivo

Esta guia endurece los ejercicios para resolverlos de forma declarativa usando Mono/Flux.

## Tipos de pruebas

- Unitarias reactivas con StepVerifier
- Edge cases: secuencias vacias, errores, orden de emision
- Casos parametrizados cuando aporte valor
- Validacion de completion y error signals

## Reglas pedagogicas

1. Priorizar composicion declarativa de operadores.
2. Evitar block en soluciones de produccion de ejercicios.
3. Verificar onComplete/onError explicitamente.
4. Mantener inmutabilidad y evitar estado compartido.

## Checklist de avance

- [ ] ex01-mono-just-or-empty
- [ ] ex02-flux-map-filter
- [ ] ex03-mono-flatmap-chain
- [ ] ex04-flux-filter-non-empty
- [ ] ex05-mono-on-error-resume
- [ ] ex06-flux-distinct-stable
- [ ] ex07-mono-default-if-empty
- [ ] ex08-flux-concat-values
- [ ] ex09-mono-map-transform
- [ ] ex10-flux-take-limit
- [ ] ex11-mono-switch-if-empty
- [ ] ex12-flux-skip-elements
- [ ] ex13-mono-handle-parse
- [ ] ex14-flux-buffer-batches
- [ ] ex15-mono-filter-blank
- [ ] ex16-flux-window-batches
- [ ] ex17-mono-defer-lazy
- [ ] ex18-flux-reduce-join
- [ ] ex19-mono-on-error-return
- [ ] ex20-flux-scan-running-total
- [ ] ex21-mono-timeout-fallback
- [ ] ex22-flux-group-by-initial
- [ ] ex23-mono-context-greeting
- [ ] ex24-flux-limit-rate
- [ ] ex25-mono-subscribe-on
- [ ] ex26-flux-publish-on
- [ ] ex27-imperative-to-reactive
