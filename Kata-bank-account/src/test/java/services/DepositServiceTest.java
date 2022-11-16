package services;

import models.Account;
import models.Operation;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class DepositServiceTest {

    private final DepositService depositService = new DepositService();

    @Test
    public void should_deposit_in_my_account() {
        //GIVEN
        Long somme = 1000L;
        Account account = new Account();
        List<Operation> operations = new ArrayList<>();

        //WHEN
        depositService.deposit(account, operations, somme);

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
        List<Operation> operations = new ArrayList<>();

        //WHEN
        depositService.deposit(account, operations, firstDeposit);
        depositService.deposit(account, operations, secondDeposit);
        depositService.deposit(account, operations, thirdDeposit);
        depositService.deposit(account, operations, fouthDeposit);
        depositService.deposit(account, operations, fifthDeposit);

        //THEN
        assertEquals(sommeExpected, account.getBalance());
    }
}