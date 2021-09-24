package co.edu.unbosque.view;

import javax.swing.JOptionPane;

public class VistaConsola {

	private int select;

	public VistaConsola () {
		select =-1;
	}

	public String leerDato(String instruccion) {
		String respuesta ="";
		respuesta = JOptionPane.showInputDialog(instruccion);
		return respuesta;
	}

	public void mostrarMensaje(String mensaje) {
		JOptionPane.showMessageDialog(null, mensaje);
	}	

	public int leerDatoMenu() {
		int respuesta =0;
		String mensaje = JOptionPane.showInputDialog("Ingrese lo que desee hacer:"
		
				+"\n1. Ver la lista"
				
				+"\n2. Jugador vs Jugador"
				
				+"\n3. Jugador vs máquina"
				
				
				+"\n0. Salir");
		
		respuesta = Integer.parseInt(mensaje);

		return respuesta;
	}

	public int getSelect() {
		return select;
	}

	public void setSelect(int select) {
		this.select = select;
	}

	


}

