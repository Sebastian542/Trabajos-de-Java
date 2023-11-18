package co.edu.unbosque.model;

public class Numero {
	
	private int n;
	private int unidades;
	private int decenas;
	private int centenas;
	private int cantidad_pares;
	private int cantidad_impares;
	
	public Numero() {
		n = 0;
		cantidad_pares = 0;
		cantidad_impares = 0;
	}
	
	public Numero (int n) {
		this.n = n;
		cantidad_pares = 0;
		cantidad_impares = 0;
	}
	
	public void contarPares() {
		int residuo = 0;
		residuo = unidades % 2;
		if( residuo == 0 ) {
			cantidad_pares++;
		}
		residuo = decenas % 2;
		if( residuo == 0 ) {
			cantidad_pares++;
		}
		residuo = centenas % 2;
		if( residuo == 0 ) {
			cantidad_pares++;
		}
	}
	
	public void contarImpares() {
		cantidad_impares = 3 - cantidad_pares;
	}
	
	public void asignarPos() {
		unidades = n % 10;
		decenas = (n / 10) % 10;
		centenas = n / 100;
	}
	
	public int getUnidades() {
		return unidades;
	}

	public void setUnidades(int unidades) {
		this.unidades = unidades;
	}

	public int getDecenas() {
		return decenas;
	}

	public void setDecenas(int decenas) {
		this.decenas = decenas;
	}

	public int getCentenas() {
		return centenas;
	}

	public void setCentenas(int centenas) {
		this.centenas = centenas;
	}

	public int getN() {
		return n;
	}

	public void setN(int n) {
		this.n = n;
	}

	public int getCantidad_pares() {
		return cantidad_pares;
	}

	public void setCantidad_pares(int cantidad_pares) {
		this.cantidad_pares = cantidad_pares;
	}

	public int getCantidad_impares() {
		return cantidad_impares;
	}

	public void setCantidad_impares(int cantidad_impares) {
		this.cantidad_impares = cantidad_impares;
	}
	
	
	
}
