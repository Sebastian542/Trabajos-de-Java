package co.edu.unbosque.controller;

import java.util.Scanner;

import co.edu.unbosque.model.Cilindro;
import co.edu.unbosque.view.ViewConsola;

public class Controller {

	public Cilindro c1;
	public Cilindro c2;
	public ViewConsola vista;
	
	public Controller() {
		vista = new ViewConsola();
		funcionar();
	}
	
	public void funcionar() {
		c1 = new Cilindro();
		double aux = 0.0;
		aux = vista.leerDato("Digite Valor del radio: ");
		c1.setRadio(aux);
		aux = vista.leerDato("Digite Valor del altura: ");
		c1.setAltura(aux);
		c1.calcularVolumen();
		vista.mostrarInformacion(c1.toString());
		
		double aux1 = 0.0, aux2 = 0.0;
		aux1 = vista.leerDato("Digite Valor del radio: ");
		aux2 = vista.leerDato("Digite Valor del altura: ");
		c2 = new Cilindro(aux2, aux1);
		c2.calcularVolumen();
		vista.mostrarInformacion(c2.toString());
	}
}
