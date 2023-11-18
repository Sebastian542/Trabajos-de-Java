package co.edu.unbosque.view;

import javax.swing.JOptionPane;

public class ViewVentanas {
	
	public ViewVentanas() {
		
	}
	
	public int leerDato(String mensaje) {
		String aux = JOptionPane.showInputDialog(mensaje);
		int dato = Integer.parseInt(aux);
		return dato;
	}
	
	public void mostrarInformacion(String mensaje) {
		JOptionPane.showMessageDialog(null, mensaje);
	}

}
