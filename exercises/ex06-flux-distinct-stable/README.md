# ex06-flux-distinct-stable

## Enunciado
Implementa `uniqueInOrder` para eliminar duplicados manteniendo orden de llegada.

## Reglas
- Mantener la primera aparicion de cada valor.
- Preservar orden.

## Que practicar
- `distinct`

## Teoria breve
`distinct` elimina repetidos usando estado interno y conserva el orden de emision. Es util para normalizar eventos duplicados en streams donde importa la primera ocurrencia.
