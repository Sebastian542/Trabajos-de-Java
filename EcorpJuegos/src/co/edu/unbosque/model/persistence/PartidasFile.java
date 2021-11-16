package co.edu.unbosque.model.persistence;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class PartidasFile {
	private String ruta = "./data/partidas.dat";
	private File f; 
	
	public String escribirPartida(RegPartidas rgpartida) {
		String mensaje = "Archivo Generado Exitosamente";
		f = new File(ruta);
		try {
			ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(ruta));
			out.writeObject(rgpartida);
			out.close();
		}
		catch (IOException e) {
			e.printStackTrace();
			mensaje = "Error de IO";
		}
		return mensaje;
	}
	
	public RegPartidas leerPartida(RegPartidas rgpartida ) {
		f = new File(ruta);
		ObjectInputStream in;
		try {
			in = new ObjectInputStream(new FileInputStream(ruta));
	        rgpartida = (RegPartidas)in.readObject();
	        in.close();

		} catch (IOException | ClassNotFoundException e) {
			e.printStackTrace();
		}
		return rgpartida;
	}
}