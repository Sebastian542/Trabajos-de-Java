package co.edu.unbosque.controller;
/**
		  * Metodo 
		  *@
		  */
import co.edu.unbosque.model.Arreglo;
import co.edu.unbosque.view.VistaVentanas;


import co.edu.unbosque.view.VentanaJvsJ;
import co.edu.unbosque.view.VentanaJvsJ2;
import co.edu.unbosque.view.VentanaJvsM;
import co.edu.unbosque.view.VentanaJvsM2;
import co.edu.unbosque.view.VentanaPrincipal;
/**
		  * Metodo 
		  *@
		  */
public class Controller {
	/**
		  * Metodo 
		  *@
		  */
	private VistaVentanas vista;
	private Arreglo arreglonumero;
	private Arreglo arreglonumeroal;
	private VentanaPrincipal ventanaprincipal;
	private VentanaJvsJ ventanaJvsJ;
	private VentanaJvsJ2 ventanaJvsJ2;
	private VentanaJvsM ventanaJvsM;
	private VentanaJvsM2 ventanaJvsM2;

	/**
		  * Metodo 
		  *@
		  */
	public Controller() {
		vista = new VistaVentanas();
		funcionar();
		
	}
	/**
		  * Metodo 
		  *@
		  */
	public void funcionar() {
		//ventanaprincipal=new VentanaPrincipal();
		///ventanaJvsJ = new VentanaJvsJ();
		//ventanaJvsJ2 = new VentanaJvsJ2();
		//ventanaJvsM = new VentanaJvsM();
		//ventanaJvsM2 = new VentanaJvsM2();
	
	/**
		  * Metodo 
		  *@
		  */
		int t = vista.leerDatoEntero("De cuantos digitos sera el número ");
		
		if(t<1 || t>10) {
			
			System.out.println("El número debe tener minimo 1 digito y maximo 10 digitos");

			t = vista.leerDatoEntero("Ingrese nuevamente la cantidad de digitos del número ");
			 
		}
		
	
		
		int r=vista.leerDatoEntero("Desea digitos repetidos \n "+"1.Sí \n"+" 2.No \n"  );
		
		int vidas=vista.leerDatoEntero("Cuantos intentos desea tener");
		
		if(vidas<1 || vidas>5) {
			
			 vidas=vista.leerDatoEntero("El valor minimo de intentos debe estar entre 1 y 5");
			
		}
		
		
/**
		  * Metodo 
		  *@
		  */
		Arreglo arreglonumero = new Arreglo(t);
	
		Arreglo arreglonumeroal = new Arreglo(t);
		
		
		arreglonumero.asignarValorPosicionAl(arreglonumero.numAleatorio(t,r));
	
		if(r==1) {
		System.out.println("-----------------"+arreglonumero.Alprueba());
		}
		
		
		
		
	
		
		//String rta = "El arreglo aleatorio es:\n"+ arreglonumero.numAleatorio()+ "\n";
		
		//vista.mostrarInformacion(rta);
		
		int numero=vista.leerDatoEntero("Escribe un numero");
		

		arreglonumero.asignarValorPosicionUsuario(numero);
		
	

		
		String rta = "El arreglo aleatorio es:\n"+ arreglonumero.obtenerArregloAl()+ "\n";
		
		vista.mostrarInformacion(rta);
		
		
		
		int auxiliar=Math.abs(arreglonumero.fijas()-arreglonumero.picas());

		System.out.println("Las picas son  "+auxiliar);
		
		System.out.println("Las fijas son  "+arreglonumero.fijas());
	
		
		
	
	}
	
	
}
