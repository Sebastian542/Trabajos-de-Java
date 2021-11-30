package co.edu.unbosque.model.persistence;

import java.io.DataInputStream;




import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Random;

import co.edu.unbosque.view.ReportePDF;

// Este esta perfecto :) ..
public class ReportePDFPersistencia {
	
	private String ruta = "C:\\data\\prueba.out";
	private String rutaReg = "C:\\data\\registro.out";

	private int REGISTROS = 10;
	private File f; 
	private FileOutputStream fos;     
	private DataOutputStream dos;
	private FileInputStream fis;     
	private DataInputStream dis;
	private int valores[];
	private ReportePDF reg;
	private ReportePDFPersistencia[] datos;
	
	public int getREGISTROS() {
		return REGISTROS;
		
	}

	public void setREGISTROS(int REGISTROS) {
		REGISTROS = REGISTROS;
		
	}
	
	public int[] getValores() {
		return valores;
		
	}

	public void setValores(int[] valores) {
		this.valores = valores;
		
	}
	
	public ReportePDFPersistencia() {
		valores = new int[10];
		datos = new ReportePDFPersistencia[10];
		
	}
	
	public String escribirArchivoBinario() {
		String mensaje="Archivo Generado Exitosamente!";
		f = new File(ruta);
		Random r=new Random(); 
		double d = 18.76353; 
		try{     
			fos = new FileOutputStream(f);     
			dos = new DataOutputStream(fos);     
			for (int i=0;i<REGISTROS;i++){ 
				dos.writeInt(i);
				dos.writeDouble(r.nextDouble());//Nº aleatorio     
			}
			
			dos.close();
			
		} 
		
		catch(FileNotFoundException e){     
			mensaje= "No se encontro el archivo"; 
			
		} 
		
		catch(IOException e){     
			mensaje = "Error al escribir"; 
			
		}
		
		return mensaje;
		
	}
	
	public void leerArchivoBinario() {
		f = new File(ruta);
		try {
			fis = new FileInputStream(f);
			dis = new DataInputStream(fis);
			for (int i=0; i<REGISTROS ; i++){
				//System.out.println(dis.readDouble());
				valores[i] = (int) dis.readDouble();
				valores[i] = dis.readInt();
				
			}
			
			dis.close();
			
		}
		
		catch(IOException e){  
			
			e.printStackTrace(); 
			
		} 
	}
		
		public String escribirRegistro() {
			String mensaje = "Registro de información Ingresada";
			ReportePDF staff[] = new ReportePDF[3];
			staff[0] = new ReportePDF();
			staff[1] = new ReportePDF();
			staff[2] = new ReportePDF();
			
			try {
				ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(rutaReg));
				out.writeObject(staff);
				out.close();
				
			}
			
			catch (IOException e) {
				e.printStackTrace();
				mensaje = "Error de IO";
				
			}
			
			return mensaje;
			
		}
		
		public void leerRegistro() {
	        ObjectInputStream in;
			try {
				in = new ObjectInputStream(new FileInputStream(rutaReg));
		        datos = (ReportePDFPersistencia[])in.readObject();
		        in.close();
		        for (int i = 0; i < datos.length; i++) {
		            System.out.println(datos[i].ReportePDF());
		            System.out.println(datos[i].ReportePDF());
		            System.out.println(datos[i].ReportePDF());
		        }

			} catch (IOException | ClassNotFoundException e) {
				
				e.printStackTrace();
				
			}
			
		}

		private char[] ReportePDF() {
			
			return ReportePDF();
			
		}

}




