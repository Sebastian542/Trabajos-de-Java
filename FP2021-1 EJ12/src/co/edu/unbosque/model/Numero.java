package co.edu.unbosque.model;

public class Numero {
	
	private int n;
	
	public Numero() {
		n = 0;
	}
	
	public Numero(int n) {
		this.n = n;
	}
	
	public boolean esPrimo1() {
		if(n % 2 == 0 || n % 3 == 0 || n % 5 == 0 || n % 7 == 0) {
			return false;
		}else {
			return true;
		}
	}
	
	public boolean esPrimo2() {
		int c = 0;
		for(int i = 1 ; i <= n ; i++) {
			if (n % i == 0) {
				c++;
			}
		}
		if( c == 2) {
			return true;
		} else {
			return false;
		}
	}
	
	public boolean esPrimo3() {
		int c = 0;
		for(int i = 2 ; i < n ; i++) {
			if (n % i == 0) {
				c++;
			}
		}
		if( c == 0) {
			return true;
		} else {
			return false;
		}
	}
	
	public boolean esPrimo4() {
		for(int i = 2 ; i < n ; i++) {
			if (n % i == 0) {
				return false;
			}
		}
		return true;
	}
	
	public boolean esPerfecto() {
		int s = 0;
		for(int i = 1 ; i < n ; i++) {
			if (n % i == 0) {
				s = s + i;
			}
		}
		if( s == n) {
			return true;
		} else {
			return false;
		}
	}
	
	public int getN() {
		return n;
	}

	public void setN(int n) {
		this.n = n;
	}
	
}
