
public class Controller {

	private static EmpleadoDAO m;
	private static View v;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		v = new View();
		m = new EmpleadoDAO();	
		String nom = v.pedirString("Digite Nombre:");
		String cargo = v.pedirString("Digite Cargo:");
		String correo = v.pedirString("Digite Correo:");
		long sueldo = v.pedirLong("Digite Salario:");
		EmpleadoDTO registro = new EmpleadoDTO(nom, cargo, correo, sueldo);
		m.agregarEmpleado(registro);
		v.imprimirNomina(m.getNomina());
		buscarEmpleado();
	}
	
	public static void buscarEmpleado() {
		String correo = v.pedirString("Digite Correo a consultar:");
		EmpleadoDTO registro = m.buscarEmpleado(correo);
		if (registro == null) {
			v.mostrarMensaje("El empleado no existe");
		}
		else {
			v.imprimirEmpleado(registro);
		}	
	}
	
}
