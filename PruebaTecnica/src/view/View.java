package view;

import javax.swing.JOptionPane;

public class View {
	
	public void mostrarResultados(String dato) {
		JOptionPane.showMessageDialog(null, dato);
	}
	
	public String pedirDato(String mensaje) {
		String dato = "";
		dato = JOptionPane.showInputDialog(mensaje);
		return dato;
	}
	
	public String pedirString() {
		String dato = "";
		dato = JOptionPane.showInputDialog(null);
		return dato;
	}
	
	
	public int pedirDatoEntero() {
		int numero = 0;
		numero = Integer.parseInt(JOptionPane.showInputDialog(null,"Entre Nùmero:"));
		return numero;
	}


}
