# ex07-mono-default-if-empty

## Enunciado
Implementa `greeting` para generar un saludo por defecto.

## Reglas
- Aplicar `trim`.
- Si queda vacio, devolver `hola-reactive`.

## Que practicar
- `filter`
- `defaultIfEmpty`

## Teoria breve
`defaultIfEmpty` agrega un valor de respaldo cuando la fuente termina sin emisiones. Es ideal para defaults simples cuando no necesitas construir otro publisher completo.
