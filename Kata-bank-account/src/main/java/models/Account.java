package models;

import Interface.IOperation;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Yann Ducloux
 * défini le compte bancaire.
 */
public class Account {
    private Long balance;
    private List<IOperation> operations;


    /**
     * Instantiates a new Account.
     */
    public Account() {
        this.balance = 0L;
        this.operations = new ArrayList<>();
    }

    /**
     * Gets balance.
     *
     * @return the balance
     */
    public Long getBalance() {
        return balance;
    }

    /**
     * Sets balance.
     *
     * @param balance the balance
     */
    public void setBalance(Long balance) {
        this.balance = balance;
    }

    /**
     * Gets operations.
     *
     * @return the operations
     */
    public List<IOperation> getOperations() {
        return operations;
    }

    /**
     * Add operation.
     *
     * @param operation the operation
     */
    public void addOperation(IOperation operation) {
        this.operations.add(operation);
    }
}
