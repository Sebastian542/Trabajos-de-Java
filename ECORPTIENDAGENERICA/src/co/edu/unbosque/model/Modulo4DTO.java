package co.edu.unbosque.model;

import java.io.Serializable;

public class Modulo4DTO implements Serializable {
	private static final long serialVersionUID = 1L;
	private String codigoproducto;
	private String nombreproducto;
	private String nitProveedor;
	private double precio_Compra;
	private double precio_Venta;
	

	public Modulo4DTO(String codigoproducto,String nombreproducto, String nitProveedor, double precio_Compra, double precio_Venta) {
		
		this.codigoproducto = codigoproducto;
		this.nombreproducto = nombreproducto;
		this.nitProveedor = nitProveedor;
		this.precio_Compra = precio_Compra;
		this.precio_Venta = precio_Venta;
	}
	

	public String getCodigoproducto() {
		return codigoproducto;
	}


	public void setCodigoproducto(String codigoproducto) {
		this.codigoproducto = codigoproducto;
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


	@Override
	public String toString() {
		return "codigoproducto="+codigoproducto+"\nnombreproducto=" + nombreproducto + "\nnitProveedor=" + nitProveedor + "\nprecio_Compra="
				+ precio_Compra + "\nprecio_Venta=" + precio_Venta + "]";
	}
	
	
}
