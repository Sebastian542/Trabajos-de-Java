package co.edu.unbosque.model;

import java.io.Serializable;

public class Modulo5DetallesDTO implements Serializable {
	private static final long serialVersionUID = 1L;
	private String codigoproducto;
	private int cantidadVender;
	private double valorunitario;
	private double valortotal;
	private int codigoventa;

	public Modulo5DetallesDTO(String codigoproducto,int cantidadVender,double valorunitario,double valortotal,int codigoventa ) {
		this.codigoproducto=codigoproducto;
		this.cantidadVender=cantidadVender;
		this.valorunitario=valorunitario;
		this.valortotal=valortotal;
		this.codigoventa=codigoventa;
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

	public double getValorunitario() {
		return valorunitario;
	}

	public void setValorunitario(double valorunitario) {
		this.valorunitario = valorunitario;
	}

	public double getValortotal() {
		return valortotal;
	}

	public void setValortotal(double valortotal) {
		this.valortotal = valortotal;
	}

	public int getCodigoventa() {
		return codigoventa;
	}

	public void setCodigoventa(int codigoventa) {
		this.codigoventa = codigoventa;
	}

	@Override
	public String toString() {
		return "\ncodigoproducto=" + codigoproducto + "\ncantidadVender=" + cantidadVender
				+ "\nvalorunitario=" + valorunitario + "\nvalortotal=" + valortotal +
				"\ncodigoventa=" + codigoventa;
	}
}
