# ex05-mono-on-error-resume

## Enunciado
Implementa `safeParseInt` para parsear enteros sin romper el flujo.

## Reglas
- Si el parseo funciona, emitir el valor.
- Si falla, emitir `-1`.

## Que practicar
- `map`
- `onErrorResume`

## Teoria breve
En Reactor los errores son senales del flujo. `onErrorResume` permite recuperar con un flujo alternativo y mantener resiliencia sin `try/catch` disperso por todo el codigo.
