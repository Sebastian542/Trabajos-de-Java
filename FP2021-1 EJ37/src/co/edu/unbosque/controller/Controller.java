package co.edu.unbosque.controller;

import co.edu.unbosque.model.Tabla;
import co.edu.unbosque.view.VistaVentanas;

public class Controller {
	
	private Tabla num;

	private VistaVentanas vista;
	
	public Controller() {
		
		vista=new VistaVentanas();
		
		funcionar();
		
	}
	
	public void funcionar() {
		
		
		
		num = new Tabla(0);
		
	
		vista.mostrarInformacion(num.mostrarTabla(1));
		
		vista.mostrarInformacion(num.mostrarTabla(2));
		
		vista.mostrarInformacion(num.mostrarTabla(3));
		
		vista.mostrarInformacion(num.mostrarTabla(4));

		vista.mostrarInformacion(num.mostrarTabla(5));

		vista.mostrarInformacion(num.mostrarTabla(6));
		
		vista.mostrarInformacion(num.mostrarTabla(7));
		
		vista.mostrarInformacion(num.mostrarTabla(8));

		vista.mostrarInformacion(num.mostrarTabla(9));
	
		vista.mostrarInformacion(num.mostrarTabla(10));
	}
	
	
}
