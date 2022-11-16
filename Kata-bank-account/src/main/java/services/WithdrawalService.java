package services;

import models.Account;

public class WithdrawalService {
    public void withdrawal(Account account, Long somme) {
        account.setBalance(-somme);
    }
}
