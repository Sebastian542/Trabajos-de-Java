package co.edu.unbosque.controller;

import co.edu.unbosque.model.Persona;
import co.edu.unbosque.view.ViewConsola;

public class Controller {

	public Persona persona1;
	public Persona persona2;
	public ViewConsola vista;
	
	public Controller() {
		vista = new ViewConsola();
		funcionar();
	}
	
	public void funcionar() {
		String nombre = "";
		double estatura = 0.0;
		
		persona1 = new Persona();
		nombre = vista.leerNombre();
		persona1.setNombre(nombre);
		estatura = vista.leerEstatura();
		persona1.setEstatura(estatura);
		vista.mostrarInformacion(persona1.getNombre(), persona1.getEstatura());
		vista.mostrarInformacion2(persona1.toString());
		
		nombre = vista.leerNombre();
		estatura = vista.leerEstatura();
		persona2 = new Persona(nombre, estatura);
		vista.mostrarInformacion(persona2.getNombre(), persona2.getEstatura());
		
	}
}
