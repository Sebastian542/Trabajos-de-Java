package co.edu.unbosque.model.persistence;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

import co.edu.unbosque.model.Modulo5DetallesDTO;
import co.edu.unbosque.model.Modulo5VentasDTO;

public class Modulo5file  {
	private String ruta1= "./data/ventas.dat";
	private String ruta2= "./data/detalleVentas.dat";
	private File f1;
	private File f2;	
	
	public String escribirArchivoVentas(ArrayList<Modulo5VentasDTO> mgdv5) {
		String mensaje = "Transaccion Completada";
		f1 = new File(ruta1);
		try {
			ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(ruta1));
			out.writeObject(mgdv5);
			out.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			mensaje = "Ocurrio un error durante la transaccion";
		} catch (IOException e) {
			e.printStackTrace();
			mensaje = "Error de IO";
		}
		return mensaje;
	}
	
	public ArrayList<Modulo5VentasDTO> leerArchivoVentas(){
		ObjectInputStream in;
		ArrayList<Modulo5VentasDTO> mgdv5 = null;
		try {
			in = new ObjectInputStream(new FileInputStream(ruta1));
			mgdv5 = (ArrayList<Modulo5VentasDTO>)in.readObject();
	        in.close();

		} catch (IOException | ClassNotFoundException e) {
			e.printStackTrace();
		}
		return mgdv5;
	}
	
	public String escribirArchivoDetalleVentas(ArrayList<Modulo5DetallesDTO> mgd5) {
		String mensaje = "Transaccion Completada";
		f2 = new File(ruta2);
		try {
			ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(ruta2));
			out.writeObject(mgd5);
			out.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			mensaje = "Ocurrio un error durante la transaccion";
		} catch (IOException e) {
			e.printStackTrace();
			mensaje = "Error de IO";
		}
		return mensaje;
	}
	
	public ArrayList<Modulo5DetallesDTO> leerArchivoDetalleVentas(){
		ObjectInputStream in;
		ArrayList<Modulo5DetallesDTO> mgd5 = null;
		try {
			in = new ObjectInputStream(new FileInputStream(ruta2));
			mgd5 = (ArrayList<Modulo5DetallesDTO>)in.readObject();
	        in.close();

		} catch (IOException | ClassNotFoundException e) {
			e.printStackTrace();
		}
		return mgd5;
	}
}
