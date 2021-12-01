package co.edu.unbosque.view;

import javax.swing.JDialog;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JTextField;

import co.edu.unbosque.controller.Controller;

public class Modulo5Dialog extends JDialog {
	private static final long serialVersionUID = 1L;
	
	private JLabel labCodProd;
	private JLabel labCantidadVen;
	private JTextField txtCodProd;
	private JTextField txtCantidadVen;

	public Modulo5Dialog(Controller control) {
		setBounds(300, 100, 450, 350);
		getContentPane().setBackground(Color.RED);
		setBackground(Color.RED);
		setLayout(null);
		
		labCodProd = new JLabel("Codigo del producto");
		labCodProd.setForeground(Color.WHITE);
		labCodProd.setBounds(10, 60, 116, 17);
		labCodProd.setFont(new Font("Roboto", Font.PLAIN, 11));
		add(labCodProd);
		
		txtCodProd = new JTextField();
		txtCodProd.setBounds(160, 60, 86, 20);
		add(txtCodProd);
		txtCodProd.setColumns(10);
		
		labCantidadVen = new JLabel("Cantidad a Vender");
		labCantidadVen.setBounds(10, 90, 106, 20);
		labCantidadVen.setForeground(Color.WHITE);
		labCantidadVen.setFont(new Font("Roboto", Font.PLAIN, 11));
		add(labCantidadVen);
		
		txtCantidadVen = new JTextField();
		txtCantidadVen.setBounds(160, 90, 86, 20);
		add(txtCantidadVen);
		txtCantidadVen.setColumns(10);
	}
}
