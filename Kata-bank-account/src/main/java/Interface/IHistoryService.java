package Interface;

import models.Account;

/**
 * @author Yann Ducloux
 * interface qui gére l'historique sur un compte.
 */
public interface IHistoryService {
    /**
     * Statement printing string.
     *
     * @param account the account
     * @return the string
     */
    public String statementPrinting(Account account);
}
