package co.edu.unbosque.model;

public class Numero {
	
	private int n;
	
	public Numero() {
		n = 0;
	}
	
	public Numero(int n) {
		this.n = n;
	}
	
	public int contarCifras() {
		int cifras = 0;
		int nn = n;
		while ( nn > 0) {
			nn = nn / 10;
			cifras++;
		}
		return cifras;
	}
	
	public int contarCifrasPares() {
		int cifras = 0;
		int nn = n;
		while ( nn > 0) {
			int d = nn % 10;
			nn = nn / 10;
			if(d % 2 == 0) {
				cifras++;
			}
		}
		return cifras;
	}
	
	public int contarCifrasImpares() {
		int cifras = 0;
		int nn = n;
		while ( nn > 0) {
			int d = nn % 10;
			nn = nn / 10;
			if(d % 2 != 0) {
				cifras++;
			}
		}
		return cifras;
	}
	
	public int getN() {
		return n;
	}

	public void setN(int n) {
		this.n = n;
	}
	
}
