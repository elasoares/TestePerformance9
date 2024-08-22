# Cadeira: Desenvolvimento de Serviços Web e Testes com Java
## Teste performance 1

### Exercício 9: Classe `Aluno` e Teste de Unidade

### Descrição

Neste exercício, você deve criar uma classe `Aluno` em Java, que terá como atributos a matrícula, o nome e duas notas. Além disso, será necessário desenvolver uma classe de testes para verificar a validade do atributo `matricula`.

### Objetivo

O objetivo principal é garantir que, ao definir a matrícula de um aluno, o valor atribuído seja maior que zero. Caso o valor seja inválido, o método responsável por definir a matrícula deve lançar uma exceção, que será tratada e testada na classe de testes.

### Especificações

1. **Classe `Aluno`**:
   - A classe deve conter os atributos `matricula`, `nome`, e duas notas (`nota1` e `nota2`).
   - O método `setMatricula` deve validar se o valor da matrícula é maior que zero.
   - Se o valor da matrícula for inválido, o método deve lançar uma exceção específica.

2. **Classe de Testes**:
   - Desenvolva uma classe de testes utilizando JUnit para verificar se o método `setMatricula` lança uma exceção quando o valor da matrícula é menor ou igual a zero.
   - A classe de testes deve capturar e tratar a exceção, garantindo que o comportamento do método está correto.

### Considerações

Este exercício reforça a importância de validar os dados de entrada no desenvolvimento de software, bem como a utilização de testes de unidade para garantir que o código se comporte conforme o esperado em situações adversas.
