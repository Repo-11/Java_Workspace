import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class insertTable {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/studentOfMCA";
            String user = "root";
            String pass = "root0_";
            Connection connect = DriverManager.getConnection(url, user, pass);
            String query = "INSERT INTO clients values(?, ?, ?, ?, ?)";
            PreparedStatement pstmt = connect.prepareStatement(query);
            pstmt.setString(1, "C0002");
            pstmt.setString(2, "Ankit");
            pstmt.setString(3, "Brothel");
            pstmt.setInt(4, 90000);
            pstmt.setString(5, "Patna");
            pstmt.executeUpdate();
            System.out.println("Data Inserted");
            connect.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
