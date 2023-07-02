package system;

import java.sql.*;

public class DBConnection {

    private static DBConnection instance;
    private static final String DB_URL = "jdbc:mysql://localhost:3306/travel_agency";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "ChPyEnIkJye8#";
    private  Connection connection;
    
    private DBConnection() {
         try {
             // Establish a new connection to our database.
             connection = DriverManager.getConnection(DB_URL, USERNAME, PASSWORD);
         } catch(SQLException ex) {
                ex.printStackTrace();
            }
    }
    
    public static DBConnection getInstance() {
        if (instance == null) {
            instance = new DBConnection();
        }
        return instance;
    }
    
    public Connection getConnection(){
        return connection;
    }
    
    public void closeConnection() {
        if (connection != null) {
            try {
                connection.close();
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
    }
}
