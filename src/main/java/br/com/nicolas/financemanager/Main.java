package br.com.nicolas.financemanager;
import br.com.nicolas.financemanager.model.TransactionType;
import br.com.nicolas.financemanager.service.FinanceManager;
import br.com.nicolas.financemanager.model.Transaction;
import java.math.BigDecimal;
public class Main {
    public static void main(String[] args) {
        FinanceManager manager=new FinanceManager();
        Transaction salary= new Transaction("Salario", new BigDecimal("2500.00"), TransactionType.INCOME);
        Transaction netflix = new Transaction("Netflix", new BigDecimal("50.00"), TransactionType.EXPENSE);
        Transaction spotify = new Transaction("Spotify", new BigDecimal("40.00"), TransactionType.EXPENSE);
        try {
            Transaction google = new Transaction("Google", BigDecimal.ZERO, TransactionType.EXPENSE);
        } catch (IllegalArgumentException Exception ) {
           System.out.println( Exception.getMessage());
        }
        //Transaction teste = new Transaction("Teste", new BigDecimal("50.00"), null);
        manager.addTransaction(salary);
        manager.addTransaction(netflix);
        manager.addTransaction(spotify);
        //manager.addTransaction(teste);
        manager.listTransactions();
        System.out.println("Balance: "+manager.calculateBalance());
        System.out.println("Income: "+manager.calculateTotalByType(TransactionType.INCOME));
        System.out.println("Expense: "+manager.calculateTotalByType(TransactionType.EXPENSE));

        Transaction foundTransaction= manager.findTransactionByDescription("Netflix");
        if (foundTransaction!=null) {
            System.out.println(foundTransaction);
        }

    }
}
