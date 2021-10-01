package co.edu.unbosque.view;

import javax.swing.JOptionPane;

public class View {
	
	public void mostrarResultados(String dato) {
		JOptionPane.showMessageDialog(null, dato);
	}
	
	public String pedirDato(String mensaje) {
		String dato = "";
		dato = JOptionPane.showInputDialog(null,mensaje);
		return dato;
	}
	
	public int pedirDatoEntero(String mensaje) {
		int numero = 0;
		numero = Integer.parseInt(JOptionPane.showInputDialog(null,mensaje));
		return numero;
	}
}
