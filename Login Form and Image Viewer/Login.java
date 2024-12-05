import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Login {
    private static final String USERNAME = "adminits";
    private static final String PASSWORD = "itssurabaya";
    private JTextField txtUsername;
    private JPasswordField txtPassword;

    public void go() {
        JFrame frame = new JFrame("Login");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 150);
        frame.setLayout(new GridLayout(3, 2));

        // Komponen GUI
        JLabel lblUsername = new JLabel("Username:");
        JLabel lblPassword = new JLabel("Password:");
        txtUsername = new JTextField();
        txtPassword = new JPasswordField();
        JButton btnLogin = new JButton("Login");
        JButton btnCancel = new JButton("Cancel");

        // Tambahkan komponen ke frame
        frame.add(lblUsername);
        frame.add(txtUsername);
        frame.add(lblPassword);
        frame.add(txtPassword);
        frame.add(btnLogin);
        frame.add(btnCancel);

        // Listener
        btnLogin.addActionListener(new LoginListener());
        btnCancel.addActionListener(new CancelListener());

        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }

    class LoginListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            String username = txtUsername.getText();
            String password = new String(txtPassword.getPassword());
            if (USERNAME.equals(username) && PASSWORD.equals(password)) {
                JOptionPane.showMessageDialog(null, "Login Granted!");
                new ImageViewer(); // Arahkan ke ImageViewer
            } else {
                JOptionPane.showMessageDialog(null, "Login Denied!", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }

    class CancelListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            txtUsername.setText("");
            txtPassword.setText("");
            txtUsername.requestFocus();
        }
    }

    public static void main(String[] args) {
        new Login().go();
    }
}
