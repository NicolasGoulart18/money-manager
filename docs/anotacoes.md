# Anotações de Aprendizado — Money Manager

## Objetivo do projeto

Criar um gerenciador financeiro de terminal em Java e evoluí-lo gradualmente até chegar a uma API com Spring Boot.

Este arquivo registra os principais conceitos praticados durante o desenvolvimento.

## 1. Classes e objetos

- Classe é um molde que define características e comportamentos.
- Objeto é uma instância criada a partir de uma classe.
- `Transaction` representa uma receita ou despesa.
- `FinanceManager` gerencia várias transações.

## 2. Atributos, construtor e `this`

- Atributos armazenam o estado de um objeto.
- O construtor é executado quando usamos `new`.
- `this` representa o próprio objeto e ajuda a diferenciar atributos de parâmetros.

## 3. Encapsulamento

- Os atributos são `private` para proteger o estado do objeto.
- Os getters permitem acessar os dados de forma controlada.
- As validações impedem que objetos inválidos sejam criados.

## 4. Enum

O enum `TransactionType` limita os tipos possíveis de transação:

```text
INCOME
EXPENSE
```

`TransactionType.valueOf(texto)` converte uma `String` em um valor do enum.

## 5. BigDecimal

`BigDecimal` é utilizado para valores financeiros porque evita problemas de precisão comuns em tipos de ponto flutuante.

Conceitos praticados:

- `BigDecimal.ZERO`
- `compareTo()`
- `add()`
- Criação de valores a partir de texto

## 6. Coleções

- `List<Transaction>` armazena várias transações.
- `ArrayList` é a implementação utilizada pelo `FinanceManager`.
- O `for-each` percorre os elementos da lista.

## 7. Métodos do projeto

- `addTransaction()` — adiciona uma transação.
- `listTransactions()` — lista as transações registradas.
- `calculateBalance()` — calcula o saldo atual.
- `calculateTotalByType()` — calcula o total por tipo.
- `findTransactionByDescription()` — busca uma transação pela descrição.
- `getSignedValue()` — retorna valor positivo para receita e negativo para despesa.
- `toString()` — define a representação textual da transação.

## 8. Validações e exceções

O construtor de `Transaction` valida:

- Descrição nula ou vazia
- Valor nulo
- Valor menor ou igual a zero
- Tipo nulo

Exceções praticadas:

- `IllegalArgumentException`
- `NumberFormatException`

O `try-catch` permite tratar entradas inválidas sem encerrar o programa imediatamente.

## 9. Entrada de dados

`Scanner` lê os dados digitados no terminal.

Fluxo atual:

1. Ler descrição.
2. Ler valor.
3. Converter o valor para `BigDecimal`.
4. Ler o tipo.
5. Converter o tipo para `TransactionType`.
6. Criar a `Transaction`.
7. Adicionar a transação ao `FinanceManager`.

## 10. Laços de repetição

O `while` mantém o cadastro ativo enquanto o usuário desejar adicionar novas transações.

O `FinanceManager` é criado fora do laço para que todas as transações permaneçam na mesma lista durante a execução.

## Checkpoint atual

Já foram praticados:

- POO básica
- Encapsulamento
- Enums
- Collections com `List` e `ArrayList`
- `BigDecimal`
- Validações
- Exceções
- Entrada de dados
- Laços de repetição

## Próximos passos

1. Aprofundar Collections e Generics.
2. Melhorar o tratamento de erros.
3. Criar testes com JUnit.
4. Adicionar persistência com SQL e JDBC.
5. Evoluir o projeto para Spring Boot.
