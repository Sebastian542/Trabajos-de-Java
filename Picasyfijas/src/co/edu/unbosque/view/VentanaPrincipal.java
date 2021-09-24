package co.edu.unbosque.view;

import java.awt.BorderLayout;
import java.awt.Color;

import java.awt.Font;

import javax.swing.*;
import javax.swing.border.EmptyBorder;


public class VentanaPrincipal extends JFrame {
	
	private JPanel contentPane;
	
	private JLabel titulo;
	private JLabel jugadorvsjugador;
	private JLabel jugadorvsm�quina;
	private JLabel nombres;
	
	private JButton btnJugar;
	private JButton btnJugar2;
	
	public VentanaPrincipal() {
		
		setTitle("PICAS Y FIJAS");
		
		setSize(700,400);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 487, 311);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		setResizable(false);
		setVisible(true);
		
		inicializarcomponentes();
	}
	
	

	public void inicializarcomponentes() {
		
		titulo = new JLabel("Picas Y Fijas");
		titulo.setFont(new Font("Arial", Font.BOLD, 15));
		titulo.setForeground(Color.RED);
		titulo.setBounds(180, 11, 119, 26);
		
		
		jugadorvsjugador = new JLabel("JUGADOR VS JUGADOR");
		jugadorvsjugador.setFont(new Font("Arial", Font.BOLD, 12));
		jugadorvsjugador.setForeground(Color.BLUE);
		jugadorvsjugador.setBounds(27, 68, 148, 16);
		
		
		jugadorvsm�quina = new JLabel("JUGADOR VS M�QUINA");
		jugadorvsm�quina.setFont(new Font("Arial", Font.BOLD, 12));
		jugadorvsm�quina.setForeground(Color.BLUE);
		jugadorvsm�quina.setBounds(269, 63, 164, 26);
		
		
		nombres = new JLabel("Hecho por: Sebastian Mu�oz, David Plata, Laura Villar y Omar Santos.");
		nombres.setFont(new Font("Arial", Font.BOLD, 13));
		nombres.setBounds(10, 176, 461, 26);
	
	
		btnJugar = new JButton("Jugar");
		btnJugar.setFont(new Font("Trebuchet MS", Font.PLAIN, 13));
		btnJugar.setBounds(47, 95, 105, 36);
		btnJugar.setActionCommand("jugador vs jugador");
		
		
		btnJugar2 = new JButton("Jugar");
		btnJugar2.setFont(new Font("Trebuchet MS", Font.PLAIN, 13));
		btnJugar2.setBounds(293, 95, 105, 36);
		btnJugar2.setActionCommand("jugador vs maquina");
		
		add(titulo);
		add(jugadorvsjugador);
		add(jugadorvsm�quina);
		add(nombres);
		
		add(btnJugar);
		add(btnJugar2);
		
	}
	

	public JLabel getTitulo() {
		return titulo;
	}

	public void setTitulo(JLabel titulo) {
		this.titulo = titulo;
	}

	public JLabel getJugadorvsjugador() {
		return jugadorvsjugador;
	}

	public void setJugadorvsjugador(JLabel jugadorvsjugador) {
		this.jugadorvsjugador = jugadorvsjugador;
	}

	public JLabel getJugadorvsm�quina() {
		return jugadorvsm�quina;
	}

	public void setJugadorvsm�quina(JLabel jugadorvsm�quina) {
		this.jugadorvsm�quina = jugadorvsm�quina;
	}

	public JLabel getNombres() {
		return nombres;
	}

	public void setNombres(JLabel nombres) {
		this.nombres = nombres;
	}

	public JButton getBtnJugar() {
		return btnJugar;
	}

	public void setBtnJugar(JButton btnJugar) {
		this.btnJugar = btnJugar;
	}

	public JButton getBtnJugar2() {
		return btnJugar2;
	}

	public void setBtnJugar2(JButton btnJugar2) {
		this.btnJugar2 = btnJugar2;
	}
	

}
