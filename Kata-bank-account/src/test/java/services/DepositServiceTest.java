package services;

import models.Account;
import operation.Operation;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class DepositServiceTest {

    private final DepositService depositService = new DepositService();

    @Test
    public void should_deposit_in_my_account() {
        //GIVEN
        Long amount = 1000L;
        Account account = new Account();
        List<Operation> operations = new ArrayList<>();

        //WHEN
        depositService.deposit(account, amount);

        //THEN
        assertEquals(amount, account.getBalance());
    }
    @Test
    public void should_multiple_deposit_in_my_account() {
        //GIVEN
        Long amountExpected = 17489L;
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
        assertEquals(amountExpected, account.getBalance());
    }
}