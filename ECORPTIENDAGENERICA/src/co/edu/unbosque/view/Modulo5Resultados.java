package co.edu.unbosque.view;

import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;

public class Modulo5Resultados extends JPanel {
	
	private static final long serialVersionUID = 1L;
	
	private JTextArea txtCedula;
	private JTextArea txtCodProd;
	private JTextArea txtCantidadVen;
	private JLabel labArchivo;
	
	public Modulo5Resultados() {
//		setVisible(false);
		setVisible(true);
		setLayout( new GridLayout(1,6) );
		setBackground(Color.WHITE);
		TitledBorder border = BorderFactory.createTitledBorder("Resultados");
		border.setTitleColor(Color.BLACK);
		setBorder( border );
		labArchivo = new JLabel("Resultado de Registros");
		
		txtCedula = new JTextArea();
		txtCodProd = new JTextArea();
		txtCantidadVen = new JTextArea();
		
		add(txtCedula);
		add(txtCodProd);
		add(txtCantidadVen);
		
	}

	public JTextArea getTxtCedula() {
		return txtCedula;
	}

	public void setTxtCedula(JTextArea txtCedula) {
		this.txtCedula = txtCedula;
	}

	public JTextArea getTxtCodProd() {
		return txtCodProd;
	}

	public void setTxtCodProd(JTextArea txtCodProd) {
		this.txtCodProd = txtCodProd;
	}

	public JTextArea getTxtCantidadVen() {
		return txtCantidadVen;
	}

	public void setTxtCantidadVen(JTextArea txtCantidadVen) {
		this.txtCantidadVen = txtCantidadVen;
	}

	public JLabel getLabArchivo() {
		return labArchivo;
	}

	public void setLabArchivo(JLabel labArchivo) {
		this.labArchivo = labArchivo;
	}
	
}
