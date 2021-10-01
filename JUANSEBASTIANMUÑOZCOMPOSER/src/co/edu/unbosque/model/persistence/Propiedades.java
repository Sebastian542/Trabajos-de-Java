package co.edu.unbosque.model.persistence;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class Propiedades {
	
	private Properties prop=new Properties();
	
	private String archivoprop="./DataProp/archivo.properties";
	
	
	public int escribirPropiedades(int numeroEstrofas,int numeroRenglones) {
		
		try {
			
			String numEst= numeroEstrofas+"";
			String numReng= numeroRenglones+"";
			
			prop.setProperty("numeroFrases", numEst);
		  
			prop.setProperty("numeroRenglones", numReng);

			prop.store(new FileOutputStream(archivoprop),null);
			
		}catch(IOException ex) {
			
			return -1;
		}
		
		return 2;
	}
	
	
	public String leerPropiedades() {
		
		String linea="";
		
		try {
			
			prop.load(new FileInputStream(archivoprop));
			
			prop.list(System.out);
			
			linea +="numero de frases"+prop.getProperty("numeroFrases")+"\n";

			//int frases=Integer.parseInt(prop.getProperty("numeroFrases"));
			
			linea +="numero de estrofas"+prop.getProperty("numeroEstrofas")+"\n";
			
			//int estrofas=Integer.parseInt(prop.getProperty("numeroEstrofas"));
			
			//System.out.println(estrofas);
			//System.out.println(frases);
			
		}catch(IOException e) {
			
			return null;
		}
		
		return linea;
	}
	
	

}
