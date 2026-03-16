# ex26-flux-publish-on

## Enunciado
Implementa `publishOnParallelUpper` para cambiar scheduler y transformar datos.

## Que practicar
- `publishOn`

## Teoria breve
`publishOn` cambia el scheduler desde el punto donde se declara hacia abajo (downstream). Permite separar etapas del pipeline en diferentes pools de ejecucion.
