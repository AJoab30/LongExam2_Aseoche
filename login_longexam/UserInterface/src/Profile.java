import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;

public class Profile {

	private JFrame frmProfile;
	private JTextField txtWelcomeAndreJoab;
	private JTextField txtCourses;
	private JTextField txtStudentInformation;
	private JTextField txtComputerScience;
	private JTextField txtMedTech;
	private JTextField txtEngineering;
	private JTextField txtNursing;
	private JTextField txtArchitecture;
	private JTextField txtTuitionPhp;
	private JTextField txtTuitionPhp_1;
	private JTextField txtMiscellaneousPhp_1;
	private JTextField txtTuitionPhp_2;
	private JTextField txtMiscellaneousPhp_2;
	private JTextField txtMiscellaneousPhp;
	private JTextField txtTuitionPhp_3;
	private JTextField txtMiscellaneousPhp_3;
	private JTextField txtTuitionPhp_4;
	private JTextField txtMiscellaneousPhp_4;
	private JTextField txtIdNumber;
	private JTextField txtFirstName;
	private JTextField txtLastName;
	private JTextField txtDiscount;
	private JTextField txtCourse;
	private JTextField textField_5;
	private JTextField txtAndreJoab;
	private JTextField txtAseoche;
	private JTextField txtSilver;
	private JTextField txtComputerScience_1;
	private JTextField txtTuitionFeediscounted;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Profile window = new Profile();
					window.frmProfile.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Profile() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmProfile = new JFrame();
		frmProfile.setUndecorated(true);
		frmProfile.setBounds(100, 100, 873, 667);
		frmProfile.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmProfile.setLocationRelativeTo(null);
		frmProfile.getContentPane().setLayout(null);
		
		txtWelcomeAndreJoab = new JTextField();
		txtWelcomeAndreJoab.setForeground(Color.WHITE);
		txtWelcomeAndreJoab.setBackground(Color.BLUE);
		txtWelcomeAndreJoab.setBorder(null);
		txtWelcomeAndreJoab.setHorizontalAlignment(SwingConstants.CENTER);
		txtWelcomeAndreJoab.setFont(new Font("Arial", Font.BOLD, 14));
		txtWelcomeAndreJoab.setText("Welcome Andre Joab! :)");
		txtWelcomeAndreJoab.setBounds(21, 0, 827, 36);
		frmProfile.getContentPane().add(txtWelcomeAndreJoab);
		txtWelcomeAndreJoab.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("C:\\downlaods\\for user\\andre.jpg"));
		lblNewLabel.setBounds(59, 36, 750, 214);
		frmProfile.getContentPane().add(lblNewLabel);
		
		JLabel lblX = new JLabel("X");
		lblX.setBorder(null);
		lblX.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
					if(JOptionPane.showConfirmDialog(null, "Do you want to go back to the sign in page?", "Are you sure?", JOptionPane.YES_NO_OPTION) == 0) {
						login.main(null);
						frmProfile.dispose();
						}
				}
			
		});
		lblX.setFont(new Font("Arial", Font.BOLD, 14));
		lblX.setHorizontalAlignment(SwingConstants.CENTER);
		lblX.setForeground(Color.BLACK);
		lblX.setBounds(841, 0, 32, 25);
		frmProfile.getContentPane().add(lblX);
		
		JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(Color.BLACK, 2, true));
		panel.setBounds(21, 268, 404, 355);
		frmProfile.getContentPane().add(panel);
		panel.setLayout(null);
		
		txtCourses = new JTextField();
		txtCourses.setForeground(Color.WHITE);
		txtCourses.setBackground(Color.BLUE);
		txtCourses.setFont(new Font("Arial", Font.BOLD, 14));
		txtCourses.setHorizontalAlignment(SwingConstants.CENTER);
		txtCourses.setText("COURSES");
		txtCourses.setBounds(10, 11, 384, 20);
		panel.add(txtCourses);
		txtCourses.setColumns(10);
		
		txtComputerScience = new JTextField();
		txtComputerScience.setFont(new Font("Arial", Font.BOLD, 12));
		txtComputerScience.setHorizontalAlignment(SwingConstants.CENTER);
		txtComputerScience.setBorder(null);
		txtComputerScience.setText("Computer Science:\r\n");
		txtComputerScience.setBounds(10, 42, 139, 20);
		panel.add(txtComputerScience);
		txtComputerScience.setColumns(10);
		
		txtMedTech = new JTextField();
		txtMedTech.setFont(new Font("Arial", Font.BOLD, 12));
		txtMedTech.setHorizontalAlignment(SwingConstants.CENTER);
		txtMedTech.setBorder(null);
		txtMedTech.setText("Med Tech:");
		txtMedTech.setColumns(10);
		txtMedTech.setBounds(10, 103, 139, 20);
		panel.add(txtMedTech);
		
		txtEngineering = new JTextField();
		txtEngineering.setFont(new Font("Arial", Font.BOLD, 12));
		txtEngineering.setHorizontalAlignment(SwingConstants.CENTER);
		txtEngineering.setBorder(null);
		txtEngineering.setText("Engineering:");
		txtEngineering.setColumns(10);
		txtEngineering.setBounds(10, 164, 139, 20);
		panel.add(txtEngineering);
		
		txtNursing = new JTextField();
		txtNursing.setFont(new Font("Arial", Font.BOLD, 12));
		txtNursing.setHorizontalAlignment(SwingConstants.CENTER);
		txtNursing.setBorder(null);
		txtNursing.setText("Nursing:");
		txtNursing.setColumns(10);
		txtNursing.setBounds(10, 228, 139, 20);
		panel.add(txtNursing);
		
		txtArchitecture = new JTextField();
		txtArchitecture.setFont(new Font("Arial", Font.BOLD, 12));
		txtArchitecture.setHorizontalAlignment(SwingConstants.CENTER);
		txtArchitecture.setBorder(null);
		txtArchitecture.setText("Architecture:");
		txtArchitecture.setColumns(10);
		txtArchitecture.setBounds(10, 291, 139, 20);
		panel.add(txtArchitecture);
		
		txtTuitionPhp = new JTextField();
		txtTuitionPhp.setText("Tuition: Php 20,000.00");
		txtTuitionPhp.setHorizontalAlignment(SwingConstants.CENTER);
		txtTuitionPhp.setFont(new Font("Arial", Font.BOLD, 10));
		txtTuitionPhp.setColumns(10);
		txtTuitionPhp.setBorder(new LineBorder(Color.YELLOW));
		txtTuitionPhp.setBounds(134, 60, 260, 20);
		panel.add(txtTuitionPhp);
		
		txtTuitionPhp_1 = new JTextField();
		txtTuitionPhp_1.setText("Tuition: Php 25,000.00");
		txtTuitionPhp_1.setHorizontalAlignment(SwingConstants.CENTER);
		txtTuitionPhp_1.setFont(new Font("Arial", Font.BOLD, 10));
		txtTuitionPhp_1.setColumns(10);
		txtTuitionPhp_1.setBorder(new LineBorder(Color.YELLOW));
		txtTuitionPhp_1.setBounds(134, 116, 260, 20);
		panel.add(txtTuitionPhp_1);
		
		txtMiscellaneousPhp_1 = new JTextField();
		txtMiscellaneousPhp_1.setText("Miscellaneous: Php 25,000.00");
		txtMiscellaneousPhp_1.setHorizontalAlignment(SwingConstants.CENTER);
		txtMiscellaneousPhp_1.setFont(new Font("Arial", Font.BOLD, 10));
		txtMiscellaneousPhp_1.setColumns(10);
		txtMiscellaneousPhp_1.setBorder(new LineBorder(Color.YELLOW));
		txtMiscellaneousPhp_1.setBounds(134, 143, 260, 20);
		panel.add(txtMiscellaneousPhp_1);
		
		txtTuitionPhp_2 = new JTextField();
		txtTuitionPhp_2.setText("Tuition: Php 17,000.00");
		txtTuitionPhp_2.setHorizontalAlignment(SwingConstants.CENTER);
		txtTuitionPhp_2.setFont(new Font("Arial", Font.BOLD, 10));
		txtTuitionPhp_2.setColumns(10);
		txtTuitionPhp_2.setBorder(new LineBorder(Color.YELLOW));
		txtTuitionPhp_2.setBounds(134, 174, 260, 20);
		panel.add(txtTuitionPhp_2);
		
		txtMiscellaneousPhp_2 = new JTextField();
		txtMiscellaneousPhp_2.setText("Miscellaneous: Php 10,000.00");
		txtMiscellaneousPhp_2.setHorizontalAlignment(SwingConstants.CENTER);
		txtMiscellaneousPhp_2.setFont(new Font("Arial", Font.BOLD, 10));
		txtMiscellaneousPhp_2.setColumns(10);
		txtMiscellaneousPhp_2.setBorder(new LineBorder(Color.YELLOW));
		txtMiscellaneousPhp_2.setBounds(134, 205, 260, 20);
		panel.add(txtMiscellaneousPhp_2);
		
		txtMiscellaneousPhp = new JTextField();
		txtMiscellaneousPhp.setText("Miscellaneous: Php 22,000.00");
		txtMiscellaneousPhp.setHorizontalAlignment(SwingConstants.CENTER);
		txtMiscellaneousPhp.setFont(new Font("Arial", Font.BOLD, 10));
		txtMiscellaneousPhp.setColumns(10);
		txtMiscellaneousPhp.setBorder(new LineBorder(Color.YELLOW));
		txtMiscellaneousPhp.setBounds(134, 85, 260, 20);
		panel.add(txtMiscellaneousPhp);
		
		txtTuitionPhp_3 = new JTextField();
		txtTuitionPhp_3.setText("Tuition: Php 26,000.00");
		txtTuitionPhp_3.setHorizontalAlignment(SwingConstants.CENTER);
		txtTuitionPhp_3.setFont(new Font("Arial", Font.BOLD, 10));
		txtTuitionPhp_3.setColumns(10);
		txtTuitionPhp_3.setBorder(new LineBorder(Color.YELLOW));
		txtTuitionPhp_3.setBounds(134, 236, 260, 20);
		panel.add(txtTuitionPhp_3);
		
		txtMiscellaneousPhp_3 = new JTextField();
		txtMiscellaneousPhp_3.setText("Miscellaneous: Php 20,000.00");
		txtMiscellaneousPhp_3.setHorizontalAlignment(SwingConstants.CENTER);
		txtMiscellaneousPhp_3.setFont(new Font("Arial", Font.BOLD, 10));
		txtMiscellaneousPhp_3.setColumns(10);
		txtMiscellaneousPhp_3.setBorder(new LineBorder(Color.YELLOW));
		txtMiscellaneousPhp_3.setBounds(134, 267, 260, 20);
		panel.add(txtMiscellaneousPhp_3);
		
		txtTuitionPhp_4 = new JTextField();
		txtTuitionPhp_4.setText("Tuition: Php 28,000.00");
		txtTuitionPhp_4.setHorizontalAlignment(SwingConstants.CENTER);
		txtTuitionPhp_4.setFont(new Font("Arial", Font.BOLD, 10));
		txtTuitionPhp_4.setColumns(10);
		txtTuitionPhp_4.setBorder(new LineBorder(Color.YELLOW));
		txtTuitionPhp_4.setBounds(134, 298, 260, 20);
		panel.add(txtTuitionPhp_4);
		
		txtMiscellaneousPhp_4 = new JTextField();
		txtMiscellaneousPhp_4.setText("Miscellaneous: Php 25,000.00");
		txtMiscellaneousPhp_4.setHorizontalAlignment(SwingConstants.CENTER);
		txtMiscellaneousPhp_4.setFont(new Font("Arial", Font.BOLD, 10));
		txtMiscellaneousPhp_4.setColumns(10);
		txtMiscellaneousPhp_4.setBorder(new LineBorder(Color.YELLOW));
		txtMiscellaneousPhp_4.setBounds(134, 324, 260, 20);
		panel.add(txtMiscellaneousPhp_4);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new LineBorder(Color.BLACK, 2, true));
		panel_1.setBounds(435, 268, 404, 355);
		frmProfile.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		txtStudentInformation = new JTextField();
		txtStudentInformation.setForeground(Color.WHITE);
		txtStudentInformation.setBackground(Color.BLUE);
		txtStudentInformation.setFont(new Font("Arial", Font.BOLD, 14));
		txtStudentInformation.setHorizontalAlignment(SwingConstants.CENTER);
		txtStudentInformation.setText("STUDENT INFORMATION");
		txtStudentInformation.setBounds(10, 11, 384, 20);
		panel_1.add(txtStudentInformation);
		txtStudentInformation.setColumns(10);
		
		txtIdNumber = new JTextField();
		txtIdNumber.setText("I.D. Number:");
		txtIdNumber.setHorizontalAlignment(SwingConstants.CENTER);
		txtIdNumber.setFont(new Font("Arial", Font.BOLD, 12));
		txtIdNumber.setColumns(10);
		txtIdNumber.setBorder(null);
		txtIdNumber.setBounds(32, 75, 139, 20);
		panel_1.add(txtIdNumber);
		
		txtFirstName = new JTextField();
		txtFirstName.setText("First Name:");
		txtFirstName.setHorizontalAlignment(SwingConstants.CENTER);
		txtFirstName.setFont(new Font("Arial", Font.BOLD, 12));
		txtFirstName.setColumns(10);
		txtFirstName.setBorder(null);
		txtFirstName.setBounds(32, 119, 139, 20);
		panel_1.add(txtFirstName);
		
		txtLastName = new JTextField();
		txtLastName.setText("Last Name:");
		txtLastName.setHorizontalAlignment(SwingConstants.CENTER);
		txtLastName.setFont(new Font("Arial", Font.BOLD, 12));
		txtLastName.setColumns(10);
		txtLastName.setBorder(null);
		txtLastName.setBounds(32, 165, 139, 20);
		panel_1.add(txtLastName);
		
		txtDiscount = new JTextField();
		txtDiscount.setText("Discount:");
		txtDiscount.setHorizontalAlignment(SwingConstants.CENTER);
		txtDiscount.setFont(new Font("Arial", Font.BOLD, 12));
		txtDiscount.setColumns(10);
		txtDiscount.setBorder(null);
		txtDiscount.setBounds(32, 209, 139, 20);
		panel_1.add(txtDiscount);
		
		txtCourse = new JTextField();
		txtCourse.setText("Course:");
		txtCourse.setHorizontalAlignment(SwingConstants.CENTER);
		txtCourse.setFont(new Font("Arial", Font.BOLD, 12));
		txtCourse.setColumns(10);
		txtCourse.setBorder(null);
		txtCourse.setBounds(32, 257, 139, 20);
		panel_1.add(txtCourse);
		
		textField_5 = new JTextField();
		textField_5.setText("2020-204048");
		textField_5.setHorizontalAlignment(SwingConstants.CENTER);
		textField_5.setFont(new Font("Arial", Font.PLAIN, 12));
		textField_5.setColumns(10);
		textField_5.setBorder(null);
		textField_5.setBounds(171, 75, 139, 20);
		panel_1.add(textField_5);
		
		txtAndreJoab = new JTextField();
		txtAndreJoab.setText("Andre Joab");
		txtAndreJoab.setHorizontalAlignment(SwingConstants.CENTER);
		txtAndreJoab.setFont(new Font("Arial", Font.PLAIN, 12));
		txtAndreJoab.setColumns(10);
		txtAndreJoab.setBorder(null);
		txtAndreJoab.setBounds(171, 119, 139, 20);
		panel_1.add(txtAndreJoab);
		
		txtAseoche = new JTextField();
		txtAseoche.setText("Aseoche");
		txtAseoche.setHorizontalAlignment(SwingConstants.CENTER);
		txtAseoche.setFont(new Font("Arial", Font.PLAIN, 12));
		txtAseoche.setColumns(10);
		txtAseoche.setBorder(null);
		txtAseoche.setBounds(171, 165, 139, 20);
		panel_1.add(txtAseoche);
		
		txtSilver = new JTextField();
		txtSilver.setText("Silver");
		txtSilver.setHorizontalAlignment(SwingConstants.CENTER);
		txtSilver.setFont(new Font("Arial", Font.PLAIN, 12));
		txtSilver.setColumns(10);
		txtSilver.setBorder(null);
		txtSilver.setBounds(171, 209, 139, 20);
		panel_1.add(txtSilver);
		
		txtComputerScience_1 = new JTextField();
		txtComputerScience_1.setText("Computer Science");
		txtComputerScience_1.setHorizontalAlignment(SwingConstants.CENTER);
		txtComputerScience_1.setFont(new Font("Arial", Font.PLAIN, 12));
		txtComputerScience_1.setColumns(10);
		txtComputerScience_1.setBorder(null);
		txtComputerScience_1.setBounds(171, 257, 139, 20);
		panel_1.add(txtComputerScience_1);
		
		txtTuitionFeediscounted = new JTextField();
		txtTuitionFeediscounted.setText("Tuition Fee (Discounted): Php 21,000.00\r\n");
		txtTuitionFeediscounted.setHorizontalAlignment(SwingConstants.CENTER);
		txtTuitionFeediscounted.setFont(new Font("Arial", Font.BOLD, 12));
		txtTuitionFeediscounted.setColumns(10);
		txtTuitionFeediscounted.setBorder(null);
		txtTuitionFeediscounted.setBounds(32, 306, 318, 20);
		panel_1.add(txtTuitionFeediscounted);
	}

	public void frmProfile() {
		// TODO Auto-generated method stub
		
	}
	}


