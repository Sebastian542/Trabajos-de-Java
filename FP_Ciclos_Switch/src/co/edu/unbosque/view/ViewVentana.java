package co.edu.unbosque.view;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class ViewVentana {
	
	public ViewVentana() {
		
	}
	
	public void mostrarMensaje(String mensaje, String tipo) {
		if(tipo.equals("informativo")) {
			JOptionPane.showMessageDialog(null, mensaje, "Información", JOptionPane.INFORMATION_MESSAGE);
		}else if(tipo.equals("error")) {
			JOptionPane.showMessageDialog(null, mensaje, "Error", JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public int leerDato(String mensaje) {
		String aux = JOptionPane.showInputDialog(null,mensaje,"Ingreso de dato",JOptionPane.QUESTION_MESSAGE);
		int dato = Integer.parseInt(aux);
		return dato;
	}
}
