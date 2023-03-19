import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JPanel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JComboBox;
import javax.swing.JRadioButton;
import javax.swing.ImageIcon;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.border.SoftBevelBorder;
import javax.swing.plaf.basic.BasicInternalFrameTitlePane.IconifyAction;
import javax.swing.border.BevelBorder;
import javax.swing.border.LineBorder;
import javax.swing.SwingConstants;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Set;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;

public class NewAccount {

	private JFrame frmNewAccount;
	private JTextField textFieldFirstname;
	private JTextField textFieldLastname;
	private JTextField textFieldUsername;
	private JPasswordField pwdPassword;
	private JTextField txtSignUp;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					NewAccount window = new NewAccount();
					window.frmNewAccount.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public NewAccount() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmNewAccount = new JFrame();
		frmNewAccount.getContentPane().setBackground(new Color(230, 230, 250));
		frmNewAccount.getContentPane().setLayout(null);
		frmNewAccount.setLocationRelativeTo(null);
	
		JLabel lblSignUp = new JLabel("Sign Up");
		lblSignUp.setFont(new Font("Calibri", Font.BOLD, 25));
		lblSignUp.setBounds(26, 51, 94, 47);
		frmNewAccount.getContentPane().add(lblSignUp);
		
		JLabel lblNewLabel = new JLabel("It's quick and easy");
		lblNewLabel.setBounds(26, 88, 109, 26);
		frmNewAccount.getContentPane().add(lblNewLabel);
		
		JPanel pnlUsername = new JPanel();
		pnlUsername.setBounds(26, 125, 166, 43);
		frmNewAccount.getContentPane().add(pnlUsername);
		pnlUsername.setLayout(null);
		
		textFieldFirstname = new JTextField();
		textFieldFirstname.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				if(textFieldFirstname.getText().equals("First name")) {
					textFieldFirstname.setText("");
				}
				else {
					textFieldFirstname.selectAll();
				}
				
			}
			@Override
			public void focusLost(FocusEvent e) {
				if(textFieldFirstname.getText().equals(""))
					textFieldFirstname.setText("First name");
			}
		});
		textFieldFirstname.setBorder(null);
		textFieldFirstname.setText("First name");
		textFieldFirstname.setBounds(10, 11, 146, 20);
		pnlUsername.add(textFieldFirstname);
		textFieldFirstname.setColumns(10);
		
		JPanel pnlLastname = new JPanel();
		pnlLastname.setBounds(202, 125, 170, 43);
		frmNewAccount.getContentPane().add(pnlLastname);
		pnlLastname.setLayout(null);
		
		textFieldLastname = new JTextField();
		textFieldLastname.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				if(textFieldLastname.getText().equals("Last name")) {
					textFieldLastname.setText("");
				}
				else {
					textFieldLastname.selectAll();
				}
			}
			@Override
			public void focusLost(FocusEvent e) {
				if(textFieldLastname.getText().equals(""))
		           textFieldLastname.setText("Last name");		
			}
		});
		textFieldLastname.setBorder(null);
		textFieldLastname.setText("Last name");
		textFieldLastname.setBounds(10, 11, 150, 21);
		pnlLastname.add(textFieldLastname);
		textFieldLastname.setColumns(10);
		
		JPanel pnlEmailAddressorMobileNumber = new JPanel();
		pnlEmailAddressorMobileNumber.setBounds(26, 188, 351, 43);
		frmNewAccount.getContentPane().add(pnlEmailAddressorMobileNumber);
		pnlEmailAddressorMobileNumber.setLayout(null);
		
		textFieldUsername = new JTextField();
		textFieldUsername.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				if(textFieldUsername.getText().equals("Username or Mobile Number")) {
			textFieldUsername.setText("");
		}
		else {
			textFieldUsername.selectAll();
		}
			}
			@Override
			public void focusLost(FocusEvent e) {
				if(textFieldUsername.getText().equals(""))
					textFieldUsername.setText("Username or Mobile Number");
			}
		});
		textFieldUsername.setBorder(null);
		textFieldUsername.setText("Username or Mobile Number");
		textFieldUsername.setBounds(10, 11, 331, 21);
		pnlEmailAddressorMobileNumber.add(textFieldUsername);
		textFieldUsername.setColumns(10);
		
		JPanel pnlNewPassword = new JPanel();
		pnlNewPassword.setBounds(26, 242, 351, 43);
		frmNewAccount.getContentPane().add(pnlNewPassword);
		pnlNewPassword.setLayout(null);
		
		pwdPassword = new JPasswordField();
		pwdPassword.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				if(pwdPassword.getText().equals("Password")) {
					pwdPassword.setEchoChar('●');
					pwdPassword.setText("");
				}
				else {
					pwdPassword.selectAll();
				}			
			}
			@Override
			public void focusLost(FocusEvent e) {
				if(pwdPassword.getText().equals("")) {
				  pwdPassword.setText("Password");
				  pwdPassword.setEchoChar((char)0);
			}
			}
		});
		pwdPassword.setBorder(null);
		pwdPassword.setEchoChar((char)0);
		pwdPassword.setText("Password");
		pwdPassword.setBounds(10, 11, 331, 21);
		pnlNewPassword.add(pwdPassword);
		
		JLabel lblNewLabel_1 = new JLabel("Date of Birth");
		lblNewLabel_1.setBounds(26, 291, 87, 14);
		frmNewAccount.getContentPane().add(lblNewLabel_1);
		
		Integer[] days = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31}; 
		JComboBox comboBoxDay = new JComboBox(days);
		comboBoxDay.setBounds(26, 316, 74, 26);
		frmNewAccount.getContentPane().add(comboBoxDay);
		
		String[] month = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
		JComboBox comboBox2 = new JComboBox(month);
		comboBox2.setBounds(122, 316, 109, 26);
		frmNewAccount.getContentPane().add(comboBox2);
		
		Integer[] year = {1995, 1996, 1997, 1998, 1999, 2000, 2001, 2002, 2003, 2004, 2005, 2006, 2007, 2008, 2009, 2010};
		JComboBox comboBoxYear = new JComboBox(year);
		comboBoxYear.setBounds(257, 316, 109, 26);
		frmNewAccount.getContentPane().add(comboBoxYear);
		
		JLabel lblNewLabel_2 = new JLabel("Gender");
		lblNewLabel_2.setBounds(26, 356, 87, 14);
		frmNewAccount.getContentPane().add(lblNewLabel_2);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("Male");
		rdbtnNewRadioButton.setBounds(26, 389, 109, 23);
		frmNewAccount.getContentPane().add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("Female");
		rdbtnNewRadioButton_1.setBounds(159, 389, 109, 23);
		frmNewAccount.getContentPane().add(rdbtnNewRadioButton_1);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setIcon(new ImageIcon("C:\\downlaods\\for user\\design.png"));
		lblNewLabel_3.setBounds(10, 437, 418, 107);
		frmNewAccount.getContentPane().add(lblNewLabel_3);
		
		final JLabel lblNewLabelX = new JLabel("X");
		lblNewLabelX.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(JOptionPane.showConfirmDialog(null, "Do you want to go back to the sign in page?", "Are you sure?", JOptionPane.YES_NO_OPTION) == 0) {
					login.main(null);
					frmNewAccount.dispose();
					}
			}
			@Override
			public void mouseEntered(MouseEvent e) {
			lblNewLabelX.setForeground(Color.RED); 
			}
			@Override
			public void mouseExited(MouseEvent e) {
			lblNewLabelX.setForeground(Color.BLACK); 
			}
		});
		lblNewLabelX.setFont(new Font("Arial", Font.BOLD, 14));
		lblNewLabelX.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabelX.setBounds(449, 0, 20, 20);
		frmNewAccount.getContentPane().add(lblNewLabelX);
		
		JLabel lblLoginMessage = new JLabel("");
		lblLoginMessage.setForeground(new Color(255, 0, 0));
		lblLoginMessage.setFont(new Font("Arial", Font.BOLD, 12));
		lblLoginMessage.setBounds(26, 428, 151, 14);
		frmNewAccount.getContentPane().add(lblLoginMessage);
		
		JPanel pnlSignUp = new JPanel();
		pnlSignUp.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
			}
		});
		pnlSignUp.setBackground(new Color(0, 0, 255));
		pnlSignUp.setForeground(new Color(0, 0, 255));
		pnlSignUp.setBounds(296, 377, 132, 31);
		frmNewAccount.getContentPane().add(pnlSignUp);
		pnlSignUp.setLayout(null);
		
		txtSignUp = new JTextField();
		txtSignUp.setForeground(new Color(255, 255, 255));
		txtSignUp.setBackground(new Color(0, 0, 255));
		txtSignUp.setBorder(null);
		txtSignUp.setBounds(34, 5, 57, 20);
		pnlSignUp.add(txtSignUp);
		txtSignUp.setFont(new Font("Arial", Font.BOLD, 14));
		txtSignUp.setText("Sign Up");
		txtSignUp.setColumns(10);
		frmNewAccount.setUndecorated(true);
		frmNewAccount.setBounds(100, 100, 466, 608);
		frmNewAccount.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		
	}
}
