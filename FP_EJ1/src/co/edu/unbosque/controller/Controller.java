package co.edu.unbosque.controller;

import java.util.Scanner;

public class Controller {

	Scanner leer;
	
	public Controller() {
		leer = new Scanner(System.in);
		funcionar();
	}
	
	public void funcionar() {
		double radio = 0.0;
		double altura = 0.0;
		double volumen = 0.0;
		
		//leer radio
		System.out.println("Digite radio: ");
		radio = leer.nextDouble();
		
		//leer altura
		System.out.println("Digite altura: ");
		altura = leer.nextDouble();
		
		//calcular la formula
		volumen = radio * radio * altura * Math.PI;
		
		//imprimir información
		System.out.println("El volumen es "+volumen);
		
		
		
		
		
		
		
		
		
	}
}
