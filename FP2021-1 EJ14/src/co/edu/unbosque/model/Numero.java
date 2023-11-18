package co.edu.unbosque.model;

public class Numero {
	
	private int n;
	
	public Numero() {
		n = 0;
	}
	
	public Numero(int n) {
		this.n = n;
	}
	
	public String numTer4IntevaloFOR(Numero b) {
		String resp = "";
		if(n < b.n) {
			for(int i = n ; i <= b.n ; i++) {
				int residuo = i % 10;
				if(residuo < 0) {
					residuo = residuo * (-1);
				}
				if( residuo == 4) {
					resp = resp+ "\n" + i;
				}
			}
		}else {
			for(int i = b.n ; i <= n ; i++) {
				int residuo = i % 10;
				if(residuo < 0) {
					residuo = residuo * (-1);
				}
				if( residuo == 4) {
					resp = resp+ "\n" + i;
				}
			}
		}
		return resp;
	}
	
	public String tabla1() {
		String rta = "";
		int k = 0;
		for(int i = 1 ; i <= 5 ; i++) {
			for(int j = 1 ; j <= 2 ; j++) {
				rta = rta + "\n" + k + " " + i;
				k++;
			}
		}
		return rta;
	}
	
	public String numTer4IntevaloWHILE(Numero b) {
		String resp = "";
		if(n < b.n) {
			int i = n ;
			while( i <= b.n ) {
				int residuo = i % 10;
				if( residuo == 4 || residuo == -4) {
					resp = resp+ " " + i;
				}
				i++;
			}
		}else {
			int i = b.n ;
			while( i <= n ) {
				int residuo = i % 10;
				if( residuo == 4 || residuo == -4) {
					resp = resp+ " " + i;
				}
				i++;
			}
		}
		return resp;
	}
	
	public String numTer4IntevaloDOWHILE(Numero b) {
		String resp = "";
		if(n < b.n) {
			int i = n ;
			do {
				int residuo = i % 10;
				if( residuo == 4 || residuo == -4) {
					resp = resp+ " " + i;
				}
				i++;
			}while( i <= b.n );
		}else {
			int i = b.n ;
			do {
				int residuo = i % 10;
				if( residuo == 4 || residuo == -4) {
					resp = resp+ " " + i;
				}
				i++;
			}while( i <= b.n );
		}
		return resp;
	}
	
	public int getN() {
		return n;
	}

	public void setN(int n) {
		this.n = n;
	}
	
}
