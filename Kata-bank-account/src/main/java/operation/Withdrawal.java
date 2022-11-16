package operation;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Withdrawal extends Operation{

    public Withdrawal(LocalDateTime date, Long amount, Long balance) {
        super(date, amount, balance);
    }

    public Long execute() {
        balance -= amount;
        return balance;
    }

    @Override
    public String print() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        return  "\nDate of operation is " + date.format(formatter) +
                " the amount of operation is " + amount + " €" +
                " and the type of operation is WITHDRAWAL";
    }
}
