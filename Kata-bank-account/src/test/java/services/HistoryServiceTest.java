package services;

import models.Account;
import models.TypeOperation;
import org.junit.Test;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import static org.junit.Assert.assertEquals;

public class HistoryServiceTest {

    private final DepositService depositService = new DepositService();
    private final WithdrawalService withdrawalService = new WithdrawalService();
    private final HistoryService historyService = new HistoryService();

    @Test
    public void should_history_in_my_account(){
        //GIVEN
        Long firstAmount = 4564L;
        Long secondAmount = 2868L;
        Long thirdAmount = 5489L;
        Long fourthAmount = 45657L;
        Long balanceExpected = 41864L;
        Account account = new Account();

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        LocalDateTime localDateTime = LocalDateTime.now();

        String  accountStatementExpected = "The balance: "+ balanceExpected + " €\n" +
                "The operation(s) :\n" +
                "Date of operation is "+  localDateTime.format(formatter) +" the amount of operation is "+ firstAmount +" € and the type of operation is " + TypeOperation.DEPOSIT + "\n" +
                "Date of operation is "+  localDateTime.format(formatter) +" the amount of operation is "+ secondAmount +" € and the type of operation is " + TypeOperation.WITHDRAWAL + "\n" +
                "Date of operation is "+  localDateTime.format(formatter) +" the amount of operation is "+ thirdAmount +" € and the type of operation is " + TypeOperation.WITHDRAWAL + "\n" +
                "Date of operation is "+  localDateTime.format(formatter) +" the amount of operation is "+ fourthAmount +" € and the type of operation is " + TypeOperation.DEPOSIT;

        //WHEN
        depositService.deposit(account, firstAmount);
        withdrawalService.withdrawal(account, secondAmount);
        withdrawalService.withdrawal(account, thirdAmount);
        depositService.deposit(account, fourthAmount);

        String accountStatementActual = historyService.statementPrinting(account);

        //THEN
        assertEquals(accountStatementExpected, accountStatementActual) ;

    }
}