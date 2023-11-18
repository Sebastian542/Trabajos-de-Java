package co.edu.unbosque.model;

public class Numero {
	
	private int n;
	
	public Numero() {
		n = 0;
	}
	
	public int hallarMayor(Numero b, Numero c) {
		int mayor = 0;
		if(n >= b.n && n >= c.n) {
			mayor = n;
		}else if(b.n >= n && b.n >= c.n ) {
			mayor = b.n;
		}else {
			mayor = c.n;
		}
		return mayor;
	}
	
	public int hallarMenor(Numero b, Numero c) {
		int menor = 0;
		if(n <= b.n && n <= c.n) {
			menor = n;
		}else if(b.n <= n && b.n <= c.n ) {
			menor = b.n;
		}else {
			menor = c.n;
		}
		return menor;
	}
	
	public int sumaNumeros(Numero b, Numero c) {
		int suma = 0;
		suma = n + b.n + c.n;
		return suma;
	}
	
	public int multiplicacionNumeros(Numero b, Numero c) {
		int multiplicacion = 0;
		multiplicacion = n * b.n * c.n;
		return multiplicacion;
	}
	
	public Numero(int pn) {
		n = pn;
	}

	public int getN() {
		return n;
	}

	public void setN(int n) {
		this.n = n;
	}

	public String toString() {
		return "" + n ;
	}
	
}
