package co.edu.unbosque.model;


public class Texto {
	
	private String text;
	
	public Texto (String t) {
		text = t;
	}


	public int contarEspaciosBlancos () {
		
		int contador=0;
	
		int contador1=0;
		
		int contador2=0;
		
		int contador3=0;
	
		int contador4=0;
		
		int contador5=0;
		
		int contadortil1=0;
		
		int contadortil2=0;
		
		int contadortil3=0;
	
		int contadortil4=0;
		
		int contadortil5=0;
		
		
		int totalvocales=0;
		
		int totalvocalestil=0;
		
		int totalfin=0;
		
		for(int x = 0 ; x < text.length() ; x++) {
		
			if( text.charAt(x) == 'a' || text.charAt(x) == 'A' ) {
			
				contador1++;
			}
			
			if( text.charAt(x) == 'e'|| text.charAt(x) == 'E') {
				
				contador2++;
				
		
			}
			
			if( text.charAt(x) == 'i'|| text.charAt(x) == 'I') {
				
				contador3++;
		
		
			}
			
			if( text.charAt(x) == 'o'|| text.charAt(x) == 'O') {
				
				contador4++;
		
				
			}
			
			
			if( text.charAt(x) == 'u'|| text.charAt(x) == 'U') {
				
				contador5++;
		
				
			}
			
			
			if( text.charAt(x) == '�'|| text.charAt(x) == '�') {
				
				contadortil1++;
			}
			
			if( text.charAt(x) == '�'|| text.charAt(x) == '�') {
				
				contadortil2++;
				
		
			}
			
			if( text.charAt(x) == '�'|| text.charAt(x) == '�') {
				
				contadortil3++;
		
		
			}
			
			if( text.charAt(x) == '�'|| text.charAt(x) == '�') {
				
				contadortil4++;
		
				
			}
			
			
			if( text.charAt(x) == '�'|| text.charAt(x) == '�') {
				
				contadortil5++;
		
				
			}
			
			totalvocalestil=contadortil1+contadortil2+contadortil3+contadortil4+contadortil5;
			
			totalvocales=contador1+contador2+contador3+contador4+contador5;
			
			totalfin=totalvocalestil+totalvocales;
		}
		
		System.out.println("La a est� : \n"+contador1);
		
		System.out.println("La e est� : \n"+contador2);
		
		System.out.println("La i est� : \n"+contador3);
		
		System.out.println("La o est� : \n"+contador4);
		
		System.out.println("La u est� : \n"+contador5);

		
		System.out.println("La � est� : \n"+contadortil1);
		
		System.out.println("La � est� : \n"+contadortil2);
		
		System.out.println("La � est� : \n"+contadortil3);
		
		System.out.println("La � est� : \n"+contadortil4);
		
		System.out.println("La � est� : \n"+contadortil5);
		
		System.out.println("El total de vocales sin tilde es: \n"+totalvocales);
		
		System.out.println("El total de vocales con tilde es: \n"+totalvocalestil);
		
		System.out.println("El total de vocales es: \n"+totalfin);
				
		return contador;
	}

}


