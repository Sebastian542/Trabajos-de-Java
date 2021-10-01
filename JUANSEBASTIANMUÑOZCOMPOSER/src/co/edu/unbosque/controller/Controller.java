package co.edu.unbosque.controller;

import co.edu.unbosque.model.Crear_cancion;
import co.edu.unbosque.model.persistence.EjemploFile;
import co.edu.unbosque.view.View;

public class Controller {
	
	private Crear_cancion c;

	private View gui;
	
	private EjemploFile archivo;
	
	public Controller() {
		
		
		gui = new View();
		
		c=new Crear_cancion();
		
		archivo=new EjemploFile();

		funcionar();
	}

	private void funcionar() {
		
		int numeroEst=gui.pedirDatoEntero("Escriba el numero de estrofas");	
		int numeroReng=gui.pedirDatoEntero("Escriba el número de frases");	
	  
	  	c.setNumeroEstrofas(numeroEst);
	
	  	c.setNumeroRenglones(numeroReng);

        gui.mostrarResultados(c.generarCancion());
		
		
	}
}
