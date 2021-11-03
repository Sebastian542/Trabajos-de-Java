package co.edu.unbosque.model;

import co.edu.unbosque.model.persistence.PartidasFile;

public class Partidas {
	private PartidasFile pf;
	
	public Partidas() {
		// TODO Auto-generated constructor stub
		pf = new PartidasFile();
	}


	public PartidasFile getBf() {
		return pf;
	}


	public void setBf(PartidasFile pf) {
		this.pf = pf;
	}


	/* metodo que realiza un proceso basado en un parámetro "dato" 
	 * y retorne el dato procesado. Reemplazar por lo que se necesiten
	 */
	public String procesarDato(String dato) {
		dato = dato + " procesado";
		return dato;
	}
}
