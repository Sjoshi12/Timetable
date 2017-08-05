import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JButton;

public class login {

	private JFrame frame;
	private JTextField txtPassword;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					login window = new login();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public login() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Username");
		lblNewLabel.setFont(new Font("Monospaced", Font.PLAIN, 13));
		lblNewLabel.setBounds(57, 57, 80, 20);
		frame.getContentPane().add(lblNewLabel);
		
		txtPassword = new JTextField();
		txtPassword.setText("Password");
		txtPassword.setBounds(51, 100, 86, 20);
		frame.getContentPane().add(txtPassword);
		txtPassword.setColumns(10);
		
		textField = new JTextField();
		textField.setFont(new Font("Monospaced", Font.PLAIN, 13));
		textField.setBounds(184, 58, 86, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(184, 100, 86, 20);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		JButton btnLogin = new JButton("Login");
		btnLogin.setBounds(111, 153, 89, 23);
		frame.getContentPane().add(btnLogin);
	}
}
