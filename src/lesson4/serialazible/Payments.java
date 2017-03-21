package lesson4.serialazible;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by Lelouch on 18.02.2017.
 */
public class Payments implements Serializable{

    private static final long serialVersionUID = 1;

       int customerNumber;
       Date paymentDate;
       double amount;

    public Payments() {
    }

    public Payments(int customerNumber, Date paymentDate, double amount) {
        this.customerNumber = customerNumber;
        this.paymentDate = paymentDate;
        this.amount = amount;
    }

}
