package co.edu.unbosque.model;

import java.io.Serializable;

public class Modulo4DTO implements Serializable {
	private static final long serialVersionUID = 1L;
	private String nombreproducto;
	private String nitProveedor;
	private double precio_Compra;
	private double precio_Venta;
	

	public Modulo4DTO(String nombreproducto, String nitProveedor, double precio_Compra, double precio_Venta) {
		

		this.nombreproducto = nombreproducto;
		this.nitProveedor = nitProveedor;
		this.precio_Compra = precio_Compra;
		this.precio_Venta = precio_Venta;
	}


	public String getNombreproducto() {
		return nombreproducto;
	}


	public void setNombreproducto(String nombreproducto) {
		this.nombreproducto = nombreproducto;
	}


	public String getNitProveedor() {
		return nitProveedor;
	}


	public void setNitProveedor(String nitProveedor) {
		this.nitProveedor = nitProveedor;
	}


	public double getPrecio_Compra() {
		return precio_Compra;
	}


	public void setPrecio_Compra(double precio_Compra) {
		this.precio_Compra = precio_Compra;
	}


	public double getPrecio_Venta() {
		return precio_Venta;
	}


	public void setPrecio_Venta(double precio_Venta) {
		this.precio_Venta = precio_Venta;
	}

	
}
