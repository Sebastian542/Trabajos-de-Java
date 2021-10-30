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
		
		setLayout( new GridLayout(2,2) );//se define el grid de 2x2
		setSize(500,400); //tamaño en ancho y alto en pixeles
	
		
		TitledBorder border = BorderFactory.createTitledBorder("Datos de Entrada");
		border.setTitleColor(Color.BLACK);
		setBorder( border );
		nombreJugador1 = new JLabel("El nombre del jugador 1 es :");
		add(nombreJugador1);
		
		textField = new JTextField();
		add(textField);
		textField.setColumns(10);
		
		lblNewLabel_1 = new JLabel("Tipo de juego");
		add(lblNewLabel_1);
		
		
		JList listajuegos;
		String juego[] = { "Cartas", "Mesa", "Ping pong"};
		listajuegos = new JList( juego );

		list = new JList(juego);
		
	
		lblNewLabel = new JLabel("El nombre del jugador 2 es:");
		add(lblNewLabel);
		
		textField_1 = new JTextField();
		add(textField_1);
		textField_1.setColumns(10);
		
		
		
		btnNewButton = new JButton("Comenzar juego");
		add(btnNewButton);
	}
	


	public static String getConvertir() {
		return CONVERTIR;
	}
}
