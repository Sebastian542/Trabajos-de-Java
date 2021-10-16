package co.edu.unbosque.view;

import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;

public class PanelEntrada extends JPanel{
	
	private static final long serialVersionUID = 1L;
	private JLabel labEntrada;
	private JTextField txtNumero;
	private JButton butConvertir;
	public static final String CONVERTIR = "Convertir";
	
	public PanelEntrada() {
		setLayout( new GridLayout(2,2) );//se define el grid de 2x2
		TitledBorder border = BorderFactory.createTitledBorder("Datos de Entrada");
		border.setTitleColor(Color.BLACK);
		setBorder( border );
		labEntrada = new JLabel("Digite un Valor");
		txtNumero = new JTextField("");
		txtNumero.setForeground(Color.BLACK);
		txtNumero.setBackground(Color.WHITE);
		butConvertir = new JButton("Convertir");
		butConvertir.setActionCommand(CONVERTIR);
		add(labEntrada);
		add(txtNumero);
		add(new JLabel(""));
		add(butConvertir);
	}
	
	public JLabel getLabEntrada() {
		return labEntrada;
	}

	public void setLabEntrada(JLabel labEntrada) {
		this.labEntrada = labEntrada;
	}

	public JTextField getTxtNumero() {
		return txtNumero;
	}

	public void setTxtNumero(JTextField txtNumero) {
		this.txtNumero = txtNumero;
	}

	public JButton getButConvertir() {
		return butConvertir;
	}

	public void setButConvertir(JButton butConvertir) {
		this.butConvertir = butConvertir;
	}


	public static String getConvertir() {
		return CONVERTIR;
	}
	
}
