package services;

import models.Account;

/**
 * service qui gére le dépôt sur un compte.
 */
public class DepositService {

    /**
     * fonction qui permet de déposer de l'argent sur un compte.
     *
     * @param account the account
     * @param somme   the somme
     */
    public void deposit(Account account, Long somme) {
        account.setBalance(somme);
    }
}
