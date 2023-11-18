package co.edu.unbosque.controller;

import co.edu.unbosque.model.Numero;
import co.edu.unbosque.view.VistaVentanas;

public class Controller {
	
	private Numero num;
	private VistaVentanas vista;
	
	public Controller() {
		vista = new VistaVentanas();
		funcionar();
	}
	
	public void funcionar() {
		int d = vista.leerDato("Ingrese numero entero:");
		num = new Numero(d);
		//vista.mostrarInformacion(num.tablaMultiplicarConCiclos());
		int resp = num.sumatoriaHastaN();
		vista.mostrarInformacion("La sumatoria [1,N] = "+resp);
	}
}
