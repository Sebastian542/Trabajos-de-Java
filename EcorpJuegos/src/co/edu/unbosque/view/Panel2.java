package co.edu.unbosque.view;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import co.edu.unbosque.controller.Controller;

import java.awt.Color;
import java.awt.Font;

public class Panel2 extends JPanel {
	
	private static final long serialVersionUID = 1L;
	
	private JLabel nombreJugador1;
	
	private JButton btnEscribir;//Escribir
	private JButton btnLeer;//Leer
	private JButton btnVolver;//Volver
	

	

	public static final String ESCRIBIR2 = "Escribir";
	public static final String LEER2 = "Leer";
	public static final String VOLVER2 = "Volver";
	private JLabel lblNewLabel;//Nombre del Juego
	private JLabel lblNewLabel_6;//Tipo de Juego
	
	
	private JTextField textField;
	private JTextField textField_4;
	
	public Panel2(Controller control) {
		setForeground(Color.WHITE);
		setVisible(false);
		setBackground(Color.BLACK);
		setSize(584,362); //tamanio en ancho y alto en pixeles


		setLayout(null);
		
		btnEscribir = new JButton("Escribir");
		btnEscribir.setBounds(323, 226, 89, 23);
		btnEscribir.setActionCommand(ESCRIBIR2);
		add(btnEscribir);
		
		btnLeer = new JButton("Leer");
		btnLeer.setBounds(82, 226, 89, 23);
		btnLeer.setActionCommand(LEER2);
		add(btnLeer);
		
		btnVolver = new JButton("Volver");
		btnVolver.setBounds(205, 226, 89, 23);
		btnEscribir.setActionCommand(VOLVER2);
		add(btnVolver);
		
		lblNewLabel = new JLabel("Nombre del juego ");
		lblNewLabel.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setBounds(58, 84, 124, 14);
		add(lblNewLabel);
		
		lblNewLabel_6 = new JLabel("Tipo de juego");
		lblNewLabel_6.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		lblNewLabel_6.setForeground(Color.WHITE);
		lblNewLabel_6.setBounds(58, 130, 89, 14);
		add(lblNewLabel_6);
		
		textField = new JTextField();
		textField.setBounds(184, 82, 86, 20);
		add(textField);
		textField.setColumns(10);
		
		textField_4 = new JTextField();
		textField_4.setBounds(184, 128, 86, 20);
		add(textField_4);
		textField_4.setColumns(10);
		
	}
	public static String getVolver2() {
		return VOLVER2;
	}
	
	public static String getLeer2() {
		return LEER2;
	}
	
	public static String getEscribir2() {
		return ESCRIBIR2;
	}
	
	public JLabel getNombreJugador1() {
		return nombreJugador1;
	}

	public void setNombreJugador1(JLabel nombreJugador1) {
		this.nombreJugador1 = nombreJugador1;
	}

	public JButton getBtnEscribir() {
		return btnEscribir;
	}
	public void setBtnEscribir(JButton btnEscribir) {
		this.btnEscribir = btnEscribir;
	}

	public JButton getBtnLeer() {
		return btnLeer;
	}
	
	public void setBtnLeer(JButton btnLeer) {
		this.btnLeer = btnLeer;
	}
	
	public JButton getBtnVolver() {
		return btnVolver;
	}
	
	public void setBtnVolver(JButton btnVolver) {
		this.btnVolver = btnVolver;
	}
	
	public JTextField getTextField() {
		return textField;
	}
	
	public void setTextField(JTextField textField) {
		this.textField = textField;
	}
	
	public JTextField getTextField_4() {
		return textField_4;
	}
	
	public void setTextField_4(JTextField textField_4) {
		this.textField_4 = textField_4;
	}
	
}
