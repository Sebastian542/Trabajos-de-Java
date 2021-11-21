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


import co.edu.unbosque.model.RegistroModelo2;

public class Modelo2Persistencia {


	private String ruta = "C:\\data\\prueba.out";
	private String rutaReg = "C:\\data\\registro.out";

	private int REGISTROS = 10;
	private File f; 
	private FileOutputStream fos;     
	private DataOutputStream dos;
	private FileInputStream fis;     
	private DataInputStream dis;
	private double numeros[];
	private int valores[];
	private RegistroModelo2 reg;
	private RegistroModelo2[] datos;
	

	public int getREGISTROS() {
		return REGISTROS;
	}

	public void setREGISTROS(int rEGISTROS) {
		REGISTROS = rEGISTROS;
	}

	
	public int[] getValores() {
		return valores;
	}

	public void setValores(int[] valores) {
		this.valores = valores;
	}

	public Modelo2Persistencia() {
		// TODO Auto-generated constructor stub
		numeros = new double[10];
		valores = new int[10];
		datos = new RegistroModelo2[10];
	}

	public String escribirArchivoBinario() {
		String mensaje="Archivo Generado Exitosamente!";
		f=new File(ruta);
		Random r=new Random(); 
		double d=18.76353; 
		try{     
			fos=new FileOutputStream(f);     
			dos=new DataOutputStream(fos);     
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
				numeros[i] = dis.readDouble();
				valores[i] = dis.readInt();
			}
			dis.close();
		}
		catch(IOException e){     
			e.printStackTrace(); 
		} 
	}

	public String escribirRegistro() {
		String mensaje = "Registro de Empleado Ingresado!";
		RegistroModelo2 staff[] = new RegistroModelo2[3];
		staff[0] = new RegistroModelo2();
		staff[1] = new RegistroModelo2();
		staff[2] = new RegistroModelo2();

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
	        datos = (RegistroModelo2[])in.readObject();
	        in.close();
	        for (int i = 0; i < datos.length; i++) {
	            System.out.println(datos[i].getEdad());
	            System.out.println(datos[i].getNombre());
	            System.out.println(datos[i].getSalario());
	        }

		} catch (IOException | ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public RegistroModelo2[] getDatos() {
		return datos;
	}

	public void setDatos(RegistroModelo2[] datos) {
		this.datos = datos;
	}

	public double[] getNumeros() {
		return numeros;
	}

	public void setNumeros(double[] numeros) {
		this.numeros = numeros;
	}
}
