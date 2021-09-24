package co.edu.unbosque.controller;

import co.edu.unbosque.model.Intervalo;
import co.edu.unbosque.view.VistaVentanas;

public class Controller {
	
	private Intervalo intervalo;
	private VistaVentanas vista;
	
	public Controller() {
		vista = new VistaVentanas();
		funcionar();
	}
	
	public void funcionar() {
		int n1 = vista.leerDato("Ingrese primer entero:");
		int n2 = vista.leerDato("Ingrese segundo entero:");

		intervalo = new Intervalo(n1,n2);
		
		vista.mostrarInformacion("Los número primos son: " + intervalo.primosIntervalo());
		
	}
}
