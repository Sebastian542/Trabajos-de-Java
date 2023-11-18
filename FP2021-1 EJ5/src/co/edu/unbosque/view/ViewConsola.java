package co.edu.unbosque.view;

import java.util.Scanner;

public class ViewConsola {
	
	private Scanner leer;
	
	public ViewConsola() {
		leer = new Scanner(System.in);
	}
	
	public String leerNombre() {
		System.out.println("Ingrese nombre: ");
		String nombre = leer.nextLine();
		return nombre;
	}
	
	public double leerEstatura() {
		System.out.println("Ingrese estatura: ");
		double estatura = leer.nextDouble();
		leer.nextLine();
		return estatura;
	}
	
	public void mostrarInformacion(String nombre, double estatura) {
		System.out.println("Nombre = "+nombre);
		System.out.println("Estatura = "+estatura);
	}
	
	public void mostrarInformacion2(String mensaje) {
		System.out.println(mensaje);
	}

}
