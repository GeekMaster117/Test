package swingTest;

import java.awt.EventQueue;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;

public class Sample {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Sample window = new Sample();
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
	public Sample() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 516, 484);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Registration");
		lblNewLabel.setFont(new Font("Dialog", Font.BOLD, 18));
		lblNewLabel.setBounds(184, 26, 137, 34);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblName = new JLabel("Name");
		lblName.setFont(new Font("Dialog", Font.BOLD, 16));
		lblName.setBounds(57, 100, 90, 34);
		frame.getContentPane().add(lblName);
		
		textField = new JTextField();
		textField.setBounds(138, 109, 114, 19);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JRadioButton rdbtnMale = new JRadioButton("Male");
		rdbtnMale.setFont(new Font("Dialog", Font.BOLD, 16));
		rdbtnMale.setBounds(151, 163, 67, 23);
		frame.getContentPane().add(rdbtnMale);
		
		JRadioButton rdbtnFemale = new JRadioButton("Female");
		rdbtnFemale.setFont(new Font("Dialog", Font.BOLD, 16));
		rdbtnFemale.setBounds(244, 163, 107, 23);
		frame.getContentPane().add(rdbtnFemale);
		
		ButtonGroup bg = new ButtonGroup();
		bg.add(rdbtnMale);
		bg.add(rdbtnFemale);
		
		JLabel lblGender = new JLabel("Gender");
		lblGender.setFont(new Font("Dialog", Font.BOLD, 16));
		lblGender.setBounds(57, 167, 70, 15);
		frame.getContentPane().add(lblGender);
		
		JLabel lblMobileNo = new JLabel("Mobile No");
		lblMobileNo.setFont(new Font("Dialog", Font.BOLD, 16));
		lblMobileNo.setBounds(57, 217, 98, 23);
		frame.getContentPane().add(lblMobileNo);
		
		textField_1 = new JTextField();
		textField_1.setBounds(173, 217, 114, 19);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblFavLanguage = new JLabel("Fav Language");
		lblFavLanguage.setFont(new Font("Dialog", Font.BOLD, 16));
		lblFavLanguage.setBounds(57, 266, 137, 34);
		frame.getContentPane().add(lblFavLanguage);
		
		JComboBox<String> comboBox = new JComboBox<String>();
		comboBox.setModel(new DefaultComboBoxModel<String>(new String[] {"C", "Python", "Java", "C#"}));
		comboBox.setBounds(220, 272, 78, 24);
		frame.getContentPane().add(comboBox);
		
		JLabel lblEmail = new JLabel("Email");
		lblEmail.setFont(new Font("Dialog", Font.BOLD, 16));
		lblEmail.setBounds(57, 330, 90, 23);
		frame.getContentPane().add(lblEmail);
		
		textField_2 = new JTextField();
		textField_2.setBounds(138, 333, 114, 19);
		frame.getContentPane().add(textField_2);
		textField_2.setColumns(10);
		
		JButton btnSubmit = new JButton("Submit");
		btnSubmit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				String msg = "Name: " + (textField.getText().equals("") ? "Nothing" : textField.getText());
				msg += '\n';
				msg += "Gender: " + (rdbtnMale.isSelected() ? "Male" : rdbtnFemale.isSelected() ? "Female" : "Nothing");
				msg += '\n';
				msg += "Fav Language: " + comboBox.getSelectedItem();
				msg += '\n';
				
				msg += "Mobile No: ";
				String temp = textField_1.getText().equals("") ? "Nothing" : textField_1.getText();
				try
				{
					Integer.parseInt(temp);
					msg += temp;
				}
				catch(NumberFormatException excep)
				{
					msg += "Nothing";
					System.out.println("excepted");
				}
				msg += '\n';
				
				msg += "Email: " + (textField_2.getText().equals("") ? "Nothing" : textField_2.getText());
				
				JOptionPane.showMessageDialog(btnSubmit, msg);
			}
		});
		btnSubmit.setBounds(204, 396, 117, 25);
		frame.getContentPane().add(btnSubmit);
	}
}
