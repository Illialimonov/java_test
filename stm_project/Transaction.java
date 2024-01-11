package stm_project;
import java.util.Date;

public class Transaction {
    private double amount;
    private Date timestamp;
    private String memo;
    private Account inAccount;

    public Transaction(double amount, Account inAccount) {
        this.amount = amount;
        thisinAccount = inAccount;
        this.timestamp = new Date();
        this.memo = "";
    }




    public Transaction(double amount, String memo, Account imAccount) {
        this(amount, inAccount);

        this.memo = memo;
    }



}
