package co.edu.unbosque.controller;

import co.edu.unbosque.model.Persona;

public class Controller {

	public Persona persona1;
	public Persona persona2;
	
	public Controller() {
		funcionar();
	}
	
	public void funcionar() {
		persona1 = new Persona();
		persona1.setNombre("David");
		persona1.setEstatura(1.75);
		System.out.println("Nombre: "+ persona1.getNombre());
		
		persona2 = new Persona("Lucas", 1.68);
		System.out.println(persona2);
	}
}
