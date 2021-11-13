

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



public class JuegosFile {
	

	private String ruta = "./data/juegos.dat";
	private String rutaReg = "./data/regjuegos.dat";

	private int REGISTROS = 10;
	private File f; 
	private FileOutputStream fos;     
	private DataOutputStream dos;
	private FileInputStream fis;     
	private DataInputStream dis;
	private double numeros[];
	private int valores[];
	private RegJuegos reg;
	private RegJuegos[] datos;
	

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

	public JuegosFile() {
		// TODO Auto-generated constructor stub
		numeros = new double[10];
		valores = new int[10];
		datos = new RegJuegos[10];
	}

	public String escribirArchivoBinario() {
		String mensaje="Archivo de juegos Generado Exitosamente!";
		f=new File(ruta);
		Random r=new Random(); 
		//double d=18.76353; 
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
		String mensaje = "Registro del panel 2 almacenado";
		RegJuegos juegos[] = new RegJuegos[3];
		juegos[0] = new RegJuegos("Juego 1","");
		juegos[1] = new RegJuegos("Juego 2","");

		try {
			ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(rutaReg));
			out.writeObject(juegos);
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
	        datos = (RegJuegos[])in.readObject();
	        in.close();
	        for (int i = 0; i < datos.length; i++) {
	            System.out.println(datos[i].getTipo());
	            System.out.println(datos[i].getNombre());
	        }

		} catch (IOException | ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public RegJuegos[] getDatos() {
		return datos;
	}

	public void setDatos(RegJuegos[] datos) {
		this.datos = datos;
	}

	public double[] getNumeros() {
		return numeros;
	}

	public void setNumeros(double[] numeros) {
		this.numeros = numeros;
	}
	

}
