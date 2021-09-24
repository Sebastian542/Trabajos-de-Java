package co.edu.unbosque.model;
import java.util.Random;
/**
		  * Metodo 
		  *@
		  */
public class Arreglo {

	private double numeros[];

	int t;

	private int[] arreglonumeroal = new int[t];
	
	private int[] arreglonumero = new int[t];

	int a,aux,aux2;
	
	int al,aux2al;

	int picas;

	int fijas;

	
	public Arreglo(int t) {
		
		arreglonumero = new int[t];
	
		arreglonumeroal= new int[t];
		
		
	}
	/**
		  * Metodo 
		  *@
		  */
	
	public String buscarNumeroConRepeticiones(int num) {
		String rta = "";
		int pos = 0;

		for (int i = 0; i < arreglonumeroal.length; i++) {
			if ( num == arreglonumeroal[i]) {
				pos = i;
				rta = rta + pos + " ";
			}
		}

		return rta ;
	}
	
	
	/**
		  * Metodo 
		  *@
		  */
	public String obtenerArregloUsuario() {
		String rta = "";
		for(int i = 0; i < arreglonumero.length ; i++) {
			
		
			rta = rta + "Arreglo[" + i + "] = " + arreglonumero[i] + "\n";
		}
	
		return rta;
	}
	
	/**
		  * Metodo 
		  *@
		  */
	public String obtenerArregloAl() {
		String rta = "";
		for(int i = 0; i < arreglonumeroal.length ; i++) {
			
	
			rta = rta + "Arreglo[" + i + "] = " + arreglonumeroal[i] + "\n";
		}
		
		return rta;
	}
/**
		  * Metodo 
		  *@
		  */
	
	public void asignarValorPosicionUsuario( int numero) {
		
		System.out.println("El valor ingresado por el usuario es : "+numero);

		String numerodig = String.valueOf(numero); 

        String[] digitosep = numerodig.split("");

        for(int i = 0; i < digitosep.length; i++) {
   
        		String aux1=digitosep[i];
        
        		int aux2= Integer.parseInt(aux1);
        
        		System.out.println("Los valores separados son  :"+aux1);

        		arreglonumero[a]=aux2;
        	
        		System.out.println("El valor de la pos "+a+" en el arreglo es : "+arreglonumero[a]);
            
        		a++;

        	
        		}

		}
/**
		  * Metodo 
		  *@
		  */
	
	public int Alprueba() {
		

		
		int aux=0;

		al=	aux= (int)(Math.random()*arreglonumeroal.length+0);;

		
		System.out.println("el valor rand es"+al);
		
		System.out.println("posicion 0 es ____"+arreglonumeroal[al]);
		
		int av;

		av=arreglonumeroal[al];

		System.out.println("posicion 1 es___"+arreglonumeroal[al]);

		System.out.println("------------Los definitivos son-------------");
		
		al=0;

		System.out.println("posicion 0 es ____"+arreglonumeroal[al]);
		
		al=1;

		System.out.println("posicion 1 es___"+arreglonumeroal[al]);
	
		
        return aux;

	}
/**
		  * Metodo 
		  *@
		  */
	public int numAleatorio(int t,int r) {
/**
		  * Metodo 
		  *@
		  */
		if(t==1) {
		
			aux= (int)(Math.random()*9+0);
			
			
			/**
		  * Metodo 
		  *@
		  */
		}else if(t==2) {
			
			aux= (int)( Math.random()*99+10);
			
	
/**
		  * Metodo 
		  *@
		  */
		}	else if(t==3) {

			
			aux= (int)(Math.random()*999+100);
			
			/**
		  * Metodo 
		  *@
		  */
		}else if(t==4) {
			
			
			aux= (int)(Math.random()*9999+1000);
			
			
			/**
		  * Metodo 
		  *@
		  */
		}else if(t==5) {
			
			
			aux= (int)(Math.random()*99999+10000);
			/**
		  * Metodo 
		  *@
		  */
		}else if(t==6) {
			
			
			aux= (int)(Math.random()*999999+100000);
			/**
		  * Metodo 
		  *@
		  */
		}else if(t==7) {
			
			
			aux= (int)(Math.random()*9999999+1000000);
			/**
		  * Metodo 
		  *@
		  */
		}else if(t==8) {
			
			
			aux= (int)(Math.random()*99999999+100000000);
			/**
		  * Metodo 
		  *@
		  */
		}else if(t==9) {
			
			
			aux= (int)(Math.random()*999999999+100000000);
			/**
		  * Metodo 
		  *@
		  */
		}else if(t==10) { 
			
			
			aux= (int)(Math.random()*999999999+1000000000);
			
		}
		/**
		  * Metodo 
		  *@
		  */
		return aux;
	}	
		/**
		  * Metodo 
		  *@
		  */
	public void asignarValorPosicionAl( int aux) {
		/**
		  * Metodo 
		  *@
		  */
		System.out.println("El valor aleatorio generado es  : "+aux);
/**
		  * Metodo 
		  *@
		  */
		String numerodigal = String.valueOf(aux); 
/**
		  * Metodo 
		  *@
		  */
        String[] digitosepal = numerodigal.split("");
/**
		  * Metodo 
		  *@
		  */
        
        for(int i = 0; i < digitosepal.length; i++) {
          /**
		  * Metodo 
		  *@
		  */
        
        	String aux1al=digitosepal[i];
        	/**
		  * Metodo 
		  *@
		  */
        	int aux2al= Integer.parseInt(aux1al);
        	/**
		  * Metodo 
		  *@
		  */
        	System.out.println("Los valores separados son  :"+aux1al);

        	arreglonumeroal[al] =aux2al; 
/**
		  * Metodo 
		  *@
		  */
        	System.out.println("El valor de la pos "+al+" en el arreglo es : "+arreglonumeroal[al]);
        
        	al++;
	         } 

        }   
	/**
		  * Metodo 
		  *@
		  */
	public int fijas() {
		/**
		  * Metodo 
		  *@
		  */
		int fijas = 0;
		
		/**
		  * Metodo 
		  *@
		  */
		for(int x = 0, j = 0; x < arreglonumero.length; x++, j++) {
			if(arreglonumero[x] == arreglonumeroal[j]) {
				
				fijas++;
				
				
				
				}
			
		}
		/**
		  * Metodo 
		  *@
		  */
		return fijas;
	}
	
	
	/**
		  * Metodo 
		  *@
		  */
	public int picas() {
		/**
		  * Metodo 
		  *@
		  */
			int picas=0;
			/**
		  * Metodo 
		  *@
		  */
			for (int i = 0; i<arreglonumeroal.length; i++){
				/**
		  * Metodo 
		  *@
		  */
				for (int j=0; j<arreglonumero.length; j++){
				/**
		  * Metodo 
		  *@
		  */
						if (arreglonumeroal[i] == arreglonumero[j]) {
			
							
							picas++;
						}
					}
				}
			/**
		  * Metodo 
		  *@
		  */
			int pic=fijas-picas;
			/**
		  * Metodo 
		  *@
		  */
			return picas;
			
			}
}
