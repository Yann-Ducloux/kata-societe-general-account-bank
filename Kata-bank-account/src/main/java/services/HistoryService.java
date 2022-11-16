package services;

import Interface.IHistoryService;
import Interface.IOperation;
import models.Account;

/**
 * service qui l'historique sur un compte.
 */
public class HistoryService implements IHistoryService {
    /**
     * fonction qui permet d'imprimer le relever de compte.
     *
     * @param account    the account
     */
    public String statementPrinting(Account account) {
        StringBuilder statement = new StringBuilder();
        statement.append("The balance: " + account.getBalance() + " €");

        if(!account.getOperations().isEmpty()) {
            statement.append("\nThe operation(s) :");
            for (IOperation operation: account.getOperations()) {
                statement.append(operation.print());
            }
        }
        return statement.toString();
    }
}
