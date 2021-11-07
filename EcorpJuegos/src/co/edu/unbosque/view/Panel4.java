package co.edu.unbosque.view;

import javax.swing.*;
import javax.swing.border.TitledBorder;

import co.edu.unbosque.controller.Controller;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;

public class Panel4 extends JPanel {
	private JButton  butJugadores;
	private JButton  butJuegos;
	private JButton  butPartidas;
	private JButton  butTorneos;
	public static final String JUGADORES = "Jugadores";
	public static final String JUEGOS = "Juegos";
	public static final String PARTIDAS = "Partidas";
	public static final String TORNEOS = "Torneos";
	
	/**
	 * Create the panel.
	 * @param control 
	 */
	
	public Panel4(Controller control) {
		setVisible(true);
		TitledBorder border = BorderFactory.createTitledBorder("Sistema de Informacion de Juegos");
		border.setTitleColor(Color.BLACK);
		setBorder( border );
		
		butJugadores = new JButton("Jugadores");
		butJugadores.setBounds(175, 70, 200, 20);
		butJugadores.setActionCommand(JUGADORES);
		add(butJugadores);
		
		butJuegos = new JButton("Juegos");
		butJuegos.setBounds(175, 50, 200, 20);
		butJuegos.setActionCommand(JUEGOS);
		add(butJuegos);
		
		butPartidas = new JButton("Partidas");
		butPartidas.setBounds(175, 20, 200, 20);
		butPartidas.setActionCommand(PARTIDAS);
		add(butPartidas);
		
		/*butTorneos = new JButton("Torneos");
		butTorneos.setBounds(175, 90, 200, 20);
		butTorneos.setActionCommand(TORNEOS);
		add(butTorneos);*/
	}

	public static String getJugadores() {
		return JUGADORES;
	}
	
	public void setButJugadores(JButton butJugadores) {
		this.butJugadores = butJugadores;
	}

	public JButton getButJugadores() {
		return butJugadores;
	}
	

	public static String getJuegos() {
		return JUEGOS;
	}
	
	public JButton getButJuegos() {
		return butJuegos;
	}
	
	public void setButJuegos(JButton butJuegos) {
		this.butJuegos = butJuegos;
	}


	public static String getPartidas() {
		return PARTIDAS;
	}
	
	public JButton getButPartidas() {
		return butPartidas;
	}

	public void setButPartidas(JButton butPartidas) {
		this.butPartidas = butPartidas;
	}


	/*public static String getTorneos() {
		return TORNEOS;
	}

	public JButton getButTorneos() {
		return butTorneos;
	}

	public void setButTorneos(JButton butTorneos) {
		this.butTorneos = butTorneos;
	}*/
	
}
