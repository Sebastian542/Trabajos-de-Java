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
import javax.swing.SwingConstants;

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
	private JTextField puntaje1;
	private JTextField puntaje2;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	
	public Panel2(Controller control) {
		setBackground(new Color(72, 209, 204));
		setSize(423,400); //tamaño en ancho y alto en pixeles
	
		
		TitledBorder border = BorderFactory.createTitledBorder("Datos de Entrada");
		border.setTitleColor(Color.BLACK);
		setBorder( border );
		setLayout(null);
		
		JLabel lblNewLabel_2 = new JLabel("Jugador 1");
		lblNewLabel_2.setBounds(50, 56, 70, 17);
		add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Jugador 2");
		lblNewLabel_3.setBounds(50, 106, 70, 17);
		add(lblNewLabel_3);
		
		puntaje1 = new JTextField();
		puntaje1.setBounds(323, 53, 86, 20);
		add(puntaje1);
		puntaje1.setColumns(10);
		
		puntaje2 = new JTextField();
		puntaje2.setBounds(323, 104, 86, 20);
		add(puntaje2);
		puntaje2.setColumns(10);
		
		JLabel lblNewLabel_4 = new JLabel("Puntaje");
		lblNewLabel_4.setBounds(254, 57, 46, 14);
		add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Puntaje");
		lblNewLabel_5.setBounds(254, 107, 46, 14);
		add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("Tipo de juego :");
		lblNewLabel_6.setBounds(50, 151, 86, 31);
		add(lblNewLabel_6);
		
		textField_2 = new JTextField();
		textField_2.setBounds(146, 156, 86, 20);
		add(textField_2);
		textField_2.setColumns(10);
		
		JButton btnNewButton_1 = new JButton("Escribir");
		btnNewButton_1.setBounds(323, 226, 89, 23);
		add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Leer");
		btnNewButton_2.setBounds(82, 226, 89, 23);
		add(btnNewButton_2);
		
		textField_3 = new JTextField();
		textField_3.setBounds(122, 54, 86, 20);
		add(textField_3);
		textField_3.setColumns(10);
		
		textField_4 = new JTextField();
		textField_4.setBounds(122, 104, 86, 20);
		add(textField_4);
		textField_4.setColumns(10);
		
	}
	



}
