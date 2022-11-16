package services;

import Interface.IHistoryService;
import models.Account;
import models.Operation;

import java.util.List;

/**
 * service qui l'historique sur un compte.
 */
public class HistoryService implements IHistoryService {
    /**
     * fonction qui permet d'imprimer le relever de compte.
     *
     * @param account    the account
     * @param operations the operations
     */
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
