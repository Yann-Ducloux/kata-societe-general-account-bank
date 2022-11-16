package operation;

import Interface.IOperation;

import java.time.LocalDateTime;

/**
 * @author Yann Ducloux
 * définit un opération.
 */
public abstract class Operation implements IOperation {
    /**
     * The Date.
     */
    protected LocalDateTime date;
    /**
     * The Amount.
     */
    protected Long amount;

    /**
     * The Balance.
     */
    protected Long balance;

    /**
     * Instantiates a new Operation.
     *
     * @param date    the date
     * @param amount  the amount
     * @param balance the balance
     */
    public Operation(LocalDateTime date, Long amount, Long balance) {
        this.date = date;
        this.amount = amount;
        this.balance = balance;
    }

    public abstract String print();
}
