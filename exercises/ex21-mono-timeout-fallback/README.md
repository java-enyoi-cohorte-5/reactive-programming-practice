# ex21-mono-timeout-fallback

## Enunciado
Implementa `withTimeout` para aplicar timeout con fallback.

## Reglas
- Si la fuente tarda mas que el timeout, devolver `fallback`.

## Que practicar
- `timeout`
- `StepVerifier.withVirtualTime`

## Teoria breve
`timeout` corta esperas largas y evita bloquear flujos indefinidamente. Con `withVirtualTime` puedes probar comportamiento temporal de forma determinista sin esperar tiempo real.
