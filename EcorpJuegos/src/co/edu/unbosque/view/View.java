package co.edu.unbosque.view;

import java.awt.BorderLayout;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import java.awt.Color;

import co.edu.unbosque.controller.Controller;
import co.edu.unbosque.model.persistence.RegPartidas;


public class View extends JFrame{

	//Constante generada por Eclipse  
	private static final long serialVersionUID = 1L;
	
	private Panel1 p1;
	private Panel2 p2;
	private Panel3 p3;
	private Panel4 p4;
	private Panel3Resultados pr3;


	public View(Controller control) {
		setBackground(Color.BLACK);
		setSize(600,400);
		setResizable(false); 
		getContentPane().setLayout(null);
		setTitle("Sistema de Informacion de Juegos"); 
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null); 
		setLayout( null);

		p1 = new Panel1(control);
		
	    p2 = new Panel2(control);
	    p2.setBounds(0, 0, 584, 362);
	    getContentPane().add(p2);

		p3 = new Panel3(control);
		p3.setBounds(0, 0, 584, 180);
		getContentPane().add(p3);
		
//		pr3 = new Panel3Resultados();(0,360,584,180)
//		pr3.setBounds(0,180,584,180);
//		getContentPane().add(pr3);
		
		pr3 = new Panel3Resultados();
		pr3.setBounds(0,180,584,180);
		getContentPane().add(pr3);
		
		p4 = new Panel4(control);
		p4.setBounds(0, 0, 584, 362);
		getContentPane().add(p4);

		
		p1.getButVolver().addActionListener(control);
		p1.getLeerButton().addActionListener(control);
		p1.getEscrButton().addActionListener(control);
		
		p2.getBtnVolver().addActionListener(control);
		p2.getBtnEscribir().addActionListener(control);
		p2.getBtnLeer().addActionListener(control);

		p3.getButEscribir().addActionListener(control);
//		p3.getButEscribirReg().addActionListener(control);
	   	p3.getButLeer().addActionListener(control);
//	   	p3.getButLeerReg().addActionListener(control);
	   	p3.getButVolver().addActionListener(control);
			
		p4.getButjugadores().addActionListener(control);
	   	p4.getButjuegos().addActionListener(control);
    	p4.getButpartidas().addActionListener(control);
	}
	
	public void escribirMensaje(String mensaje) {
		JOptionPane.showMessageDialog(null, mensaje, "archivos binarios", JOptionPane.INFORMATION_MESSAGE);
	}

	public void mostrarPartida(RegPartidas rgpart) {
			getPr3().getTxtjugador1().append(String.valueOf(rgpart.getJugador1())+"\n");
			getPr3().getTxtpuntaje1().append(String.valueOf(rgpart.getPuntaje1())+"\n");
			getPr3().getTxtjugador2().append(String.valueOf(rgpart.getJugador2())+"\n");
			getPr3().getTxtpuntaje2().append(String.valueOf(rgpart.getPuntaje2())+"\n");
			getPr3().getTxtJuego().append(String.valueOf(rgpart.getJuego())+"\n");
			getPr3().getTxtTipoPartida().append(String.valueOf(rgpart.getTipoPartida())+"\n");
		
	}

	public Panel1 getP1() {
		return p1;
	}


	public void setP1(Panel1 p1) {
		this.p1 = p1;
	}


	public Panel2 getP2() {
		return p2;
	}


	public void setP2(Panel2 p2) {
		this.p2 = p2;
	}


	public Panel3 getP3() {
		return p3;
	}


	public void setP3(Panel3 p3) {
		this.p3 = p3;
	}


	public Panel4 getP4() {
		return p4;
	}


	public void setP4(Panel4 p4) {
		this.p4 = p4;
	}

	public Panel3Resultados getPr3() {
		return pr3;
	}

	public void setPr3(Panel3Resultados pr3) {
		this.pr3 = pr3;
	}


	
}