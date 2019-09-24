package prematricual.project;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.border.EmptyBorder;

public class ConfirmationWindow extends JFrame {

	private JPanel contentPane;
	
	public static final int WIDTH = 800;
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
					ConfirmationWindow frame = new ConfirmationWindow();
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
	public ConfirmationWindow() {
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
		
		JButton btnNewButton = new JButton("Cerrar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				setVisible(false);
				dispose();
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 25));
		btnNewButton.setBounds(416, 633, 177, 54);
		contentPane.add(btnNewButton);
		
		JTextArea txtrPrematricula = new JTextArea();
		txtrPrematricula.setText("SU SOLICITUD DE INGRESO");
		txtrPrematricula.setFont(new Font("Arial", Font.BOLD, 54));
		txtrPrematricula.setEditable(false);
		txtrPrematricula.setBounds(135, 360, 747, 77);
		contentPane.add(txtrPrematricula);
		
		JTextArea txtrSolicitudDeIngreso = new JTextArea();
		txtrSolicitudDeIngreso.setFont(new Font("Arial", Font.BOLD, 54));
		txtrSolicitudDeIngreso.setEditable(false);
		txtrSolicitudDeIngreso.setText("GRACIAS POR COMPLETAR");
		txtrSolicitudDeIngreso.setBounds(135, 294, 747, 77);
		contentPane.add(txtrSolicitudDeIngreso);
		
		JLabel lblNewLabel1 = new JLabel("");
		Image img2 = new ImageIcon(this.getClass().getResource("/mssgNota.png")).getImage();
		lblNewLabel1.setIcon(new ImageIcon(img2));
		lblNewLabel1.setBounds(10, 448, 974, 73);
		contentPane.add(lblNewLabel1);
		
		JTextArea textArea = new JTextArea();
		textArea.setEditable(false);
		textArea.setBounds(10, 11, 974, 749);
		contentPane.add(textArea);
		
	}
}
