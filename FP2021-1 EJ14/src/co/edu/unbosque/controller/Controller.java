package co.edu.unbosque.controller;

import co.edu.unbosque.model.Numero;
import co.edu.unbosque.view.VistaConsola;
import co.edu.unbosque.view.VistaVentanas;

public class Controller {
	
	private Numero num1, num2;
	private VistaConsola vista;
	
	public Controller() {
		vista = new VistaConsola();
		funcionar();
	}
	
	public void funcionar() {
		int a = vista.leerDato("Ingrese primer número entero:");
		int b = vista.leerDato("Ingrese segundo número entero:");
		num1 = new Numero(a);
		num2 = new Numero(b);
		String r1 = num1.numTer4IntevaloFOR(num2);
		String r2 = num1.numTer4IntevaloWHILE(num2);
		String r3 = num1.numTer4IntevaloDOWHILE(num2);
		vista.mostrarInformacion("FOR: \t\tLos números son " + r1);
		vista.mostrarInformacion("WHILE:\t\tLos números son " + r2);
		vista.mostrarInformacion("DOWHILE:\tLos números son " + r3);
		vista.mostrarInformacion(num1.tabla1());
	}
}
