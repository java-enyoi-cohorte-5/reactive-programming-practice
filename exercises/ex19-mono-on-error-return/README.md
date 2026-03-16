# ex19-mono-on-error-return

## Enunciado
Implementa `safeDivide` para dividir con fallback seguro.

## Reglas
- Si divisor es 0, emitir 0.
- Si no, emitir resultado de la division.

## Que practicar
- `onErrorReturn`

## Teoria breve
`onErrorReturn` recupera de cualquier error con un valor fijo. Es la opcion mas simple de resiliencia cuando el fallback no requiere logica adicional.
