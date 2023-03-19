import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.crypto.AEADBadTagException;
import javax.swing.ImageIcon;
import java.awt.Font;
import java.awt.TextField;
import java.awt.Color;
import java.awt.FlowLayout;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.RowSpec;
import com.jgoodies.forms.layout.FormSpecs;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.SwingConstants;
import javax.swing.text.html.HTMLDocument.HTMLReader.PreAction;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;

public class login {

	private JFrame frmWelcome;
	private JTextField txtUsername;
	private JPasswordField txtPassword;
	private JPanel pnlBtnLogin;
	private JLabel lblLoginMessage = new JLabel("");

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					login window = new login();
					window.frmWelcome.setVisible(true);
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
		frmWelcome = new JFrame();
		frmWelcome.setBackground(Color.GRAY);
		frmWelcome.getContentPane().setBackground(Color.WHITE);
		frmWelcome.setUndecorated(true);
		frmWelcome.setForeground(Color.BLACK);
		frmWelcome.setFont(new Font("Times New Roman", Font.BOLD, 12));
		frmWelcome.setBounds(100, 100, 876, 628);
		frmWelcome.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmWelcome.getContentPane().setLayout(null);
		frmWelcome.setLocationRelativeTo(null);
		
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setBackground(Color.CYAN);
		lblNewLabel.setBounds(345, 139, 188, 69);
		lblNewLabel.setIcon(new ImageIcon("C:\\downlaods\\for user\\Screenshot 2023-03-19 022627.png"));
		frmWelcome.getContentPane().add(lblNewLabel);
		
		JPanel panel = new JPanel();
		panel.setBounds(296, 245, 300, 40);
		frmWelcome.getContentPane().add(panel);
		panel.setLayout(null);
		
		txtUsername = new JTextField();
		txtUsername.addFocusListener(new FocusAdapter() {	
			@Override
			public void focusGained(FocusEvent e) {
				if(txtUsername.getText().equals("Email Address or Mobile Number")) {
					txtUsername.setText("");
				}
			
				else {
					txtUsername.selectAll(); 		
			}
		  }
			@Override
			public void focusLost(FocusEvent e) {
				if(txtUsername.getText().equals(""))
					txtUsername.setText("Email Address or Mobile Number");
 			}
		});
		txtUsername.setFont(new Font("Arial", Font.BOLD, 12));
		txtUsername.setBorder(null);
		txtUsername.setText("Email Address or Mobile Number");
		txtUsername.setBounds(10, 11, 242, 18);
		panel.add(txtUsername);
		txtUsername.setColumns(10);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(296, 296, 300, 40);
		frmWelcome.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		txtPassword = new JPasswordField();
		txtPassword.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				if(txtPassword.getText().equals("Password")) {
					txtPassword.setEchoChar('●');
					txtPassword.setText("");
				}
				else {
					txtPassword.selectAll();
				}
			} 
			@Override
			public void focusLost(FocusEvent e) {
				if(txtPassword.getText().equals("")) {
					txtPassword.setText("Password");
					txtPassword.setEchoChar((char)0);
				}
			}
		});
		txtPassword.setFont(new Font("Arial", Font.BOLD, 12));
		txtPassword.setBounds(10, 11, 190, 20);
		panel_1.add(txtPassword);
		txtPassword.setBorder(null);
		txtPassword.setEchoChar((char)0);
		txtPassword.setText("Password");
		pnlBtnLogin = new JPanel();
		pnlBtnLogin.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseExited(MouseEvent e) {
				pnlBtnLogin.setBackground(new Color(40, 40, 150));
			}
			@Override
			public void mousePressed(MouseEvent e) {
				pnlBtnLogin.setBackground(new Color(100, 150, 150));
			}
			@Override
			public void mouseReleased(MouseEvent e) {
				pnlBtnLogin.setBackground(new Color(0, 0, 100));
			}
		});
		pnlBtnLogin.setFocusTraversalKeysEnabled(false);
		pnlBtnLogin.setBackground(new Color(0, 0, 255));
		pnlBtnLogin.setBounds(296, 373, 300, 69);
		frmWelcome.getContentPane().add(pnlBtnLogin);
		pnlBtnLogin.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("LOG IN");
		lblNewLabel_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {		
				if(txtUsername.getText().equals("Andre Joab") && txtPassword.getText().equals("Aseoche30")) {
				   lblLoginMessage.setText("");
				   JOptionPane.showMessageDialog(null, "Log in Successful!");
				   Profile p = new Profile();
				   Profile.main(null);
				   frmWelcome.dispose();
				   }		
				
				else if(txtUsername.getText().equals("") || txtUsername.getText().equals("Username") ||
				txtPassword.getText().equals("")|| txtPassword.getText().equals("Password")) {
					lblLoginMessage.setText("Please Input all Requirements!");
				}
		else {
			lblLoginMessage.setText("Username and Password didn't match!");
		     }			
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				pnlBtnLogin.setBackground(new Color(0, 0, 100));
			}
		});
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblNewLabel_1.setRequestFocusEnabled(false);
		lblNewLabel_1.setBounds(125, 11, 111, 47);
		pnlBtnLogin.add(lblNewLabel_1);
		
		final JLabel lblX2 = new JLabel("X");
		lblX2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) { 
				if(JOptionPane.showConfirmDialog(null, "Are you sure you want to close this application?", "Confirmation", JOptionPane.YES_NO_OPTION) == 0) {
					frmWelcome.dispose();
				}
			}
			@Override
			public void mouseEntered(MouseEvent e) {
			lblX2.setForeground(Color.RED); 
			}
			@Override
			public void mouseExited(MouseEvent e) {
			lblX2.setForeground(Color.BLACK); 
			}
		});
		lblX2.setFont(new Font("Comic Sans MS", Font.BOLD, 14));
		lblX2.setHorizontalAlignment(SwingConstants.CENTER);
		lblX2.setBounds(856, 11, 20, 20);
		frmWelcome.getContentPane().add(lblX2);
		
		lblLoginMessage.setForeground(new Color(128, 0, 0));
		lblLoginMessage.setFont(new Font("Arial", Font.BOLD, 12));
		lblLoginMessage.setBounds(296, 347, 300, 14);
		frmWelcome.getContentPane().add(lblLoginMessage);
		
		JPanel pnlBtnRegister = new JPanel();
		pnlBtnRegister.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				NewAccount na = new NewAccount();
				   NewAccount.main(null);
				   frmWelcome.dispose();
			}
		});
		pnlBtnRegister.setBackground(new Color(0, 255, 0));
		pnlBtnRegister.setBounds(329, 475, 239, 48);
		frmWelcome.getContentPane().add(pnlBtnRegister);
		pnlBtnRegister.setLayout(null);
		
		JLabel lblNewLabel_2 = new JLabel("Create new account");
		lblNewLabel_2.setForeground(new Color(255, 255, 255));
		lblNewLabel_2.setFont(new Font("Calibri", Font.BOLD, 16));
		lblNewLabel_2.setBounds(49, 11, 155, 26);
		pnlBtnRegister.add(lblNewLabel_2);
	}
}
