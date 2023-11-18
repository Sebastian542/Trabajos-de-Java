package co.edu.unbosque.view;

import java.util.Scanner;

public class ViewConsola {
	
	private Scanner leer;
	
	public ViewConsola() {
		leer = new Scanner(System.in);
	}
	
	public double leerDato(String mensaje) {
		System.out.println(mensaje);
		double dato = leer.nextDouble();
		leer.nextLine();
		return dato;
	}
	
	public void mostrarInformacion(String mensaje) {
		System.out.println(mensaje);
	}
}
