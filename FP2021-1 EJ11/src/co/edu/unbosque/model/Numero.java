package co.edu.unbosque.model;

public class Numero {
	
	private int n;
	
	public Numero() {
		n = 0;
	}
	
	public Numero(int n) {
		this.n = n;
	}
	
	public String tablaMultiplicar() {
		String resp = "TABLA DE MULTIPLICAR\n";
		resp = resp + n + "* 0 = "+ (n*0) + "\n";
		resp = resp + n + "* 1 = "+ (n*1) + "\n";
		resp = resp + n + "* 2 = "+ (n*2) + "\n";
		resp = resp + n + "* 3 = "+ (n*3) + "\n";
		resp = resp + n + "* 4 = "+ (n*4) + "\n";
		resp = resp + n + "* 5 = "+ (n*5) + "\n";
		resp = resp + n + "* 6 = "+ (n*6) + "\n";
		resp = resp + n + "* 7 = "+ (n*7) + "\n";
		resp = resp + n + "* 8 = "+ (n*8) + "\n";
		resp = resp + n + "* 9 = "+ (n*9) + "\n";
		resp = resp + n + "* 10 = "+ (n*10) + "\n";
		return resp;
	}
	
	public String tablaMultiplicarConCiclos() {
		String resp = "TABLA DE MULTIPLICAR\n";
		for(int i = 0; i <= 5; i++) {
			resp = resp + n + "* " + i + " = "+ (n*i) + "\n";
		}
		return resp;
	}
	
	public int sumatoriaHastaN() {
		int sum = 0;
		for( int i = 1; i<=n; i++) {
			sum = sum + i ;
		}
		return sum;
	}

	public int getN() {
		return n;
	}

	public void setN(int n) {
		this.n = n;
	}
	
}
