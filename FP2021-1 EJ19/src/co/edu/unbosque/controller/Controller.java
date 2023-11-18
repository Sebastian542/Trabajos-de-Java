package co.edu.unbosque.controller;

import co.edu.unbosque.model.Texto;
import co.edu.unbosque.view.VistaVentanas;

public class Controller {
	
	private VistaVentanas vista;
	private Texto texto;

	
	public Controller() {
		vista = new VistaVentanas();
		funcionar();
	}
	
	public void funcionar() {
		String aux = vista.leerDatoString("Ingrese texto: ");
		texto = new Texto(aux);
		int t = texto.contarEspaciosBlancos();
		vista.mostrarInformacion("La cantidad de espacios en blanco del texto es "+t);
		
	}
	
}
