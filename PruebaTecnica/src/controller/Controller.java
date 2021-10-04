package controller;

import model.Juego;
import view.View;

public class Controller {
	
	private Juego j;
	private View gui;
	
	public Controller() {
		j=new Juego();
		gui = new View();
		
		funcionar();
	
	}
	
	
	public void funcionar() {
	
		
		j.iniciarRonda();
	
		
		
	}
}
