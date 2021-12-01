package co.edu.unbosque.view;

import java.awt.Color;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;

import co.edu.unbosque.controller.Controller;

public class Modulo5Panel extends JPanel {
	
	private static final long serialVersionUID = 1L;
	private JLabel labCedula;
	private JLabel labCodProd;
	private JLabel labCantidadVen;
	
	private JTextField txtCedula;
	private JTextField txtCodProd;
	private JTextField txtCantidadVen;
	
	private JButton butCalcular;
	private JButton butVolver;
	public static final String BUSCAR5="Buscar5";
	public static final String VOLVER5="Volver5";

	
	public Modulo5Panel(Controller control) {
		setBackground(new Color(255, 69, 0));
		setForeground(new Color(255, 255, 255));
		setLayout(null);
		TitledBorder border = BorderFactory.createTitledBorder("Gestion de Ventas");
		border.setTitleColor(Color.BLACK);
		
		labCedula = new JLabel("Cedula");
		labCedula.setForeground(Color.WHITE);
		labCedula.setBounds(10, 30, 106, 17);
		labCedula.setFont(new Font("Roboto", Font.PLAIN, 12));
		add(labCedula);
		
		txtCedula = new JTextField();
		txtCedula.setBounds(110, 30, 150, 20);
		add(txtCedula);
		
		butCalcular = new JButton("BUSCAR");
		butCalcular.setBounds(320, 30, 116, 17);
		butCalcular.setActionCommand(BUSCAR5);
		add(butCalcular);
		
		butVolver = new JButton("VOLVER");
		butVolver.setBounds(320, 10, 116, 17);
		butVolver.setActionCommand(VOLVER5);
		add(butVolver);
		
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
	
	
	
	public JButton getButVolver() {
		return butVolver;
	}



	public void setButVolver(JButton butVolver) {
		this.butVolver = butVolver;
	}



	public static String getVolver5() {
		return VOLVER5;
	}



	public static String getBuscar5() {
		return BUSCAR5;
	}

	public JTextField getTxtCedula() {
		return txtCedula;
	}

	public void setTxtCedula(JTextField txtCedula) {
		this.txtCedula = txtCedula;
	}

	public JTextField getTxtCodProd() {
		return txtCodProd;
	}

	public void setTxtCodProd(JTextField txtCodProd) {
		this.txtCodProd = txtCodProd;
	}

	public JTextField getTxtCantidadVen() {
		return txtCantidadVen;
	}

	public void setTxtCantidadVen(JTextField txtCantidadVen) {
		this.txtCantidadVen = txtCantidadVen;
	}

	public JButton getButCalcular() {
		return butCalcular;
	}

	public void setButCalcular(JButton butCalcular) {
		this.butCalcular = butCalcular;
	}
	
}
