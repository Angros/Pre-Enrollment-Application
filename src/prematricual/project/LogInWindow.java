package prematricual.project;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;

import java.awt.SystemColor;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JTextArea;
import javax.swing.JFormattedTextField;

import java.awt.Color;
import java.sql.*;

public class LogInWindow extends JFrame {

	private JPanel contentPane;
	
	public static final int WIDTH = 700;
	public static final int HEIGHT = 1000;
	public static final String NAME = "ASTA - Pre-Matricula ";
	public static final String YEAR = "2016-2017";
	private JTextField txtUsername;
	private JTextField txtPassword;


	Connection connection = null;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LogInWindow frame = new LogInWindow();
					frame.setVisible(true);
					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public LogInWindow() {
		
		connection = SqlConnection.dbConector();
		
		setTitle(NAME + YEAR);
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, HEIGHT, WIDTH);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		txtUsername = new JTextField();
		txtUsername.setFont(new Font("Tahoma", Font.PLAIN, 23));
		txtUsername.setForeground(SystemColor.desktop);
		txtUsername.setBounds(165, 233, 647, 64);
		contentPane.add(txtUsername);
		txtUsername.setColumns(10);
		
		txtPassword = new JPasswordField(10);
		txtPassword.setForeground(SystemColor.desktop);
		txtPassword.setFont(new Font("Tahoma", Font.PLAIN, 23));
		txtPassword.setColumns(10);
		txtPassword.setBounds(165, 378, 647, 64);
		contentPane.add(txtPassword);
		
		
		JLabel lblAdminLogIn = new JLabel("ADMIN LOG IN");
		lblAdminLogIn.setFont(new Font("Tahoma", Font.BOLD, 42));
		lblAdminLogIn.setForeground(SystemColor.infoText);
		lblAdminLogIn.setBounds(323, 74, 348, 123);
		contentPane.add(lblAdminLogIn);
		
		JButton btnLogIn = new JButton("Log In");
		btnLogIn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				// Log in button function

					//If log in is correct
					AdminWindow.main(null);
					setVisible(false);
					dispose();
				
			}
		});
		btnLogIn.setForeground(Color.BLACK);
		btnLogIn.setFont(new Font("Tahoma", Font.BOLD, 27));
		btnLogIn.setBounds(268, 541, 167, 64);
		contentPane.add(btnLogIn);
		
		
		JLabel lblUsername = new JLabel("Username");
		lblUsername.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblUsername.setBounds(165, 188, 187, 45);
		contentPane.add(lblUsername);
		
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblPassword.setBounds(165, 336, 187, 45);
		contentPane.add(lblPassword);
		
		JLabel lblASTAbanner = new JLabel("");
		Image img = new ImageIcon(this.getClass().getResource("/astaHeader.png")).getImage();
		lblASTAbanner.setIcon(new ImageIcon(img));
		lblASTAbanner.setBounds(0, 0, 994, 90);
		contentPane.add(lblASTAbanner);
		
		JTextArea textArea = new JTextArea();
		textArea.setEditable(false);
		textArea.setBounds(0, 659, 994, 112);
		contentPane.add(textArea);
		
		JButton btnCancel = new JButton("Back");
		btnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				MainWindow.main(null);
				setVisible(false);
				dispose();
			}
		});
		btnCancel.setForeground(Color.BLACK);
		btnCancel.setFont(new Font("Tahoma", Font.BOLD, 27));
		btnCancel.setBounds(518, 541, 167, 64);
		contentPane.add(btnCancel);
		setLocationRelativeTo(null);
	}
}
