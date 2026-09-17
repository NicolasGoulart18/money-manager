package br.com.nicolas.financemanager;
import br.com.nicolas.financemanager.model.TransactionType;
import br.com.nicolas.financemanager.service.FinanceManager;
import br.com.nicolas.financemanager.model.Transaction;
import java.math.BigDecimal;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        FinanceManager manager=new FinanceManager();
        System.out.println("---- MONEY MANAGER ----");
        
        System.out.println("Informe a descrição: ");
        String description=scanner.nextLine();
        System.out.println("Informe o valor da transação: ");
        String valueInput=scanner.nextLine();
   
        
        try {
            BigDecimal value = new  BigDecimal(valueInput);
            System.out.println("Valor convertido:"+value);
        } catch (NumberFormatException exception) {
            System.out.println("Informe um valor de transação Válido");
        }


        

    }
}
