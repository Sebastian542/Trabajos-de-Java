package co.edu.unbosque.model.persistence;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

import co.edu.unbosque.model.Modulo3DTO;
import co.edu.unbosque.model.Modulo4DTO;

public class Modulo4file {
	private String ruta = "./data/productos.dat";
	private File f;
	
	public String escribirArchivoProductos(ArrayList<Modulo4DTO> m4dt) {
		String mensaje = "Archivo Generado Exitosamente";
		f = new File(ruta);
		try {
			ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(ruta));
			out.writeObject(m4dt);
			out.close();
		}catch(IOException e) {
			e.printStackTrace();
			mensaje="Error";
		}
		return mensaje;
	}
	
	public ArrayList<Modulo4DTO> leerArchivoProductos() {
		ObjectInputStream in;
		ArrayList<Modulo4DTO> m4dt = null;
		try {
			in = new ObjectInputStream(new FileInputStream(ruta));
			m4dt = (ArrayList<Modulo4DTO>)in.readObject();
	        in.close();

		} catch (IOException | ClassNotFoundException e) {
			e.printStackTrace();
		}
		return m4dt;
	}
}
