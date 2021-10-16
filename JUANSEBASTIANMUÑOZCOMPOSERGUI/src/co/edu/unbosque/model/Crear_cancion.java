package co.edu.unbosque.model;



import co.edu.unbosque.model.persistence.EjemploFile;
import co.edu.unbosque.model.persistence.Propiedades;


public class Crear_cancion {

	private int numeroEstrofas;
	
	private int numeroRenglones;

	
	



	public int getNumeroEstrofas() {
		return numeroEstrofas;
	}



	public int setNumeroEstrofas(int numeroEstrofas) {
		return this.numeroEstrofas = numeroEstrofas;
	}



	public int getNumeroRenglones() {
		return numeroRenglones;
	}



	public int setNumeroRenglones(int numeroRenglones) {
		return this.numeroRenglones = numeroRenglones;
	}

	

	public String generarEstrofa() {
		
		String renglonCancion = null;

		String[ ] palabras1 = {"Mami ", "Bebe ","Princess ", "Mami "};   
		String[ ] palabras2 = {"yo quiero ", "yo puedo ","yo vengo a ", "voy a "};   
		String[ ] palabras3 = {"enceldete ", "amalte ","ligalte ", "fugalte "};   
		String[ ] palabras4 = {"suave ", "lento ","rapido ", "fuerte "};   
		String[ ] palabras5 = {"hasta que salga el sol  ", "toda la noche ","hasta el amanecer ", "todo el dia "};   
		String[ ] palabras6 = {"sin anestecia ", "complomiso ","feis to feis ", "sin miedo "};
	
		
		
		//String renglon1=palabras1[generarAleatorio()]+palabras2[generarAleatorio()]+palabras3[generarAleatorio()]+palabras4[generarAleatorio()]+palabras5[generarAleatorio()]+palabras6[generarAleatorio()];
		String renglon1,renglon2,renglon3,renglon4;
		
		//String renglon4=palabras1[generarAleatorio()]+palabras2[generarAleatorio()]+palabras3[generarAleatorio()]+palabras4[generarAleatorio()]+palabras5[generarAleatorio()]+palabras6[generarAleatorio()];

		
	
		
		
		if(numeroRenglones==1) {
			
			renglon1=palabras1[generarAleatorio()];
			renglon2=palabras1[generarAleatorio()];
			renglon3=palabras1[generarAleatorio()];
			renglon4=palabras1[generarAleatorio()];
	
			
			renglonCancion=renglon1+"\n"+renglon2+"\n"+renglon3+"\n"+renglon4;
			System.out.println(renglonCancion);
			
		}
		
		
	if(numeroRenglones==2) {
			
			renglon1=palabras1[generarAleatorio()]+palabras2[generarAleatorio()];
			renglon2=palabras1[generarAleatorio()]+palabras2[generarAleatorio()];
			renglon3=palabras1[generarAleatorio()]+palabras2[generarAleatorio()];
			renglon4=palabras1[generarAleatorio()]+palabras2[generarAleatorio()];
			
			renglonCancion=renglon1+"\n"+renglon2+"\n"+renglon3+"\n"+renglon4;
			System.out.println(renglonCancion);
			
		}
		
		if(numeroRenglones==3) {
			
			renglon1=palabras1[generarAleatorio()]+palabras2[generarAleatorio()]+palabras3[generarAleatorio()];
			renglon2=palabras1[generarAleatorio()]+palabras2[generarAleatorio()]+palabras3[generarAleatorio()];
			renglon3=palabras1[generarAleatorio()]+palabras2[generarAleatorio()]+palabras3[generarAleatorio()];
			renglon4=palabras1[generarAleatorio()]+palabras2[generarAleatorio()]+palabras3[generarAleatorio()];
			
			renglonCancion=renglon1+"\n"+renglon2+"\n"+renglon3+"\n"+renglon4;
			//System.out.println(renglonCancion);
			
		}
		
		if(numeroRenglones==4) {
			
			renglon1=palabras1[generarAleatorio()]+palabras2[generarAleatorio()]+palabras3[generarAleatorio()]+palabras4[generarAleatorio()];
			renglon2=palabras2[generarAleatorio()]+palabras2[generarAleatorio()]+palabras3[generarAleatorio()]+palabras4[generarAleatorio()];
			renglon3=palabras3[generarAleatorio()]+palabras2[generarAleatorio()]+palabras3[generarAleatorio()]+palabras4[generarAleatorio()];
			renglon4=palabras4[generarAleatorio()]+palabras2[generarAleatorio()]+palabras3[generarAleatorio()]+palabras4[generarAleatorio()];
			
			renglonCancion=renglon1+"\n"+renglon2+"\n"+renglon3+"\n"+renglon4;
			System.out.println(renglonCancion);
			
		}
		
		if(numeroRenglones==5) {
			
			renglon1=palabras1[generarAleatorio()]+palabras2[generarAleatorio()]+palabras3[generarAleatorio()]+palabras4[generarAleatorio()]+palabras5[generarAleatorio()];
			renglon2=palabras1[generarAleatorio()]+palabras2[generarAleatorio()]+palabras3[generarAleatorio()]+palabras4[generarAleatorio()]+palabras5[generarAleatorio()];
			renglon3=palabras1[generarAleatorio()]+palabras2[generarAleatorio()]+palabras3[generarAleatorio()]+palabras4[generarAleatorio()]+palabras5[generarAleatorio()];
			renglon4=palabras1[generarAleatorio()]+palabras2[generarAleatorio()]+palabras3[generarAleatorio()]+palabras4[generarAleatorio()]+palabras5[generarAleatorio()];
			
			renglonCancion=renglon1+"\n"+renglon2+"\n"+renglon3+"\n"+renglon4;
			System.out.println(renglonCancion);
			
		}
		
		
		
		if(numeroRenglones==6) {
			
			renglon1=palabras1[generarAleatorio()]+palabras2[generarAleatorio()]+palabras3[generarAleatorio()]+palabras4[generarAleatorio()]+palabras5[generarAleatorio()]+palabras6[generarAleatorio()];
			renglon2=palabras1[generarAleatorio()]+palabras2[generarAleatorio()]+palabras3[generarAleatorio()]+palabras4[generarAleatorio()]+palabras5[generarAleatorio()]+palabras6[generarAleatorio()];
			renglon3=palabras1[generarAleatorio()]+palabras2[generarAleatorio()]+palabras3[generarAleatorio()]+palabras4[generarAleatorio()]+palabras5[generarAleatorio()]+palabras6[generarAleatorio()];
			renglon4=palabras1[generarAleatorio()]+palabras2[generarAleatorio()]+palabras3[generarAleatorio()]+palabras4[generarAleatorio()]+palabras5[generarAleatorio()];
			
			renglonCancion=renglon1+"\n"+renglon2+"\n"+renglon3+"\n"+renglon4;
		
		}
		

		return renglonCancion;

	}


	public String generarCancion() {
		
		
		EjemploFile archivo=new EjemploFile();
		
		
		String cancion = null;
	
		
		String estrofa1=generarEstrofa();
		String estrofa2=generarEstrofa();
		String estrofa3=generarEstrofa();
		String estrofa4=generarEstrofa();
		String estrofa5=generarEstrofa();
		String estrofa6=generarEstrofa();
		
		//archivo.escribirArchivo("La estrofa 1 es \n"+estrofa1+"\nLa estrofa 2 es \n"+estrofa2+"\nLa estrofa 3 es \n"+estrofa3);
		
	if(numeroEstrofas==1) {
		
			estrofa1=generarEstrofa();
			
			archivo.escribirArchivo("La estrofa 1 es \n"+estrofa1);
			
			cancion="La estrofa 1 es \n"+estrofa1;
			
		
			
		}
	
	if(numeroEstrofas==2) {
		
		estrofa1=generarEstrofa();
		
		archivo.escribirArchivo("La estrofa 1 es \n"+estrofa1+"\n"+"La estrofa 2 es \n"+estrofa2);
		
		cancion="La estrofa 1 es \n"+estrofa1+"\n"+"La estrofa 2 es \n"+estrofa2;
		
		
	}
	
	if(numeroEstrofas==3) {
		
		estrofa1=generarEstrofa();
		
		estrofa2=generarEstrofa();
		
		estrofa3=generarEstrofa();
		
		archivo.escribirArchivo("La estrofa 1 es \n"+estrofa1+"La estrofa 2 es \n"+estrofa2+"La estrofa 3 es \n"+estrofa3);
		
		cancion="La estrofa 1 es \n"+estrofa1+" \n"+"La estrofa 2 es \n"+estrofa2+" \n"+"La estrofa 3 es \n"+estrofa3;
		
	
		
	}
	
	if(numeroEstrofas==4) {
		
		estrofa1=generarEstrofa();
		
		estrofa2=generarEstrofa();
		
		estrofa3=generarEstrofa();
		
		estrofa4=generarEstrofa();
		
		archivo.escribirArchivo("La estrofa 1 es \n"+estrofa1+"La estrofa 2 es \n"+estrofa2+"La estrofa 3 es \n"+estrofa3+"La estrofa 4 es \n"+estrofa4);
		
		cancion="La estrofa 1 es \n"+estrofa1+" \n"+"La estrofa 2 es \n"+estrofa2+" \n"+" \n"+"La estrofa 3 es \n"+estrofa3+"La estrofa 4 es \n"+estrofa4;
		
	
		
	}
	
	if(numeroEstrofas==5) {
		
		estrofa1=generarEstrofa();
		
		estrofa2=generarEstrofa();
		
		estrofa3=generarEstrofa();
		
		estrofa4=generarEstrofa();
		
		estrofa5=generarEstrofa();
		
		archivo.escribirArchivo("La estrofa 1 es \n"+estrofa1+"La estrofa 2 es \n"+estrofa2+"La estrofa 3 es \n"+estrofa3+"La estrofa 4 es \n"+estrofa4+"La estrofa 5 es \n"+estrofa5);
		
		cancion="La estrofa 1 es \n"+estrofa1+" \n"+"La estrofa 2 es \n"+estrofa2+" \n"+"La estrofa 3 es \n"+estrofa3+" \n"+"La estrofa 4 es \n"+estrofa4+" \n"+"La estrofa 5 es \n"+estrofa5;
		
	
		
	}
	
	if(numeroEstrofas==6) {
		
		estrofa1=generarEstrofa();
		
		estrofa2=generarEstrofa();
		
		estrofa3=generarEstrofa();
		
		estrofa4=generarEstrofa();
		
		estrofa5=generarEstrofa();
		
		estrofa6=generarEstrofa();
		
		archivo.escribirArchivo("La estrofa 1 es \n"+estrofa1+"La estrofa 2 es \n"+estrofa2+"La estrofa 3 es \n"+estrofa3+"La estrofa 4 es \n"+estrofa4+"La estrofa 5 es \n"+estrofa5+"La estrofa 6 es \n"+estrofa6);
		
		cancion="La estrofa 1 es \n"+estrofa1+" \n"+"La estrofa 2 es \n"+estrofa2+" \n"+"La estrofa 3 es \n"+estrofa3+" \n"+"La estrofa 4 es \n"+estrofa4+" \n"+"La estrofa 5 es \n"+estrofa5+" \n"+"La estrofa 6 es \n"+estrofa6;
		
	
		
	}
	
		
		return cancion;		

	}
	
	
	
	

	public int generarAleatorio() {
		
		return (int) (Math.random() * (3- 0) + 0);
	}
	
	
	
	public String gestionarPropiedades() {
		
		Propiedades prop=new Propiedades();
		
		prop.escribirPropiedades(numeroEstrofas, numeroRenglones);

		
		return "Se leyeron estas propiedades"+"\n"+prop.leerPropiedades();
		
	}



	
	
}
