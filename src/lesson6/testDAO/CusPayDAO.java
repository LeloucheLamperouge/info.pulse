package lesson6.testDAO;

import com.j256.ormlite.dao.Dao;
import com.j256.ormlite.dao.DaoManager;
import com.j256.ormlite.jdbc.JdbcConnectionSource;
import com.j256.ormlite.stmt.QueryBuilder;
import com.j256.ormlite.support.ConnectionSource;

import java.sql.SQLException;
import java.util.List;

/**
 * Created by Lelouch on 14.03.2017.
 */
public class CusPayDAO {
    public static void main(String[] args) {

        ConnectionSource connectionSource;
        String login = "user1";
        String password = "pass1";

        String dbURL = "jdbc:mysql://localhost/classicmodels?" + "user=" + login + "&password=" + password;

        Dao<Customer, String> cusDAO;
        Dao<Payment, String> payDAO;

        try {
            connectionSource = new JdbcConnectionSource(dbURL);
            cusDAO = DaoManager.createDao(connectionSource, Customer.class);
            payDAO = DaoManager.createDao(connectionSource, Payment.class);

            QueryBuilder<Customer, String> customerQB = cusDAO.queryBuilder();
            QueryBuilder<Payment, String> paymentQB = payDAO.queryBuilder();

            customerQB.where().eq("country", "France");
            List<Payment> payments = paymentQB.join("customerNumber", "customerNumber", customerQB).query();
            for (Payment payment : payments
                    ) {
                System.out.println(payment);
            }

        } catch (
                SQLException e) {
            e.printStackTrace();
        }
    }
}

