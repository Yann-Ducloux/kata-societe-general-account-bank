package services;

import Interface.IHistoryService;
import models.Account;
import models.Operation;

import java.util.List;

public class HistoryService implements IHistoryService {
    public String statementPrinting(Account account, List<Operation> operations) {
        String press;
        press = "The balance: " + account.getBalance() + " €";

        if(!operations.isEmpty()) {
            press+= "\nThe operation(s) :";
            for (Operation operation: operations) {
                press += "\n" + operation.toString();
            }
        }

        return press;
    }
}
