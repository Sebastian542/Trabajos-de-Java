package co.edu.unbosque.view;

import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JList;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;

import co.edu.unbosque.controller.Controller;

import java.awt.Color;
import java.awt.GridLayout;

public class Panel3 extends JPanel {
	private static final long serialVersionUID = 1L;
	public static final String CONVERTIR = "Convertir";
	private JLabel jugador1;
	private JLabel jugador2;
	private JLabel puntaje1;
	private JLabel puntaje2;
	private JList listaPartida;
	
	/**
	 * Create the panel.
	 * @param control 
	 */
	public Panel3(Controller control) {
		setVisible(false);
		setLayout(new GridLayout(2,2));
		TitledBorder border = BorderFactory.createTitledBorder("Partida");
		border.setTitleColor(Color.BLACK);
		setBorder( border );
		
		jugador1 = new JLabel("JUGADOR 1");
		add(jugador1);
		
		jugador2 = new JLabel("JUGADOR 2");
		add(jugador2);
		
		puntaje1 = new JLabel("PUNTAJE 1");
		add(puntaje1);
		
		puntaje2 = new JLabel("PUNTAJE 2");
		add(puntaje2);
		
		JList tipoPartida;
		String tipoPa[] = { "Ronda 1", "Ronda 2", "SemiFinal","Final"};
		tipoPartida = new JList(tipoPa);

		listaPartida = new JList(tipoPa);
		
	}
	public static String getConvertir() {
		return CONVERTIR;
	}
}
