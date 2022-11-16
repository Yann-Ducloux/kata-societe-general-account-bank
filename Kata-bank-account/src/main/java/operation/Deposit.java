package operation;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * @author Yann Ducloux
 * définit une opération de dépôt.
 */
public class Deposit extends Operation{

    /**
     * Instantiates a new Deposit.
     *
     * @param date    the date
     * @param amount  the amount
     * @param balance the balance
     */
    public Deposit(LocalDateTime date, Long amount, Long balance) {
        super(date, amount, balance);
    }

    /**
     * permet d'ajouter le montant du solde
     * @return balance la nouvelle balance calculé
     */
    @Override
    public Long execute() {
        balance += amount;
        return balance;
    }

    @Override
    public String print() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        return  "\nDate of operation is " + date.format(formatter) +
                " the amount of operation is " + amount + " €" +
                " and the type of operation is DEPOSIT";
    }
}
