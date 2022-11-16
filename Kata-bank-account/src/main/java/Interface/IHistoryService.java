package Interface;

import models.Account;
import models.Operation;

import java.util.List;

public interface IHistoryService {
    public String statementPrinting(Account account, List<Operation> operations);
}
