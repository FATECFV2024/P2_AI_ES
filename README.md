# Prova do 2º Bimestre em Java

## Objetivo

O objetivo deste projeto é implementar duas funcionalidades principais: `fila` e `lista`. Ambas as funcionalidades devem utilizar a classe `Scanner` para ler entradas do usuário e processar os dados de acordo.


### `LISTA`

A função `lista` deve ler 5 números inteiros do `Scanner` e armazená-los em um array. Em seguida, deve imprimir os números positivos na ordem em que foram inseridos, descartando negativos e zeros.

#### Crie uma lista em Java com as seguintes características:
- Leia 5 números inteiros e, em seguida, exiba esses números na mesma ordem em que foram inseridos. Esses números podem ser apenas positivos, descartar negativos ou zero.
- Utilize a classe `Scanner` para permitir a entrada de dados no terminal.
- Imprima a lista em uma única linha contendo os 5 números, separados por um espaço, na mesma ordem em que foram lidos.

#### Entrada

A entrada será composta por 5 números inteiros, um por linha. Esses números podem ser positivos, negativos ou zero.

#### Saída

A saída deve ser uma única linha contendo os números positivos, separados por um espaço, na mesma ordem em que foram lidos.

### Exemplo 
**Entrada:**
- 1 
- -2 
- 3 
- 0 
- 5

**Saída:**
- 1 3 5

### `FILA`

A função `fila` deve definir uma fila denominada `FilaEspera` do tipo `String` com a capacidade máxima de 100 pessoas. Deve utilizar a classe `Scanner` para permitir a entrada de dados no terminal e solicitar ao usuário que insira o nome de cada pessoas. Após isso, precisa imprimir os nomes na ordem em que foram adicionados à fila.

#### Crie uma fila em Java com as seguintes características:
- Defina a fila denominada `Cidades` do tipo `String` com a capacidade máxima de 10 elementos.
- Utilize a classe `Scanner` para permitir a entrada de dados no terminal.
- Solicite ao usuário que insira o nome de uma cidade, utilizando `System.out.println();`.
- Imprima a fila após o preenchimento de todos os elementos.

#### Entrada

A entrada começa com um número inteiro n (1 ≤ n ≤ 100) representando o número de pessoas que chegam à fila. Em seguida, haverá n linhas, cada uma contendo o nome de uma pessoa que chegou à fila. O nome de cada pessoa será uma string com até 100 caracteres e pode conter espaços.

#### Saída

deve imprimir os nomes das pessoas na ordem em que chegaram à fila, iniciando com a palavra "Inicio->" e separados por um espaço.

### Exemplo 

**Entrada:**
- 5
- Ana
- Carlos
- Beatriz
- Douglas
- Felipe


**Saída:**
- Inicio->Ana Carlos Beatriz Douglas Felipe


