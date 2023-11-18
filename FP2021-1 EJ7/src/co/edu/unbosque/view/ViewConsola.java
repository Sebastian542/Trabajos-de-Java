package co.edu.unbosque.view;

import java.util.Scanner;

public class ViewConsola {
	
	private Scanner leer;
	
	public ViewConsola() {
		leer = new Scanner(System.in);
	}
	
	public int leerDato(String mensaje) {
		System.out.println(mensaje);
		int dato = leer.nextInt();
		leer.nextLine();
		return dato;
	}
	
	public void mostrarInformacion(String mensaje) {
		System.out.println(mensaje);
	}
}
