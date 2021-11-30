package co.edu.unbosque.model;

import java.io.Serializable;

public class Modulo3DTO implements Serializable{
	private static final long serialVersionUID = 1L;
	public String NIT;
	public String nombre;
	public String proveedor;
	public String direccion;
	public String telefono;
	public String ciudad;
	
	public Modulo3DTO(String NIT, String nombre, String proveedor, String direccion, String telefono, String ciudad) {
		this.NIT = NIT;
		this.nombre=nombre;
		this.proveedor=proveedor;
		this.direccion=direccion;
		this.telefono=telefono;
		this.ciudad=ciudad;
	}

	public String getNIT() {
		return NIT;
	}

	public void setNIT(String nIT) {
		NIT = nIT;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getProveedor() {
		return proveedor;
	}

	public void setProveedor(String proveedor) {
		this.proveedor = proveedor;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getCiudad() {
		return ciudad;
	}

	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}
	
}
