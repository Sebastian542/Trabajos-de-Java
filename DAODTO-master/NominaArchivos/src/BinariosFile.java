import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class BinariosFile {
	
	private String nombreArchivoEmpleado="datos_nomina.dat";
	
	public int escribirArchivoEmpleado(ArrayList<EmpleadoDTO> nomina) {
		try {
			ObjectOutputStream salida = new ObjectOutputStream(new FileOutputStream(nombreArchivoEmpleado));
			salida.writeObject(nomina);
			salida.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			return -1;
		}
		return 0;
	}
	
	public ArrayList<EmpleadoDTO> leerArchivoEmpleado() {
		ArrayList<EmpleadoDTO> nomina = null;
		try {
			ObjectInputStream in = new ObjectInputStream(new FileInputStream(nombreArchivoEmpleado));
			nomina = (ArrayList<EmpleadoDTO>)in.readObject();
			in.close();
		} catch (IOException | ClassNotFoundException e) {
			// TODO Auto-generated catch block
			return null;
		}
		return nomina;
	}

	public String getNombreArchivoEmpleado() {
		return nombreArchivoEmpleado;
	}

	public void setNombreArchivoEmpleado(String nombreArchivoEmpleado) {
		this.nombreArchivoEmpleado = nombreArchivoEmpleado;
	}
	
	

}
