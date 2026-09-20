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
* `TransactionType.valueOf(texto)` converte uma `String` em um valor do enum.
* O texto precisa corresponder a um valor existente no enum.

### BigDecimal

* `BigDecimal` é usado para valores financeiros.
* Ele evita problemas de precisão que podem acontecer ao usar `double`.
* `BigDecimal.ZERO` representa o valor zero.
* `compareTo(BigDecimal.ZERO)` permite comparar valores financeiros.
* `new BigDecimal(texto)` converte um texto em valor financeiro.

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
* `NumberFormatException` acontece quando um texto não pode ser convertido em número.
* `NumberFormatException` é um tipo de `IllegalArgumentException`.

### Entrada de dados pelo terminal

* `Scanner` lê os dados digitados pelo usuário.
* `System.in` representa a entrada do sistema, normalmente o teclado.
* `nextLine()` lê uma linha inteira e retorna uma `String`.
* O usuário digita descrição, valor e tipo da transação.
* O valor digitado é convertido para `BigDecimal`.
* O tipo digitado é convertido para `TransactionType`.
* As conversões e a criação da transação ficam dentro do mesmo `try`, pois podem gerar exceções.
* Dentro do `try`, as variáveis `value` e `type` podem ser usadas para criar uma `Transaction`.
* Após criar a transação, ela é adicionada ao sistema com `manager.addTransaction(transaction)`.

### Laços de repetição

- `while` repete um bloco enquanto uma condição for verdadeira.
- A variável `boolean cadastrarOutro` controla se o cadastro continua.
- `equalsIgnoreCase("S")` aceita `S` ou `s` como resposta para continuar.
- O `FinanceManager` é criado antes do `while` para manter todas as transações na mesma lista.
- O resumo final fica fora do `while`, pois deve aparecer apenas depois que o usuário encerrar os cadastros.


## Próximos passos

* Mostrar as transações cadastradas pelo terminal.
* Permitir cadastrar mais de uma transação sem reiniciar o programa.
* Melhorar validações e operações com transações.
* Aprender outras coleções: `Set` e `Map`.
* Criar testes com JUnit.
* Salvar dados com SQL e JDBC.
* Evoluir o projeto para uma API com Spring Boot.
