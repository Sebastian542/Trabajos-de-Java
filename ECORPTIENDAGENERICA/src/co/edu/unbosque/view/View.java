package co.edu.unbosque.view;

import java.awt.Color;
import java.util.Scanner;
import javax.swing.JFrame;
import javax.swing.JOptionPane;


import co.edu.unbosque.controller.Controller;

public class View extends JFrame{
	
	Scanner entrada = new Scanner(System.in);

	//Constante generada por Eclipse  

	private static final long serialVersionUID = 1L;
	private Modulo1Registro m1;
	private Modulo2Registro m2;
	private Modulo3Panel m3;
	private Modulo4Registro m4;
	private Modulo5Panel m5;
	private Modulo5Dialog md5;
	private Panel2Resultados pr2;
	private PanelPrincipal pl;

	public View(Controller control) {
				setBackground(Color.BLACK);
				setSize(650,200);
				setResizable(false); 
				getContentPane().setLayout(null);
				setTitle("Gestion de Transacciones"); 
				setDefaultCloseOperation(EXIT_ON_CLOSE);
				setLocationRelativeTo(null); 
				setLayout(null);
				
				pl = new PanelPrincipal(control);
				pl.setBounds(0,0,635,160);
				getContentPane().add(pl);
				
				m1 = new Modulo1Registro(control);
				
				m2 = new Modulo2Registro();
				m2.setBounds(0,0,400,250);
				getContentPane().add(m2);
				
				m3 = new Modulo3Panel(control);
				m3.setBounds(0,0,635,270);
				getContentPane().add(m3);
				
				m4 = new Modulo4Registro(control);
				m4.setBounds(0, 0, 450, 200);
				getContentPane().add(m4);
				
				m5= new Modulo5Panel(control);
				m5.setBounds(0,0,444,500);
				getContentPane().add(m5);
				
				md5= new Modulo5Dialog(control);

				pl.setVisible(true);
				m1.setVisible(true);
				m2.setVisible(false);
				m3.setVisible(false);
				m4.setVisible(false);
				m5.setVisible(false);
				md5.setVisible(true);
				
				pl.getButMod2().addActionListener(control);
				pl.getButMod3().addActionListener(control);
				pl.getButMod4().addActionListener(control);
				pl.getButMod5().addActionListener(control);
				pl.getButMod6().addActionListener(control);
				
				m1.getButLeer().addActionListener(control);

		
				
				pr2 = new Panel2Resultados();
		    	pr2.setBounds(300, 0, 286, 362);
		
		//    	add(pr2,BorderLayout.SOUTH);
	
		    	
		       m2.getBtnEscribir().addActionListener(control);
               m2.getBtnLeer().addActionListener(control);
				
		    	
		    	m4.getBtnEscribir().addActionListener(control);
		        m4.getBtnLeer().addActionListener(control);

				m2.getBtnVolver().addActionListener(control);
				m2.getBtnEscribir().addActionListener(control);
				m2.getBtnLeer().addActionListener(control);
				
				m3.getBtnEscribir().addActionListener(control);
				m3.getBtnLeer().addActionListener(control);
				m3.getBtnVolver().addActionListener(control);

				
				m4.getBtnNewButton_2().addActionListener(control);
				m4.getBtnNewButton_1().addActionListener(control);
				m4.getBtnNewButton().addActionListener(control);
				
				m5.getButVolver().addActionListener(control);
				m5.getButCalcular().addActionListener(control);

	}
	
	public void mostrarConsultas() {
		
	}
	



	public Scanner getEntrada() {
		return entrada;
	}

	public void setEntrada(Scanner entrada) {
		this.entrada = entrada;
	}

	public Modulo1Registro getM1() {
		return m1;
	}

	public void setM1(Modulo1Registro m1) {
		this.m1 = m1;
	}

	public Modulo2Registro getM2() {
		return m2;
	}

	public void setM2(Modulo2Registro m2) {
		this.m2 = m2;
	}

	public Modulo3Panel getM3() {
		return m3;
	}

	public void setM3(Modulo3Panel m3) {
		this.m3 = m3;
	}

	public Modulo4Registro getM4() {
		return m4;
	}

	public void setM4(Modulo4Registro m4) {
		this.m4 = m4;
	}

	public Modulo5Panel getM5() {
		return m5;
	}

	public void setM5(Modulo5Panel m5) {
		this.m5 = m5;
	}

	public Modulo5Dialog getMd5() {
		return md5;
	}

	public void setMd5(Modulo5Dialog md5) {
		this.md5 = md5;
	}

	public Panel2Resultados getPr2() {
		return pr2;
	}

	public void setPr2(Panel2Resultados pr2) {
		this.pr2 = pr2;
	}

	public PanelPrincipal getPl() {
		return pl;
	}

	public void setPl(PanelPrincipal pl) {
		this.pl = pl;
	}

	public void escribirMensaje(String mensaje) {
		JOptionPane.showMessageDialog(null, mensaje, "archivos binarios", JOptionPane.INFORMATION_MESSAGE);
	}
	
	
	
}
