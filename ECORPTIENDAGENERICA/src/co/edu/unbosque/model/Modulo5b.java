package co.edu.unbosque.model;

public interface Modulo5b {
	public abstract double calcularIvaTotalVenta(double valor_IVA, double precio_Venta);
	public abstract double valorTotalConIvaVenta(double precioVenta, double valor_IVA, double precio_Venta);
	public abstract double calcularIvaTotalProveedor(double valor_IVA, double precio_Venta);
	public abstract double valorTotalConIvaProveedor(double precioVenta, double valor_IVA, double precio_Venta);
	
}
