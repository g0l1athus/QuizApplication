package quizapp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class DatabaseResult {

    private ResultSet result;
    private PreparedStatement statement;

    DatabaseResult(String table) throws Exception {

        String pass = "SELECT * FROM " + table;
        Class.forName("com.mysql.jdbc.Driver"); //Starts the driver class that initiates connector statements
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/quiz", "root", ""); //connects to the root of database MYSQL
        statement = con.prepareStatement(pass); //Statemnt that converts java code to mysqlcode (QUERY)
        result = statement.executeQuery(); //result taken from mysql database

    }

    public ResultSet getResult() {
        return result;
    }

    public PreparedStatement getStatement() {
        return statement;
    }

    public static void tableOperations(String tableName, int choice) throws Exception {
        Class.forName("com.mysql.jdbc.Driver"); //Starts the driver class that initiates connector statements
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/quiz", "root", ""); //connects to the root of database MYSQL
        Statement stmt = con.createStatement();
            /*FOR CREATING A TABLE*/
        if (choice == 1) {
            String s = "CREATE TABLE " + tableName + "(`ID` INTEGER not NULL, `Question` VARCHAR(1000),`Answer` VARCHAR(1000),`Option 1` VARCHAR(1000),`Option 2` VARCHAR(1000),`Option 3` VARCHAR(1000),`Option 4` VARCHAR(1000))";
            stmt.executeUpdate(s);
        
        }
        /*FOR DELETING A TABLE*/
        else{
            String s = "DROP TABLE " + tableName ;
            stmt.executeUpdate(s);
        }
        
    }
}
