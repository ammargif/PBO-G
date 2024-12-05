import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.File;

public class ImageViewer {
    private JLabel imageLabel;

    public ImageViewer() {
        JFrame frame = new JFrame("Image Viewer");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 500);

        // Panel untuk menampilkan gambar
        JPanel imagePanel = new JPanel();
        imageLabel = new JLabel();
        imagePanel.add(imageLabel);

        // Tombol dan menu
        JButton btnOpen = new JButton("Open Image");
        btnOpen.addActionListener(e -> openImage(frame));

        frame.add(imagePanel, BorderLayout.CENTER);
        frame.add(btnOpen, BorderLayout.SOUTH);

        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }

    private void openImage(JFrame frame) {
        JFileChooser fileChooser = new JFileChooser();
        if (fileChooser.showOpenDialog(frame) == JFileChooser.APPROVE_OPTION) {
            File file = fileChooser.getSelectedFile();
            ImageIcon imageIcon = new ImageIcon(file.getPath());
            imageLabel.setIcon(imageIcon);
            imageLabel.setText("");
        }
    }
}
