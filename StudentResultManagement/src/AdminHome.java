import java.awt.EventQueue;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.JTextField;


import javax.swing.DefaultComboBoxModel;

public class AdminHome {

	private JFrame frame;
	private JTextField rolltextField;
	private JTextField nametextField_1;
	private JTextField fnametextField_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AdminHome window = new AdminHome();
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
	public AdminHome() {
		initialize();
		frame.setVisible(true);
		frame.setVisible(true);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	@SuppressWarnings({ "unchecked", "rawtypes" })
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 536, 501);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(128, 255, 255));
		panel.setBounds(0, 0, 213, 462);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JButton addnewbtn = new JButton("AddNewStudent");
		addnewbtn.setForeground(new Color(255, 0, 0));
		addnewbtn.setBounds(30, 83, 126, 23);
		panel.add(addnewbtn);
		
		
		JButton insertnewbtn = new JButton("InsertNewResult");
		insertnewbtn.setBounds(30, 150, 126, 23);
		panel.add(insertnewbtn);
		insertnewbtn.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent e) {
		      
		        frame.dispose();
		    }
		});

		
		JButton registeredstudentbtn = new JButton("RegisteredStudent");
		registeredstudentbtn.setBounds(30, 227, 126, 23);
		panel.add(registeredstudentbtn);
		registeredstudentbtn.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent e) {
		        
		        frame.dispose();
		    }
		});
		
		JButton allstudentsresultsbtn = new JButton("AllStudentsResults");
		allstudentsresultsbtn.setBounds(30, 302, 126, 23);
		panel.add(allstudentsresultsbtn);
		allstudentsresultsbtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				 frame.dispose();
			}
		});
		
		JButton logoutButton_4 = new JButton("Logout");
		logoutButton_4.setBounds(49, 393, 89, 23);
		panel.add(logoutButton_4);
		logoutButton_4.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent e) {
		        
		        frame.dispose();
		    }
		});
			
		JLabel lblNewLabel = new JLabel("Course");
		lblNewLabel.setBounds(265, 56, 46, 14);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("BranchName");
		lblNewLabel_1.setBounds(265, 113, 69, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("RollNo");
		lblNewLabel_2.setBounds(265, 163, 46, 14);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Name");
		lblNewLabel_3.setBounds(265, 218, 46, 14);
		frame.getContentPane().add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Gender");
		lblNewLabel_4.setBounds(265, 268, 46, 14);
		frame.getContentPane().add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("FatherName");
		lblNewLabel_5.setBounds(265, 323, 69, 14);
		frame.getContentPane().add(lblNewLabel_5);
		
		JComboBox coursecomboBox = new JComboBox();
		coursecomboBox.setModel(new DefaultComboBoxModel(new String[] {"MCA", "BCA"}));
		coursecomboBox.setBounds(371, 52, 96, 22);
		frame.getContentPane().add(coursecomboBox);
		
		rolltextField = new JTextField();
		rolltextField.setBounds(371, 160, 96, 20);
		frame.getContentPane().add(rolltextField);
		rolltextField.setColumns(10);
		
		JComboBox branchcomboBox_1 = new JComboBox();
		branchcomboBox_1.setModel(new DefaultComboBoxModel(new String[] {"MCA", "BCA"}));
		branchcomboBox_1.setBounds(371, 109, 96, 22);
		frame.getContentPane().add(branchcomboBox_1);
		
		nametextField_1 = new JTextField();
		nametextField_1.setBounds(374, 215, 93, 20);
		frame.getContentPane().add(nametextField_1);
		nametextField_1.setColumns(10);
		
		fnametextField_2 = new JTextField();
		fnametextField_2.setBounds(371, 320, 89, 20);
		frame.getContentPane().add(fnametextField_2);
		fnametextField_2.setColumns(10);
		
		JComboBox gendercomboBox_2 = new JComboBox();
		gendercomboBox_2.setModel(new DefaultComboBoxModel(new String[] {"MALE", "FEMALE", "OTHER"}));
		gendercomboBox_2.setBounds(371, 264, 90, 22);
		frame.getContentPane().add(gendercomboBox_2);
		
		JButton createButton_5 = new JButton("create");
		createButton_5.setBounds(323, 389, 89, 23);
		frame.getContentPane().add(createButton_5);
		
		JLabel dislblNewLabel_6 = new JLabel("");
		dislblNewLabel_6.setBounds(323, 11, 137, 14);
		frame.getContentPane().add(dislblNewLabel_6);
		
		
		
	}
	    	public void setVisible(boolean b) {
		// TODO Auto-generated method stub
		setVisible(true);
	}
}
