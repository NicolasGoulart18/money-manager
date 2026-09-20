# Money Manager Java

Terminal application built in Java to practice the foundations required before Spring Boot.

## Version 1

The first version keeps data in memory and focuses on a small but functional financial flow.

## Current features

- Register income and expenses from the terminal
- Register multiple transactions in a single execution
- Validate transaction description, value and type
- List registered transactions
- Calculate the current balance
- Calculate totals by transaction type
- Find a transaction by its description
- Display a final summary after the registration flow

## Project structure

```text
.
├── docs/
│   └── anotacoes.md
├── src/main/java/br/com/nicolas/financemanager/
│   ├── Main.java
│   ├── model/
│   │   ├── Transaction.java
│   │   └── TransactionType.java
│   └── service/
│       └── FinanceManager.java
└── README.md
```

- `Transaction` represents an income or expense.
- `TransactionType` defines the available transaction types.
- `FinanceManager` stores and manages transactions in memory.
- `Main` reads terminal input and starts the application flow.
- `docs/anotacoes.md` contains learning notes written during development.

## Running the project

1. Open the repository in VS Code with the Java extension installed.
2. Open `Main.java`.
3. Run the `main` method.
4. Enter the description, value and transaction type when requested.
5. Use `S` to register another transaction or `N` to display the final summary.

Use a decimal point for values, such as `50.00`, and use `INCOME` or `EXPENSE` for the transaction type.

## Learning progress

Completed in this version:

- Classes, objects, constructors and encapsulation
- Enums
- Methods and return values
- Association between `FinanceManager` and `Transaction`
- `List`, `ArrayList` and `for-each`
- `BigDecimal` for financial calculations
- Input validation with `IllegalArgumentException`
- Exception handling with `try-catch`
- Terminal input with `Scanner`
- Repetition with `while`

Next steps:

- Continue collection operations and validations
- Handle errors and invalid operations with exceptions
- Add persistence with SQL and JDBC
- Create tests and later evolve the project into a Spring Boot API

## Technologies

- Java
- Java Collections with `List` and `ArrayList`
- `BigDecimal` for financial values
- Terminal application
