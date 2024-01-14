import java.sql.*;

public class testJDBC {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url = "jdbc:mysql://127.0.0.1:3306/studentOfMCA";
            String user = "root";
            String password = "root0_";
            Connection con = DriverManager.getConnection(url, user, password);
            if(con.isClosed())
                System.out.println("Connection not Established");
            else
                System.out.println("Connection Established");
            String q = "SELECT * FROM clients";
            Statement stmt = con.createStatement();
            ResultSet set = stmt.executeQuery(q);
            System.out.println();
            while (set.next()) {
                String clientID = set.getString("ClientID");
                String name = set.getString("Name");
                String dept = set.getString("Department");
                int salary = set.getInt("Salary");
                String city = set.getString("City");
                System.out.print(clientID + "\t");
                System.out.print(name + "\t");
                System.out.print(dept + " \t");
                System.out.print(salary + "\t");
                System.out.print(city + "\t");
                System.out.println();
            }
            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
