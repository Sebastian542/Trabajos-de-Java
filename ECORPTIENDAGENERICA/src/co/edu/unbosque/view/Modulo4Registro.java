package co.edu.unbosque.view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.Font;

public class Modulo4Registro extends JPanel{
	
	
	private static final long serialVersionUID = 1L;

	

	private JButton btnEscribir;//Escribir
	private JButton btnLeer;//Leer
	private JButton btnVolver;//Volver
	
	public static final String ESCRIBIR4 = "Escribir4";
	public static final String LEER4 = "Leer4";
	public static final String VOLVER4 = "Volver4";

	
	private JTextField codProducto;
	private JTextField nomProducto;
	private JTextField nitProveedor;
	private JTextField prCompra;
	private JTextField prVenta;
	



	public Modulo4Registro() {
		setBackground(new Color(255, 140, 0));
		setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Codigo del producto");
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setBounds(26, 35, 129, 23);
		add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Nombre del producto");
		lblNewLabel_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1.setBounds(26, 84, 123, 14);
		add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Nit del proveedor");
		lblNewLabel_2.setForeground(new Color(255, 255, 255));
		lblNewLabel_2.setBounds(26, 122, 103, 14);
		add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Precio de compra");
		lblNewLabel_3.setForeground(new Color(255, 255, 255));
		lblNewLabel_3.setBounds(265, 39, 110, 14);
		add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Precio de venta");
		lblNewLabel_4.setForeground(new Color(255, 255, 255));
		lblNewLabel_4.setBounds(265, 84, 110, 14);
		add(lblNewLabel_4);
		
		codProducto = new JTextField();
		codProducto.setBounds(159, 36, 86, 20);
		add(codProducto);
		codProducto.setColumns(10);
		
		nomProducto = new JTextField();
		nomProducto.setBounds(159, 81, 86, 20);
		add(nomProducto);
		nomProducto.setColumns(10);
		
		nitProveedor = new JTextField();
		nitProveedor.setBounds(159, 119, 86, 20);
		add(nitProveedor);
		nitProveedor.setColumns(10);
		
		prCompra = new JTextField();
		prCompra.setBounds(375, 36, 86, 20);
		add(prCompra);
		prCompra.setColumns(10);
		
		prVenta = new JTextField();
		prVenta.setBounds(375, 81, 86, 20);
		add(prVenta);
		prVenta.setColumns(10);
		
		btnEscribir = new JButton("Escribir");
		btnEscribir.setBounds(81, 186, 89, 23);
		btnEscribir.setActionCommand(ESCRIBIR4);
		add(btnEscribir);
		
		btnLeer = new JButton("Leer");
		btnLeer.setBounds(202, 186, 89, 23);
		btnEscribir.setActionCommand(LEER4);
		add(btnLeer);
		
		btnVolver = new JButton("Volver");
		btnVolver.setBounds(320, 186, 89, 23);
		btnEscribir.setActionCommand(VOLVER4);
		add(btnVolver);
		
		
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




	public JTextField getNitProveedor() {
		return nitProveedor;
	}




	public void setNitProveedor(JTextField nitProveedor) {
		this.nitProveedor = nitProveedor;
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
