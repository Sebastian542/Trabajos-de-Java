package co.edu.unbosque.model.persistence;

import java.io.Serializable;

public class RegJugador implements Serializable {
	
	
	private static final long serialVersionUID = 1L;
	
	
	private String nombre;
	private String genero;
	private int edad;
	private double puntaje;
	
	public RegJugador(String nombre, int edad, String genero, double puntaje){
		this.nombre = nombre;
		this.edad = edad;
		this.genero = genero;
		this.puntaje = puntaje;

	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public double getPuntaje() {
		return puntaje;
	}

	public void setPuntaje(double puntaje) {
		this.puntaje = puntaje;
	}
	
	
}
