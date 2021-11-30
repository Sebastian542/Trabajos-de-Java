package co.edu.unbosque.view;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;

import co.edu.unbosque.controller.Controller;

public class Modulo3Panel extends JPanel {
	private static final long serialVersionUID = 1L;
	private JLabel labNIT;
	private JLabel labnombre;
	private JLabel labproveedor;
	private JLabel labdireccion;
	private JLabel labtelefono;
	private JLabel labciudad;
	
	private JTextField txtNIT;
	private JTextField txtnombre;
	private JTextField txtproveedor;
	private JTextField txtdireccion;
	private JTextField txttelefono;
	private JTextField txtciudad;
	
	public static final String GUARDAR = "Guardar";
	
	public Modulo3Panel() {
		setBackground(Color.BLACK);
		setSize(584,184); //tamaño en ancho y alto en pixeles
		setLayout(null);
		TitledBorder border = BorderFactory.createTitledBorder("GESTI�N DE PROVEEDORES");
		border.setTitleColor(Color.WHITE);
		setBorder(border);
		
		labNIT = new JLabel("NIT");
		labNIT.setForeground(Color.WHITE);
		labNIT.setBounds(50, 30, 106, 17);
		labNIT.setFont(new Font("Tahoma", Font.PLAIN, 14));
		add(labNIT);
		
		labnombre = new JLabel("Nombre");
		labnombre.setForeground(Color.WHITE);
		labnombre.setBounds(50, 60, 106, 17);
		labnombre.setFont(new Font("Tahoma", Font.PLAIN, 14));
		add(labnombre);
		
		labproveedor = new JLabel("Proveedor");
		labproveedor.setForeground(Color.WHITE);
		labproveedor.setBounds(50, 90, 106, 17);
		labproveedor.setFont(new Font("Tahoma", Font.PLAIN, 14));
		add(labproveedor);
		
		labdireccion = new JLabel("Direccion");
		labdireccion.setForeground(Color.WHITE);
		labdireccion.setBounds(325, 30, 106, 17);
		labdireccion.setFont(new Font("Tahoma", Font.PLAIN, 14));
		add(labdireccion);
		
		labtelefono = new JLabel("Telefono");
		labtelefono.setForeground(Color.WHITE);
		labtelefono.setBounds(325, 60, 106, 17);
		labtelefono.setFont(new Font("Tahoma", Font.PLAIN, 14));
		add(labtelefono);
		
		labciudad = new JLabel("Ciudad");
		labciudad.setForeground(Color.WHITE);
		labciudad.setBounds(325, 90, 106, 17);
		labciudad.setFont(new Font("Tahoma", Font.PLAIN, 14));
		add(labciudad);
		
		txtNIT = new JTextField();
		txtNIT.setBounds(120, 30, 106, 17);
		txtNIT.setFont(new Font("Tahoma", Font.PLAIN, 14));
		add(txtNIT);
		
		txtnombre = new JTextField();
		txtnombre.setBounds(120, 60, 106, 17);
		txtnombre.setFont(new Font("Tahoma", Font.PLAIN, 14));
		add(txtnombre);
		
		txtproveedor = new JTextField();
		txtproveedor.setBounds(120, 90, 106, 17);
		txtproveedor.setFont(new Font("Tahoma", Font.PLAIN, 14));
		add(txtproveedor);
		
		txtdireccion = new JTextField();
		txtdireccion.setBounds(390, 30, 106, 17);
		txtdireccion.setFont(new Font("Tahoma", Font.PLAIN, 14));
		add(txtdireccion);
		
		txttelefono = new JTextField();
		txttelefono.setBounds(390, 60, 106, 17);
		txttelefono.setFont(new Font("Tahoma", Font.PLAIN, 14));
		add(txttelefono);
		
		txtciudad = new JTextField();
		txtciudad.setBounds(390, 90, 106, 17);
		txtciudad.setFont(new Font("Tahoma", Font.PLAIN, 14));
		add(txtciudad);
		
		
	}

	public JLabel getLabNIT() {
		return labNIT;
	}

	public void setLabNIT(JLabel labNIT) {
		this.labNIT = labNIT;
	}

	public JLabel getLabnombre() {
		return labnombre;
	}

	public void setLabnombre(JLabel labnombre) {
		this.labnombre = labnombre;
	}

	public JLabel getLabproveedor() {
		return labproveedor;
	}

	public void setLabproveedor(JLabel labproveedor) {
		this.labproveedor = labproveedor;
	}

	public JLabel getLabdireccion() {
		return labdireccion;
	}

	public void setLabdireccion(JLabel labdireccion) {
		this.labdireccion = labdireccion;
	}

	public JLabel getLabtelefono() {
		return labtelefono;
	}

	public void setLabtelefono(JLabel labtelefono) {
		this.labtelefono = labtelefono;
	}

	public JLabel getLabciudad() {
		return labciudad;
	}

	public void setLabciudad(JLabel labciudad) {
		this.labciudad = labciudad;
	}

	public JTextField getTxtNIT() {
		return txtNIT;
	}

	public void setTxtNIT(JTextField txtNIT) {
		this.txtNIT = txtNIT;
	}

	public JTextField getTxtnombre() {
		return txtnombre;
	}

	public void setTxtnombre(JTextField txtnombre) {
		this.txtnombre = txtnombre;
	}

	public JTextField getTxtproveedor() {
		return txtproveedor;
	}

	public void setTxtproveedor(JTextField txtproveedor) {
		this.txtproveedor = txtproveedor;
	}

	public JTextField getTxtdireccion() {
		return txtdireccion;
	}

	public void setTxtdireccion(JTextField txtdireccion) {
		this.txtdireccion = txtdireccion;
	}

	public JTextField getTxttelefono() {
		return txttelefono;
	}

	public void setTxttelefono(JTextField txttelefono) {
		this.txttelefono = txttelefono;
	}

	public JTextField getTxtciudad() {
		return txtciudad;
	}

	public void setTxtciudad(JTextField txtciudad) {
		this.txtciudad = txtciudad;
	}

	public static String getGuardar() {
		return GUARDAR;
	}
	
	
}
