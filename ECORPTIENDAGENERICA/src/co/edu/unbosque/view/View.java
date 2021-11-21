package co.edu.unbosque.view;

import java.awt.Color;
import java.util.ArrayList;
import java.util.Scanner;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

import co.edu.unbosque.controller.Controller;



public class View extends JFrame{
	Scanner entrada = new Scanner(System.in);

	//Constante generada por Eclipse  

	private static final long serialVersionUID = 1L;
	
	private Modulo2Registro m2;
	
	private Panel2Resultados pr2;

	

	public View(Controller control) {
		setBackground(Color.BLACK);
		setSize(600,400);
		setResizable(false); 
		getContentPane().setLayout(null);
		setTitle("Sistema de Informacion de Juegos"); 
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null); 
		setLayout(null);


	    	m2 = new Modulo2Registro(control);
	    	m2.setBounds(0, 0, 300, 400);
	    	getContentPane().add(m2);
	    
	    	pr2 = new Panel2Resultados();
	    	pr2.setBounds(300, 0, 286, 362);
	    	getContentPane().add(pr2);

		
		m2.getBtnLeer().addActionListener(control);
		m2.getBtnEscribir().addActionListener(control);
		m2.getBtnVolver().addActionListener(control);
		

		
	}
	
	public void escribirMensaje(String mensaje) {
		JOptionPane.showMessageDialog(null, mensaje, "archivos binarios", JOptionPane.INFORMATION_MESSAGE);
	}

	/*

	public void imprimirModulo2(Modulo2DTO prtds) {
		getPr3().getTxtjugador1().append(String.valueOf(prtds.getJugador1())+"\n");
		getPr3().getTxtpuntaje1().append(String.valueOf(prtds.getPuntaje1())+"\n");
		getPr3().getTxtjugador2().append(String.valueOf(prtds.getJugador2())+"\n");
		getPr3().getTxtpuntaje2().append(String.valueOf(prtds.getPuntaje2())+"\n");
		getPr3().getTxtJuego().append(String.valueOf(prtds.getJuego())+"\n");
		getPr3().getTxtTipoPartida().append(String.valueOf(prtds.getTipoPartida())+"\n");
	}
	
	*/
	/*
	public void imprimirModulo2(ArrayList<Modulo2DTO> jgdto) {
		for(JuegoDTO rJgrs : jgdto) {
			getPr2().getTxtnombre().append(String.valueOf(rJgrs.getNombre())+"\n");
			getPr2().getTxtTipo().append(String.valueOf(rJgrs.getTipo())+"\n");
		}
	}
	
	*/
	
	public void mostrarMensaje(String mensaje) {
		System.out.println(mensaje);
	}
	
	

	
	public String pedirString(String mensaje) {
		String texto = "";
		System.out.print(mensaje);
		texto = entrada.nextLine();
		return texto;
	}

	public Modulo2Registro getM2() {
		return m2;
	}

	public void setM2(Modulo2Registro m2) {
		this.m2 = m2;
	}

	
	


	
}
