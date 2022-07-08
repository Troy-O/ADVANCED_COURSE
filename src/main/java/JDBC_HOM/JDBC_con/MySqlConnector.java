package JDBC_HOM.JDBC_con;

import JDBC_HOM.JDBC_con.Connector;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MySqlConnector implements Connector {
    private static String JDBC_DRIVER="com.mysql.cj.jdbc.Driver";
    private  static String URL="jdbc:mysql://localhost:3306/homework_2?serverTimezone=UTC";

    private static String NAME="root";
    private static String PASSWORD="dima";

    @Override
    public Connection getConnection() {
        Connection connection=null;
        try {


            connection= DriverManager.getConnection(URL,NAME,PASSWORD);


        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return  connection;
    }
}
