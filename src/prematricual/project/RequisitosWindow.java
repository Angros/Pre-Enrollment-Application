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
import javax.swing.border.EmptyBorder;
import javax.swing.JTextArea;

public class RequisitosWindow extends JFrame {

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
					RequisitosWindow frame = new RequisitosWindow();
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
	public RequisitosWindow() {
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
		
		JButton btnNewButton = new JButton("Volver");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				MainWindow.main(null);
				setVisible(false);
				dispose();
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 25));
		btnNewButton.setBounds(758, 568, 177, 54);
		contentPane.add(btnNewButton);
		
		JTextArea txtrSolicitudDeIngreso = new JTextArea();
		txtrSolicitudDeIngreso.setFont(new Font("Arial", Font.PLAIN, 32));
		txtrSolicitudDeIngreso.setEditable(false);
		txtrSolicitudDeIngreso.setText("\u25BACumplimentar formulario de solicitud\r\n\u25BA Examen de Admisi\u00F3n (Cooperativo 9 y 10)\r\n\u25BA Transcripci\u00F3n de cr\u00E9ditos oficial (sellada y con las \r\n     notas primer del semestre)\r\n\u25BA Informe de vacunas\r\n\u25BA Carta de conducta de la escuela de procedencia\r\n\u25BA 1 foto 2x2 ");
		txtrSolicitudDeIngreso.setBounds(157, 296, 778, 326);
		contentPane.add(txtrSolicitudDeIngreso);
		
		JTextArea txtrRequisitosDeAdmisin = new JTextArea();
		txtrRequisitosDeAdmisin.setText("Requisitos de admisi\u00F3n");
		txtrRequisitosDeAdmisin.setFont(new Font("Arial", Font.BOLD, 54));
		txtrRequisitosDeAdmisin.setEditable(false);
		txtrRequisitosDeAdmisin.setBounds(196, 189, 623, 79);
		contentPane.add(txtrRequisitosDeAdmisin);
		
		JTextArea textArea = new JTextArea();
		textArea.setEditable(false);
		textArea.setBounds(10, 11, 974, 749);
		contentPane.add(textArea);
	}
}
