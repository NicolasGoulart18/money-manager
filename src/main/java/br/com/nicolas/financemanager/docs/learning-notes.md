# Anotações de Aprendizado — Money Manager

## Objetivo do projeto

Criar um gerenciador financeiro de terminal em Java e evoluí-lo gradualmente até chegar ao Spring Boot.

## Conceitos Java aprendidos

### Classes e objetos

* Classe é um molde que define características e comportamentos.
* Objeto é uma instância criada a partir de uma classe.
* `Transaction` representa uma receita ou despesa.
* `FinanceManager` gerencia várias transações.

### Atributos, construtor e `this`

* Atributos guardam os dados de um objeto.
* O construtor é chamado quando usamos `new` para criar um objeto.
* `this` representa o próprio objeto criado e ajuda a diferenciar atributo de parâmetro.

### Encapsulamento

* Os atributos são `private` para proteger o estado do objeto.
* Os getters permitem acessar os dados de forma controlada.

### Enum

* `TransactionType` limita os tipos possíveis de transação.
* Neste projeto, uma transação pode ser `INCOME` ou `EXPENSE`.

### BigDecimal

* `BigDecimal` é usado para valores financeiros.
* Ele evita problemas de precisão que podem acontecer ao usar `double`.
* `BigDecimal.ZERO` representa o valor zero.
* `compareTo(BigDecimal.ZERO)` permite comparar valores financeiros.

### Coleções

* `List<Transaction>` armazena várias transações.
* `ArrayList` é a implementação de lista usada no `FinanceManager`.
* O `for-each` percorre cada transação da lista.

### Métodos criados

* `addTransaction()` adiciona uma transação à lista.
* `listTransactions()` mostra as transações registradas.
* `calculateBalance()` calcula o saldo atual.
* `calculateTotalByType()` calcula o total de receitas ou despesas.
* `findTransactionByDescription()` busca uma transação pela descrição.
* `getSignedValue()` retorna o valor positivo para receita e negativo para despesa.
* `toString()` define como uma transação será exibida no terminal.

### Validações e exceções

* O construtor de `Transaction` valida descrição, valor e tipo.
* `if` verifica se um dado é inválido.
* `throw new IllegalArgumentException(...)` impede a criação de uma transação inválida.
* `try-catch` captura uma exceção e permite que o programa continue executando.
* `getMessage()` retorna a mensagem da exceção.

## Próximos passos

* Melhorar validações e operações com transações.
* Ler dados digitados pelo usuário no terminal.
* Aprender outras coleções: `Set` e `Map`.
* Criar testes com JUnit.
* Salvar dados com SQL e JDBC.
* Evoluir o projeto para uma API com Spring Boot.
