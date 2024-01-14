import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.io.InputStream;
import java.sql.Blob;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class helper {
    public static ImageIcon getImageIconById(int id, Connection connect) {
        ImageIcon icon = null;
        try {
            String query = "select picture from images where id = ?";
            PreparedStatement stmt = connect.prepareStatement(query);
            stmt.setInt(1, id);
            ResultSet set = stmt.executeQuery();
            if(set.next()) {
                Blob blob = set.getBlob("picture");
                InputStream is = blob.getBinaryStream();
                Image image = ImageIO.read(is);
                icon = new ImageIcon(image);
            }
        }
        catch (Exception e){
            e.printStackTrace();
        }
        return icon;
    }
}
