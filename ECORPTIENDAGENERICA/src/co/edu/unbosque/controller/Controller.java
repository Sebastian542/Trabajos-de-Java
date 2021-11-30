package co.edu.unbosque.controller;



import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;


import co.edu.unbosque.model.Modulo2DTO;
import co.edu.unbosque.model.Mundo;

import co.edu.unbosque.view.View;

public class Controller implements  ActionListener {

	//Atributos que vienen del Modelo (mundo) 
	private Mundo bd;
	
	//Atributos que vienen de Vista - GUI
	private View gui;
	
	private Modulo2DTO md2DTO;
	
	private ArrayList<Modulo2DTO> rgsModulo2;
	
	public Controller() {
		
		//aqui van los constructores tanto de Mundo, como de Vista
		
		bd = new Mundo();
		///view
		
		gui = new View(this);
		
		gui.setVisible(true); //hacer visible la ventana principal
		
	}
	
	public void actionPerformed(ActionEvent evento) {
		// TODO Auto-generated method stub
		String resultado;
		
		System.out.println("Entre al action");
		
	
		
		if(evento.getActionCommand().equals(gui.getM2().ESCRIBIR2)) {
			
			String aux=gui.getM2().getNombre().getText();
			
			
			md2DTO.setNombre(aux);
			
	
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

