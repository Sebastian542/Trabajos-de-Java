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
	private JLabel labEntrada2;
	private JTextField txtNumero;
	private JTextField txtNumero2;
	private JButton butConvertir;
	public static final String CONVERTIR = "Convertir";
	
	public PanelEntrada() {
		setLayout( new GridLayout(1,1) );//se define el grid de 2x2
		TitledBorder border = BorderFactory.createTitledBorder("Datos de Entrada");
		border.setTitleColor(Color.BLACK);
		setBorder( border );
		
		labEntrada = new JLabel(" Digite las estrofas");
		txtNumero = new JTextField("");
		
		txtNumero.setForeground(Color.BLACK);
		txtNumero.setBackground(Color.WHITE);
		
		
		butConvertir = new JButton("Generar Cancion");
		butConvertir.setActionCommand(CONVERTIR);
		
	
		
		labEntrada2=new JLabel(" Digite las palabras");
		txtNumero2= new JTextField("");
		
	
		
		butConvertir = new JButton("Generar");
		butConvertir.setActionCommand(CONVERTIR);
		
		add(labEntrada);
		add(txtNumero);
		add(new JLabel(""));
		

		add(butConvertir);
		
		
		setLayout( new GridLayout(2,2) );//se define el grid de 2x2

		add(labEntrada2);
		add(txtNumero2);
	    add(new JLabel(""));
	    
	
		
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
	
	public JTextField getTxtNumero2() {
		return txtNumero2;
	}

	public void setTxtNumero2(JTextField txtNumero) {
		this.txtNumero = txtNumero2;
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
