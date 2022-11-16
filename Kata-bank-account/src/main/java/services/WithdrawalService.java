package services;

import Interface.IOperation;
import models.Account;
import operation.Withdrawal;

import java.time.LocalDateTime;

/**
 * @author Yann Ducloux
 * service qui gére le retrait sur un compte.
 */
public class WithdrawalService {
    /**
     * fonction qui permet de retirer de l'argent sur un compte.
     *
     * @param account    the account
     * @param amount      the amount
     */
    public void withdrawal(Account account, Long amount) {
        IOperation operation = new Withdrawal(LocalDateTime.now(), amount, account.getBalance());
        account.setBalance(operation.execute());
        account.addOperation(operation);
    }
}
