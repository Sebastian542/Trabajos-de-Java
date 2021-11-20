import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

//Clase corresponde al Modelo del MVC

public class EmpleadoDAO {

	private ArrayList<EmpleadoDTO> nomina;
	
	private BinariosFile archivoEmpleado;

	public EmpleadoDAO() {
		
		nomina = new ArrayList<EmpleadoDTO>();
		
		archivoEmpleado = new BinariosFile();
	}
	
	public EmpleadoDTO buscarEmpleado(String correo) {
		nomina = archivoEmpleado.leerArchivoEmpleado();
	
		for(EmpleadoDTO empleado : nomina) {
			
			if(empleado.getCorreo().equals(correo)) {
				return empleado;
			}
		}
		return null;
	}
	
	public void agregarEmpleado(EmpleadoDTO empleado){//Operación C - CRUD
		nomina = archivoEmpleado.leerArchivoEmpleado();
		nomina.add(empleado);
		archivoEmpleado.escribirArchivoEmpleado(nomina);
	}

	public ArrayList<EmpleadoDTO> getNomina() {
		return nomina;
	}

	public void setNomina(ArrayList<EmpleadoDTO> nomina) {
		this.nomina = nomina;
	}
	
}




