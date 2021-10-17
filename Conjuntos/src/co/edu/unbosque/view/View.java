package co.edu.unbosque.view;

import javax.swing.JOptionPane;

public class View {
	
	public void mostrarResultados(String dato) {
		JOptionPane.showMessageDialog(null,"Resultado"+dato);
		
		
	}
	
	public int leerDatoEntero(String mensaje) {
		String aux = JOptionPane.showInputDialog(mensaje);
		int dato = Integer.parseInt(aux);
		return dato;
	}
	

	
	public String pedirDato() {
		String dato = "";
		dato = JOptionPane.showInputDialog(null, "Entre Dato:");
		return dato;
	}
	
	public int pedirDatoEntero(String mensaje) {
		int numero = 0;
		numero = Integer.parseInt(JOptionPane.showInputDialog(null,mensaje));
		return numero;
	}
}
