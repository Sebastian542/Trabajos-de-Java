package co.edu.unbosque.controller;

import co.edu.unbosque.model.Herencia;

import co.edu.unbosque.view.View;

public class Controller {
	
	
	private Herencia h;

	private View gui;
	
	
	public Controller() {
		
		
		h=new Herencia();
		
		
		
		gui = new View();
		
		funcionar();
		

	}
	
	
	public void funcionar() {
		
	
		gui.mostrarResultados(" \n "+h.mostrarInformacionHeroe());
		
		gui.mostrarResultados(" \n "+h.mostrarInformacionDesterrado());
		
		gui.mostrarResultados(" \n "+h.mostrarInformacionMortal());
		
	}
		
	
	
}

