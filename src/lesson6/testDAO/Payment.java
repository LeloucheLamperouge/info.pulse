package lesson6.testDAO;

import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;

/**
 * Created by Lelouch on 14.03.2017.
 */
@DatabaseTable(tableName = "payments")
public class Payment {

    @DatabaseField (id = true)
    int customerNumber;
    @DatabaseField (canBeNull = false)
    String checkNumber;
    @DatabaseField (canBeNull = false)
    String paymentDate;
    @DatabaseField (canBeNull = false)
    double amount;

    public Payment(){

    }

    public Payment(int customerNumber, String checkNumber, String paymentDate, double amount) {
        this.customerNumber = customerNumber;
        this.checkNumber = checkNumber;
        this.paymentDate = paymentDate;
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "Payment{" +
                "customerNumber=" + customerNumber +
                ", checkNumber='" + checkNumber + '\'' +
                ", paymentDate='" + paymentDate + '\'' +
                ", amount=" + amount +
                '}';
    }
}
