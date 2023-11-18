package co.edu.unbosque.model;

public class Persona {
	
	private String nombre;
	private double estatura;
	
	public Persona() {
		nombre = "";
		estatura = 0.0;
	}
	
	public Persona(String nombre, double estatura) {
		this.nombre = nombre;
		this.estatura = estatura;
	}

	@Override
	public String toString() {
		return 	"Nombre: " + nombre + "\n"+
				"Estatura: " + estatura;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getEstatura() {
		return estatura;
	}

	public void setEstatura(double estatura) {
		this.estatura = estatura;
	}
	
}
