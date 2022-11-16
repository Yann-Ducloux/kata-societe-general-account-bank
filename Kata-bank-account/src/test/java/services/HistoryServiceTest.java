package services;

import models.Account;
import models.Operation;
import models.TypeOperation;
import org.junit.Test;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class HistoryServiceTest {

    private final DepositService depositService = new DepositService();
    private final WithdrawalService withdrawalService = new WithdrawalService();
    private final HistoryService historyService = new HistoryService();

    @Test
    public void should_history_in_my_account(){
        //GIVEN
        Long firstOperation = 4564L;
        Long secondOperation = 2868L;
        Long thirdOperation = 5489L;
        Long fourthOperation = 45657L;
        Long balanceExpected = 41864L;
        Account account = new Account();
        List<Operation> operations = new ArrayList<>();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        LocalDateTime localDateTime = LocalDateTime.now();
        String  accountStatementExpected = "The balance: "+ balanceExpected + " €\n" +
                "The operation(s) :\n" +
                "Date of operation is "+  localDateTime.format(formatter) +" the amount of operation is "+ firstOperation +" € and the type of operation is " + TypeOperation.DEPOSIT + "\n" +
                "Date of operation is "+  localDateTime.format(formatter) +" the amount of operation is "+ secondOperation +" € and the type of operation is " + TypeOperation.WITHDRAWAL + "\n" +
                "Date of operation is "+  localDateTime.format(formatter) +" the amount of operation is "+ thirdOperation +" € and the type of operation is " + TypeOperation.WITHDRAWAL + "\n" +
                "Date of operation is "+  localDateTime.format(formatter) +" the amount of operation is "+ fourthOperation +" € and the type of operation is " + TypeOperation.DEPOSIT;
        //WHEN
        depositService.deposit(account, operations, firstOperation);
        withdrawalService.withdrawal(account, operations, secondOperation);
        withdrawalService.withdrawal(account, operations, thirdOperation);
        depositService.deposit(account, operations, fourthOperation);
        String accountStatementActual = historyService.statementPrinting(account, operations);

        //THEN
        assertEquals(accountStatementExpected, accountStatementActual) ;

    }
}