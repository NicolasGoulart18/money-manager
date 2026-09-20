package br.com.nicolas.financemanager;
import br.com.nicolas.financemanager.model.TransactionType;
import br.com.nicolas.financemanager.service.FinanceManager;
import br.com.nicolas.financemanager.model.Transaction;
import java.math.BigDecimal;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        boolean cadastrarOutro=true;
        FinanceManager manager=new FinanceManager();        
        System.out.println("---- MONEY MANAGER ----");        
        while (cadastrarOutro) {
        
        System.out.println("Informe a descrição: ");
        String description=scanner.nextLine();
       
        System.out.println("Informe o valor da transação: ");
        String valueInput=scanner.nextLine();
        

        System.out.println("Informe o tipo de transação (INCOME ou EXPENSE)");
        String typeInput=scanner.nextLine();           
    
        try {
            BigDecimal value= new BigDecimal(valueInput);
            TransactionType type =  TransactionType.valueOf(typeInput);
            Transaction transaction = new Transaction(description, value, type);
            manager.addTransaction(transaction);
            System.out.println("Deseja cadastrar outra transação? (S/N)");
            String resposta =scanner.nextLine();
            cadastrarOutro = resposta.equalsIgnoreCase("S");
        

        } catch ( IllegalArgumentException exception) {
            System.out.println("Informe valores válidos! "+exception.getMessage());
        }
    


     }
        System.out.println("---- RESUMO FINAL ----");
        manager.listTransactions();
        System.out.println("Receita: "+manager.calculateTotalByType(TransactionType.INCOME));
        System.out.println("Despesa: "+manager.calculateTotalByType(TransactionType.EXPENSE));     
        System.out.println("Saldo: "+manager.calculateBalance());  
     

    }
}
