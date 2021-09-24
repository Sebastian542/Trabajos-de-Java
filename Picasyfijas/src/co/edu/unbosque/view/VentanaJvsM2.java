package co.edu.unbosque.view;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class VentanaJvsM2 extends JFrame {

	private JPanel contentPane;
	private JLabel picas;
	private JLabel fijas;
	private JLabel intentos;
	
	public VentanaJvsM2() {
		
		setTitle("PICAS Y FIJAS");
		setSize(500,200);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 362, 263);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		setResizable(false);
		setVisible(true);
		
		inicializarcomponentes();
	}
	
	public void inicializarcomponentes() {
		
		picas= new JLabel("PICAS");
		picas.setForeground(Color.RED);
		picas.setFont(new Font("Tahoma", Font.BOLD, 13));
		picas.setBounds(52, 26, 46, 14);
		
		fijas = new JLabel("FIJAS");
		fijas.setFont(new Font("Tahoma", Font.BOLD, 13));
		fijas.setForeground(Color.RED);
		fijas.setBounds(242, 26, 46, 14);
		
		intentos = new JLabel("INTENTOS");
		intentos.setFont(new Font("Tahoma", Font.BOLD, 13));
		intentos.setForeground(Color.RED);
		intentos.setBounds(141, 136, 67, 14);
	
		add(picas);
		add(fijas);
		add(intentos);
		
	}

	public JLabel getPicas() {
		return picas;
	}

	public void setPicas(JLabel picas) {
		this.picas = picas;
	}

	public JLabel getFijas() {
		return fijas;
	}

	public void setFijas(JLabel fijas) {
		this.fijas = fijas;
	}

	public JLabel getIntentos() {
		return intentos;
	}

	public void setIntentos(JLabel intentos) {
		this.intentos = intentos;
	}
	
}
