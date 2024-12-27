package connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {
    protected static ConnectionFactory connect;
    protected final static String DRIVER = "com.mysql.jdbc.Driver"; // Driver para o MYSQL, mude caso usar outro BD
    protected final static String URL = ""; // URL do Banco de Dados
    protected final static String USER = ""; // Usuário para se conectar ao Banco de Dados
    protected final static String PASS = "";  // Senha para se conectar ao Banco de Dados

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
