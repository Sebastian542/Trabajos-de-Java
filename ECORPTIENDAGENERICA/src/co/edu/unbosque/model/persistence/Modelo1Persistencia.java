package co.edu.unbosque.model.persistence;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

import co.edu.unbosque.model.Modulo1DTO;

public class Modelo1Persistencia {
	private String ruta = "./Data/config.properties";
	private File f;
	
	public String escribirArchivoPropiedades(ArrayList<Modulo1DTO> rgm1){
		String mensaje="Archivo Generado Exitosamente!";
		f = new File(ruta);
		try {
			ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(ruta));
			out.writeObject(rgm1);
			out.close();
		}catch(IOException e) {
			e.printStackTrace();
			mensaje="Error IO";
		}
		return mensaje;
	}
	
	public ArrayList<Modulo1DTO> leerArchivoPropiedades() {
		ObjectInputStream in;
		ArrayList<Modulo1DTO> rgm1 = null;
		try {
			in = new ObjectInputStream(new FileInputStream(ruta));
			rgm1 = (ArrayList<Modulo1DTO>)in.readObject();
	        in.close();

		} catch (IOException | ClassNotFoundException e) {
			e.printStackTrace();
		}
		return rgm1;
	}
	
}