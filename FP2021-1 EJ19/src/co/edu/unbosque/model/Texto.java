package co.edu.unbosque.model;

public class Texto {
	
	private String text;
	
	public Texto (String t) {
		text = t;
	}
	
	public int contarEspaciosBlancos () {
		int contador = 0;
		for(int i = 0 ; i < text.length() ; i++) {
			if( text.charAt(i) == ' ') {
				contador++;
			}
		}
		return contador;
	}

}
