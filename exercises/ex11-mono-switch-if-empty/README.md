# ex11-mono-switch-if-empty

## Enunciado
Implementa `ensureValue` para conmutar a un fallback cuando no haya valor.

## Reglas
- Si `input` tiene valor no vacio, devolverlo con trim.
- Si queda vacio, usar `Mono.just("fallback")`.

## Que practicar
- `switchIfEmpty`

## Teoria breve
`switchIfEmpty` cambia a otro publisher cuando la fuente no emite nada. A diferencia de `defaultIfEmpty`, aqui puedes ejecutar logica alternativa completa, incluso asincrona.
