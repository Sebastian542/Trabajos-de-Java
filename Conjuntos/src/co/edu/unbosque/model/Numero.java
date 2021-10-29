package co.edu.unbosque.model;

public class Numero {
	
	private int numero;

	
	public Numero(int n) {
	
		numero = n ;

	}
	
	public String obtenerNumeroA() {
		return "El numero es modificado desde git : "+ numero + "\n"  ;
	}

	public String obtenerNumeroB() {
		return "El numero es : "+ numero + "\n"  ;
	}
	
	
	public int getNumero() {
		return numero;
	}


	public void setNumero(int numero) {
		this.numero = numero;
	}
	
	
	
	

}
