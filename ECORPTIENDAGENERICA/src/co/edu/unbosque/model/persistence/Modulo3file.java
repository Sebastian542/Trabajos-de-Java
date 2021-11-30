package co.edu.unbosque.model.persistence;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import co.edu.unbosque.model.Modulo3DTO;

public class Modulo3file {
	private String ruta = "./data/proveedores.dat";
	private File f;
	
	public String escribirArchivoProveedores(ArrayList<Modulo3DTO> m3dt) {
		String mensaje = "Archivo Generado Exitosamente";
		f = new File(ruta);
		try {
			ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(ruta));
			out.writeObject(m3dt);
			out.close();
		}catch(IOException e) {
			e.printStackTrace();
			mensaje="Error IO";
		}
		return mensaje;
	}
	
	public ArrayList<Modulo3DTO> leerArchivoProveedores() {
		ObjectInputStream in;
		ArrayList<Modulo3DTO> m3dt = null;
		try {
			in = new ObjectInputStream(new FileInputStream(ruta));
			m3dt = (ArrayList<Modulo3DTO>)in.readObject();
	        in.close();

		} catch (IOException | ClassNotFoundException e) {
			e.printStackTrace();
		}
		return m3dt;
	}
}
