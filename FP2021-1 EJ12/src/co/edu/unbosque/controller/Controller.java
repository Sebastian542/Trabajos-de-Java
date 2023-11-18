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
		if(num.esPrimo3()) {
			vista.mostrarInformacion("El n�mero " + d +" ingresado es primo");
		}else {
			vista.mostrarInformacion("El n�mero " + d +" ingresado NO es primo");
		}
		
		/*if(d > 0 && d < 50) {
			num = new Numero(d);
			if(num.esPrimo1()) {
				vista.mostrarInformacion("El n�mero ingresado es primo");
			}else {
				vista.mostrarInformacion("El n�mero ingresado NO es primo");
			}
		}else {
			vista.mostrarInformacion("Error: N�mero no cumple las condiciones solicitadas");
		}*/
		
	}
}
