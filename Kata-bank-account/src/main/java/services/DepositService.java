package services;

import models.Account;
import models.Operation;
import models.TypeOperation;

import java.time.LocalDateTime;
import java.util.List;

/**
 * service qui gére le dépôt sur un compte.
 */
public class DepositService {

    /**
     * fonction qui permet de déposer de l'argent sur un compte.
     *
     * @param account    the account
     * @param operations
     * @param somme      the somme
     */
    public void deposit(Account account, List<Operation> operations, Long somme) {
        Long balance = 0L;
        Operation operation = new Operation();
        if(account.getBalance() != null) {
            balance = account.getBalance();
        }
        operation.setDateOperation(LocalDateTime.now());
        operation.setAmount(somme);
        operation.setTypeOperation(TypeOperation.DEPOSIT);
        operations.add(operation);
        account.setBalance(balance + somme);
    }
}
