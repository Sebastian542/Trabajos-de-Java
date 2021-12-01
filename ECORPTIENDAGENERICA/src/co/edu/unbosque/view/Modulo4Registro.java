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

	
	private JTextField codProducto;
	private JTextField nomProducto;
	private JTextField nitProveedor;
	private JTextField prCompra;
	private JTextField prVenta;
	



	public Modulo4Registro() {
		setBackground(new Color(255, 140, 0));
		setLayout(null);

		
			
		}
		
		
	/**
	 * Create the frame.
	 */
	public Modulo4Registro(Controller control) {
		setLayout(null);
		setBackground(new Color(255, 69, 0));
		setForeground(new Color(255, 255, 255));
		setBorder(new EmptyBorder(5, 5, 5, 5));

		
		JLabel lblNewLabel = new JLabel("Codigo del producto");
		lblNewLabel.setForeground(new Color(255, 255, 255));

		lblNewLabel.setBounds(26, 35, 129, 23);

		lblNewLabel.setBounds(10, 30, 114, 14);

		add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Nombre del producto");
		lblNewLabel_1.setForeground(new Color(255, 255, 255));

		lblNewLabel_1.setBounds(26, 84, 123, 14);

		lblNewLabel_1.setBounds(230, 30, 114, 14);

		add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Nit del proveedor");
		lblNewLabel_2.setForeground(new Color(255, 255, 255));

		lblNewLabel_2.setBounds(26, 122, 103, 14);

		lblNewLabel_2.setFont(new Font("Roboto", Font.PLAIN, 11));
		lblNewLabel_2.setBounds(10, 79, 114, 14);

		add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Precio de compra");
		lblNewLabel_3.setForeground(new Color(255, 255, 255));

		lblNewLabel_3.setBounds(265, 39, 110, 14);

		lblNewLabel_3.setFont(new Font("Roboto", Font.PLAIN, 11));
		lblNewLabel_3.setBounds(230, 79, 114, 14);

		add(lblNewLabel_3);
		

		JLabel lblNewLabel_4 = new JLabel("Precio de venta");
		lblNewLabel_4.setForeground(new Color(255, 255, 255));
		lblNewLabel_4.setBounds(265, 84, 110, 14);
		add(lblNewLabel_4);

		textField = new JTextField();//NombreProducto
		textField.setBounds(134, 27, 86, 20);
		add(textField);

		codProducto = new JTextField();
		codProducto.setBounds(159, 36, 86, 20);
		add(codProducto);
		codProducto.setColumns(10);

		textField_1 = new JTextField();//NITproveedor
		textField_1.setBounds(338, 27, 86, 20);
		add(textField_1);

		nomProducto = new JTextField();
		nomProducto.setBounds(159, 81, 86, 20);
		add(nomProducto);
		nomProducto.setColumns(10);

		textField_2 = new JTextField();//PrecioCompra
		textField_2.setBounds(134, 76, 86, 20);
		add(textField_2);

		nitProveedor = new JTextField();
		nitProveedor.setBounds(159, 119, 86, 20);
		add(nitProveedor);
		nitProveedor.setColumns(10);

		textField_3 = new JTextField();//PrecioVenta
		textField_3.setBounds(338, 76, 86, 20);
		add(textField_3);

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

		btnNewButton = new JButton("Escribir");
		btnNewButton.setActionCommand(ESCRIBIR4);
		btnNewButton.setBounds(86, 135, 89, 23);
		add(btnNewButton);

		btnLeer = new JButton("Leer");
		btnLeer.setBounds(202, 186, 89, 23);
		btnEscribir.setActionCommand(LEER4);
		add(btnLeer);

		btnNewButton_1 = new JButton("Leer");
		btnNewButton_1.setActionCommand(LEER4);
		btnNewButton_1.setBounds(205, 135, 89, 23);
		add(btnNewButton_1);

		btnVolver = new JButton("Volver");
		btnVolver.setBounds(320, 186, 89, 23);
		btnEscribir.setActionCommand(VOLVER4);
		add(btnVolver);
		
		btnNewButton_2 = new JButton("Volver");
		btnNewButton_2.setActionCommand(VOLVER4);
		btnNewButton_2.setBounds(304, 135, 89, 23);
		add(btnNewButton_2);

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
