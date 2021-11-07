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
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_2;
	private JLabel lblNewLabel_3;
	private JLabel lblNewLabel_4;
	private JLabel lblNewLabel_5;
	private JButton btnNewButton_1;
	private JButton btnNewButton_2;
	private JTextField puntaje1;
	private JTextField puntaje2;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	public static final String CONVERTIR = "Convertir";
	
	public Panel2(Controller control) {
		setVisible(false);
		setBackground(new Color(72, 209, 204));
		setSize(423,400); //tamaño en ancho y alto en pixeles
		
		TitledBorder border = BorderFactory.createTitledBorder("Datos de Entrada");
		border.setTitleColor(Color.BLACK);
		setBorder( border );
		setLayout(null);
		
		lblNewLabel_1 = new JLabel("Jugador 1");
		lblNewLabel_1.setBounds(50, 56, 70, 17);
		add(lblNewLabel_1);
		
		lblNewLabel_2 = new JLabel("Jugador 2");
		lblNewLabel_2.setBounds(50, 106, 70, 17);
		add(lblNewLabel_2);
		
		puntaje1 = new JTextField();
		puntaje1.setBounds(323, 53, 86, 20);
		add(puntaje1);
		puntaje1.setColumns(10);
		
		puntaje2 = new JTextField();
		puntaje2.setBounds(323, 104, 86, 20);
		add(puntaje2);
		puntaje2.setColumns(10);
		
		lblNewLabel_3 = new JLabel("Puntaje");
		lblNewLabel_3.setBounds(254, 57, 46, 14);
		add(lblNewLabel_3);
		
		lblNewLabel_4 = new JLabel("Puntaje");
		lblNewLabel_4.setBounds(254, 107, 46, 14);
		add(lblNewLabel_4);
		
		lblNewLabel_5 = new JLabel("Tipo de juego :");
		lblNewLabel_5.setBounds(50, 151, 86, 31);
		add(lblNewLabel_5);
		
		btnNewButton_1 = new JButton("Escribir");
		btnNewButton_1.setBounds(323, 226, 89, 23);
		add(btnNewButton_1);
		
		btnNewButton_2 = new JButton("Leer");
		btnNewButton_2.setBounds(82, 226, 89, 23);
		add(btnNewButton_2);
		
		textField_1 = new JTextField();
		textField_1.setBounds(146, 156, 86, 20);
		add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(122, 54, 86, 20);
		add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setBounds(122, 104, 86, 20);
		add(textField_3);
		textField_3.setColumns(10);
		
	}

	public JLabel getNombreJugador1() {
		return nombreJugador1;
	}

	public void setNombreJugador1(JLabel nombreJugador1) {
		this.nombreJugador1 = nombreJugador1;
	}

	public JLabel getLblNewLabel_1() {
		return lblNewLabel_1;
	}

	public void setLblNewLabel_1(JLabel lblNewLabel_1) {
		this.lblNewLabel_1 = lblNewLabel_1;
	}

	public JLabel getLblNewLabel_2() {
		return lblNewLabel_2;
	}

	public void setLblNewLabel_2(JLabel lblNewLabel_2) {
		this.lblNewLabel_2 = lblNewLabel_2;
	}

	public JLabel getLblNewLabel_3() {
		return lblNewLabel_3;
	}

	public void setLblNewLabel_3(JLabel lblNewLabel_3) {
		this.lblNewLabel_3 = lblNewLabel_3;
	}

	public JLabel getLblNewLabel_4() {
		return lblNewLabel_4;
	}

	public void setLblNewLabel_4(JLabel lblNewLabel_4) {
		this.lblNewLabel_4 = lblNewLabel_4;
	}

	public JLabel getLblNewLabel_5() {
		return lblNewLabel_5;
	}

	public void setLblNewLabel_5(JLabel lblNewLabel_5) {
		this.lblNewLabel_5 = lblNewLabel_5;
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

	public JTextField getPuntaje1() {
		return puntaje1;
	}

	public void setPuntaje1(JTextField puntaje1) {
		this.puntaje1 = puntaje1;
	}

	public JTextField getPuntaje2() {
		return puntaje2;
	}

	public void setPuntaje2(JTextField puntaje2) {
		this.puntaje2 = puntaje2;
	}

	public JTextField getTextField_1() {
		return textField_1;
	}

	public void setTextField_1(JTextField textField_1) {
		this.textField_1 = textField_1;
	}

	public JTextField getTextField_2() {
		return textField_2;
	}

	public void setTextField_2(JTextField textField_2) {
		this.textField_2 = textField_2;
	}

	public JTextField getTextField_3() {
		return textField_3;
	}

	public void setTextField_3(JTextField textField_3) {
		this.textField_3 = textField_3;
	}
	
	
	



}
