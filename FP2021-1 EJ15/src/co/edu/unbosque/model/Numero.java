package co.edu.unbosque.model;

public class Numero {
	
	private int n;
	
	public Numero() {
		n = 0;
	}
	
	public Numero(int n) {
		this.n = n;
	}
	
	public boolean esPrimo() {
		for(int i = 2 ; i < n ; i++) {
			if (n % i == 0) {
				return false;
			}
		}
		return true;
	}
	
	public int getN() {
		return n;
	}

	public void setN(int n) {
		this.n = n;
	}
	
}
