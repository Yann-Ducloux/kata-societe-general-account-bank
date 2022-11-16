package models;

import Interface.IOperation;
import operation.Operation;

import java.util.ArrayList;
import java.util.List;

public class Account {
    private Long balance;
    private List<IOperation> operations;


    public Account() {
        this.balance = 0L;
        this.operations = new ArrayList<>();
    }
    public Long getBalance() {
        return balance;
    }

    public void setBalance(Long balance) {
        this.balance = balance;
    }

    public List<IOperation> getOperations() {
        return operations;
    }

    public void addOperation(IOperation operation) {
        this.operations.add(operation);
    }
}
