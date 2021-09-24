package co.edu.unbosque.controller;

import co.edu.unbosque.model.Numero;
import co.edu.unbosque.view.VistaConsola;
import co.edu.unbosque.view.VistaVentanas;

public class Controller {
	
	private Numero num;
	private VistaConsola vista;
	
	public Controller() {
		vista = new VistaConsola();
		funcionar();
	}
	
	public void funcionar() {
		int d = vista.leerDato("Ingrese numero entero:");
		num = new Numero(d);
		int cifras = num.contarCifras();
		int cp = num.contarCifrasPares();
		int ci = num.contarCifrasImpares();
		vista.mostrarInformacion("El número " + d +" tiene " + cifras + " cifras, donde "
								+cp + " son pares y "+ci + " son impares");
	}
}
