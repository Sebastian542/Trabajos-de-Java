package co.edu.unbosque.view;

import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.border.TitledBorder;

public class Panel2Registro  extends JPanel {
	private JTextArea txtTipoPartida;
	private JTextArea txtJuego;
	private JLabel labArchivo;
	
	private static final long serialVersionUID = 1L;
	
	public Panel2Registro() {
		
		setVisible(false);
		setLayout( new GridLayout(1,6) );
		setBackground(Color.BLACK);
		TitledBorder border = BorderFactory.createTitledBorder("Lectura Registros");
		border.setTitleColor(Color.WHITE);
		setBorder( border );
		labArchivo = new JLabel("Resultado de Registros");
		
		txtTipoPartida = new JTextArea("");
		txtTipoPartida.setForeground(Color.BLACK);
		txtTipoPartida.setBackground(Color.WHITE);
		
		txtJuego = new JTextArea("");
		txtJuego.setForeground(Color.BLACK);
		txtJuego.setBackground(Color.WHITE);
		add(txtTipoPartida);
		add(txtJuego);

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

	

