import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class displayImage extends javax.swing.JFrame {
    private JTextField txtField;
    private JButton button;
    private JPanel showImage;
    private JLabel imageLabel;

    public displayImage() {
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
//                String str = txtField.getText();
                int id = Integer.parseInt(txtField.getText());
                ImageIcon icon = helper.getImageIconById(id, ConnectionProvider.getConnection());
                if(icon == null)
                    JOptionPane.showMessageDialog(null, "No image found at this ID");
                imageLabel.setIcon(icon);
            }
        });
    }

    public static void main(String[] args) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                displayImage di = new displayImage();
                di.setLocationRelativeTo(null);
                di.setVisible(true);
            }
        });
    }
}
