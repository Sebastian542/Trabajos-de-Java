package co.edu.unbosque.model;

public class Numero {
	
	private int n;
	
	public Numero() {
		n = 0;
	}
	
	public int hallarMayor1(Numero b, Numero c) {
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
	
	public int hallarMayor2(Numero b, Numero c) {
		int mayor = 0;
		if(n >= b.n) {
			if(n >= c.n) {
				mayor = n;
			}else {
				mayor = c.n;
			}
		}else{
			if(b.n >= c.n) {
				mayor = b.n;
			}else {
				mayor = c.n;
			}
		}
		return mayor;
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
