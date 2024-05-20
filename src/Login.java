import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Login extends JFrame {

  private JTextField correo;
  private JPasswordField contraseña;

  public Login() {
  setTitle("Login");
  setSize(600, 300);
  setLocationRelativeTo(null); 
  setVisible(true);
  setResizable(false);
  setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

  JPanel panelLogin = new JPanel(new GridLayout(3, 1, 10, 10)); 

  JPanel panelCorreo = new JPanel();
  panelCorreo.setLayout(new FlowLayout(FlowLayout.CENTER));

  panelCorreo.add(new JLabel("Email:"));
  correo = new JTextField(20); 
  panelCorreo.add(correo);

  JPanel panelContraseña = new JPanel();
  panelContraseña.setLayout(new FlowLayout(FlowLayout.CENTER));

  panelContraseña.add(new JLabel("Contraseña:"));
  contraseña = new JPasswordField(20); 
  panelContraseña.add(contraseña);

  JPanel panelBoton = new JPanel();
  panelBoton.setLayout(new FlowLayout(FlowLayout.CENTER));
  JButton btnLogin = new JButton("Login");
  panelBoton.add(btnLogin);

  panelLogin.add(panelCorreo);
  panelLogin.add(panelContraseña);
  panelLogin.add(panelBoton);

  add(panelLogin, BorderLayout.CENTER);

    
  btnLogin.addActionListener(e -> {
    String email = correo.getText();
    String password = new String(contraseña.getPassword());
    JOptionPane.showMessageDialog(this, "Email: " + email + "\nContraseña: " + password);
  });
}
}