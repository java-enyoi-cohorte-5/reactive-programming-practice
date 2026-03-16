# ex13-mono-handle-parse

## Enunciado
Implementa `parsePositive` para parsear enteros positivos.

## Reglas
- Si no se puede parsear, completar vacio.
- Si el numero es <= 0, completar vacio.

## Que practicar
- `handle`

## Teoria breve
`handle` combina transformacion y filtrado en un solo punto usando un sink manual. Es util cuando la logica no encaja limpio en `map + filter`, por ejemplo validaciones con parseo condicional.
