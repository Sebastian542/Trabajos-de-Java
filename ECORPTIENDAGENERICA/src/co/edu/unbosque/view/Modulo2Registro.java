package co.edu.unbosque.view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridLayout;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Modulo2Registro extends JFrame {

	private JPanel contentPane;
	private JTextField cedula;
	private JTextField nombre;
	private JTextField direccion;
	private JTextField telefono;
	private JTextField correo;

	/**
	 * Launch the application.
	 */
	
	
	/*
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


*/
	/**
	 * Create the frame.
	 */
	public Modulo2Registro() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 408, 345);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Cedula");
		lblNewLabel.setBounds(45, 39, 46, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Nombre");
		lblNewLabel_1.setBounds(45, 87, 46, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Direcci\u00F3n");
		lblNewLabel_2.setBounds(45, 133, 46, 14);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Telefono");
		lblNewLabel_3.setBounds(45, 196, 46, 14);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Correo Electronico");
		lblNewLabel_4.setBounds(45, 258, 99, 14);
		contentPane.add(lblNewLabel_4);
		
		cedula = new JTextField();
		cedula.setBounds(129, 36, 86, 20);
		contentPane.add(cedula);
		cedula.setColumns(10);
		
		nombre = new JTextField();
		nombre.setBounds(129, 84, 86, 20);
		contentPane.add(nombre);
		nombre.setColumns(10);
		
		direccion = new JTextField();
		direccion.setBounds(129, 130, 86, 20);
		contentPane.add(direccion);
		direccion.setColumns(10);
		
		telefono = new JTextField();
		telefono.setBounds(129, 193, 86, 20);
		contentPane.add(telefono);
		telefono.setColumns(10);
		
		correo = new JTextField();
		correo.setBounds(146, 255, 86, 20);
		contentPane.add(correo);
		correo.setColumns(10);
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
	
	
	
	
}
