package co.edu.unbosque.model;

public class ClaseX {

	private ClaseY y;
	
	public ClaseX() {
		// TODO Auto-generated constructor stub
		y = new ClaseY();
	}

	public ClaseY getY() {
		return y;
	}

	public void setY(ClaseY y) {
		this.y = y;
	}


	/* metodo que realiza un proceso basado en un parámetro "dato" 
	 * y retorne el dato procesado. Reemplazar por lo que se necesiten
	 */
	public String procesarDato(String dato) {
		dato = dato + " procesado";
		return dato;
	}
}
