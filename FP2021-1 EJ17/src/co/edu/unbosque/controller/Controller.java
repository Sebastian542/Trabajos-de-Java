package co.edu.unbosque.controller;

import co.edu.unbosque.model.Numero;
import co.edu.unbosque.view.VistaConsola;

public class Controller {
	
	private Numero num1;
	private VistaConsola vista;

	public Controller() {
	
		vista=new VistaConsola();
		
		funcionar();
	}
	
	public void funcionar() {
		
		int x=vista.leerDato("Ingrese X");
		
		int y=vista.leerDato("Ingrese Y");
		
		num1=new Numero();
		
		double prom_mult_2=num1.promedioNmultiplos(2,x);
		
		double prom_mult_5=num1.promedioNmultiplos(5,y);
		
		System.out.println("Prom2:"+prom_mult_2+" \n Prom5:"+prom_mult_5);
		
		if(prom_mult_2<prom_mult_5) {
		
		vista.mostrarInformacion("El prom de 5 es mayor al prom de 2");	
			
	}else if(prom_mult_2==prom_mult_5) {
		
		vista.mostrarInformacion("El prom de 2 es igual al prom de 5");
	}else {

		vista.mostrarInformacion("El prom de 2 es mayor al prom de 5");
	}
		
	}
	
}
