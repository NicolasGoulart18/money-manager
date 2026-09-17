package br.com.nicolas.financemanager.model;
import java.math.BigDecimal;


public class Transaction {
    private String description;
    private BigDecimal value;
    private TransactionType type;
    public Transaction(String description, BigDecimal value, TransactionType type) {
        if(description==null || description.isBlank()){
            throw new IllegalArgumentException("Descrição inválida!");
        }else{
             this.description = description;
        }
        if (value==null || value.compareTo(BigDecimal.ZERO)<=0) {
            throw new IllegalArgumentException("Valor informado inválido");
        }else{
            this.value =value;
        }
        if(type==null){
            throw new IllegalArgumentException("Tipo Inválido");
        }else{
             this.type = type;
        }
        
    }
    public String getDescription() {
        return description;
    }
    public BigDecimal getValue() {
        return value;
    }
    public TransactionType getType() {
        return type;
    }

    public boolean isIncome(){
        return type==TransactionType.INCOME;
    }
    
    public boolean isExpense(){
        return type==TransactionType.EXPENSE;
    }

    // esse metodo abaixo serve para fazer entrada e saida de valores no BigDecimal
    public BigDecimal getSignedValue(){
        if (isIncome()) {
            return value;            
        }
         return value.negate();
    }

    // Usando toString para quando o objeto de despesa ou receita for instanciado ao mostrar ele apareca formatado
    @Override
    public String toString() {
        return description+"| Valor: "+getSignedValue()+" tipo: "+type;
    }

}
