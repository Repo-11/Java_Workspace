import javax.swing.*;
import java.io.File;
import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        try {
//            System.out.println("Hello World");
            Connection connect = ConnectionProvider.getConnection();
            String query = "insert into images(picture) value(?)";
            PreparedStatement stmt = connect.prepareStatement(query);
            JFileChooser jfc = new JFileChooser();
            jfc.showOpenDialog(null);
            File file = jfc.getSelectedFile();
            FileInputStream fis = new FileInputStream(file);
            stmt.setBinaryStream(1, fis, fis.available());
            stmt.executeUpdate();
            System.out.println("Inserted...");
            JOptionPane.showMessageDialog(null, "Success");
            connect.close();
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
}