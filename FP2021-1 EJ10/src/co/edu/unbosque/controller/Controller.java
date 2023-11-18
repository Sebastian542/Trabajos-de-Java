package co.edu.unbosque.controller;

import co.edu.unbosque.model.Numero;
import co.edu.unbosque.view.ViewVentanas;

public class Controller {
	
	private ViewVentanas vista;
	private Numero num;
	
	public Controller() {
		vista = new ViewVentanas();
		funcionar();
	}
	
	public void funcionar() {
		
		int aux = vista.leerDato("Se�or usuario ingrese un n�mero de 3 cifras [100,999]: ");
		
		if( aux > 99 && aux < 1000) {
			num = new Numero(aux);
			num.asignarPos();
			num.contarPares();
			num.contarImpares();
			vista.mostrarInformacion("Cantidad de pares = "+num.getCantidad_pares() + "\n" +
								     "Cantidad de impares = "+num.getCantidad_impares() + "\n");
		}else {
			vista.mostrarInformacion("Se�or usuario: La cag..., ingres� un n�mero inv�lido");
		}
		
	}
	
}
