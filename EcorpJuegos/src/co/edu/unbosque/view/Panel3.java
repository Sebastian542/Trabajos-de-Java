package co.edu.unbosque.view;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;

import co.edu.unbosque.controller.Controller;

import java.awt.Color;

public class Panel3 extends JPanel {
	private static final long serialVersionUID = 1L;
	private JLabel labjugador1;
	private JLabel labjugador2;
	private JLabel labpuntaje1;
	private JLabel labpuntaje2;
	private JLabel labtipoPartida;
	private JLabel labjuego;
	private JTextField txtpuntaje1;
	private JTextField txtpuntaje2;
	private JTextField txtjugador1;
	private JTextField txtjugador2;
	private JTextField txtTipoPartida;
	private JTextField txtjuego;
	private JButton butLeer;
	private JButton butEscribir;
	private JButton butVolver;
	public static final String ESCRIBIR = "Escribir";
	public static final String LEER = "Leer";
	public static final String VOLVER = "Volver";
	/**
	 * Create the panel.
	 * @param control 
	 */
	public Panel3(Controller control) {
		setVisible(false);
		setBackground(new Color(89, 172, 166));
		setSize(600,400); //tamaÃ±o en ancho y alto en pixeles
		setLayout(null);
		TitledBorder border = BorderFactory.createTitledBorder("Partida");
		border.setTitleColor(Color.BLACK);
		setBorder( border );
		
		labjugador1 = new JLabel("JUGADOR 1");
		labjugador1.setBounds(50, 56, 70, 17);
		add(labjugador1);
		
		txtjugador1 = new JTextField();
		txtjugador1.setBounds(122, 54, 86, 20);
		add(txtjugador1);
		txtjugador1.setColumns(10);
		
		labjugador2 = new JLabel("JUGADOR 2");
		labjugador2.setBounds(50, 106, 70, 17);
		add(labjugador2);
		
		txtjugador2 = new JTextField();
		txtjugador2.setBounds(122, 104, 86, 20);
		add(txtjugador2);
		txtjugador2.setColumns(10);
		
		labpuntaje1 = new JLabel("PUNTAJE 1");
		labpuntaje1.setBounds(354, 57, 66, 14);
		add(labpuntaje1);
		
		txtpuntaje1 = new JTextField();
		txtpuntaje1.setBounds(423, 53, 86, 20);
		add(txtpuntaje1);
		txtpuntaje1.setColumns(10);
		
		labpuntaje2 = new JLabel("PUNTAJE 2");
		labpuntaje2.setBounds(354, 107, 66, 14);
		add(labpuntaje2);
		
		txtpuntaje2 = new JTextField();
		txtpuntaje2.setBounds(423, 104, 86, 20);
		add(txtpuntaje2);
		txtpuntaje2.setColumns(10);
		
		labjuego = new JLabel("JUEGO");
		labjuego.setBounds(354, 157, 66, 14);
		add(labjuego);
		
		txtjuego = new JTextField();
		txtjuego.setBounds(423, 154, 86, 20);
		add(txtjuego);
		txtjuego.setColumns(10);
		
		labtipoPartida = new JLabel("TIPO DE PARTIDA");
		labtipoPartida.setBounds(50, 151, 106, 31);
		add(labtipoPartida);
		
		txtTipoPartida = new JTextField();
		txtTipoPartida.setBounds(152, 156, 86, 20);
		add(txtTipoPartida);
		txtTipoPartida.setColumns(10);
		
		butEscribir = new JButton("Escribir");
		butEscribir.setBounds(323, 226, 89, 23);
		butEscribir.setActionCommand(ESCRIBIR);
		add(butEscribir);
		
		butLeer = new JButton("Leer");
		butLeer.setBounds(82, 226, 89, 23);
		butLeer.setActionCommand(LEER);
		add(butLeer);
		
		butVolver = new JButton("Volver");
		butVolver.setBounds(205, 226, 89, 23);
		butVolver.setActionCommand(VOLVER);
		add(butVolver);
		
		
	}
	public static String getVolver() {
		return VOLVER;
	}
	
	public static String getLeer() {
		return LEER;
	}
	
	public static String getEscribir() {
		return ESCRIBIR;
	}
	public JLabel getLabjugador1() {
		return labjugador1;
	}
	public void setLabjugador1(JLabel labjugador1) {
		this.labjugador1 = labjugador1;
	}
	public JLabel getLabjugador2() {
		return labjugador2;
	}
	public void setLabjugador2(JLabel labjugador2) {
		this.labjugador2 = labjugador2;
	}
	public JLabel getLabpuntaje1() {
		return labpuntaje1;
	}
	public void setLabpuntaje1(JLabel labpuntaje1) {
		this.labpuntaje1 = labpuntaje1;
	}
	public JLabel getLabpuntaje2() {
		return labpuntaje2;
	}
	public void setLabpuntaje2(JLabel labpuntaje2) {
		this.labpuntaje2 = labpuntaje2;
	}
	public JLabel getLabtipoPartida() {
		return labtipoPartida;
	}
	public void setLabtipoPartida(JLabel labtipoPartida) {
		this.labtipoPartida = labtipoPartida;
	}
	public JTextField getTxtpuntaje1() {
		return txtpuntaje1;
	}
	public void setTxtpuntaje1(JTextField txtpuntaje1) {
		this.txtpuntaje1 = txtpuntaje1;
	}
	public JTextField getTxtpuntaje2() {
		return txtpuntaje2;
	}
	public void setTxtpuntaje2(JTextField txtpuntaje2) {
		this.txtpuntaje2 = txtpuntaje2;
	}
	public JTextField getTxtjugador1() {
		return txtjugador1;
	}
	public void setTxtjugador1(JTextField txtjugador1) {
		this.txtjugador1 = txtjugador1;
	}
	public JTextField getTxtjugador2() {
		return txtjugador2;
	}
	public void setTxtjugador2(JTextField txtjugador2) {
		this.txtjugador2 = txtjugador2;
	}
	public JTextField getTxtTipoPartida() {
		return txtTipoPartida;
	}
	public void setTxtTipoPartida(JTextField txtTipoPartida) {
		this.txtTipoPartida = txtTipoPartida;
	}
	public JButton getButLeer() {
		return butLeer;
	}
	public void setButLeer(JButton butLeer) {
		this.butLeer = butLeer;
	}
	public JButton getButEscribir() {
		return butEscribir;
	}
	public void setButEscribir(JButton butEscribir) {
		this.butEscribir = butEscribir;
	}
	public JButton getButVolver() {
		return butVolver;
	}
	public void setButVolver(JButton butVolver) {
		this.butVolver = butVolver;
	}
	public JLabel getLabjuego() {
		return labjuego;
	}
	public void setLabjuego(JLabel labjuego) {
		this.labjuego = labjuego;
	}
	public JTextField getTxtjuego() {
		return txtjuego;
	}
	public void setTxtjuego(JTextField txtjuego) {
		this.txtjuego = txtjuego;
	}
	
}	
