package co.edu.unbosque.controller;

import java.util.Scanner;

import co.edu.unbosque.model.Cilindro;

public class Controller {

	public Cilindro c1;
	public Cilindro c2;
	public Scanner leer;
	
	public Controller() {
		leer  = new Scanner(System.in);
		funcionar();
	}
	
	public void funcionar() {
		c1 = new Cilindro();
		double aux = 0.0;
		System.out.println("Digite Valor del radio: ");
		aux = leer.nextDouble();
		c1.setRadio(aux);
		System.out.println("Digite Valor del altura: ");
		aux = leer.nextDouble();
		c1.setAltura(aux);
		c1.calcularVolumen();
		System.out.println(c1);
		
		double aux1 = 0.0, aux2 = 0.0;
		System.out.println("Digite Valor del radio: ");
		aux1 = leer.nextDouble();
		System.out.println("Digite Valor del altura: ");
		aux2 = leer.nextDouble();
		c2 = new Cilindro(aux2, aux1);
		c2.calcularVolumen();
		System.out.println(c2);
	}
}
