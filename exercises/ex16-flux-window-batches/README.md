# ex16-flux-window-batches

## Enunciado
Implementa `windowToCsv` usando ventanas de 2 elementos.

## Que practicar
- `window`
- `concatMap`

## Teoria breve
`window(n)` crea subflujos (`Flux<Flux<T>>`) en lugar de listas como `buffer`. Esto permite procesar cada lote de manera reactiva, conservando composicion y backpressure.
