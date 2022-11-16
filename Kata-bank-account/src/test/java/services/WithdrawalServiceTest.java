package services;

import models.Account;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class WithdrawalServiceTest {
    private final WithdrawalService withdrawalService = new WithdrawalService();

    @Test
    public void should_withdrawal_in_my_account() {
        //GIVEN
        Long somme = 1000L;
        Long sommeExpected = -1000L;
        Account account = new Account();
        //WHEN
        this.withdrawalService.withdrawal(account, somme);

        //THEN
        Assert.assertEquals(sommeExpected, account.getBalance());
    }
}