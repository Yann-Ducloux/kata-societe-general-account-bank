package services;

import Interface.IOperation;
import models.Account;
import operation.Deposit;

import java.time.LocalDateTime;

/**
 * @author Yann Ducloux
 * service qui gére le dépôt sur un compte.
 */
public class DepositService {

    /**
     * fonction qui permet de déposer de l'argent sur un compte.
     *
     * @param account    the account
     * @param amount      the amount
     */
    public void deposit(Account account, Long amount) {
        IOperation operation = new Deposit(LocalDateTime.now(), amount, account.getBalance());
        account.setBalance(operation.execute());
        account.addOperation(operation);
    }
}
