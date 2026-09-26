# Money Manager

Terminal-based financial manager developed in Java as a study project before moving into Spring Boot.

The current version focuses on Object-Oriented Programming, collections, validation, exceptions, and financial calculations using `BigDecimal`.

## Current Version

Version 1 stores all data in memory and provides a complete basic transaction flow through the terminal.

## Features

- Register income and expenses
- Register multiple transactions in one execution
- Validate description, value, and transaction type
- List registered transactions
- Calculate the current balance
- Calculate totals by transaction type
- Search for a transaction by description
- Display a final financial summary

## Project Structure

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

### Main responsibilities

- `Transaction` represents an income or expense.
- `TransactionType` defines the available transaction types.
- `FinanceManager` stores transactions and applies financial operations.
- `Main` handles terminal input and controls the application flow.
- `docs/anotacoes.md` records the concepts learned during development.

## Concepts Practiced

- Classes and objects
- Constructors
- Encapsulation
- Enums
- Methods and return values
- Association between classes
- `List` and `ArrayList`
- `for-each`
- `BigDecimal`
- Input validation
- `IllegalArgumentException`
- `NumberFormatException`
- `try-catch`
- `Scanner`
- `while`

## How to Run

1. Clone the repository.
2. Open it in VS Code or another Java IDE.
3. Open `Main.java`.
4. Run the `main` method.
5. Enter the transaction information requested in the terminal.

Use a decimal point for monetary values, for example:

```text
50.00
```

Available transaction types:

```text
INCOME
EXPENSE
```

## Learning Roadmap

The project is being evolved gradually:

1. Strengthen OOP fundamentals
2. Practice Collections and Generics
3. Improve exception handling
4. Add automated tests
5. Add data persistence with SQL/JDBC
6. Evolve the application into a Spring Boot API

## Documentation

Detailed study notes are available in:

```text
docs/anotacoes.md
```

## Technologies

- Java
- Java Collections
- BigDecimal
- Git and GitHub

## Status

Version 1 in development.
