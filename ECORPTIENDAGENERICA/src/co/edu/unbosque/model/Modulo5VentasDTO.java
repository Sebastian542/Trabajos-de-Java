package co.edu.unbosque.model;

import java.io.Serializable;

public class Modulo5VentasDTO implements Serializable{
	private static final long serialVersionUID = 1L;
	private String cedula;
	private String codigoventa;
	private double valorTOTAL;
	private double valor_IVA;
	private double valorIVAtotal;
	private int cantidadVender;
	
	public Modulo5VentasDTO(String cedula, String codigoventa, double valorTOTAL,
			double valorIVA, double valorIVAtotal, int cantidadvender) {
		this.cedula=cedula;
		this.codigoventa=codigoventa;
		this.valorTOTAL=valorTOTAL;
		this.valor_IVA=valor_IVA;
		this.valorIVAtotal=valorIVAtotal;
		this.cantidadVender=cantidadvender;
	}

	
	public double getValorTOTAL() {
		return valorTOTAL;
	}


	public void setValorTOTAL(double valorTOTAL) {
		this.valorTOTAL = valorTOTAL;
	}


	public double getValorIVA() {
		return valor_IVA;
	}


	public void setValorIVA(double valor_IVA) {
		this.valor_IVA = valor_IVA;
	}


	public double getValorIVAtotal() {
		return valorIVAtotal;
	}


	public void setValorIVAtotal(double valorIVAtotal) {
		this.valorIVAtotal = valorIVAtotal;
	}


	public String getCedula() {
		return cedula;
	}

	public void setCedula(String cedula) {
		this.cedula = cedula;
	}



	public int getCantidadVender() {
		return cantidadVender;
	}

	public void setCantidadVender(int cantidadVender) {
		this.cantidadVender = cantidadVender;
	}
	

	public String getCodigoventa() {
		return codigoventa;
	}


	public void setCodigoventa(String codigoventa) {
		this.codigoventa = codigoventa;
	}


	@Override
	public String toString() {
		return "cedula=" + cedula + "\ncodigoventa=" + codigoventa + 
				"\ncantidadVender="+ cantidadVender+ "\nvalorIVAtotal"+valorIVAtotal + "\nvalorIVA"+valorIVA;
	}
	
}
