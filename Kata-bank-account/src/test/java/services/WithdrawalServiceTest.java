package services;

import models.Account;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WithdrawalServiceTest {
    private final WithdrawalService withdrawalService = new WithdrawalService();

    @Test
    public void should_withdrawal_in_my_account() {
        //GIVEN
        Long amount = 1000L;
        Long amountExpected = -1000L;
        Account account = new Account();

        //WHEN
        this.withdrawalService.withdrawal(account, amount);

        //THEN
        assertEquals(amountExpected, account.getBalance());
    }

    @Test
    public void should_multiple_withdrawal_in_my_account() {
        //GIVEN
        Long sommeExpected = -17690L;
        Long firstWithdrawal = 955L;
        Long secondWithdrawal = 50L;
        Long thirdWithdrawal = 8445L;
        Long fourthWithdrawal = 6784L;
        Long fifthWithdrawal = 1456L;
        Account account = new Account();

        //WHEN
        this.withdrawalService.withdrawal(account, firstWithdrawal);
        this.withdrawalService.withdrawal(account, secondWithdrawal);
        this.withdrawalService.withdrawal(account, thirdWithdrawal);
        this.withdrawalService.withdrawal(account, fourthWithdrawal);
        this.withdrawalService.withdrawal(account, fifthWithdrawal);

        //THEN
        assertEquals(sommeExpected, account.getBalance());
    }
}