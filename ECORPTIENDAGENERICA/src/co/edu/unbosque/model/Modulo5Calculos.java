package co.edu.unbosque.model;

public class Modulo5Calculos extends Modulo5a implements Modulo5b {
	
	
	public Modulo5Calculos() {
		
	}

	@Override
	public double calcularIvaTotalVenta(double valor_IVA, double precio_Venta) {
		double totalv = 0;
		totalv = (precio_Venta*valor_IVA)/100;
		return totalv;
	}

	@Override
	public double valorTotalConIvaVenta(double precioVenta, double valor_IVA, double precio_Venta) {
		double totalconivav = 0;
		totalconivav = calcularIvaTotalVenta(valor_IVA,precio_Venta)+ precioVenta;
		return totalconivav;
	}

	@Override
	public double totalProductos(double precio_Venta, int cantidadVender) {
		double totalP = 0;
		totalP= precio_Venta * cantidadVender;
		return totalP;
	}

	@Override
	public double calcularIvaTotalProveedor(double valor_IVA, double precio_Compra) {
		double totalc = 0;
		totalc = (precio_Compra*valor_IVA)/100;
		return totalc;
	}

	@Override
	public double valorTotalConIvaProveedor(double precioVenta, double valor_IVA, double precio_Compra) {
		double totalconivac = 0;
		totalconivac = calcularIvaTotalVenta(valor_IVA,precio_Compra)+ precioVenta;
		return totalconivac;
	}
}
