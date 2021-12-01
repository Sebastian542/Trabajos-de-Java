package co.edu.unbosque.view;

import javax.swing.JButton;
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
	private JButton butTotalizar;
	private JButton butVolver;
	public static final String VOLVER7="VOLVER7";
	public static final String ESCRIBIR5="ESCRIBIR5";

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
		
		labCantidadVen = new JLabel("Cantidad a Vender");
		labCantidadVen.setBounds(10, 90, 106, 20);
		labCantidadVen.setForeground(Color.WHITE);
		labCantidadVen.setFont(new Font("Roboto", Font.PLAIN, 11));
		add(labCantidadVen);
		
		txtCantidadVen = new JTextField();
		txtCantidadVen.setBounds(160, 90, 86, 20);
		add(txtCantidadVen);
		
		butTotalizar = new JButton("Escribir");
		butTotalizar.setActionCommand(ESCRIBIR5);
		butTotalizar.setBounds(160, 160, 89, 23);
		add(butTotalizar);
		
		butVolver = new JButton("Volver");
		butVolver.setActionCommand(VOLVER7);
		butVolver.setBounds(10, 160, 89, 23);
		add(butVolver);
	}
	

	public JButton getButTotalizar() {
		return butTotalizar;
	}


	public void setButTotalizar(JButton butTotalizar) {
		this.butTotalizar = butTotalizar;
	}


	public JButton getButVolver() {
		return butVolver;
	}


	public void setButVolver(JButton butVolver) {
		this.butVolver = butVolver;
	}


	public static String getVolver7() {
		return VOLVER7;
	}



	public static String getEscribir5() {
	return ESCRIBIR5;
}


	public JLabel getLabCodProd() {
		return labCodProd;
	}

	public void setLabCodProd(JLabel labCodProd) {
		this.labCodProd = labCodProd;
	}

	public JLabel getLabCantidadVen() {
		return labCantidadVen;
	}

	public void setLabCantidadVen(JLabel labCantidadVen) {
		this.labCantidadVen = labCantidadVen;
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
	
}
