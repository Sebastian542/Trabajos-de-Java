package co.edu.unbosque.controller;



import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import co.edu.unbosque.model.Mundo;

import co.edu.unbosque.view.View;

public class Controller implements  ActionListener {

	//Atributos que vienen del Modelo (mundo) 
	private Mundo bd;
	
	//Atributos que vienen de Vista - GUI
	private View gui;
	
	
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
		
		if (evento.getActionCommand().equals(gui.getM2().ESCRIBIR2)) {
			resultado = bd.getBD().escribirArchivoBinario();
			gui.escribirMensaje(resultado);
		}
		
		
		
		
		
		
		
		
		
		
		
		/*
		
		if(evento.getActionCommand().equals(gui.getPanelEntrada().LEER)) {
			//haga algo de por Dios!!
			bd.getBD().leerArchivoBinario();
			mostrarCifras();
		}
		
		if(evento.getActionCommand().equals(gui.getPanelEntrada().ESCRIBIR_REG)) {
			gui.escribirMensaje(bd.getBD().escribirRegistro());
		}
		
		if(evento.getActionCommand().equals(gui.getPanelEntrada().LEER_REG)) {
			bd.getBD().leerRegistro();
			mostrarRegistros();
			
		}
	}
	
	private void mostrarCifras() {
		for (int i= 0 ; i<bd.getBD().getREGISTROS() ; i++) {
			gui.getPanelResultados().getTxtMonto().append(String.valueOf(bd.getBD().getNumeros()[i])+"\n");
			gui.getPanelResultados().getTxtValores().append(String.valueOf(bd.getBD().getValores()[i])+"\n");
		}	
	}
	
	private void mostrarRegistros() {
		for (int i= 0 ; i<3 ; i++) {
			gui.getPanelRegistro().getTxtEdad().append(String.valueOf(bd.getBD().getDatos()[i].getEdad())+"\n");
			gui.getPanelRegistro().getTxtNombre().append(String.valueOf(bd.getBD().getDatos()[i].getNombre())+"\n");
			gui.getPanelRegistro().getTxtSalario().append(String.valueOf(bd.getBD().getDatos()[i].getSalario())+"\n");
		}	
	}
  */	
	}
}
