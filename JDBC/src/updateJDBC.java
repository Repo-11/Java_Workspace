import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.PreparedStatement;

public class updateJDBC {
    public static void main(String[] args) {
        try {
            Connection connect = ConnectionProvider.getConnection();
            String query = "update clients set Department =? where ClientID=?";
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            System.out.print("Enter Client ID : ");
            String cid = br.readLine();
            System.out.print("Enter new Department Name : ");
            String dept = br.readLine();
            PreparedStatement stmt = connect.prepareStatement(query);
            stmt.setString(1, dept);
            stmt.setString(2, cid);
            stmt.executeUpdate();
            System.out.println("Updated...");
            connect.close();
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
}
