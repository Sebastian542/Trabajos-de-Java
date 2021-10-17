package co.edu.unbosque.controller;


import java.util.Collections;

import co.edu.unbosque.model.Conjuntos;
import co.edu.unbosque.model.Numero;
import co.edu.unbosque.view.View;

public class Controller {
	
	private Conjuntos c;
	private Numero n1;
	private View gui;
	
	public Controller() {
		c = new Conjuntos();
		gui = new View();
		
		funcionar();
		//gui.mostrarResultados(m.procesarDato(gui.pedirDato()));
	}
	
	public void funcionar() {
		
		
		String menu = "..:Programa de conjuntos :.." + "\n" +
				  "\nQué deseas hacer ??? :)"	 + "\n" +
			      "    1. Agregar valor a un conjunto numerico" + "\n" +
				  "    2. Ver listado" + "\n" +
			      "    3. Buscar amigo por nombre" + "\n" +
				  "    4. Modificar amigo" + "\n" +
			      "    5. Eliminar amigo" + "\n" +
				  "    6. Salir" + "\n" + "\n" +
			      "Tu opción es: ";
	
		
		
		int opcion = gui.leerDatoEntero(menu);

		int n,a = 0;
		int i=1;
		
		     menu = "..:Programa de conjuntos :.." + "\n" +
				  "\n   Qué deseas hacer ??? :)"	 + "\n" +
			      "    1. Agregar valor a un conjunto numerico A" + "\n" +
				  "    2. Agregar valor a un conjunto numerico B" + "\n" +
			      "    3. Ver los elementos del conjunto A" + "\n" +
				  "    4. Ver los elementos del conjunto B" + "\n" +
				  "    5. Comparar el conjunto A y B" + "\n" +
			      "    5. Eliminar elemento del conjunto A" + "\n" +
			      "    6. Eliminar elemento del conjunto b" + "\n" +
				  "    7. Salir" + "\n" + "\n" +
			      "Tu opción es: ";
	
		
		
		opcion = gui.leerDatoEntero(menu);

			
		while(i<=a) {
			n=gui.pedirDatoEntero("Ingrese un numero");
			
			c.insertarNumeroA(n);
			i++;
			
		}
		

		switch (opcion) {
		
		case 1:
			 a=gui.pedirDatoEntero("Ingrese el numero de datos que desea almacenar en el conjunto A");
			 
			 i=1;
			
		
				
			while(i<=a) {
				n=gui.pedirDatoEntero("Ingrese un numero");
				
				c.insertarNumeroA(n);
				i++;
			
				
			}
			funcionar();
			break;
			
			
		
		
	
		
		case 2:
			 a=gui.pedirDatoEntero("Ingrese el numero de datos que desea almacenar en el conjunto A");
			 
			 i=1;
			
		
				
			while(i<=a) {
				n=gui.pedirDatoEntero("Ingrese un numero");
				
				c.insertarNumeroB(n);
				i++;
				
			}
			
			funcionar();
			
			break;
		
		
		case 3:
			
		c.conjuntoNumerico();
			
			break;
		
		
		
		
		//n=gui.pedirDatoEntero();
		

		
	
		
		//c.conjuntoNumerico();
		
	}
		
	}	
}
