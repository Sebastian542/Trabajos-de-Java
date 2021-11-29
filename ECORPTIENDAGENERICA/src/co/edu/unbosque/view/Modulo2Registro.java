package co.edu.unbosque.view;


import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.Color;
import java.awt.Font;

public class Modulo2Registro extends JPanel{
	
	
	
	private static final long serialVersionUID = 1L;
	private JButton btnEscribir;//Escribir
	private JButton btnLeer;//Leer
	private JButton btnVolver;//Volver
	
	public static final String ESCRIBIR2 = "Escribir2";
	public static final String LEER2 = "Leer2";
	public static final String VOLVER2 = "Volver2";
	
	
	
	private JTextField cedula;
	private JTextField nombre;
	private JTextField direccion;
	private JTextField telefono;
	private JTextField correo;



	public Modulo2Registro() {
		setBackground(new Color(218, 165, 32));
		
		setForeground(new Color(0, 0, 0));
		
	
		setBounds(100, 100, 384, 267);
		setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Cedula");
		lblNewLabel.setFont(new Font("Roboto", Font.PLAIN, 14));
		lblNewLabel.setBounds(51, 26, 46, 14);
		add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Nombre");
		lblNewLabel_1.setFont(new Font("Roboto", Font.PLAIN, 14));
		lblNewLabel_1.setBounds(51, 61, 67, 14);
	    add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Direccion");
		lblNewLabel_2.setFont(new Font("Roboto", Font.PLAIN, 14));
		lblNewLabel_2.setBounds(51, 96, 75, 14);
		add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Telefono");
		lblNewLabel_3.setFont(new Font("Roboto", Font.PLAIN, 14));
		lblNewLabel_3.setBounds(51, 140, 75, 14);
	    add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Correo");
		lblNewLabel_4.setFont(new Font("Roboto", Font.PLAIN, 14));
		lblNewLabel_4.setBounds(51, 185, 46, 14);
		add(lblNewLabel_4);
		
		cedula = new JTextField();
		cedula.setFont(new Font("Roboto", Font.PLAIN, 14));
		cedula.setForeground(Color.BLACK);
		cedula.setBackground(Color.WHITE);
		cedula.setBounds(128, 27, 126, 20);
		add(cedula);
		cedula.setColumns(10);
		
		nombre = new JTextField();
		nombre.setBounds(128, 59, 126, 20);
		add(nombre);
		nombre.setColumns(10);
		
		direccion = new JTextField();
		direccion.setBounds(128, 90, 126, 20);
		add(direccion);
		direccion.setColumns(10);
		
		telefono = new JTextField();
		telefono.setBounds(128, 138, 126, 20);
        add(telefono);
		telefono.setColumns(10);
		
		correo = new JTextField();
		correo.setBounds(128, 182, 126, 20);
		add(correo);
		correo.setColumns(10);
		
		
		
		
		btnLeer = new JButton("Leer");
		btnLeer.setBounds(29, 233, 89, 23);
		btnLeer.setActionCommand(LEER2);
		add(btnLeer);
		
		btnEscribir = new JButton("Escribir");
		btnEscribir.setBounds(171, 221, 89, 23);
		btnEscribir.setActionCommand(ESCRIBIR2);
		add(btnEscribir);
		
		
		btnVolver = new JButton("Volver");
		btnVolver.setBounds(285, 221, 89, 23);
		add(btnVolver);
		
	}
	

	public static String getEscribir2() {
		return ESCRIBIR2;
	}


	public static String getLeer2() {
		return LEER2;
	}


	public static String getVolver2() {
		return VOLVER2;
	}


	public JTextField getCedula() {
		return cedula;
	}


	public void setCedula(JTextField cedula) {
		this.cedula = cedula;
	}


	public JTextField getNombre() {
		return nombre;
	}


	public void setNombre(JTextField nombre) {
		this.nombre = nombre;
	}


	public JTextField getDireccion() {
		return direccion;
	}


	public void setDireccion(JTextField direccion) {
		this.direccion = direccion;
	}


	public JTextField getTelefono() {
		return telefono;
	}


	public void setTelefono(JTextField telefono) {
		this.telefono = telefono;
	}


	public JTextField getCorreo() {
		return correo;
	}


	public void setCorreo(JTextField correo) {
		this.correo = correo;
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
}
