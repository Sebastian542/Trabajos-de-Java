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
	private JTextArea txtMonto;
	private JTextArea txtValores;
	
	public JTextArea getTxtValores() {
		return txtValores;
	}

	public void setTxtValores(JTextArea txtValores) {
		this.txtValores = txtValores;
	}

	public Panel2Resultados() {
		
		setLayout( new GridLayout(1,2) );
		TitledBorder border = BorderFactory.createTitledBorder("Resultados Archivos Binarios");
		border.setTitleColor(Color.BLACK);
		setBorder( border );
		labResultado = new JLabel("Listado de Resultados Archivo");
		txtValores = new JTextArea("");
		txtValores.setForeground(Color.BLACK);
		txtValores.setBackground(Color.WHITE);
	
		txtMonto = new JTextArea("");
		txtMonto.setForeground(Color.BLACK);
		txtMonto.setBackground(Color.WHITE);
		//add(labResultado);
		//add(new JLabel(""));
		//add(new JLabel(""));
		add(txtValores);
		add(txtMonto);
	}

	public JLabel getLabResultado() {
		return labResultado;
	}

	public void setLabResultado(JLabel labResultado) {
		this.labResultado = labResultado;
	}

	public JTextArea getTxtMonto() {
		return txtMonto;
	}

	public void setTxtMonto(JTextArea txtMonto) {
		this.txtMonto = txtMonto;
	}
}
