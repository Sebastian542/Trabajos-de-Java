package co.edu.unbosque.model;

public class Intervalo {
	
	private int a;
	private int b;
	private Numero n;
	
	public Intervalo() {
		a = 0;
		b = 0;
	}
	
	public Intervalo(int n1 , int n2) {
		if(n1 <= n2) {
			a = n1;
			b = n2;
		}else {
			a = n2;
			b = n1;
		}
	}
	
	public String primosIntervalo() {
		String rta = "";
		for( int num = a ; num <= b ; num++) {
			n = new Numero(num);
			if(n.esPrimo()) {
				rta = rta + " " + num;
			}
		}
		return rta;
	}

	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}

	public int getB() {
		return b;
	}

	public void setB(int b) {
		this.b = b;
	}
	
}
