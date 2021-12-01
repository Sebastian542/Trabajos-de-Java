package co.edu.unbosque.view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import co.edu.unbosque.controller.Controller;

import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.Font;

public class Modulo4Registro extends JPanel {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JButton btnNewButton;
	private JButton btnNewButton_1;
	private JButton btnNewButton_2;
	
	public static final String ESCRIBIR4 = "Escribir4";
	public static final String LEER4 = "Leer4";
	public static final String VOLVER4 = "Volver4";
	/**
	 * Create the frame.
	 */
	public Modulo4Registro(Controller control) {
		setLayout(null);
		setBackground(new Color(255, 69, 0));
		setForeground(new Color(255, 255, 255));
		setBorder(new EmptyBorder(5, 5, 5, 5));
		
		JLabel lblNewLabel = new JLabel("Nombre del producto");
		lblNewLabel.setFont(new Font("Roboto", Font.PLAIN, 11));
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setBounds(10, 30, 114, 14);
		add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Nit del proveedor");
		lblNewLabel_1.setFont(new Font("Roboto", Font.PLAIN, 11));
		lblNewLabel_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1.setBounds(230, 30, 114, 14);
		add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Precio de compra");
		lblNewLabel_2.setForeground(new Color(255, 255, 255));
		lblNewLabel_2.setFont(new Font("Roboto", Font.PLAIN, 11));
		lblNewLabel_2.setBounds(10, 79, 114, 14);
		add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Precio de venta");
		lblNewLabel_3.setForeground(new Color(255, 255, 255));
		lblNewLabel_3.setFont(new Font("Roboto", Font.PLAIN, 11));
		lblNewLabel_3.setBounds(230, 79, 114, 14);
		add(lblNewLabel_3);
		
		textField = new JTextField();//NombreProducto
		textField.setBounds(134, 27, 86, 20);
		add(textField);
		
		textField_1 = new JTextField();//NITproveedor
		textField_1.setBounds(338, 27, 86, 20);
		add(textField_1);
		
		textField_2 = new JTextField();//PrecioCompra
		textField_2.setBounds(134, 76, 86, 20);
		add(textField_2);
		
		textField_3 = new JTextField();//PrecioVenta
		textField_3.setBounds(338, 76, 86, 20);
		add(textField_3);
		
		btnNewButton = new JButton("Escribir");
		btnNewButton.setActionCommand(ESCRIBIR4);
		btnNewButton.setBounds(86, 135, 89, 23);
		add(btnNewButton);
		
		btnNewButton_1 = new JButton("Leer");
		btnNewButton_1.setActionCommand(LEER4);
		btnNewButton_1.setBounds(205, 135, 89, 23);
		add(btnNewButton_1);
		
		btnNewButton_2 = new JButton("Volver");
		btnNewButton_2.setActionCommand(VOLVER4);
		btnNewButton_2.setBounds(304, 135, 89, 23);
		add(btnNewButton_2);
	}
	
	public static String getEscribir4() {
		return ESCRIBIR4;
	}

	public static String getLeer4() {
		return LEER4;
	}

	public static String getVolver4() {
		return VOLVER4;
	}

	public JTextField getTextField() {
		return textField;
	}

	public void setTextField(JTextField textField) {
		this.textField = textField;
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

	public JPanel getContentPane() {
		return contentPane;
	}

	public void setContentPane(JPanel contentPane) {
		this.contentPane = contentPane;
	}

	public JButton getBtnNewButton() {
		return btnNewButton;
	}

	public void setBtnNewButton(JButton btnNewButton) {
		this.btnNewButton = btnNewButton;
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
	
	
}
