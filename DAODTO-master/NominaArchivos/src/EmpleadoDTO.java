import java.io.Serializable;

public class EmpleadoDTO implements Serializable {

	private static final long serialVersionUID = 1L;
	private String nombre;
	private String cargo;
	//Este es el ID
	private String correo;
	private long sueldo;
	
	public EmpleadoDTO(String nombre, String cargo, String correo, long sueldo) {
		this.nombre = nombre;
		this.cargo = cargo;
		this.correo = correo;
		this.sueldo = sueldo;
	}
	
	
	public String getCorreo() {
		return correo;
	}


	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	public long getSueldo() {
		return sueldo;
	}

	public void setSueldo(long sueldo) {
		this.sueldo = sueldo;
	}
	
}
