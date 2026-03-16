# ex02-flux-map-filter

## Enunciado
Implementa `normalize` para limpiar y transformar un `Flux<String>`.

## Reglas
- Aplicar `trim` a cada elemento.
- Filtrar vacios.
- Convertir a mayusculas.

## Que practicar
- `map`
- `filter`
- pipeline reactivo

## Teoria breve
`Flux` representa una secuencia de 0..N elementos. `map` transforma cada emision sin cambiar cardinalidad y `filter` elimina elementos por una condicion, formando pipelines declarativos faciles de componer.
