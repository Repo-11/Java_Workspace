import java.sql.Connection;
import java.sql.DriverManager;
public class ConnectionProvider {
    private static Connection connect;

    public static Connection getConnection(){
        if (connect == null) {
            try {
                Class.forName("com.mysql.cj.jdbc.Driver");
                connect = DriverManager.getConnection("jdbc:mysql://localhost:3306/studentOfMCA", "root", "root0_");
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return connect;
    }
}
