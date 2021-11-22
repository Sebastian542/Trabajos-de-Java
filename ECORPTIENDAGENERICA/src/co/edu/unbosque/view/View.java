package co.edu.unbosque.view;

import java.awt.BorderLayout;
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
		
		// Definición de los parámetros básicos de la ventana principal
		

				setBackground(Color.BLACK);
				setSize(600,400);
				setResizable(false); 
				getContentPane().setLayout(null);
				setTitle("Sistema de Informacion de Juegos"); 
				setDefaultCloseOperation(EXIT_ON_CLOSE);
				setLocationRelativeTo(null); 
				setLayout(null);


				//Se agrega al layout en la parte NORTH, el panel de entrada definido

				m2 = new Modulo2Registro();
				m2.setBounds(0, 0, 300, 400);
			
				
				add(m2,BorderLayout.NORTH);
				
				

		
		m2.getBtnLeer().addActionListener(control);
		m2.getBtnEscribir().addActionListener(control);
		m2.getBtnVolver().addActionListener(control);
		

		
	}
	
	
	
	public Modulo2Registro getM2() {
		return m2;
	}



	public void setM2(Modulo2Registro m2) {
		this.m2 = m2;
	}



	public Panel2Resultados getPr2() {
		return pr2;
	}



	public void setPr2(Panel2Resultados pr2) {
		this.pr2 = pr2;
	}



	public void escribirMensaje(String mensaje) {
		JOptionPane.showMessageDialog(null, mensaje, "archivos binarios", JOptionPane.INFORMATION_MESSAGE);
	}
	
	
	
}
