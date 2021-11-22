package co.edu.unbosque.view;
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Modulo2Registro extends JFrame {
	
	
	private JButton btnEscribir;//Escribir
	private JButton btnLeer;//Leer
	private JButton btnVolver;//Volver
	
	public static final String ESCRIBIR2 = "Escribir";
	public static final String LEER2 = "Leer";
	public static final String VOLVER2 = "Volver";
	
	
	
	private JTextField cedula;
	private JTextField nombre;
	private JTextField direccion;
	private JTextField telefono;
	private JTextField correo;

	/**
	 * Launch the application.
	 */
	
	
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Modulo2Registro frame = new Modulo2Registro();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}



	/**
	 * Create the frame.
	 * @param control 
	 */
	public Modulo2Registro() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 391, 280);
		getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Cedula");
		lblNewLabel.setBounds(51, 33, 46, 14);
		getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Nombre");
		lblNewLabel_1.setBounds(51, 75, 46, 14);
		getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Direccion");
		lblNewLabel_2.setBounds(51, 117, 75, 14);
		getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Telefono");
		lblNewLabel_3.setBounds(51, 164, 75, 14);
		getContentPane().add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Correo");
		lblNewLabel_4.setBounds(51, 206, 46, 14);
		getContentPane().add(lblNewLabel_4);
		
		cedula = new JTextField();
		cedula.setBounds(160, 41, 86, 20);
		add(cedula);
		cedula.setColumns(10);
		
		nombre = new JTextField();
		nombre.setBounds(160, 72, 86, 20);
		add(nombre);
		nombre.setColumns(10);
		
		direccion = new JTextField();
		direccion.setBounds(160, 114, 86, 20);
		add(direccion);
		direccion.setColumns(10);
		
		telefono = new JTextField();
		telefono.setBounds(160, 161, 86, 20);
	    add(telefono);
		telefono.setColumns(10);
		
		correo = new JTextField();
		correo.setBounds(160, 203, 86, 20);
		add(correo);
		correo.setColumns(10);
		
		JButton butLeer = new JButton("Leer");		
		butLeer.setActionCommand(LEER2);
		butLeer.setBounds(270, 71, 89, 23);
	    add(butLeer);
		
		JButton butEscribir = new JButton("Escribir");
		butEscribir.setActionCommand(ESCRIBIR2);
		butEscribir.setBounds(270, 113, 89, 23);
		add(butEscribir);
		
		JButton butVolver = new JButton("Volver");
		butVolver.setBounds(270, 160, 89, 23);
		add(butVolver);
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
