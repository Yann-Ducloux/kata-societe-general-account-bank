package services;

import models.Account;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DepositServiceTest {

    private final DepositService depositService = new DepositService();

    @Test
    public void should_deposit_in_my_account() {
        //GIVEN
        Long somme = 1000L;
        Account account = new Account();

        //WHEN
        depositService.deposit(account, somme);

        //THEN
        assertEquals(somme, account.getBalance());
    }
    @Test
    public void should_multiple_deposit_in_my_account() {
        //GIVEN
        Long sommeExpected = 17489L;
        Long firstDeposit = 1454L;
        Long secondDeposit = 9246L;
        Long thirdDeposit = 1723L;
        Long fouthDeposit = 542L;
        Long fifthDeposit = 4524L;
        Account account = new Account();

        //WHEN
        depositService.deposit(account, firstDeposit);
        depositService.deposit(account, secondDeposit);
        depositService.deposit(account, thirdDeposit);
        depositService.deposit(account, fouthDeposit);
        depositService.deposit(account, fifthDeposit);

        //THEN
        assertEquals(sommeExpected, account.getBalance());
    }
}