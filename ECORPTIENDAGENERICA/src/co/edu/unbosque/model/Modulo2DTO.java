package co.edu.unbosque.model;

import java.io.Serializable;

public class Modulo2DTO implements Serializable {
	private static final long serialVersionUID = 1L;	

	private String cedula;
	private String nombre;
	private String direccion;
	private int telefono;
	private String correo;
	

	public Modulo2DTO(String cedula, String nombre, String direccion, int telefono, String correo) {

		this.cedula = cedula;
		this.nombre = nombre;
		this.direccion = direccion;
		this.telefono = telefono;
		this.correo = correo;
	}

	public String getCedula() {
		return cedula;
	}

	public void setCedula(String cedula) {
		this.cedula = cedula;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public int getTelefono() {
		return telefono;
	}

	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	@Override
	public String toString() {
		return "cedula=" + cedula + "\nnombre=" + nombre + "\ndireccion="
	+ direccion + "\ntelefono=" + telefono + "\ncorreo=" + correo;
	}
	
}
