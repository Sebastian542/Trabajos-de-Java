package co.edu.unbosque.view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.util.ArrayList;
import java.util.Scanner;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.border.Border;

import co.edu.unbosque.view.Modulo2Registro;

import co.edu.unbosque.controller.Controller;

import co.edu.unbosque.model.Modulo2DTO;



public class View extends JFrame{
	
	Scanner entrada = new Scanner(System.in);

	//Constante generada por Eclipse  

	private static final long serialVersionUID = 1L;
	
	private Modulo2Registro m2;
	
	private Panel2Resultados pr2;

	

	public View(Controller control) {
		
		// Definición de los parámetros básicos de la ventana principal
		

		// Definición de los parámetros básicos de la ventana principal
		
				setSize(500,400); //tamaño en ancho y alto en pixeles
				setResizable(false); //Se puede cambiar el tamaño de la ventana?
				setTitle("Título de la Ventana Principal"); //tìtulo de la ventana
				setDefaultCloseOperation(EXIT_ON_CLOSE);//qué debe hacer si cierra la ventana
				setLocationRelativeTo(null); //coloca la ventana al centro de la pantalla
				//Establece el layout (lienzo) que vamos a utilizar dentro de la ventana principal.
				setLayout( new BorderLayout() );
				
				//Se agrega al layout en la parte NORTH, el panel de entrada definido

				
				
				
			   	m2=new Modulo2Registro();
				
				add(m2,BorderLayout.CENTER);
				
				pr2 = new Panel2Resultados();
		    	pr2.setBounds(300, 0, 286, 362);
		    	
		    	add(pr2,BorderLayout.SOUTH);
				
			
				m2.getBtnLeer().addActionListener(control);
				
			//	m2.getBtnVolver().addActionListener(control);


				
		
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
	
	public void imprimirModulo2(ArrayList<Modulo2DTO> m2dto) {
		for(Modulo2DTO rJcln : m2dto) {
		
			//getM2().getNombre().append(String.valueOf(rJcln.getNombre())+"\n");
			
		}
	}
	
	
	
	
}
