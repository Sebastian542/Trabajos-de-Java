package co.edu.unbosque.view;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;
import co.edu.unbosque.controller.Controller;

import java.awt.Color;
import java.awt.Font;

public class Panel2 extends JPanel {
	
	private static final long serialVersionUID = 1L;
	private JLabel nombreJugador1;
	private JButton btnNewButton_1;//Escribir
	private JButton btnNewButton_2;//Leer
	private JButton btnNewButton_3;//Volver
	public static final String ESCRIBIR = "Escribir";
	public static final String LEER = "Leer";
	public static final String VOLVER = "Volver";
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_6;
	private JTextField textField;
	private JTextField textField_4;
	
	public Panel2(Controller control) {
		setForeground(Color.WHITE);
		setVisible(false);
		setBackground(Color.BLACK);
		setSize(700,658); //tamaño en ancho y alto en pixeles
		
		

		setLayout(null);
		
		btnNewButton_1 = new JButton("Escribir");
		btnNewButton_1.setBounds(323, 226, 89, 23);
		btnNewButton_1.setActionCommand(ESCRIBIR);
		add(btnNewButton_1);
		
		btnNewButton_2 = new JButton("Leer");
		btnNewButton_2.setBounds(82, 226, 89, 23);
		btnNewButton_2.setActionCommand(LEER);
		add(btnNewButton_2);
		
		btnNewButton_3 = new JButton("Volver");
		btnNewButton_3.setBounds(205, 226, 89, 23);
		btnNewButton_1.setActionCommand(VOLVER);
		add(btnNewButton_3);
		
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
	public static String getVolver() {
		return VOLVER;
	}
	
	public static String getLeer() {
		return LEER;
	}
	
	public static String getEscribir() {
		return ESCRIBIR;
	}

	public JLabel getNombreJugador1() {
		return nombreJugador1;
	}

	public void setNombreJugador1(JLabel nombreJugador1) {
		this.nombreJugador1 = nombreJugador1;
	}



	public JButton getBtnNewButton_1() {
		return btnNewButton_1;
	}

	public void setBtnNewButton_1(JButton btnNewButton_1) {
		this.btnNewButton_1 = btnNewButton_1;
	}

	public JButton getBtnNewButton_2() {
		return btnNewButton_2;
	}

	public void setBtnNewButton_2(JButton btnNewButton_2) {
		this.btnNewButton_2 = btnNewButton_2;
	}

	public JButton getBtnNewButton_3() {
		return btnNewButton_3;
	}
	public void setBtnNewButton_3(JButton btnNewButton_3) {
		this.btnNewButton_3 = btnNewButton_3;
	}

	
	



}
