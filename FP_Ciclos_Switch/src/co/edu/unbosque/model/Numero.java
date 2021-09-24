package co.edu.unbosque.model;

public class Numero {
	
	private int num;
	
	public Numero() {
		num = 0;
	}
	
	public int mayorDigitos() {
		int mayor = 0;
		int n = num;
		
		while(n != 0) {
			int d = n % 10;
			n = n / 10;
			if( d > mayor) {
				mayor = d;
			}
		}
		
		return mayor;
	}
	
	public int sumaDigitos() {
		int sum = 0;
		int n = num;
		
		while(n != 0) {
			int d = n % 10;
			n = n / 10;
			sum = sum + d;
		}
		
		return sum;
	}
	
	
	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}
	
}
