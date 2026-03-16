# ex03-mono-flatmap-chain

## Enunciado
Implementa `toSlug` para transformar texto en slug.

## Reglas
- Aplicar `trim`.
- Pasar a minusculas.
- Reemplazar espacios internos por `-`.

## Que practicar
- `flatMap`
- composicion en `Mono`

## Teoria breve
`flatMap` se usa cuando una transformacion ya retorna un publisher (`Mono` o `Flux`). Evita estructuras anidadas como `Mono<Mono<T>>` y permite encadenar pasos asincronos de manera limpia.
