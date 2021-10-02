package co.edu.unbosque.controller;

import co.edu.unbosque.model.Crear_cancion;
import co.edu.unbosque.model.persistence.EjemploFile;
import co.edu.unbosque.view.View;

public class Controller {
	
	private Crear_cancion c;

	private View gui;
	

	
	public Controller() {
		
		
		gui = new View();
		
		c=new Crear_cancion();
		
		

		funcionar();
	}

	private void funcionar() {
		
		gui.mostrarResultados("Bienvenido señor usuario a continuacion proporcione las caracteristicas que va a contener su cancion");
		
		int numeroEst=gui.pedirDatoEntero("Escriba el numero de estrofas");	
		int numeroReng=gui.pedirDatoEntero("Escriba el número de frases");	
	  
	  	c.setNumeroEstrofas(numeroEst);
	
	  	c.setNumeroRenglones(numeroReng);
	  	
	  	gui.mostrarResultados("A continuacion indique donde guardara la cancion");

        gui.mostrarResultados(c.generarCancion());
		
		
	}
}
