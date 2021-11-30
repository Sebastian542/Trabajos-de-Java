package co.edu.unbosque.controller;



import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JTextField;


import co.edu.unbosque.model.Modulo2DTO;
import co.edu.unbosque.model.Mundo;

import co.edu.unbosque.view.View;

public class Controller implements  ActionListener {

	//Atributos que vienen del Modelo (mundo) 
	private Mundo bd;
	
	//Atributos que vienen de Vista - GUI
	private View gui;
	
	
	
	 ArrayList<Modulo2DTO> rgsModulo2;
	private Modulo2DTO rgmd2;
	
	public Controller() {
		
		//aqui van los constructores tanto de Mundo, como de Vista
		
		bd = new Mundo();
		///view
		
		rgsModulo2 = new ArrayList<Modulo2DTO>();
		rgmd2 = new Modulo2DTO(0, null, null, 0, null);
		
		
		gui = new View(this);
		
		gui.setVisible(true); //hacer visible la ventana principal
		
	}
	
	public void actionPerformed(ActionEvent evento) {
		// TODO Auto-generated method stub
		String resultado;

		
		if(evento.getActionCommand().equals(gui.getM2().ESCRIBIR2)) {
			
			
			System.out.println("Click a escribir");
			
			int aux1;
			
			
			aux1=Integer.parseInt(gui.getM2().getCedula().getText());
			rgmd2.setCedula(aux1);

			
			String aux2=gui.getM2().getNombre().getText();
			rgmd2.setNombre(aux2);
			
			rgmd2.setDireccion(null);
			rgmd2.setTelefono(0);
			rgmd2.setCorreo(null);
	
			bd.getMd2().escribirArchivoModulo2(rgsModulo2);
	
		}
		
		
		
		if(evento.getActionCommand().equals(gui.getM2().LEER2)) {
			
			
			bd.getMd2().leerArchivoModulo2();
			
		
			System.out.println(rgsModulo2);
			System.out.println(rgsModulo2);
			//gui.imprimirJuego(rgsModulo2;
	
		}
		

	
	}
	

	
	

	

  	
	}

