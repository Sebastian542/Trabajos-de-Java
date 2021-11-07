package co.edu.unbosque.view;

import java.awt.Color;
import java.awt.GridLayout;
import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;

public class PanelResultados extends JPanel{

	private static final long serialVersionUID = 1L;
	private JLabel labResultado;
	private JTextField txtMonto;

	public PanelResultados() {
		
		setLayout( new GridLayout(2,1) );
		TitledBorder border = BorderFactory.createTitledBorder("Resultados");
		border.setTitleColor(Color.BLACK);
		setBorder( border );
		labResultado = new JLabel("El Resultado es:");
		txtMonto = new JTextField("");
		txtMonto.setForeground(Color.BLACK);
		txtMonto.setBackground(Color.WHITE);
		
		add(labResultado);
		add(txtMonto);
		
	}

	public JLabel getLabResultado() {
		return labResultado;
	}

	public void setLabResultado(JLabel labResultado) {
		this.labResultado = labResultado;
	}

	public JTextField getTxtMonto() {
		return txtMonto;
	}

	public void setTxtMonto(JTextField txtMonto) {
		this.txtMonto = txtMonto;
	}
}
