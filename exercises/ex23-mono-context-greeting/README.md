# ex23-mono-context-greeting

## Enunciado
Implementa `greetWithContext` para leer un prefijo desde Reactor Context.

## Reglas
- Si existe clave `prefix`, usarla.
- Si no existe, usar `Hi`.

## Que practicar
- `deferContextual`
- Reactor Context

## Teoria breve
Reactor Context permite pasar metadatos por suscripcion (por ejemplo trazas, tenant, auth) sin contaminar firmas de metodos. `deferContextual` lee ese contexto en el momento de ejecucion.
