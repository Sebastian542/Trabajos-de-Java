package co.edu.unbosque.model.persistence;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;


public class EjemploFile {

	private String archivodata="";
	
	
	
		
	
	
	
	public int escribirArchivo(String dato) {
		
	
		
		
		
		//Creamos el objeto JFileChooser
		JFileChooser fc=new JFileChooser();
		fc.showSaveDialog(null);

		
		archivodata=fc.getSelectedFile()+".txt";
				
				File f=new File(this.archivodata); //Carga el archivo
	    
		try {

			FileWriter fw=new FileWriter(f); //Crea el flujo hacia f
			
			PrintWriter pw=new PrintWriter(fw); //Permite la escritura en el archivo
			
			pw.println(dato);  //Se escribe el contenido del parametro dato en el archivo
			
			fw.close();
		
		}catch(IOException e ) {
			
			return -1;
			
		}
	
		return 0;
	}
	
	
	public String leerArchivo() {
		
		String linea="";
		
		String cadena="";
		
		
		File f=new File (this.archivodata); //Carga el archivo
		
		System.out.println(f.exists());
		
		try {
			
			FileReader fr=new FileReader(f);  //Crea el flujo desde f
			
			BufferedReader br=new BufferedReader(fr); //Permite la lectura
			
			linea=br.readLine();
			
			while(linea!=null) { //Mientras haya datos por leer en el archivo	
				
				cadena+=linea; //Acumular en cadena lo leido en linea 
				
				linea=br.readLine();  //Leer el valor de la siguiente linea
			}
			
			fr.close();
			
	
		}catch(IOException e){
			
			return null;
		}
		
		return cadena;
	}
	
}
