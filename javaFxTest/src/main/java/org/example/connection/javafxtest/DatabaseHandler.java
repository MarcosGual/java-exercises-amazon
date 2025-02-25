package org.example.connection.javafxtest;

import java.sql.*;

public class DatabaseHandler {
    private final String url = "jdbc:mysql://localhost:3306/";
    private final String user = "root";
    private final String password = "1959marcos";

    public Connection getConnection() throws SQLException {
            return DriverManager.getConnection(url, user, password);
    }

    public String getAllUsers() throws SQLException {
        String userData = "";
        String query = "SELECT * FROM user";
        Connection clickNBuyConnection = getConnection();
        Statement queryStatement = clickNBuyConnection.createStatement();
        ResultSet usersRs = queryStatement.executeQuery(query);

        while(usersRs.next()){
            userData += usersRs.getInt("user_id")+ " - "+
                    usersRs.getString("user_name");
        }

        return userData;
    }
}
