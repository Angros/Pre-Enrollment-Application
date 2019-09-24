package prematricual.project;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextArea;

import java.awt.Font;

import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class IntroWindow extends JFrame {

	private JPanel contentPane;

	public static final int WIDTH = 700;
	public static final int HEIGHT = 1000;
	public static final String NAME = "ASTA - Pre-Matricula ";
	public static final String YEAR = "2016-2017";
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					IntroWindow frame = new IntroWindow();
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
	public IntroWindow() {
		setTitle(NAME + YEAR);
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, HEIGHT, WIDTH);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		setLocationRelativeTo(null);
		
		JLabel lblNewLabel = new JLabel("");
		Image img = new ImageIcon(this.getClass().getResource("/asstaBanerImg.png")).getImage(); 
		lblNewLabel.setIcon(new ImageIcon(img));
		lblNewLabel.setBounds(10, 11, 974, 164);
		contentPane.add(lblNewLabel);
		
		JButton btnNewButton = new JButton("Accesar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				MainWindow.main(null);
				setVisible(false);
				dispose();
			}
		});
		Image img1 = new ImageIcon(this.getClass().getResource("/ASSTAlogo.gif")).getImage(); 
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 25));
		btnNewButton.setBounds(416, 518, 177, 54);
		contentPane.add(btnNewButton);
		
		JTextArea txtrPrematricula = new JTextArea();
		txtrPrematricula.setText("PRE-MATRICULA");
		txtrPrematricula.setFont(new Font("Arial", Font.BOLD, 54));
		txtrPrematricula.setEditable(false);
		txtrPrematricula.setBounds(294, 360, 461, 77);
		contentPane.add(txtrPrematricula);
		
		JTextArea txtrSolicitudDeIngreso = new JTextArea();
		txtrSolicitudDeIngreso.setFont(new Font("Arial", Font.BOLD, 54));
		txtrSolicitudDeIngreso.setEditable(false);
		txtrSolicitudDeIngreso.setText("SOLICITUD DE INGRESO");
		txtrSolicitudDeIngreso.setBounds(177, 295, 648, 77);
		contentPane.add(txtrSolicitudDeIngreso);
		
		JTextArea textArea = new JTextArea();
		textArea.setEditable(false);
		textArea.setBounds(10, 11, 974, 749);
		contentPane.add(textArea);
	}
}
