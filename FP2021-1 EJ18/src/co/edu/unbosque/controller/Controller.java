package co.edu.unbosque.controller;

import co.edu.unbosque.model.Arreglo;
import co.edu.unbosque.view.VistaVentanas;

public class Controller {
	
	private VistaVentanas vista;
	private Arreglo ar;

	
	public Controller() {
		vista = new VistaVentanas();
		funcionar();
	}
	
	public void funcionar() {
		int t = vista.leerDatoEntero("Digite tama�o del arreglo: ");
		ar = new Arreglo(t);
		ar.inicializarArreglo();
		leerArreglo();
		vista.mostrarInformacion("El contenido del arreglo LEIDO es: \n" + ar.obtenerArreglo());
		/*double numb = vista.leerDatoEntero("Digite numero a buscar en el arreglo: ");
		String pos_rta = ar.buscarNumeroConRepeticiones(numb);
		if(pos_rta.equals("")) {
			vista.mostrarInformacion("El n�mero no se encuentra en el arreglo");
		}else {
			vista.mostrarInformacion("El n�mero se encuentra en las posici�n(es) " + pos_rta + " del arreglo");
		}*/
		
		/*
		double max = ar.maxArreglo();
		String rta = ar.buscarNumeroConRepeticiones(max);
		vista.mostrarInformacion("El valor m�ximo del arreglo es "+ max +" y est� en las posicion(es) " +rta);
		*/
		/*
		double min = ar.minArreglo();
		String rta = ar.buscarNumeroConRepeticiones(min);
		vista.mostrarInformacion("El valor m�nimo del arreglo es "+ min +" y est� en las posicion(es) " +rta);
		*/
		
		double max = ar.maxArreglo();
		String rta_max = ar.buscarNumeroConRepeticiones(max);
		double min = ar.minArreglo();
		String rta_min = ar.buscarNumeroConRepeticiones(min);
		double suma = ar.sumaArreglo();
		double prom = ar.promArreglo();
		
		String rta = "El arreglo es:\n"+ ar.obtenerArreglo()+ "\n"+
					 "El valor m�ximo del arreglo es "+ max +" y est� en las posicion(es) " +rta_max + "\n"+
					 "El valor m�nimo del arreglo es "+ min +" y est� en las posicion(es) " +rta_min + "\n"+
					 "El valor de la suma de los elementos del arreglo es "+ suma + "\n" +
					 "El valor del promedio de los elementos del arreglo es "+ prom + "\n";
		
		vista.mostrarInformacion(rta);
		
	}
	
	public void leerArreglo() {
		for(int i = 0 ; i < ar.getNumeros().length ; i++) {
			double valor = vista.leerDatoReal("Digite valor que quiere guardar en pos Arreglo[" + i + "]: ");
			ar.asignarValorPosicion(i, valor);
		}
	}
}
