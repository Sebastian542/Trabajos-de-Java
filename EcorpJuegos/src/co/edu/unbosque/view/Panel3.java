package co.edu.unbosque.view;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;
import javax.swing.text.AttributeSet.ColorAttribute;

import co.edu.unbosque.controller.Controller;

import java.awt.Color;
import java.awt.Font;

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
	private JButton butLeerReg;
	private JButton butEscribir;
	private JButton butEscribirReg;
	private JButton butVolver;
	public static final String ESCRIBIR3 = "Escribir";
	public static final String ESCRIBIR_REG3 = "Escribir_Reg";
	public static final String LEER3 = "Leer";
	public static final String LEER_REG3 = "Leer_Reg";
	public static final String VOLVER3 = "Volver";
	/**
	 * Create the panel.
	 * @param control 
	 */
	public Panel3(Controller control) {
		setVisible(false);
		setBackground(Color.BLACK);
		setSize(584,180); //tamaño en ancho y alto en pixeles
		setLayout(null);
		TitledBorder border = BorderFactory.createTitledBorder("Partida");
		border.setTitleColor(Color.WHITE);
		setBorder(border);
		
		labjugador1 = new JLabel("Jugador 1");
		labjugador1.setForeground(Color.WHITE);
		labjugador1.setBounds(50, 30, 106, 17);
		labjugador1.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		add(labjugador1);
		
		txtjugador1 = new JTextField();
		txtjugador1.setBounds(152, 30, 86, 20);
		add(txtjugador1);
		txtjugador1.setColumns(10);
		
		labjugador2 = new JLabel("Jugador 2");
		labjugador2.setForeground(Color.WHITE);
		labjugador2.setBounds(50, 60, 106, 17);
		labjugador2.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		add(labjugador2);
		
		txtjugador2 = new JTextField();
		txtjugador2.setBounds(152, 60, 86, 20);
		add(txtjugador2);
		txtjugador2.setColumns(10);
		
		labpuntaje1 = new JLabel("Puntaje 1");
		labpuntaje1.setForeground(Color.WHITE);
		labpuntaje1.setBounds(354, 30, 106, 14);
		labpuntaje1.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		add(labpuntaje1);
		
		txtpuntaje1 = new JTextField();
		txtpuntaje1.setBounds(423, 30, 86, 20);
		add(txtpuntaje1);
		txtpuntaje1.setColumns(10);
		
		labpuntaje2 = new JLabel("Puntaje 2");
		labpuntaje2.setForeground(Color.WHITE);
		labpuntaje2.setBounds(354, 60, 106, 14);
		labpuntaje2.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		add(labpuntaje2);
		
		txtpuntaje2 = new JTextField();
		txtpuntaje2.setBounds(423, 60, 86, 20);
		add(txtpuntaje2);
		txtpuntaje2.setColumns(10);
		
		labjuego = new JLabel("Juego");
		labjuego.setBounds(354, 90, 106, 20);
		labjuego.setForeground(Color.WHITE);
		labjuego.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		add(labjuego);
		
		txtjuego = new JTextField();
		txtjuego.setBounds(423, 90, 86, 20);
		add(txtjuego);
		txtjuego.setColumns(10);
		
		labtipoPartida = new JLabel("Tipo de Partida");
		labtipoPartida.setBounds(50, 90, 106, 31);
		labtipoPartida.setForeground(Color.WHITE);
		labtipoPartida.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		add(labtipoPartida);
		
		txtTipoPartida = new JTextField();
		txtTipoPartida.setBounds(152, 90, 86, 20);
		add(txtTipoPartida);
		txtTipoPartida.setColumns(10);
		
		butEscribir = new JButton("Escribir");
		butEscribir.setBounds(152, 130, 89, 23);
		butEscribir.setActionCommand(ESCRIBIR3);
		add(butEscribir);
		
		butEscribirReg = new JButton("Escribir_Reg");
		butEscribirReg.setBounds(16, 130, 125, 23);
		butEscribirReg.setActionCommand(ESCRIBIR_REG3);
		add(butEscribirReg);
		
		butLeer = new JButton("Leer");
		butLeer.setBounds(252, 130, 89, 23);
		butLeer.setActionCommand(LEER3);
		add(butLeer);
		
		butLeerReg = new JButton("Leer_Reg");
		butLeerReg.setBounds(352, 130, 89, 23);
		butLeerReg.setActionCommand(LEER_REG3);
		add(butLeerReg);
		
		butVolver = new JButton("Volver");
		butVolver.setBounds(452, 130, 89, 23);
		butVolver.setActionCommand(VOLVER3);
		add(butVolver);
		
		
	}
	public static String getVolver3() {
		return VOLVER3;
	}
	
	public static String getLeer3() {
		return LEER3;
	}
	
	public static String getEscribir3() {
		return ESCRIBIR3;
	}
	
	public static String getEscribirReg3() {
		return ESCRIBIR_REG3;
	}
	
	public static String getLeerReg3() {
		return LEER_REG3;
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
	public JButton getButLeerReg() {
		return butLeerReg;
	}
	public void setButLeerReg(JButton butLeerReg) {
		this.butLeerReg = butLeerReg;
	}
	public JButton getButEscribirReg() {
		return butEscribirReg;
	}
	public void setButEscribirReg(JButton butEscribirReg) {
		this.butEscribirReg = butEscribirReg;
	}
	
}	