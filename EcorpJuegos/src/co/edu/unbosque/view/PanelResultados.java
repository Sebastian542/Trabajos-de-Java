package co.edu.unbosque.view;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;

public class PanelResultados extends JPanel{
	
	private static final long serialVersionUID = 1L;
	private JLabel labResultado;
	private JTextArea txtMonto;
	private JTextArea txtValores;
	private JScrollPane scrollMonto;
	private JScrollPane scrollValores;
 
	public PanelResultados() {
		
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
		txtMonto = new JTextArea();
		txtMonto.setBounds(20,50,250,120);
		txtMonto.setForeground(Color.BLACK);
		txtMonto.setBackground(Color.WHITE);
		scrollMonto = new JScrollPane(txtMonto);
		scrollMonto.setBounds(20,50,250,120);
		txtValores = new JTextArea();
		txtValores.setBounds(310,50,250,120);
		txtValores.setForeground(Color.BLACK);
		txtValores.setBackground(Color.WHITE);
		scrollValores = new JScrollPane(txtValores);
		scrollValores.setBounds(310,50,250,120);
		
		add(scrollMonto);
		add(scrollValores);
		add(labResultado);
		
		
		scrollMonto.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
		scrollValores.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
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

	public JScrollPane getScrollMonto() {
		return scrollMonto;
	}

	public void setScrollMonto(JScrollPane scrollMonto) {
		this.scrollMonto = scrollMonto;
	}

	public JScrollPane getScrollValores() {
		return scrollValores;
	}

	public void setScrollValores(JScrollPane scrollValores) {
		this.scrollValores = scrollValores;
	}
	

}
