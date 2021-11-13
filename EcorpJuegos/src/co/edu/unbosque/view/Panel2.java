package co.edu.unbosque.view;

import javax.swing.AbstractButton;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;
import co.edu.unbosque.controller.Controller;

import java.awt.Color;
import java.awt.Font;

public class Panel2 extends JPanel {
	
	private static final long serialVersionUID = 1L;
	
	private JLabel nombreJugador1;
	
	private JButton btnEscribir;//Escribir
	private JButton btnLeer;//Leer
	private JButton btnVolver;//Volver
	
	public static final String ESCRIBIR2 = "Escribir";
	public static final String ESCRIBIR_REG2 = "Escribir_Reg";
	public static final String LEER2 = "Leer";
	public static final String LEER_REG2 = "Leer_Reg";
	public static final String VOLVER2 = "Volver";
	
	private JLabel lblNjuego;
	private JLabel lblTjuego;
	
	
	private JTextField nombreJuego;
	private JTextField tipoJuego;
	
	public Panel2(Controller control) {
		
		setForeground(Color.WHITE);
		setVisible(false);
		setBackground(Color.BLACK);
		setSize(584,261); //tamaño en ancho y alto en pixeles


		setLayout(null);
		
		btnEscribir = new JButton("Escribir");
		btnEscribir.setBounds(323, 226, 89, 23);
		btnEscribir.setActionCommand(ESCRIBIR2);
		add(btnEscribir);
		
		btnLeer = new JButton("Leer");
		btnLeer.setBounds(82, 226, 89, 23);
		btnLeer.setActionCommand(LEER2);
		add(btnLeer);
		
		btnVolver = new JButton("Volver");
		btnVolver.setBounds(205, 226, 89, 23);
		btnEscribir.setActionCommand(VOLVER2);
		add(btnVolver);
		
		lblNjuego = new JLabel("Nombre del juego ");
		lblNjuego.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		lblNjuego.setForeground(Color.WHITE);
		lblNjuego.setBounds(58, 84, 124, 14);
		add(lblNjuego);
		
		lblTjuego = new JLabel("Tipo de juego");
		lblTjuego.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		lblTjuego.setForeground(Color.WHITE);
		lblTjuego.setBounds(58, 130, 89, 14);
		add(lblTjuego);
		
		
		nombreJuego = new JTextField();
		nombreJuego.setBounds(192, 82, 86, 20);
		add(nombreJuego);
		nombreJuego.setColumns(10);
		
		tipoJuego = new JTextField();
		tipoJuego.setBounds(192, 128, 86, 20);
		add(tipoJuego);
		tipoJuego.setColumns(10);
		
	}

	public JTextField getNombreJuego() {
		return nombreJuego;
	}

	public void setNombreJuego(JTextField nombreJuego) {
		this.nombreJuego = nombreJuego;
	}

	public JTextField getTipoJuego() {
		return tipoJuego;
	}

	public void setTipoJuego(JTextField tipoJuego) {
		this.tipoJuego = tipoJuego;
	}

	
	
	
	
	
	public static String getEscribir2() {
		return ESCRIBIR2;
	}

	public static String getEscribirReg2() {
		return ESCRIBIR_REG2;
	}

	public static String getLeer2() {
		return LEER2;
	}

	public static String getLeerReg2() {
		return LEER_REG2;
	}

	public static String getVolver2() {
		return VOLVER2;
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
