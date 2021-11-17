import java.util.ArrayList;
import java.util.Scanner;

public class View {

	Scanner entrada = new Scanner(System.in);

	public void imprimirNomina(ArrayList<EmpleadoDTO> nomina) {
		for (EmpleadoDTO regNomina : nomina) {
			System.out.println("Nombre:" + regNomina.getNombre());
			System.out.println("Cargo:" + regNomina.getCargo());
			System.out.println("Correo:" + regNomina.getCorreo());
			System.out.println("Sueldo:" + regNomina.getSueldo());
		}
	}

	public void imprimirEmpleado(EmpleadoDTO regNomina) {
		System.out.println("Nombre:" + regNomina.getNombre());
		System.out.println("Cargo:" + regNomina.getCargo());
		System.out.println("Correo:" + regNomina.getCorreo());
		System.out.println("Sueldo:" + regNomina.getSueldo());
	}

	public String pedirString(String mensaje) {
		String texto = "";
		System.out.print(mensaje);
		texto = entrada.nextLine();
		return texto;
	}

	public long pedirLong(String mensaje) {
		long numero = 0;
		System.out.print(mensaje);
		numero = entrada.nextLong();
		return numero;
	}
	
	public void mostrarMensaje(String mensaje) {
		System.out.println(mensaje);
	}
}
