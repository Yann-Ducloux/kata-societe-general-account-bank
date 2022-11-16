package services;

import models.Account;

public class WithdrawalService {
    public Account withdrawal(Account account, Long somme) {
        Long balance = 0L;
        if(account.getBalance() != null) {
            balance = account.getBalance();
        }
        account.setBalance(balance-somme);
        return account;
    }
}
