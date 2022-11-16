package services;

import models.Account;
import models.Operation;
import models.TypeOperation;

import java.time.LocalDateTime;
import java.util.List;

/**
 * service qui gére le retrait sur un compte.
 */
public class WithdrawalService {
    /**
     * fonction qui permet de retirer de l'argent sur un compte.
     *
     * @param account    the account
     * @param operations the operations
     * @param somme      the somme
     */
    public void withdrawal(Account account, List<Operation> operations, Long somme) {
        Long balance = 0L;
        Operation operation = new Operation();

        if(account.getBalance() != null) {
            balance = account.getBalance();
        }

        operation.setDateOperation(LocalDateTime.now());
        operation.setAmount(somme);
        operation.setTypeOperation(TypeOperation.WITHDRAWAL);
        operations.add(operation);

        account.setBalance(balance-somme);
    }
}
