package co.edu.unbosque.view;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;

import co.edu.unbosque.controller.Controller;

import java.awt.Color;
import java.awt.GridLayout;

public class Panel4 extends JPanel {
	private JButton  butjugadores;
	private JButton  butjuegos;
	private JButton  butpartidas;
	private JButton  buttorneos;
	public static final String JUGADORES = "Jugadores";
	public static final String JUEGOS = "Juegos";
	public static final String PARTIDAS = "Partidas";
	public static final String TORNEOS = "Torneos";
	
	/**
	 * Create the panel.
	 * @param control 
	 */
	
	public Panel4(Controller control) {
		setLayout(new GridLayout(2, 2));
		TitledBorder border = BorderFactory.createTitledBorder("Sistema de Información de Juegos");
		border.setTitleColor(Color.BLACK);
		setBorder( border );
		
		butjugadores = new JButton("Jugadores");
		butjugadores.setActionCommand(JUGADORES);
		
		butjuegos = new JButton("Juegos");
		butjuegos.setActionCommand(JUEGOS);
		
		butpartidas = new JButton("Partidas");
		butpartidas.setActionCommand(PARTIDAS);
		
		buttorneos = new JButton("Torneos");
		buttorneos.setActionCommand(TORNEOS);
	}

	public JButton getButjugadores() {
		return butjugadores;
	}

	public void setButjugadores(JButton butjugadores) {
		this.butjugadores = butjugadores;
	}

	public JButton getButjuegos() {
		return butjuegos;
	}

	public void setButjuegos(JButton butjuegos) {
		this.butjuegos = butjuegos;
	}

	public JButton getButpartidas() {
		return butpartidas;
	}

	public void setButpartidas(JButton butpartidas) {
		this.butpartidas = butpartidas;
	}

	public JButton getButtorneos() {
		return buttorneos;
	}

	public void setButtorneos(JButton buttorneos) {
		this.buttorneos = buttorneos;
	}

	public static String getJugadores() {
		return JUGADORES;
	}

	public static String getJuegos() {
		return JUEGOS;
	}

	public static String getPartidas() {
		return PARTIDAS;
	}

	public static String getTorneos() {
		return TORNEOS;
	}
	
}
