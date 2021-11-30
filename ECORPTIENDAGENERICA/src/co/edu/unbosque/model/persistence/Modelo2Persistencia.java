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
import java.util.ArrayList;
import java.util.Random;


import co.edu.unbosque.model.Modulo2DTO;


public class Modelo2Persistencia {
	
	private String ruta = "\\data\\cliente.dat";//guarda en directorio predeterminado del usuario (i.e. C:\\data\\juegos.dat).

	private String nombreArchivoJuego="cleinte.dat";
	private File f;
			
	
	public String escribirArchivoModulo2(ArrayList<Modulo2DTO> rgmd2) {
		String mensaje="Archivo Generado Exitosamente!";
		f = new File(ruta);
		try {
			ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(ruta));
			out.writeObject(rgmd2);
			out.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			mensaje = "Archivo no encontrado";
		} catch (IOException e) {
			e.printStackTrace();
			mensaje = "Error de IO";
		}
		return mensaje;
	}
	
	public ArrayList<Modulo2DTO> leerArchivoModulo2() {
		f.getAbsoluteFile();
		ObjectInputStream in;
		ArrayList<Modulo2DTO> rgModulo2 = null;
		try {
			in = new ObjectInputStream(new FileInputStream(ruta));
			rgModulo2 = (ArrayList<Modulo2DTO>)in.readObject();
	        in.close();

		} catch (IOException | ClassNotFoundException e) {
			e.printStackTrace();
		}
		return rgModulo2;
	}

	
}
