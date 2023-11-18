package co.edu.unbosque.model;

public class Tabla {

	private int n;

	public int getN() {
		return n;
	}

	public void setN(int n) {
		this.n = n;
	}

	public Tabla(int n) {

		this.n = n;
	}

	public String mostrarTabla(int n) {
		
		String resp = "TABLA DE MULTIPLICAR\n";
		
		
	if(n<=10) {	
			for(int x=0;x<=10;x++) {
				
				resp = resp + n + "* "+x+"="+(n*x) + "\n";
			
				
				
			}
			
		
			
	}
			
		return resp ;
	}
	
	
}
