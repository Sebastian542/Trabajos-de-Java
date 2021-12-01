package co.edu.unbosque.model;

import java.io.Serializable;

public class Modulo5VentasDTO implements Serializable{
	private static final long serialVersionUID = 1L;
	private String cedula;
	private String codigoproducto;
	private int cantidadVender;
	
	public Modulo5VentasDTO(String cedula, String codigoproducto, int cantidadvender) {
		this.cedula=cedula;
		this.codigoproducto=codigoproducto;
		this.cantidadVender=cantidadvender;
	}


	public String getCedula() {
		return cedula;
	}

	public void setCedula(String cedula) {
		this.cedula = cedula;
	}

	public String getCodigoproducto() {
		return codigoproducto;
	}

	public void setCodigoproducto(String codigoproducto) {
		this.codigoproducto = codigoproducto;
	}

	public int getCantidadVender() {
		return cantidadVender;
	}

	public void setCantidadVender(int cantidadVender) {
		this.cantidadVender = cantidadVender;
	}
	
}
