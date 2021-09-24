package co.edu.unbosque.view;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class VentanaJvsJ2 extends JFrame {
		
	private JPanel contentPane;
	private JLabel picas;
	private JLabel fijas;
	private JLabel jugador1;
	private JLabel jugador2;
	private JLabel picas2;
	private JLabel fijas2;
	private JLabel intentos1;
	private JLabel intentos2;
	
	
	
	public VentanaJvsJ2() {
		
		setTitle("PICAS Y FIJAS");
		setSize(500,200);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 514, 351);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		setResizable(false);
		setVisible(true);
		
		inicializarcomponentes();
	}
	
	
	
	
	
	public void inicializarcomponentes() {
		
		
		picas= new JLabel("PICAS");
		picas.setForeground(Color.RED);
		picas.setFont(new Font("Tahoma", Font.PLAIN, 13));
		picas.setBounds(22, 64, 45, 16);
				
		fijas = new JLabel("FIJAS");
		fijas.setForeground(Color.RED);
		fijas.setFont(new Font("Tahoma", Font.PLAIN, 13));
		fijas.setBounds(139, 65, 46, 14);
		
		jugador1 = new JLabel("Jugador 1");
		jugador1.setFont(new Font("Tahoma", Font.BOLD, 13));
		jugador1.setForeground(Color.BLUE);
		jugador1.setBounds(72, 30, 73, 24);
		
		jugador2 = new JLabel("Jugador 2");
		jugador2.setForeground(Color.BLUE);
		jugador2.setFont(new Font("Tahoma", Font.BOLD, 13));
		jugador2.setBounds(356, 32, 90, 20);
		
		picas2 = new JLabel("PICAS");
		picas2.setForeground(Color.RED);
		picas2.setFont(new Font("Tahoma", Font.PLAIN, 13));
		picas2.setBounds(308, 66, 46, 14);
				
		fijas2 = new JLabel("FIJAS");
		fijas2.setForeground(Color.RED);
		fijas2.setBounds(429, 66, 46, 14);
				
		intentos1 = new JLabel("INTENTOS");
		intentos1.setForeground(Color.RED);
		intentos1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		intentos1.setBounds(57, 192, 82, 14);
		
		intentos2= new JLabel("INTENTOS");
		intentos2.setForeground(Color.RED);
		intentos2.setFont(new Font("Tahoma", Font.PLAIN, 13));
		intentos2.setBounds(356, 192, 90, 14);
	
		
		add(picas);
		add(fijas);
		add(jugador1);
		add(jugador2);
		add(picas2);
		add(fijas2);
		add(intentos1);
		add(intentos2);
}


	public JLabel getPicas() {
		return picas;
	}

	public void setPicas(JLabel picas) {
		this.picas = picas;
	}

	public JLabel getFijas() {
		return fijas;
	}

	public void setFijas(JLabel fijas) {
		this.fijas = fijas;
	}

	public JLabel getJugador1() {
		return jugador1;
	}

	public void setJugador1(JLabel jugador1) {
		this.jugador1 = jugador1;
	}

	public JLabel getJugador2() {
		return jugador2;
	}

	public void setJugador2(JLabel jugador2) {
		this.jugador2 = jugador2;
	}

	public JLabel getPicas2() {
		return picas2;
	}

	public void setPicas2(JLabel picas2) {
		this.picas2 = picas2;
	}

	public JLabel getFijas2() {
		return fijas2;
	}

	public void setFijas2(JLabel fijas2) {
		this.fijas2 = fijas2;
	}

	public JLabel getIntentos1() {
		return intentos1;
	}

	public void setIntentos1(JLabel intentos1) {
		this.intentos1 = intentos1;
	}

	public JLabel getIntentos2() {
		return intentos2;
	}

	public void setIntentos2(JLabel intentos2) {
		this.intentos2 = intentos2;
	}
	
}
