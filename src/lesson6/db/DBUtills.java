package lesson6.db;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Created by Lelouch on 11.03.2017.
 */
public class DBUtills {
    static String[] getColumnNames(ResultSet resultSet) throws SQLException {
        // Metadata from the database
        String[] columns = new String[resultSet.getMetaData().getColumnCount()];

        for (int i = 0; i < columns.length; i++) {
            columns[i] = resultSet.getMetaData().getColumnName(i + 1);
        }
        return columns;
    }

    static String[] getColumnTypes(ResultSet resultSet) throws SQLException {
        // Metadata from the database
        String[] types = new String[resultSet.getMetaData().getColumnCount()];

        for (int i = 0; i < types.length; i++) {
            types[i] = resultSet.getMetaData().getColumnTypeName(i + 1);
        }
        return types;
    }

    static String getData(ResultSet resultSet, String columnName, String columnType) {
        String res;
        try {
            switch (columnType) {
                case "INT":
                case "BIGINT":
                    res = "" + resultSet.getInt(columnName);
                    break;
                case "DATE":
                case "DATETIME":
                case "TIMESTAMP":
                    res = "" + resultSet.getDate(columnName);
                    break;
                case "CHAR":
                case "VARCHAR":
                    res = "" + resultSet.getString(columnName);
                    break;
                case "FLOAT":
                    res = "" + resultSet.getFloat(columnName);
                    break;
                case "DOUBLE":
                    res = "" + resultSet.getDouble(columnName);
                    break;
                case "BOOLEAN":
                    res = "" + resultSet.getBoolean(columnName);
                    break;
                default:
                    res = "";
            }
            return res;
        } catch (SQLException e) {
            e.printStackTrace();
            return "";
        }
    }
    static void printResults(ResultSet resultSet) throws SQLException {
        String[] columns = getColumnNames(resultSet);
        String[] types = getColumnTypes(resultSet);
        int cnt = 0;
        for (int i = 0; i < columns.length; i++) {
            System.out.print(columns[i] + " | ");
            cnt += columns[i].length();
        }
        System.out.println("");
        for (int i = 0; i < cnt + 3 * columns.length - 1; i++)
            System.out.print("-");
        System.out.println("");

        while (resultSet.next()) {
            for (int i = 0; i < columns.length; i++) {
                System.out.print(getData(resultSet, columns[i], types[i])
                        + " | ");
            }
            System.out.println("");
        }
    }



}
