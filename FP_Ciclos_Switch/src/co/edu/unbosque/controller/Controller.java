package co.edu.unbosque.controller;

import co.edu.unbosque.model.Numero;
import co.edu.unbosque.view.ViewConsola;
import co.edu.unbosque.view.ViewVentana;

public class Controller {
	
	private ViewVentana vista;
	private Numero numero;
	
	public Controller() {
		vista = new ViewVentana();
		numero = new Numero();
		funcionar();
	}
	
	public void funcionar() {
		int opcion = 0;
		do {
			opcion = vista.leerDato("Seleccione ejercicio: "
					+ "\n\n1. Suma de los digitos de un número"
					+ "\n2. Digito mayor de un número"
					+ "\n3. Salir"
					+ "\n\nOpción:");
		
		
			switch (opcion) {
			case 1:
				int n1 = vista.leerDato("Ingrese numero entero: ");
				numero.setNum(n1);
				int resul1 = numero.sumaDigitos();
				vista.mostrarMensaje("El numero "+ numero.getNum() + " tiene como suma de sus digitos = "+resul1, "informativo");
				break;
	
			case 2:
				int n2 = vista.leerDato("Ingrese numero entero: ");
				numero.setNum(n2);
				int resul2 = numero.mayorDigitos();
				vista.mostrarMensaje("El numero "+ numero.getNum() + " tiene el digito mayor = "+resul2, "informativo");
				break;
				
			case 3:
				vista.mostrarMensaje("Hasta Pronto", "informativo");
				break;
	
			default:
				vista.mostrarMensaje("Sea Serio, OPCIÓN INVÁLIDA", "error");
				break;
			}
		}while(opcion!=3);
	}
}
