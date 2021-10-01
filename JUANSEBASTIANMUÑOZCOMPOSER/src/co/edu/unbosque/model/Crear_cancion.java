package co.edu.unbosque.model;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import javax.swing.JFileChooser;

import co.edu.unbosque.model.persistence.EjemploFile;
import co.edu.unbosque.model.persistence.Propiedades;

public class Crear_cancion {

	private int numeroEstrofas;
	
	private int numeroRenglones;

	
	



	public int getNumeroEstrofas() {
		return numeroEstrofas;
	}



	public void setNumeroEstrofas(int numeroEstrofas) {
		this.numeroEstrofas = numeroEstrofas;
	}



	public int getNumeroRenglones() {
		return numeroRenglones;
	}



	public void setNumeroRenglones(int numeroRenglones) {
		this.numeroRenglones = numeroRenglones;
	}



	public String generarCancion() {
		
		
		EjemploFile archivo=new EjemploFile();
	
		String estrofa1=generarEstrofa();
		

		String estrofa2=generarEstrofa();
		
		String estrofa3=generarEstrofa();
		
		archivo.escribirArchivo("La estrofa 1 es \n"+estrofa1+"\nLa estrofa 2 es \n"+estrofa2+"\nLa estrofa 3 es \n"+estrofa3);
		
		return "La estrofa 1 es \n"+estrofa1+"\n La estrofa 2 es \n"+estrofa2+"\n La estrofa 3 es \n"+estrofa3;		

	}
	
	
	
	public String generarEstrofa() {
		
		String[ ] palabras1 = {"Mami ", "Bebe ","Princess ", "Mami "};   
		String[ ] palabras2 = {"yo quiero ", "yo puedo ","yo vengo a ", "voy a "};   
		String[ ] palabras3 = {"enceldete ", "amalte ","ligalte ", "fugalte "};   
		String[ ] palabras4 = {"suave ", "lento ","rapido ", "fuerte "};   
		String[ ] palabras5 = {"hasta que salga el sol  ", "toda la noche ","hasta el amanecer ", "todo el dia "};   
		String[ ] palabras6 = {"sin anestecia ", "complomiso ","feis to feis ", "sin miedo "};
	
		String renglon1=palabras1[generarAleatorio()]+palabras2[generarAleatorio()]+palabras3[generarAleatorio()]+palabras4[generarAleatorio()]+palabras5[generarAleatorio()]+palabras6[generarAleatorio()];
		String renglon2=palabras1[generarAleatorio()]+palabras2[generarAleatorio()]+palabras3[generarAleatorio()]+palabras4[generarAleatorio()]+palabras5[generarAleatorio()]+palabras6[generarAleatorio()];
		String renglon3=palabras1[generarAleatorio()]+palabras2[generarAleatorio()]+palabras3[generarAleatorio()]+palabras4[generarAleatorio()]+palabras5[generarAleatorio()]+palabras6[generarAleatorio()];
		String renglon4=palabras1[generarAleatorio()]+palabras2[generarAleatorio()]+palabras3[generarAleatorio()]+palabras4[generarAleatorio()]+palabras5[generarAleatorio()]+palabras6[generarAleatorio()];

		
		
		return renglon1+"\n"+renglon2+"\n"+renglon3+"\n"+renglon4;

	}
	

	public int generarAleatorio() {
		
		return (int) (Math.random() * (3- 0) + 0);
	}
	
	
	
	public String gestionarPropiedades() {
		
		Propiedades prop=new Propiedades();
		
		prop.escribirPropiedades(numeroEstrofas, numeroRenglones);

		
		return "Se leyeron estas propiedades"+"\n"+prop.leerPropiedades();
		
	}



	
	
}
