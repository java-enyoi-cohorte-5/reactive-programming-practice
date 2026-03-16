# ex01-mono-just-or-empty

## Enunciado
Implementa `resolveName` para normalizar un nombre en `Mono`.

## Reglas
- Si el `Mono` esta vacio, retornar `anonymous`.
- Si trae texto en blanco, tambien retornar `anonymous`.
- Si trae valor, aplicar `trim` y retornar el resultado.

## Que practicar
- `Mono` de un solo valor.
- `map`, `filter`, `switchIfEmpty`.

## Teoria breve
`Mono` modela una respuesta de 0 o 1 elemento, ideal para operaciones como buscar un usuario o resolver un valor opcional. `switchIfEmpty` permite definir una alternativa cuando no llega dato, evitando `null` y flujos imperativos.
