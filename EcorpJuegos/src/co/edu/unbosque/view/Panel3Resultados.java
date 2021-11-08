package co.edu.unbosque.view;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;

public class Panel3Resultados extends JPanel{
	
	private static final long serialVersionUID = 1L;
	private JLabel labResultado;
	private JTextArea txtMonto;
	private JTextArea txtValores;
 
	public Panel3Resultados() {
		
		setVisible(false);
		setLayout(null);
		setSize(584,180);
		setBackground(Color.BLACK);
		TitledBorder border = BorderFactory.createTitledBorder("Resultados");
		border.setTitleColor(Color.WHITE);
		setBorder(border);
		labResultado = new JLabel("El Resultado es:");
		labResultado.setForeground(Color.WHITE);
		labResultado.setBounds(50, 20, 106, 17);
		labResultado.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		txtMonto = new JTextArea("");
		txtMonto.setBounds(20,50,250,120);
		txtMonto.setForeground(Color.BLACK);
		txtMonto.setBackground(Color.WHITE);
		txtValores = new JTextArea("");
		txtValores.setBounds(310,50,250,120);
		txtValores.setForeground(Color.BLACK);
		txtValores.setBackground(Color.WHITE);
		
		add(labResultado);
		add(txtMonto);
		add(txtValores);
		
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

	public JTextArea getTxtValores() {
		return txtValores;
	}

	public void setTxtValores(JTextArea txtValores) {
		this.txtValores = txtValores;
	}

}
