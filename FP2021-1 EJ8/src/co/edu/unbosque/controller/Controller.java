package co.edu.unbosque.controller;

import co.edu.unbosque.model.Numero;
import co.edu.unbosque.view.ViewConsola;
import co.edu.unbosque.view.ViewVentanas;

public class Controller {
	
	private Numero a;
	private Numero b;
	private Numero c;
	private ViewVentanas vista;
	//private ViewConsola vista;
	
	public Controller() {
		vista = new ViewVentanas();
		//vista = new ViewConsola();
		funcionar();
	}
	
	public void funcionar() {
		int aux = 0;
		
		String menu = "";
		
		menu = 	"OPERACIONES"+ "\n" + 
				"  1. Sumar los tres números" + "\n" +
				"  2. Hallar el menor de los tres números" + "\n" +
				"  3. Multiplicar los tres números" + "\n" +
				"  4. Hallar el mayor de los tres números" + "\n" +
				"  5. Salir del programa" + "\n\n" +
				"Digite operación a realizar: " + "\n";
		
		int opcion = vista.leerDato(menu);
		
		if(opcion != 5) {
			aux = vista.leerDato("Ingrese primer número: ");
			a = new Numero(aux);
			
			aux = vista.leerDato("Ingrese segundo número: ");
			b = new Numero(aux);
			
			aux = vista.leerDato("Ingrese tercer número: ");
			c = new Numero(aux);
		}
		
		if(opcion == 1) {
			int suma = 0;
			suma = a.sumaNumeros(b, c);
			vista.mostrarInformacion("La suma de los números ingresados es "+suma);
		}else if(opcion == 2) {
			int menor = 0;
			menor = a.hallarMenor(b, c);
			vista.mostrarInformacion("El menor de "+a.getN()+", "+b.getN()+" y "+c.getN() + " es "+menor);
		}else if(opcion == 3) {
			int multiplicacion = 0;
			multiplicacion = a.multiplicacionNumeros(b, c);
			vista.mostrarInformacion("La multiplicación de los números ingresados es "+multiplicacion);
		}else if (opcion == 4) {
			int mayor = 0;
			mayor = a.hallarMayor(b, c);
			vista.mostrarInformacion("El mayor de "+a.getN()+", "+b.getN()+" y "+c.getN() + " es "+mayor);
		}else if (opcion == 5){
			vista.mostrarInformacion("HASTA PRONTO");
		}else {
			vista.mostrarInformacion("Señor usuario: selecciono una opción inválida");
		}
		
		if(opcion != 5) {
			funcionar();
		}
				
	}

}
