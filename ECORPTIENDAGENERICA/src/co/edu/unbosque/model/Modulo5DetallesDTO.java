package co.edu.unbosque.model;

import java.io.Serializable;

public class Modulo5DetallesDTO implements Serializable {
	private static final long serialVersionUID = 1L;
	private String codigoproducto;
	private int cantidad;
	private double valorunitario;
	private double valortotal;
	private String codigoventa;

	public Modulo5DetallesDTO(String codigoproducto,int cantidad,double valorunitario,double valortotal,String codigoventa ) {
		this.codigoproducto=codigoproducto;
		this.cantidad=cantidad;
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

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidadVender(int cantidadVender) {
		this.cantidad = cantidadVender;
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

	public String getCodigoventa() {
		return codigoventa;
	}

	public void setCodigoventa(String codigoventa) {
		this.codigoventa = codigoventa;
	}

	@Override
	public String toString() {
		return "\ncodigoproducto=" + codigoproducto + "\ncantidad=" + cantidad
				+ "\nvalorunitario=" + valorunitario + "\nvalortotal=" + valortotal +
				"\ncodigoventa=" + codigoventa;
	}
}
