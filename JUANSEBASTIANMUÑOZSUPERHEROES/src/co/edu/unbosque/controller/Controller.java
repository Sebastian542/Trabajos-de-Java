package co.edu.unbosque.controller;


import co.edu.unbosque.model.Fachada;
import co.edu.unbosque.view.View;

public class Controller {
	
	private Fachada f;
	private View gui;
	
	public Controller() {
		f = new Fachada();
		gui = new View();
		//gui.mostrarResultados(m.procesarDato(gui.pedirDato()));
	}
}
