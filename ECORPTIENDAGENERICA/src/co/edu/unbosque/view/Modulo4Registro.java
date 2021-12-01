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

	private JButton btnEscribir;//Escribir
	private JButton btnLeer;//Leer
	private JButton btnVolver;//Volver

	private JTextField codProducto;
	private JTextField nomProducto;
	private JTextField prCompra;
	private JTextField prVenta;
	
	private JPanel contentPane;
	
	public static final String ESCRIBIR4 = "Escribir4";
	public static final String LEER4 = "Leer4";
	public static final String VOLVER4 = "Volver4";



	public Modulo4Registro() {
		setBackground(new Color(255, 255, 255));
		setLayout(null);

		
			
		}

	public Modulo4Registro(Controller control) {
		setLayout(null);
		setBackground(new Color(255, 69, 0));
		setForeground(new Color(255, 255, 255));
		setBorder(new EmptyBorder(5, 5, 5, 5));

		
		JLabel lblNewLabel = new JLabel("Codigo del producto");
		lblNewLabel.setForeground(new Color(255, 255, 255));

		lblNewLabel.setBounds(10, 30, 114, 14);

		add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Nombre del producto");
		lblNewLabel_1.setForeground(new Color(255, 255, 255));

		lblNewLabel_1.setBounds(230, 30, 134, 14);

		add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Precio de compra");
		lblNewLabel_2.setForeground(new Color(255, 255, 255));

		lblNewLabel_2.setBounds(10, 79, 114, 14);

		add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Precio de venta");
		lblNewLabel_3.setForeground(new Color(255, 255, 255));

		lblNewLabel_3.setBounds(265, 84, 110, 14);

		add(lblNewLabel_3);
		


		codProducto = new JTextField();
		codProducto.setBounds(125, 26, 86, 20);
		add(codProducto);
		
		nomProducto = new JTextField();
		nomProducto.setBounds(375, 36, 86, 20);
		add(nomProducto);

		prCompra = new JTextField();
		prCompra.setBounds(125, 81, 86, 20);
		add(prCompra);

		
		prVenta = new JTextField();
		prVenta.setBounds(375, 81, 86, 20);
		add(prVenta);
		
		btnEscribir = new JButton("Escribir");
		btnEscribir.setBounds(81, 135, 89, 23);
		btnEscribir.setActionCommand(ESCRIBIR4);
		add(btnEscribir);

		btnLeer = new JButton("Leer");
		btnLeer.setBounds(202, 135, 89, 23);
		btnLeer.setActionCommand(LEER4);
		add(btnLeer);

		btnVolver = new JButton("Volver");
		btnVolver.setBounds(320, 135, 89, 23);
		btnVolver.setActionCommand(VOLVER4);
		add(btnVolver);
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


	public JPanel getContentPane() {
		return contentPane;
	}


	public void setContentPane(JPanel contentPane) {
		this.contentPane = contentPane;
	}

	public JTextField getCodProducto() {
		return codProducto;
	}


	public void setCodProducto(JTextField codProducto) {
		this.codProducto = codProducto;
	}


	public JTextField getNomProducto() {
		return nomProducto;
	}


	public void setNomProducto(JTextField nomProducto) {
		this.nomProducto = nomProducto;
	}


	public JTextField getPrCompra() {
		return prCompra;
	}


	public void setPrCompra(JTextField prCompra) {
		this.prCompra = prCompra;
	}


	public JTextField getPrVenta() {
		return prVenta;
	}


	public void setPrVenta(JTextField prVenta) {
		this.prVenta = prVenta;
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

	
	
}
