package model;

import view.View;

public class Juego {
	
	private View gui;
	
	private String[ ] preguntasFaciles = new String[7];
	private String[ ] preguntasMedia = new String[7];
	
	private String [ ] preguntasDificiles= new String[12];
	private String respuestaUsuario;
	
	private int maximo;
	
	private int puntuacion;




	
	public int generarAleatorio() {
		
		return (int) (Math.random() * (maximo- 0) + 0);
	}
	
	
	public Juego() {
		
		gui = new View();
		
		categoriaFacil();
		categoriaMedia();
		categoriaDificiles();
		
		
	}
	
	
	public void iniciarRonda() {
		
		categoriaFacil();
		categoriaMedia();
		categoriaDificiles();
		
		gui.mostrarResultados("La puntuacion es : "+puntuacion);
		
	}
	
	
	
	public String categoriaFacil() {

		maximo=7;
		
		int aleatorio=0;
		
		aleatorio=generarAleatorio();
		
		
		
		if(aleatorio==0) {
			
			  preguntasFaciles[0] = "Cual es la capital de Brasil : \n";
				String [ ] respuestasFaciles0= {"A. Brasilia \n","B. Río de Janeiro \n","C. São Paulo \n","D. Fortaleza "};
				String opciones= preguntasFaciles[0]+respuestasFaciles0[0]+respuestasFaciles0[1]+respuestasFaciles0[2]+respuestasFaciles0[3];
				respuestaUsuario=gui.pedirDato(opciones);
				String b="A";
				
				if(respuestaUsuario.equals(b) ){

					puntuacion=puntuacion+10;	
					
					
				}else {
								
				gui.mostrarResultados("Señor usuario perdio el juego");
				
				System.exit(0);
			
				
				
			
			}
			
			
			
			
		}
			
			
			 
	
		
		   if(aleatorio==1) {
			   
			   
				  preguntasFaciles[1] = "videojuego mas vendido : \n";
					String [ ] respuestasFaciles1= {"A. GTA V \n","B. Minecraft \n","C. FIFA 21 \n","D. God Of War "};
					String opciones= preguntasFaciles[1]+respuestasFaciles1[0]+respuestasFaciles1[1]+respuestasFaciles1[2]+respuestasFaciles1[3];
					respuestaUsuario=gui.pedirDato(opciones);
					String b="A";
					
					if(respuestaUsuario.equals(b) ){

						puntuacion=puntuacion+10;		
					}else {
									
					gui.mostrarResultados("Señor usuario perdio el juego");
					
					System.exit(0);
					
				}
				
			   
			   
		   }
		   
			
			
   if(aleatorio==2) {
	   
	   
	   		preguntasFaciles[2] = "organo mas grande de los humanos: \n";
			String [ ] respuestasFaciles2= {"A. Estomago \n","B. Cerebro \n","C. La piel \n","D. El corazon "};
			String opciones= preguntasFaciles[2]+respuestasFaciles2[0]+respuestasFaciles2[1]+respuestasFaciles2[2]+respuestasFaciles2[3];
			respuestaUsuario=gui.pedirDato(opciones);
			String b="C";
			
			if(respuestaUsuario.equals(b) ){

				puntuacion=puntuacion+10;			
			}else {
							
			gui.mostrarResultados("Señor usuario perdio el juego");
			
			System.exit(0);
			
		}
		
			   
			   
			   
		   }
   
   if(aleatorio==3) {
	   
	   
  		preguntasFaciles[3] = "moneda de reino unido: \n";
		String [ ] respuestasFaciles3= {"A. libra \n","B. Euro \n","C. Yen \n","D. Dolar "};
		String opciones= preguntasFaciles[3]+respuestasFaciles3[0]+respuestasFaciles3[1]+respuestasFaciles3[2]+respuestasFaciles3[3];
		respuestaUsuario=gui.pedirDato(opciones);
		String b="A";
		
		if(respuestaUsuario.equals(b) ){

			puntuacion=puntuacion+10;			
		}else {
						
		gui.mostrarResultados("Señor usuario perdio el juego");
		
		System.exit(0);
		
	}
	
		   
		   
		   
	   }
   
  
   
   
   if(aleatorio==4) {
	   
  		preguntasFaciles[4] = "Cuantas patas tiene una araña : \n";
		String [ ] respuestasFaciles4= {"A. 16 \n","B. 8\n","C. 24 \n","D.4 "};
		String opciones= preguntasFaciles[4]+respuestasFaciles4[0]+respuestasFaciles4[1]+respuestasFaciles4[2]+respuestasFaciles4[3];
		respuestaUsuario=gui.pedirDato(opciones);
		String b="B";
		
		
		if(respuestaUsuario.equals(b) ){
			
			
			puntuacion=puntuacion+10;	
			
			
		}else {
						
		gui.mostrarResultados("Señor usuario perdio el juego");
		
		System.exit(0);
	   
		}
	   
   }
   
   
   
   if(aleatorio==5) {
		preguntasFaciles[5] = "dientes en los humanos : \n";
		String [ ] respuestasFaciles5= {"A. 29 \n","B. 32\n","C. 36 \n","D.34 "};
		
		String opciones= preguntasFaciles[5]+respuestasFaciles5[0]+respuestasFaciles5[1]+respuestasFaciles5[2]+respuestasFaciles5[3];
		respuestaUsuario=gui.pedirDato(opciones);
		String b="B";
		
		
		
		if(respuestaUsuario.equals(b) ){
			
			
			puntuacion=puntuacion+10;	

			
		}else {
						
		gui.mostrarResultados("Señor usuario perdio el juego");
		
		System.exit(0);
	   
		}
	   
   }
		
   
   
   if(aleatorio==6) {
		preguntasFaciles[6] = "Pais mas grande del mundo : \n";
		String [ ] respuestasFaciles6= {"A. China \n","B. Estados Unidos\n","C. Rusia \n","D.Alemania "};
		
		String opciones= preguntasFaciles[6]+respuestasFaciles6[0]+respuestasFaciles6[1]+respuestasFaciles6[2]+respuestasFaciles6[3];
		respuestaUsuario=gui.pedirDato(opciones);
		String b="C";
		
		
		
		if(respuestaUsuario.equals(b) ){
			
			
			puntuacion=puntuacion+10;	
			
			//categoriaFacil();
			
		}else {
						
		gui.mostrarResultados("Señor usuario perdio el juego");
		
		System.exit(0);
	   
		}
	   
   }
		

   
return "";
		
		
	}
         
	
	
	

	
	
	public int categoriaMedia() {


		maximo=7;
		
		int aleatorio=0;
		
		aleatorio=generarAleatorio();
		
		System.out.println(aleatorio);

		if(aleatorio==0) {
			
			  preguntasFaciles[0] = "Color de la esperanza : \n";
				String [ ] respuestasMedia0= {"A. Verde \n","B. Blanco \n","C. Azul \n","D. Rojo "};
				String opciones= preguntasMedia[0]+respuestasMedia0[0]+respuestasMedia0[1]+respuestasMedia0[2]+respuestasMedia0[3];
				respuestaUsuario=gui.pedirDato(opciones);
				String b="A";
				
				if(respuestaUsuario.equals(b) ){

					puntuacion=puntuacion+10;		
				}else {
								
				gui.mostrarResultados("Señor usuario perdio el juego");
				
				System.exit(0);
				
			}
			
			
			
			
			
		}
			
			
			 
	

		   if(aleatorio==1) {
			   
			   
				  preguntasMedia[1] = "Continente mas grande : \n";
					String [ ] respuestaMedia1= {"A. Africa\n","B. Asia \n","C. Europa \n","D. America "};
					String opcion= preguntasMedia[1]+respuestaMedia1[0]+respuestaMedia1[1]+respuestaMedia1[2]+respuestaMedia1[3];
					respuestaUsuario=gui.pedirDato(opcion);
					String b="B";
					
					if(respuestaUsuario.equals(b) ){

						puntuacion=puntuacion+10;		
					}else {
									
					gui.mostrarResultados("Señor usuario perdio el juego");
					
					System.exit(0);
					
				}
				
			   
			   
		   }
		   
			
			
if(aleatorio==2) {
	   
	   
	   		preguntasMedia[2] = "Idioma mas hablado: \n";
			String [ ] respuestaMedia2= {"A. Ingles \n","B. ESpañol \n","C. Portugues \n","Mandarin"};
			String opcion= preguntasMedia[2]+respuestaMedia2[0]+respuestaMedia2[1]+respuestaMedia2[2]+respuestaMedia2[3];
			respuestaUsuario=gui.pedirDato(opcion);
			String b="D";
			
			if(respuestaUsuario.equals(b) ){

				puntuacion=puntuacion+10;		
			}else {
							
			gui.mostrarResultados("Señor usuario perdio el juego");
			
			System.exit(0);
			
		}
		
			   
			   
			   
		   }

if(aleatorio==3) {
	   
	   
		preguntasMedia[3] = "Pais del sol naciente: \n";
		String [ ] respuestaMedia3= {"A. Japon \n","B. China \n","C. Estados Unidos \n","D. Canada "};
		String opcion= preguntasMedia[3]+respuestaMedia3[0]+respuestaMedia3[1]+respuestaMedia3[2]+respuestaMedia3[3];
		respuestaUsuario=gui.pedirDato(opcion);
		String b="A";
		
		if(respuestaUsuario.equals(b) ){

			puntuacion=puntuacion+10;		
		}else {
						
		gui.mostrarResultados("Señor usuario perdio el juego");
		
		System.exit(0);
		
	}
	
		   
		   
		   
	   }




	if(aleatorio==4) {
	   
		preguntasMedia[4] = "General de los nazis : \n";
		String [ ] respuestaMedia4= {"A. Thomas Jefferson \n","B. Alejandro el grande\n","C. Juan Pablo II \n","D.Adolf Hitler "};
		String opcion= preguntasMedia[4]+respuestaMedia4[0]+respuestaMedia4[1]+respuestaMedia4[2]+respuestaMedia4[3];
		respuestaUsuario=gui.pedirDato(opcion);
		String b="D";
		
		
		
		if(respuestaUsuario.equals(b) ){
			
			
			puntuacion=puntuacion+10;	
			
			categoriaMedia();
			
		}else {
						
		gui.mostrarResultados("Señor usuario perdio el juego");
		
		System.exit(0);
	   
		}
	   
}



	if(aleatorio==5) {
		
		preguntasMedia[5] = "autor de la noche estrellada : \n";
		String [ ] respuestaMedia5= {"A. Vincent Van Goagh \n","B. Gabriel Garcia Marquez\n","C. Donald Trump \n","D. Cristobal Colon "};
		
		String opcion= preguntasMedia[5]+respuestaMedia5[0]+respuestaMedia5[1]+respuestaMedia5[2]+respuestaMedia5[3];
		respuestaUsuario=gui.pedirDato(opcion);
		String b="A";
		
		
		
		if(respuestaUsuario.equals(b) ){
			
			
			puntuacion=puntuacion+10;	
			
			//categoriaMedia();
			
		}else {
						
		gui.mostrarResultados("Señor usuario perdio el juego");
		
		System.exit(0);
	   
		}
	   
	}
		


	if(aleatorio==6) {
	
		preguntasMedia[6] = "metal mas caro del mundo: \n";
		String [ ] respuestaMedia6= {"A. Rodio \n","B. Hierro\n","C. Plata \n","D.Cobre "};
		
		String opcion= preguntasMedia[6]+respuestaMedia6[0]+respuestaMedia6[1]+respuestaMedia6[2]+respuestaMedia6[3];
		respuestaUsuario=gui.pedirDato(opcion);
		String b="A";
		
	
		
		if(respuestaUsuario.equals(b) ){
			
			
			puntuacion=puntuacion+10;	
			
			//categoriaMedia();
			
		}else {
						
		gui.mostrarResultados("Señor usuario perdio el juego");
		
		System.exit(0);
	   
		}
	   
}
		
  
return puntuacion;
		

         
	}
         
	
	
	public String categoriaDificiles() {

		maximo=12;
		
		int aleatorio=0;
		
		aleatorio=generarAleatorio();
		
		
		if(aleatorio==0) {
			
			  preguntasDificiles[0] = "porcentaje de agua en la tierra: \n";
				String [ ] respuestaDificiles0= {"A. 80 \n","B. 90 \n","C. 70 \n","D. 60 "};
				String opcion= preguntasDificiles[0]+respuestaDificiles0[0]+respuestaDificiles0[1]+respuestaDificiles0[2]+respuestaDificiles0[3];
				respuestaUsuario=gui.pedirDato(opcion);
				String b="C";
				
				if(respuestaUsuario.equals(b) ){

					puntuacion=10;		
				}else {
								
				gui.mostrarResultados("Señor usuario perdio el juego");
				
				System.exit(0);
				
			}
			
			
			
			
		}
			
			
			 
	
		
		   if(aleatorio==1) {
			   
			   
				  preguntasDificiles[1] = "organo que consume mas energia : \n";
					String [ ] respuestaDificiles1= {"A. Cerebro\n","B. Estomago \n","C. Corazon \n","D. Higado "};
					String opcion= preguntasDificiles[1]+respuestaDificiles1[0]+respuestaDificiles1[1]+respuestaDificiles1[2]+respuestaDificiles1[3];
					respuestaUsuario=gui.pedirDato(opcion);
					String b="A";
					
					if(respuestaUsuario.equals(b) ){

						puntuacion=10;		
					}else {
									
					gui.mostrarResultados("Señor usuario perdio el juego");
					
					System.exit(0);
					
				}
				
			   
			   
		   }
		   
			
			
   if(aleatorio==2) {
	   
	   
	   		preguntasDificiles[2] = "pais con mas islas: \n";
			String [ ] respuestaDificiles2= {"A. Puerto Rico \n","B. Republica Dominicana \n","C. Suecia \n","D. Jamaica "};
			String opcion= preguntasDificiles[2]+respuestaDificiles2[0]+respuestaDificiles2[1]+respuestaDificiles2[2]+respuestaDificiles2[3];
			respuestaUsuario=gui.pedirDato(opcion);
			String b="C";
			
			if(respuestaUsuario.equals(b) ){

				puntuacion=10;		
			}else {
							
			gui.mostrarResultados("Señor usuario perdio el juego");
			
			System.exit(0);
			
		}
		
			   
			   
			   
		   }
   
   if(aleatorio==3) {
	   
	   
  		preguntasDificiles[3] = "cuantas lunas tiene saturno: \n";
		String [ ] respuestaDificiles3= {"A. 82\n","B. 75 \n","C. 92 \n","D. 88 "};
		String opcion= preguntasDificiles[3]+respuestaDificiles3[0]+respuestaDificiles3[1]+respuestaDificiles3[2]+respuestaDificiles3[3];
		respuestaUsuario=gui.pedirDato(opcion);
		String b="A";
		
		if(respuestaUsuario.equals(b) ){

			puntuacion=10;		
		}else {
						
		gui.mostrarResultados("Señor usuario perdio el juego");
		
		System.exit(0);
		
	}
	
		   
		   
		   
	   }
   
  
   
   
   if(aleatorio==4) {
	   
  		preguntasDificiles[4] = "que es un narval : \n";
		String [ ] respuestaDificiles4= {"A. Cateceo \n","B. UN animal\n","C. pais \n","D.Arma "};
		String opcion= preguntasDificiles[4]+respuestaDificiles4[0]+respuestaDificiles4[1]+respuestaDificiles4[2]+respuestaDificiles4[3];
		respuestaUsuario=gui.pedirDato(opcion);
		String b="A";
		
		
		
		if(respuestaUsuario.equals(b) ){
			
			
			puntuacion=puntuacion+10;	
			
			//categoriaDificiles();
			
		}else {
						
		gui.mostrarResultados("Señor usuario perdio el juego");
		
		System.exit(0);
	   
		}
	   
   }
   
   
   
   if(aleatorio==5) {
		preguntasDificiles[5] = "cuantas teclas tiene un piano : \n";
		String [ ] respuestaDificiles5= {"A. 50 \n","B. 88\n","C. 77 \n","D.95 "};
		
		String opcion= preguntasDificiles[5]+respuestaDificiles5[0]+respuestaDificiles5[1]+respuestaDificiles5[2]+respuestaDificiles5[3];
		respuestaUsuario=gui.pedirDato(opcion);
		String b="B";
		
		
		
		if(respuestaUsuario.equals(b) ){
			
		
			puntuacion=puntuacion+10;	
			
			//categoriaDificiles();
			
		}else {
						
		gui.mostrarResultados("Señor usuario perdio el juego");
		
		System.exit(0);
	   
		}
	   
   }
		
   
   
   if(aleatorio==6) {
		preguntasDificiles[6] = "pais de origen del mojito: : \n";
		String [ ] respuestaDificiles6= {"A. Cuba \n","B. Puerto Rico\n","C. España \n","D.Panama "};
		
		String opcion= preguntasDificiles[6]+respuestaDificiles6[0]+respuestaDificiles6[1]+respuestaDificiles6[2]+respuestaDificiles6[3];
		respuestaUsuario=gui.pedirDato(opcion);
		String b="A";
		
		
		
		if(respuestaUsuario.equals(b) ){
			
		
			puntuacion=puntuacion+10;	
			
			//categoriaDificiles();
			
		}else {
						
		gui.mostrarResultados("Señor usuario perdio el juego");
		
		System.exit(0);
	   
		}
	   
   }
		
	
   
   if(aleatorio==7) {
		preguntasDificiles[7] = "que mamifero es capaz de volar : \n";
		String [ ] respuestaDificiles7= {"A. Murcielago \n","B. Elefante\n","C. Gallina\n","D.Pato "};
		
		String opcion= preguntasDificiles[7]+respuestaDificiles7[0]+respuestaDificiles7[1]+respuestaDificiles7[2]+respuestaDificiles7[3];
		respuestaUsuario=gui.pedirDato(opcion);
		String b="A";
		
		
		
		if(respuestaUsuario.equals(b) ){
			
			
			puntuacion=puntuacion+10;	
			
			//categoriaDificiles();
			
		}else {
						
		gui.mostrarResultados("Señor usuario perdio el juego");
		
		System.exit(0);
	   
		}
	   
   }
  
   if(aleatorio==8) {
		preguntasDificiles[8] = "animal mas grande del mundo : \n";
		String [ ] respuestaDificiles8= {"A. Tiburon blanco \n","B. Ballena azul\n","C. Pez espada \n","D.Ballena "};
		
		String opcion= preguntasDificiles[8]+respuestaDificiles8[0]+respuestaDificiles8[1]+respuestaDificiles8[2]+respuestaDificiles8[3];
		respuestaUsuario=gui.pedirDato(opcion);
		String b="B";
		
		
		
		if(respuestaUsuario.equals(b) ){
			
			
			puntuacion=puntuacion+10;	
			
			//categoriaDificiles();
			
		}else {
						
		gui.mostrarResultados("Señor usuario perdio el juego");
		
		System.exit(0);
	   
		}
	   
   }
   
   
   if(aleatorio==9) {
		preguntasDificiles[9] = "mamifero que no puede saltar : \n";
		String [ ] respuestaDificiles9= {"A. Pato\n","B. Perro\n","C. Caballo \n","D.Elefante "};
		
		String opcion= preguntasDificiles[9]+respuestaDificiles9[0]+respuestaDificiles9[1]+respuestaDificiles9[2]+respuestaDificiles9[3];
		respuestaUsuario=gui.pedirDato(opcion);
		String b="D";
		
		
		
		if(respuestaUsuario.equals(b) ){
			
			
			puntuacion=puntuacion+10;	
			
			//categoriaDificiles();
			
		}else {
						
		gui.mostrarResultados("Señor usuario perdio el juego");
		
		System.exit(0);
	   
		}
	   
   }

   
   if(aleatorio==10) {
		preguntasDificiles[10] = "Año  que termina la 2 GM : \n";
		String [ ] respuestaDificiles10= {"A. 1945 \n","B. 1947\n","C. 1943 \n","D.1948 "};
		
		String opcion= preguntasDificiles[10]+respuestaDificiles10[0]+respuestaDificiles10[1]+respuestaDificiles10[2]+respuestaDificiles10[3];
		respuestaUsuario=gui.pedirDato(opcion);
		String b="A";
		
		
		
		if(respuestaUsuario.equals(b) ){
			
			
			puntuacion=puntuacion+10;	
			
			//categoriaDificiles();
			
		}else {
						
		gui.mostrarResultados("Señor usuario perdio el juego");
		
		System.exit(0);
	   
		}
	   
   }
   
   
   if(aleatorio==11) {
		preguntasDificiles[11] = "Hueso más pequeño del cuerpo: \n";
		String [ ] respuestaDificiles11= {"A. Clavicula \n","B. Femur\n","C. Tibia \n","D.Estribo "};
		
		String opcion= preguntasDificiles[11]+respuestaDificiles11[0]+respuestaDificiles11[1]+respuestaDificiles11[2]+respuestaDificiles11[3];
		respuestaUsuario=gui.pedirDato(opcion);
		String b="D";
		
	
		
		if(respuestaUsuario.equals(b) ){
			
			
			puntuacion=puntuacion+10;	
			
			//categoriaDificiles();
			
		}else {
						
		gui.mostrarResultados("Señor usuario perdio el juego");
		
		System.exit(0);
	   
		}
	   
   }
   
return "";
		
		

         
	}






	public String getRespuestaUsuario() {
		return respuestaUsuario;
	}



	public void setRespuestaUsuario(String respuestaUsuario) {
		this.respuestaUsuario = respuestaUsuario;
	}




	

	    
}
