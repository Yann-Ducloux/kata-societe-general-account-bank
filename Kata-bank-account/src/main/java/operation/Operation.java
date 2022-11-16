package operation;

import Interface.IOperation;
import models.TypeOperation;

import java.time.LocalDateTime;

public abstract class Operation implements IOperation {
    protected LocalDateTime date;
    protected Long amount;

    protected Long balance;

    public Operation(LocalDateTime date, Long amount, Long balance) {
        this.date = date;
        this.amount = amount;
        this.balance = balance;
    }

    public abstract String print();
}
