import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.DriverManager;
import java.io.FileInputStream;

public class insertImage {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connect = DriverManager.getConnection("jdbc:mysql://localhost:3306/studentOfMCA","root", "root0_");
            String query = "insert into images(picture) value(?)";
            PreparedStatement pstmt = connect.prepareStatement(query);
            FileInputStream fis = new FileInputStream("C:\\Users\\kalla\\Downloads\\tree-736885_960_720.jpg");
            pstmt.setBinaryStream(1, fis, fis.available());
            pstmt.executeUpdate();
            System.out.println("Image is Inserted");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

//Limit of blob type file in sql in 65KB