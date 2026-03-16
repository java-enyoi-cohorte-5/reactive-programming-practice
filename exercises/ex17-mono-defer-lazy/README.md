# ex17-mono-defer-lazy

## Enunciado
Implementa `lazyUpper` para ejecutar la conversion de forma lazy.

## Reglas
- Recibe un `Supplier<String>`.
- Debe ejecutarse solo al suscribirse.

## Que practicar
- `Mono.defer`
- lazy evaluation

## Teoria breve
Reactor es lazy por naturaleza: no ejecuta hasta suscripcion. `Mono.defer` garantiza crear una fuente nueva por suscriptor, util cuando el valor debe calcularse en tiempo de consumo.
