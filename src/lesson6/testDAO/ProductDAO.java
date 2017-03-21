package lesson6.testDAO;

import com.j256.ormlite.dao.Dao;
import com.j256.ormlite.dao.DaoManager;
import com.j256.ormlite.jdbc.JdbcConnectionSource;
import com.j256.ormlite.stmt.QueryBuilder;
import com.j256.ormlite.support.ConnectionSource;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Lelouch on 11.03.2017.
 */
public class ProductDAO {
    public static void main(String[] args) {

    ConnectionSource connectionSource;
    String login = "user1";
    String password = "pass1";

    String dbURL = "jdbc:mysql://localhost/classicmodels?" + "user=" + login + "&password=" + password;

    Dao<Product, String> productDAO;
        try {
            connectionSource = new JdbcConnectionSource(dbURL);
            productDAO = DaoManager.createDao(connectionSource, Product.class);



       // List<Product> productList = new ArrayList<>();


            QueryBuilder<Product, String> productQb = productDAO.queryBuilder();
            productQb.where().eq("productLine","Ships");
            List<Product> productList =   productQb.query();
            for (Product products: productList
                 ) {
                System.out.println(products);
            }
        }catch (SQLException e){
            e.printStackTrace();
        }


    }
}
