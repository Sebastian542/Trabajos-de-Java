package co.edu.unbosque.view;

import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.border.TitledBorder;

public class Panel3Registro extends JPanel{
	
	private JTextArea txtjugador1;
	private JTextArea txtjugador2;
	private JTextArea txtpuntaje1;
	private JTextArea txtpuntaje2;
	private JTextArea txtTipoPartida;
	private JTextArea txtJuego;
	private JLabel labArchivo;
	
	private static final long serialVersionUID = 1L;
	
	public Panel3Registro() {
		setVisible(false);
		setLayout( new GridLayout(1,6) );
		TitledBorder border = BorderFactory.createTitledBorder("Lectura Registros");
		border.setTitleColor(Color.BLACK);
		setBorder( border );
		labArchivo = new JLabel("Resultado de Registros");
		
		txtjugador1 = new JTextArea("");
		txtjugador1.setForeground(Color.BLACK);
		txtjugador1.setBackground(Color.WHITE);
	
		txtjugador2 = new JTextArea("");
		txtjugador2.setForeground(Color.BLACK);
		txtjugador2.setBackground(Color.WHITE);
		
		txtpuntaje1 = new JTextArea("");
		txtpuntaje1.setForeground(Color.BLACK);
		txtpuntaje1.setBackground(Color.WHITE);
		
		txtpuntaje2 = new JTextArea("");
		txtpuntaje2.setForeground(Color.BLACK);
		txtpuntaje2.setBackground(Color.WHITE);
		
		txtTipoPartida = new JTextArea("");
		txtTipoPartida.setForeground(Color.BLACK);
		txtTipoPartida.setBackground(Color.WHITE);
		
		txtJuego = new JTextArea("");
		txtJuego.setForeground(Color.BLACK);
		txtJuego.setBackground(Color.WHITE);

		add(txtjugador1);
		add(txtjugador2);
		add(txtpuntaje1);
		add(txtpuntaje2);
		add(txtTipoPartida);
		add(txtJuego);

	}

	public JTextArea getTxtjugador1() {
		return txtjugador1;
	}

	public void setTxtjugador1(JTextArea txtjugador1) {
		this.txtjugador1 = txtjugador1;
	}

	public JTextArea getTxtjugador2() {
		return txtjugador2;
	}

	public void setTxtjugador2(JTextArea txtjugador2) {
		this.txtjugador2 = txtjugador2;
	}

	public JTextArea getTxtpuntaje1() {
		return txtpuntaje1;
	}

	public void setTxtpuntaje1(JTextArea txtpuntaje1) {
		this.txtpuntaje1 = txtpuntaje1;
	}

	public JTextArea getTxtpuntaje2() {
		return txtpuntaje2;
	}

	public void setTxtpuntaje2(JTextArea txtpuntaje2) {
		this.txtpuntaje2 = txtpuntaje2;
	}

	public JTextArea getTxtTipoPartida() {
		return txtTipoPartida;
	}

	public void setTxtTipoPartida(JTextArea txtTipoPartida) {
		this.txtTipoPartida = txtTipoPartida;
	}

	public JTextArea getTxtJuego() {
		return txtJuego;
	}

	public void setTxtJuego(JTextArea txtJuego) {
		this.txtJuego = txtJuego;
	}

	public JLabel getLabArchivo() {
		return labArchivo;
	}

	public void setLabArchivo(JLabel labArchivo) {
		this.labArchivo = labArchivo;
	}
	
	
}
