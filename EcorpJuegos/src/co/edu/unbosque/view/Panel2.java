package co.edu.unbosque.view;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;

import co.edu.unbosque.controller.Controller;

import java.awt.Color;
import java.awt.GridLayout;
import javax.swing.JList;

public class Panel2 extends JPanel {

	private static final long serialVersionUID = 1L;
	private JLabel nombreJugador1;
	public static final String CONVERTIR = "Convertir";
	private JLabel lblNewLabel;
	private JTextField textField;
	private JTextField textField_1;
	private JLabel lblNewLabel_1;
	private JButton btnNewButton;
	private JList list;
	
	public Panel2(Controller control) {
		setSize(500,400); //tamaño en ancho y alto en pixeles
	
		
		TitledBorder border = BorderFactory.createTitledBorder("Datos de Entrada");
		border.setTitleColor(Color.BLACK);
		setBorder( border );
		setLayout(null);
		
	}
	


	public static String getEscribir() {
		return ESCRIBIR;
	}
	
	public static String getLeer() {
		return LEER;
	}
}
