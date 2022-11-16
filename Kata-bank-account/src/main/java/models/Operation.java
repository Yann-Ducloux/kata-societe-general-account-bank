package models;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Operation {
    LocalDateTime dateOperation;
    Long amount;
    TypeOperation typeOperation;

    public LocalDateTime getDateOperation() {
        return dateOperation;
    }

    public void setDateOperation(LocalDateTime dateOperation) {
        this.dateOperation = dateOperation;
    }

    public Long getAmount() {
        return amount;
    }

    public void setAmount(Long amount) {
        this.amount = amount;
    }

    public TypeOperation getTypeOperation() {
        return typeOperation;
    }

    public void setTypeOperation(TypeOperation typeOperation) {
        this.typeOperation = typeOperation;
    }

    @Override
    public String toString() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        return  "Date of operation is " + dateOperation.format(formatter) +
                " the amount of operation is " + amount + " €" +
                " and the type of operation is " + typeOperation;
    }
}
