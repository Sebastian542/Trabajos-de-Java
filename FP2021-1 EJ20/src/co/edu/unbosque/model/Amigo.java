package co.edu.unbosque.model;

public class Amigo{
	
	private String nombre;
	private String correo;
	private long telefono;
	
	public Amigo () {
		nombre = "";
		correo = "";
		telefono = 0;
	}
	
	public Amigo ( String n , String c , long t ) {
		nombre = n ;
		correo = c ;
		telefono = t ;
	}
	
	public String obtenerAmigo() {
		return "Nombre: "+ nombre + "\n" +
			   "Correo electrónico: "+ correo + "\n" +
			   "Teléfono: "+ telefono + "\n" ;
	}
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public long getTelefono() {
		return telefono;
	}

	public void setTelefono(long telefono) {
		this.telefono = telefono;
	}
	
}