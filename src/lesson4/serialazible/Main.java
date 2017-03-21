package lesson4.serialazible;

import java.io.*;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by Lelouch on 18.02.2017.
 */
public class Main {
    public static void main(String[] args) throws IOException, ClassNotFoundException {

        String string;
        int x = 0;
        DateFormat format = new SimpleDateFormat("yyyy-MM-dd");

        try (
                FileInputStream fis = new FileInputStream("D:\\payment_input.txt")) {
            InputStreamReader isr = new InputStreamReader(fis, "CP1251");
            BufferedReader br = new BufferedReader(isr);

            while
                    ((string = br.readLine()) != null) {
                String[] pay = string.split("\\|");
                if (!Character.isDigit(pay[0].charAt(0))) {
                    continue;
                }
                if (pay.length >= 3) {
                    int customerNumber = Integer.parseInt(pay[0]);
                    Date paymentDate = format.parse(pay[1]);
                    double amount = Double.parseDouble(pay[2]);
                    Payments payments = new Payments(customerNumber, paymentDate, amount);

                    try (
                            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("Payment" + x++ + ".dat"))) {
                        oos.writeObject(payments);
                        oos.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }

            }
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}
