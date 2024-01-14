import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.io.InputStreamReader;
import java.io.BufferedReader;

public class dynamicInput {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url = "jdbc:mysql://127.0.0.1:3306/studentOfMCA";
            String user = "root";
            String pass = "root0_";
            Connection connect = DriverManager.getConnection(url, user, pass);
            String query = "INSERT INTO clients values(?, ?, ?, ?, ?)";
            PreparedStatement pstmt = connect.prepareStatement(query);
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            System.out.print("Enter Client No. : ");
            String clno = br.readLine();
            System.out.print("Enter Name : ");
            String name = br.readLine();
            System.out.print("Enter Department : ");
            String dept = br.readLine();
            System.out.print("Enter Salary : ");
            double salary = Double.parseDouble(br.readLine());
            System.out.print("Enter City : ");
            String city = br.readLine();

            pstmt.setString(1, clno);
            pstmt.setString(2, name);
            pstmt.setString(3, dept);
            pstmt.setDouble(4, salary);
            pstmt.setString(5, city);
            pstmt.executeUpdate();

            System.out.println("Data Inserted");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
