package prematricual.project;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextArea;

public class InformationWindow extends JFrame {

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
					InformationWindow frame = new InformationWindow();
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
	public InformationWindow() {
		setTitle(NAME + YEAR);
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, HEIGHT, WIDTH);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		setLocationRelativeTo(null);
	}
}
