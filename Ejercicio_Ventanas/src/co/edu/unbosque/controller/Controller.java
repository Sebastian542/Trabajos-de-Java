package co.edu.unbosque.controller;

import co.edu.unbosque.model.Numero;
import co.edu.unbosque.view.ViewVentanas;

public class Controller {

	private Numero a;
	
	private Numero b;
	
	private ViewVentanas vista;
	
	public Controller() {
		
		vista=new ViewVentanas();
		
		funcionar();
	}
	
	public void funcionar() {
		
		int aux=vista.leerDato("Ingrese el primer numero");
		a=new Numero(aux);
		
		vista.mostrarInformacion("a");
		
	}
	
	
	
}
