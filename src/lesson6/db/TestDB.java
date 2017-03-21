package lesson6.db;

import java.sql.*;

/**
 * Created by Lelouch on 11.03.2017.
 */
public class TestDB {
    public static void main(String[] args) {

        Connection myConnection = null;
        Statement statement = null;
        PreparedStatement preStatement = null;
        ResultSet resultSet = null;





        try {
            Class.forName("com.mysql.jdbc.Driver");


            myConnection = DriverManager.getConnection("jdbc:mysql://localhost/classicmodels?" + "user=user1&password=pass1");
            statement = myConnection.createStatement();
            resultSet = statement.executeQuery("SELECT * FROM customers WHERE country = 'France' OR country = 'Spain';");
            DBUtills.printResults(resultSet);




           /* while (resultSet.next()) {
                int customerNumber = resultSet.getInt("customerNumber");
                String customerName = resultSet.getString("customerName");
                String country = resultSet.getString("country");

                System.out.println("customerNumber " + customerNumber);
                System.out.println("customerName " + customerName);
                System.out.println("country " + country);
            }
            statement = myConnection.createStatement();
            resultSet = statement.executeQuery("SELECT * FROM customers WHERE creditLimit > 100000 AND contactFirstName LIKE 'J%';");

            while (resultSet.next()) {
                int customerNumber = resultSet.getInt("customerNumber");
                String contactFirstName = resultSet.getString("contactFirstName");
                int creditLimit = resultSet.getInt("creditLimit");

                System.out.println("customerNumber " + customerNumber);
                System.out.println("customerFirstName " + contactFirstName);
                System.out.println("creditLimit " + creditLimit);
            }*/
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
}
