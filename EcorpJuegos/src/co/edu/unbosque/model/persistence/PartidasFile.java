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

public class PartidasFile {
	private String ruta = "./data/partidas.dat";
	private String rutaReg = "./data/regpartida.dat";

	private int REGISTROS = 10;
	private File f; 
	private FileOutputStream fos;     
	private DataOutputStream dos;
	private FileInputStream fis;     
	private DataInputStream dis;

	private double numeros[];
	private int valores[];
	private RegPartidas reg;
	private RegPartidas[] datos;
	

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

	public PartidasFile() {
		// TODO Auto-generated constructor stub
		numeros = new double[10];
		valores = new int[10];
		datos = new RegPartidas[6];
	}

	public String escribirArchivoBinario() {
		String mensaje="Archivo Generado Exitosamente!";
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
		String mensaje = "Registro de la Partida";
		RegPartidas partida[] = new RegPartidas[6];
		partida[0] = new RegPartidas("test0","Ronda0", "Jugador1", "Final0", 1,1);
		partida[1] = new RegPartidas("test1","Ronda1", "Jugador2","SemiFinal0", 2,2);
		partida[2] = new RegPartidas("test2","Ronda2","Puntaje1", "Final1", 3,3);
		partida[3] = new RegPartidas("test3","Ronda3", "Puntaje2", "SemiFinal1", 4,4);
		partida[4] = new RegPartidas("test4","Ronda4", "Juego", "Final2", 5,5);
		partida[5] = new RegPartidas("test5","Ronda5", "Tipo de Partida", "SemiFinal2", 6,6);

		try {
			ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(rutaReg));
			out.writeObject(partida);
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
	        datos = (RegPartidas[])in.readObject();
	        in.close();
	        for (int i = 0; i < datos.length; i++) {
	        	System.out.println(datos[i].getJugador1());
	        	System.out.println(datos[i].getJugador2());
	        	System.out.println(datos[i].getPuntaje1());
	        	System.out.println(datos[i].getPuntaje2());
	        	System.out.println(datos[i].getTipoPartida());
	        	System.out.println(datos[i].getJuego());
	        }

		} catch (IOException | ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public RegPartidas[] getDatos() {
		return datos;
	}

	public void setDatos(RegPartidas[] datos) {
		this.datos = datos;
	}
	
	public double[] getNumeros() {
		return numeros;
	}

	public void setNumeros(double[] numeros) {
		this.numeros = numeros;
	}

}
