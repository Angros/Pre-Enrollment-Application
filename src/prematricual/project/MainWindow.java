package prematricual.project;


import java.awt.BorderLayout;
import java.awt.Desktop;
import java.awt.EventQueue;
import java.awt.Image;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JTextArea;
import javax.swing.JLabel;

import java.awt.Font;

import javax.swing.JTextField;
import javax.swing.JCheckBox;
import javax.swing.JSeparator;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;

import java.awt.Color;
import java.awt.SystemColor;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;

import javax.swing.JFormattedTextField;
import javax.swing.DropMode;
import javax.swing.JRadioButton;

import java.awt.Checkbox;

public class MainWindow extends JFrame {

	private JPanel contentPane;
	
	public static final int WIDTH = 800;
	public static final int HEIGHT = 1000;
	public static final String NAME = "ASTA - Pre-Matricula ";
	public static final String YEAR = "2016-2017";
	private JTextField textFieldNombreSolicitante;
	private JTextField textFieldDireccionPostal;
	private JTextField textFieldTelefono;
	private JTextField textFieldCiudadania;
	private JTextField textFieldPadre;
	private JTextField textFieldPadreCel;
	private JTextField textFieldMadre;
	private JTextField textFieldMadreCel;
	private JTextField textFieldPadreOcu;
	private JTextField textFieldPadreTel;
	private JTextField textFieldMadreOcu;
	private JTextField textFieldMadreTel;
	private JTextField textFieldPerCorr;
	private JTextField textFieldRelDirec;
	private JTextField textFieldEscuelaAnt;
	private JTextField textFieldFirma;
	private JTextField textFieldLugarNacimiento;
	private JTextField textFieldEmail;
	private JTextField textFieldZipCode;
	private JTextField textFieldPais;
	private JTextField textFieldPueblo;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainWindow frame = new MainWindow();
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
	public MainWindow() {
		setTitle(NAME + YEAR);
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, HEIGHT, WIDTH);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnAdminLogIn = new JButton("Admin Log In");
		btnAdminLogIn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				LogInWindow.main(null);
				setVisible(false);
				dispose();
			}
		});
		btnAdminLogIn.setBounds(857, 721, 127, 39);
		contentPane.add(btnAdminLogIn);
		
		JButton btnOk = new JButton("Ok");
		btnOk.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				ConfirmationWindow.main(null);
				setVisible(false);
				dispose();
			}
		});
		btnOk.setBounds(10, 721, 127, 39);
		contentPane.add(btnOk);
		
		JButton btnCostos = new JButton("Costos");
		btnCostos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				//InformationWindow.main(null);
		         
				File f = new File("./doc/PDM.pdf");
				try {
					Desktop.getDesktop().open(f);
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				//setVisible(false);
			    //dispose();
			}
		});
		btnCostos.setBounds(170, 721, 147, 39);
		contentPane.add(btnCostos);
		
		JButton btnRequisitos = new JButton("Requisitos");
		btnRequisitos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				RequisitosWindow.main(null);
				setVisible(false);
				dispose();
			}
		});
		btnRequisitos.setBounds(325, 721, 147, 39);
		contentPane.add(btnRequisitos);
		
		JButton btnExit = new JButton("Exit");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				setVisible(false);
				dispose();
				System.exit(0);
			}
		});
		btnExit.setBounds(700, 721, 147, 39);
		contentPane.add(btnExit);
		
		JTextArea txtrSolicitudDeIngreso = new JTextArea();
		txtrSolicitudDeIngreso.setFont(new Font("Monospaced", Font.BOLD, 13));
		txtrSolicitudDeIngreso.setEditable(false);
		txtrSolicitudDeIngreso.setText("                    SOLICITUD DE INGRESO\r\n                   CURSO ESCOLAR 2016-2017\r\n                        PRE-MATRICULA");
		txtrSolicitudDeIngreso.setBounds(308, 28, 344, 64);
		contentPane.add(txtrSolicitudDeIngreso);
		
		JLabel label = new JLabel("New label");
		Image img = new ImageIcon(this.getClass().getResource("/astaHeader.png")).getImage();
		label.setIcon(new ImageIcon(img));
		
		label.setBounds(0, 0, 994, 103);
		contentPane.add(label);
		
		JTextArea textArea = new JTextArea();
		textArea.setEditable(false);
		textArea.setBounds(0, 0, 994, 103);
		contentPane.add(textArea);
		
		textFieldNombreSolicitante = new JTextField();
		textFieldNombreSolicitante.setBounds(229, 137, 212, 20);
		contentPane.add(textFieldNombreSolicitante);
		textFieldNombreSolicitante.setColumns(10);
		
		textFieldDireccionPostal = new JTextField();
		textFieldDireccionPostal.setColumns(10);
		textFieldDireccionPostal.setBounds(202, 169, 137, 20);
		contentPane.add(textFieldDireccionPostal);
		
		textFieldTelefono = new JTextField();
		textFieldTelefono.setColumns(10);
		textFieldTelefono.setBounds(170, 203, 169, 20);
		contentPane.add(textFieldTelefono);
		
		textFieldCiudadania = new JTextField();
		textFieldCiudadania.setColumns(10);
		textFieldCiudadania.setBounds(180, 235, 159, 20);
		contentPane.add(textFieldCiudadania);
		
		textFieldPadre = new JTextField();
		textFieldPadre.setColumns(10);
		textFieldPadre.setBounds(215, 268, 169, 20);
		contentPane.add(textFieldPadre);
		
		textFieldPadreCel = new JTextField();
		textFieldPadreCel.setColumns(10);
		textFieldPadreCel.setBounds(202, 301, 182, 20);
		contentPane.add(textFieldPadreCel);
		
		textFieldMadre = new JTextField();
		textFieldMadre.setColumns(10);
		textFieldMadre.setBounds(227, 335, 157, 20);
		contentPane.add(textFieldMadre);
		
		textFieldMadreCel = new JTextField();
		textFieldMadreCel.setColumns(10);
		textFieldMadreCel.setBounds(202, 368, 182, 20);
		contentPane.add(textFieldMadreCel);
		
		textFieldPadreOcu = new JTextField();
		textFieldPadreOcu.setColumns(10);
		textFieldPadreOcu.setBounds(461, 268, 191, 20);
		contentPane.add(textFieldPadreOcu);
		
		textFieldPadreTel = new JTextField();
		textFieldPadreTel.setColumns(10);
		textFieldPadreTel.setBounds(483, 301, 169, 20);
		contentPane.add(textFieldPadreTel);
		
		textFieldMadreOcu = new JTextField();
		textFieldMadreOcu.setColumns(10);
		textFieldMadreOcu.setBounds(461, 334, 191, 20);
		contentPane.add(textFieldMadreOcu);
		
		textFieldMadreTel = new JTextField();
		textFieldMadreTel.setColumns(10);
		textFieldMadreTel.setBounds(483, 367, 169, 20);
		contentPane.add(textFieldMadreTel);
		
		textFieldPerCorr = new JTextField();
		textFieldPerCorr.setColumns(10);
		textFieldPerCorr.setBounds(377, 418, 169, 20);
		contentPane.add(textFieldPerCorr);
		
		textFieldRelDirec = new JTextField();
		textFieldRelDirec.setColumns(10);
		textFieldRelDirec.setBounds(461, 448, 268, 20);
		contentPane.add(textFieldRelDirec);
		
		textFieldEscuelaAnt = new JTextField();
		textFieldEscuelaAnt.setColumns(10);
		textFieldEscuelaAnt.setBounds(243, 481, 169, 20);
		contentPane.add(textFieldEscuelaAnt);
		
		textFieldFirma = new JTextField();
		textFieldFirma.setColumns(10);
		textFieldFirma.setBounds(560, 590, 169, 20);
		contentPane.add(textFieldFirma);
		
		JLabel lblNombreDelSolicitante = new JLabel("Nombre del solicitante:");
		lblNombreDelSolicitante.setBounds(96, 137, 179, 22);
		contentPane.add(lblNombreDelSolicitante);
		
		JLabel lblDireccinPostal = new JLabel("Direcci\u00F3n postal:");
		lblDireccinPostal.setBounds(96, 168, 275, 22);
		contentPane.add(lblDireccinPostal);
		
		JLabel lblTelfono = new JLabel("Tel\u00E9fono:");
		lblTelfono.setBounds(96, 203, 188, 22);
		contentPane.add(lblTelfono);
		
		JLabel lblCiudadania = new JLabel("Ciudadan\u00EDa:");
		lblCiudadania.setBounds(96, 236, 202, 22);
		contentPane.add(lblCiudadania);
		
		JLabel lblNombreDelPadre = new JLabel("Nombre del padre:");
		lblNombreDelPadre.setBounds(96, 269, 275, 22);
		contentPane.add(lblNombreDelPadre);
		
		JLabel lblOcupacin = new JLabel("Ocupaci\u00F3n:");
		lblOcupacin.setBounds(393, 269, 275, 22);
		contentPane.add(lblOcupacin);
		
		JLabel lblNmDeCelular = new JLabel("N\u00FAm. de celular:");
		lblNmDeCelular.setBounds(96, 302, 241, 22);
		contentPane.add(lblNmDeCelular);
		
		JLabel lblTelDelTrabajo = new JLabel("Tel. del trabajo:");
		lblTelDelTrabajo.setBounds(393, 302, 275, 22);
		contentPane.add(lblTelDelTrabajo);
		
		JLabel lblNombreDeLa = new JLabel("Nombre de la madre:");
		lblNombreDeLa.setBounds(96, 335, 275, 22);
		contentPane.add(lblNombreDeLa);
		
		JLabel label_1 = new JLabel("Ocupaci\u00F3n:");
		label_1.setBounds(393, 335, 275, 22);
		contentPane.add(label_1);
		
		JLabel label_2 = new JLabel("Tel. del trabajo:");
		label_2.setBounds(393, 368, 275, 22);
		contentPane.add(label_2);
		
		JLabel label_3 = new JLabel("N\u00FAm. de celular:");
		label_3.setBounds(96, 368, 275, 22);
		contentPane.add(label_3);
		
		JLabel lblPersonaQueHa = new JLabel("Persona que ha de recibir la correspondencia:");
		lblPersonaQueHa.setBounds(96, 416, 275, 22);
		contentPane.add(lblPersonaQueHa);
		
		JLabel lblRelacin = new JLabel("Relaci\u00F3n:");
		lblRelacin.setBounds(96, 449, 57, 22);
		contentPane.add(lblRelacin);
		
		JLabel lblDireccin = new JLabel("Direcci\u00F3n:");
		lblDireccin.setBounds(393, 449, 275, 22);
		contentPane.add(lblDireccin);
		
		JLabel lblEscuelaDeProcedencia = new JLabel("Escuela de procedencia:");
		lblEscuelaDeProcedencia.setBounds(96, 482, 275, 22);
		contentPane.add(lblEscuelaDeProcedencia);
		
		JLabel lblTieneHermanosEn = new JLabel("Tiene hermanos en la academia?");
		lblTieneHermanosEn.setBounds(96, 511, 218, 22);
		contentPane.add(lblTieneHermanosEn);
		
		JLabel lblGrados = new JLabel("Grados:");
		lblGrados.setBounds(393, 511, 48, 22);
		contentPane.add(lblGrados);
		
		JLabel lblFecha = new JLabel("Fecha:");
		lblFecha.setBounds(96, 585, 57, 22);
		contentPane.add(lblFecha);
		
		JLabel lblFirmaDePadre = new JLabel("Firma de padre o encargado:");
		lblFirmaDePadre.setBounds(393, 589, 275, 22);
		contentPane.add(lblFirmaDePadre);
		
		JTextArea textArea_1 = new JTextArea();
		textArea_1.setEditable(false);
		textArea_1.setBounds(0, 707, 994, 64);
		contentPane.add(textArea_1);
		
		JCheckBox chckbxSi = new JCheckBox("Si");
		chckbxSi.setBounds(289, 511, 40, 23);
		contentPane.add(chckbxSi);
		
		JCheckBox chckbxNo = new JCheckBox("No");
		chckbxNo.setBounds(330, 511, 57, 23);
		contentPane.add(chckbxNo);
		
		JCheckBox chckbx9no = new JCheckBox("9no");
		chckbx9no.setBounds(440, 511, 48, 23);
		contentPane.add(chckbx9no);
		
		JCheckBox chckbxmo = new JCheckBox("10mo");
		chckbxmo.setBounds(490, 511, 57, 23);
		contentPane.add(chckbxmo);
		
		JCheckBox chckbxmo_1 = new JCheckBox("11mo");
		chckbxmo_1.setBounds(549, 511, 57, 23);
		contentPane.add(chckbxmo_1);
		
		JCheckBox chckbxmo_2 = new JCheckBox("12mo");
		chckbxmo_2.setBounds(608, 511, 57, 23);
		contentPane.add(chckbxmo_2);
		
		JComboBox comboBoxFechaAct = new JComboBox();
		comboBoxFechaAct.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31"}));
		comboBoxFechaAct.setBounds(136, 586, 48, 20);
		contentPane.add(comboBoxFechaAct);
		
		JComboBox comboBoxMesAct = new JComboBox();
		comboBoxMesAct.setModel(new DefaultComboBoxModel(new String[] {"enero", "febrero", "marzo", "abril", "mayo", "junio", "julio", "agosto", "septiembre", "octubre", "noviembre", "diciembre"}));
		comboBoxMesAct.setBounds(189, 586, 114, 20);
		contentPane.add(comboBoxMesAct);
		
		JLabel lblNewLabel = new JLabel("");
		Image img2 = new ImageIcon(this.getClass().getResource("/mssgNota.png")).getImage();
		lblNewLabel.setIcon(new ImageIcon(img2));
		lblNewLabel.setBounds(10, 623, 974, 73);
		contentPane.add(lblNewLabel);
		
		JCheckBox chckbxMadre = new JCheckBox("Madre");
		chckbxMadre.setBounds(217, 447, 76, 23);
		contentPane.add(chckbxMadre);
		
		JCheckBox chckbxPadre = new JCheckBox("Padre");
		chckbxPadre.setBounds(150, 448, 65, 23);
		contentPane.add(chckbxPadre);
		
		JCheckBox chckbxEncargado = new JCheckBox("Encargado");
		chckbxEncargado.setBounds(289, 447, 89, 23);
		contentPane.add(chckbxEncargado);
		
		JLabel lblFechaDeNacimiento = new JLabel("Fecha de nacimiento:");
		lblFechaDeNacimiento.setBounds(390, 200, 121, 22);
		contentPane.add(lblFechaDeNacimiento);
		
		JComboBox nacFecha = new JComboBox();
		nacFecha.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31"}));
		nacFecha.setBounds(521, 202, 48, 20);
		contentPane.add(nacFecha);
		
		JComboBox nacMes = new JComboBox();
		nacMes.setModel(new DefaultComboBoxModel(new String[] {"enero", "febrero", "marzo", "abril", "mayo", "junio", "julio", "agosto", "septiembre", "octubre", "noviembre", "diciembre"}));
		nacMes.setBounds(574, 202, 114, 20);
		contentPane.add(nacMes);
		
		JComboBox nacAno = new JComboBox();
		nacAno.setModel(new DefaultComboBoxModel(new String[] {"2015", "2014", "2013", "2012 ", "2011 ", "2010 ", "2009 ", "2008 ", "2007 ", "2006 ", "2005 ", "2004 ", "2003 ", "2002 ", "2001 ", "2000 ", "1999 ", "1998 ", "1997 ", "1996 ", "1995 ", "1994 ", "1993 ", "1992 ", "1991 ", "1990 ", "1989 ", "1988 ", "1987 ", "1986 ", "1985 ", "1984 ", "1983 ", "1982 ", "1981 ", "1980 ", "1979 ", "1978 ", "1977 ", "1976 ", "1975 ", "1974 ", "1973 ", "1972 ", "1971 ", "1970 ", "1969 ", "1968 ", "1967 ", "1966 ", "1965 ", "1964 ", "1963 ", "1962 ", "1961 ", "1960 ", "1959 ", "1958 ", "1957 ", "1956 ", "1955 ", "1954 ", "1953 ", "1952 ", "1951 ", "1950 ", "1949 ", "1948 ", "1947 ", "1946 ", "1945 ", "1944 ", "1943 ", "1942 ", "1941 ", "1940 ", "1939 ", "1938 ", "1937 ", "1936 ", "1935 ", "1934 ", "1933 ", "1932 ", "1931 ", "1930 ", "1929 ", "1928 ", "1927 ", "1926 ", "1925 ", "1924 ", "1923 ", "1922 ", "1921 ", "1920 ", "1919 ", "1918 ", "1917 ", "1916 ", "1915 ", "1914 ", "1913 ", "1912 ", "1911 ", "1910 ", "1909 ", "1908 ", "1907 ", "1906 ", "1905 ", "1904 ", "1903 ", "1902 ", "1901 ", "1900"}));
		nacAno.setBounds(698, 201, 57, 20);
		contentPane.add(nacAno);
		
		JLabel lblLugarDeNacimiento = new JLabel("Lugar de Nacimiento:");
		lblLugarDeNacimiento.setBounds(391, 233, 179, 22);
		contentPane.add(lblLugarDeNacimiento);
		
		textFieldLugarNacimiento = new JTextField();
		textFieldLugarNacimiento.setColumns(10);
		textFieldLugarNacimiento.setBounds(524, 233, 169, 20);
		contentPane.add(textFieldLugarNacimiento);
		
		JLabel lblEmail = new JLabel("E-mail del padre o madre:");
		lblEmail.setBounds(393, 557, 179, 22);
		contentPane.add(lblEmail);
		
		textFieldEmail = new JTextField();
		textFieldEmail.setColumns(10);
		textFieldEmail.setBounds(545, 558, 169, 20);
		contentPane.add(textFieldEmail);
		
		JLabel lblZipCode = new JLabel("Zip Code:");
		lblZipCode.setBounds(349, 168, 65, 22);
		contentPane.add(lblZipCode);
		
		textFieldZipCode = new JTextField();
		textFieldZipCode.setColumns(10);
		textFieldZipCode.setBounds(405, 168, 76, 20);
		contentPane.add(textFieldZipCode);
		
		JLabel lblPais = new JLabel("Pa\u00EDs/Estado");
		lblPais.setBounds(487, 168, 82, 22);
		contentPane.add(lblPais);
		
		textFieldPais = new JTextField();
		textFieldPais.setColumns(10);
		textFieldPais.setBounds(560, 169, 92, 20);
		contentPane.add(textFieldPais);
		
		JLabel lblPueblo = new JLabel("Pueblo:");
		lblPueblo.setBounds(662, 168, 65, 22);
		contentPane.add(lblPueblo);
		
		textFieldPueblo = new JTextField();
		textFieldPueblo.setColumns(10);
		textFieldPueblo.setBounds(712, 169, 98, 20);
		contentPane.add(textFieldPueblo);
		
		
		setLocationRelativeTo(null);
	}
}
