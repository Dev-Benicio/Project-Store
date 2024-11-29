package connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {
    protected static ConnectionFactory connect;
    protected final static String DRIVER = "com.mysql.jdbc.Driver";
    protected final static String URL = "jdbc:mysql://localhost:3306/projetojava3e";
    protected final static String USER = "root";
    protected final static String PASS = "";
    
    public static ConnectionFactory getInstance() {
        if (connect == null) {
            return connect = new ConnectionFactory();
        } else {
            return connect;
        }
    }
    
    public static Connection getConnection() throws ClassNotFoundException, SQLException {
        Class.forName(DRIVER);
        return DriverManager.getConnection(URL, USER, PASS);
    }
}