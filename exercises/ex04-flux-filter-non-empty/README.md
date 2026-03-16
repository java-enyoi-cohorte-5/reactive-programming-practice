# ex04-flux-filter-non-empty

## Enunciado
Implementa `keepNonEmpty` para conservar solo valores utiles.

## Reglas
- Hacer `trim`.
- Eliminar strings vacios.

## Que practicar
- `filter`
- limpieza de flujo de datos

## Teoria breve
Filtrar temprano en el pipeline reduce trabajo innecesario y ruido en etapas posteriores. En sistemas reactivos esto mejora legibilidad y reduce procesamiento de eventos no validos.
