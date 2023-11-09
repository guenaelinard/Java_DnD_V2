package BDD;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbConnector {
    private static DbConnector instance;
    private Connection connection;

    private final static String DB_URL = "jdbc:mysql://localhost:3306/dnd_db";
    private final static String DB_PASS = "root";
    private final static String DB_USER = "root";

    public static DbConnector getInstance() {
        if(instance == null){
            instance = new DbConnector();
        }
        return instance;
    }

    private DbConnector(){

    }

    public Connection getConnection() throws SQLException {
        if (connection == null || connection.isClosed()){
            this.connection = DriverManager.getConnection(DB_URL, DB_USER, DB_PASS);
        }
        return connection;

    }

}
