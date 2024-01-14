import java.sql.*;

public class createTable {
    public static void main(String[] args) {
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url = "jdbc:mysql://127.0.0.1:3306/studentOfMCA";
            String user = "root";
            String password = "root0_";
            Connection connect = DriverManager.getConnection(url, user, password);
            String query = "CREATE TABLE Employees(eid varchar(10) PRIMARY KEY, Name varchar(20), Department varchar(15), Salary decimal(15,3), City varchar(15))";
            Statement stmt = connect.createStatement();
            stmt.executeUpdate(query);
            System.out.println("Table Created");
            connect.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
