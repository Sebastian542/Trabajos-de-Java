package co.edu.unbosque.view;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.border.TitledBorder;

public class Panel2Resultados extends JPanel{

	private static final long serialVersionUID = 1L;
	private JLabel labResultado;
	private JTextArea txtNombre;
	private JTextArea txtCedula;
	
	public JTextArea getTxtValores() {
		return txtCedula;
	}

	public void setTxtValores(JTextArea txtValores) {
		this.txtCedula = txtValores;
	}

	public Panel2Resultados() {
		
		setLayout( new GridLayout(1,2) );
		TitledBorder border = BorderFactory.createTitledBorder("Resultados Archivos Binarios");
		border.setTitleColor(Color.BLACK);
		setBorder( border );
		labResultado = new JLabel("Listado de Resultados Archivo");
		txtCedula = new JTextArea("");
		txtCedula.setForeground(Color.BLACK);
		txtCedula.setBackground(Color.WHITE);
	
		txtNombre = new JTextArea("");
		txtNombre.setForeground(Color.BLACK);
		txtNombre.setBackground(Color.WHITE);
		//add(labResultado);
		//add(new JLabel(""));
		//add(new JLabel(""));
		add(txtCedula);
		add(txtNombre);
		
		JTextArea txtTelefono = new JTextArea("");
		txtTelefono.setForeground(Color.BLACK);
		txtTelefono.setBackground(Color.WHITE);
		add(txtTelefono);
	}

	public JLabel getLabResultado() {
		return labResultado;
	}

	public void setLabResultado(JLabel labResultado) {
		this.labResultado = labResultado;
	}

	public JTextArea getTxtMonto() {
		return txtNombre;
	}

	public void setTxtMonto(JTextArea txtMonto) {
		this.txtNombre = txtMonto;
	}
}
