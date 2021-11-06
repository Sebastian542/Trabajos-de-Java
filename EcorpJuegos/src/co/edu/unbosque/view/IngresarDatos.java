package co.edu.unbosque.view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import co.edu.unbosque.controller.Controller;
import javax.swing.JLabel;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Toolkit;

public class IngresarDatos extends JFrame {

	private JPanel contentPane;
	private JTextField nombre;
	private JTextField edad;
	private JTextField genero;
	private JTextField puntos;
	private JButton butEscribir;
	private JButton butLeer;

	public static final String ESCRIBIR = "Escribir";
	public static final String LEER = "Leer";

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					IngresarDatos frame = new IngresarDatos(null);
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
	public IngresarDatos(Controller control) {
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\juans\\Desktop\\logo.png"));
		setTitle("Ingreso de datos");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 366, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 0, 0));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Nombre");
		lblNewLabel.setForeground(new Color(253, 245, 230));
		lblNewLabel.setBounds(66, 46, 46, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Edad");
		lblNewLabel_1.setForeground(new Color(253, 245, 230));
		lblNewLabel_1.setBounds(66, 84, 46, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Genero");
		lblNewLabel_2.setForeground(new Color(253, 245, 230));
		lblNewLabel_2.setBounds(66, 124, 46, 14);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Puntos");
		lblNewLabel_3.setForeground(new Color(253, 245, 230));
		lblNewLabel_3.setBounds(66, 170, 46, 14);
		contentPane.add(lblNewLabel_3);
		
		nombre = new JTextField();
		nombre.setBounds(155, 43, 86, 20);
		contentPane.add(nombre);
		nombre.setColumns(10);
		
		edad = new JTextField();
		edad.setBounds(155, 81, 86, 20);
		contentPane.add(edad);
		edad.setColumns(10);
		
		genero = new JTextField();
		genero.setBounds(155, 121, 86, 20);
		contentPane.add(genero);
		genero.setColumns(10);
		
		puntos = new JTextField();
		puntos.setBounds(155, 167, 86, 20);
		contentPane.add(puntos);
		puntos.setColumns(10);
		
		JButton butLeer = new JButton("Leer");
		butLeer.setBounds(66, 227, 89, 23);
		contentPane.add(butLeer);
		butLeer.setActionCommand(LEER);
		
	    butEscribir = new JButton("Escribir");
		butEscribir.setBounds(245, 227, 89, 23);
		contentPane.add(butEscribir);
	
		butEscribir.setActionCommand(ESCRIBIR);
		
		

	}

	public JTextField getNombre() {
		return nombre;
	}

	public void setNombre(JTextField nombre) {
		this.nombre = nombre;
	}

	public JTextField getEdad() {
		return edad;
	}

	public void setEdad(JTextField edad) {
		this.edad = edad;
	}

	public JTextField getGenero() {
		return genero;
	}

	public void setGenero(JTextField genero) {
		this.genero = genero;
	}

	public JTextField getPuntos() {
		return puntos;
	}

	public void setPuntos(JTextField puntos) {
		this.puntos = puntos;
	}
	
	
	
	
	
	
	
	


	public void setButEscribir(JButton butEscribir) {
		this.butEscribir = butEscribir;
	}
	
	
	public static String getButEscribir() {
		return ESCRIBIR;
	}
	
	
	public void setButLeer(JButton butLeer) {
		this.butLeer = butLeer;
	}
	
	public static String getLeer() {
		return LEER;
	}
	
	
	
	
	
	
}
