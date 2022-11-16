package services;

import models.Account;
import models.Operation;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class WithdrawalServiceTest {
    private final WithdrawalService withdrawalService = new WithdrawalService();

    @Test
    public void should_withdrawal_in_my_account() {
        //GIVEN
        Long somme = 1000L;
        Long sommeExpected = -1000L;
        Account account = new Account();
        List<Operation> operations = new ArrayList<>();
        //WHEN
        this.withdrawalService.withdrawal(account, operations, somme);

        //THEN
        assertEquals(sommeExpected, account.getBalance());
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
        List<Operation> operations = new ArrayList<>();
        //WHEN
        this.withdrawalService.withdrawal(account, operations, firstWithdrawal);
        this.withdrawalService.withdrawal(account, operations, secondWithdrawal);
        this.withdrawalService.withdrawal(account, operations, thirdWithdrawal);
        this.withdrawalService.withdrawal(account, operations, fourthWithdrawal);
        this.withdrawalService.withdrawal(account, operations, fifthWithdrawal);

        //THEN
        assertEquals(sommeExpected, account.getBalance());
    }
}