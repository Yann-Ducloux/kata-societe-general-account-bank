package services;

import models.Account;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DepositServiceTest {

    private final DepositService depositService = new DepositService();

    @Test
    public void deposit_in_my_account() {
        //GIVEN
        Long somme = 1000L;
        Account account = new Account();

        //WHEN
        depositService.deposit(account, somme);

        //THEN
        assertEquals(somme, account.getBalance());
    }
}