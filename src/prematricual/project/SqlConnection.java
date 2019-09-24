package prematricual.project;

import java.sql.Connection;
import java.sql.DriverManager;

import javax.swing.JOptionPane;

public class SqlConnection {

	Connection conn = null;
	public static Connection dbConector() {
		
		// Cambiar despues el path del database a uno no tan especifico
		try{
			Class.forName("org.sqlite.JDBC");
			Connection conn = DriverManager.getConnection("jdbc:sqlite:C:\\Users\\uythuy\\Desktop\\TestSockets\\Pre Matricula (Analisis Project)\\database\\preMatricula.sqlite");
			JOptionPane.showMessageDialog(null, "Connection Succesful");
			return conn;
			
		}catch(Exception e) {
			JOptionPane.showMessageDialog(null, e);
			return null;
		}
		
	}
	
}
