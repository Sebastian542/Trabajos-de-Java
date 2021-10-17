package co.edu.unbosque.model;

import java.util.ArrayList;

public class Agenda {
	
	private ArrayList<Amigo> contactos;
	
	public Agenda () {
		contactos = new ArrayList<Amigo>();
	}
	
	//  C R U D
	
	public int buscarAmigoTelefono( long telefono ) {
		for( int i = 0 ; i < contactos.size() ; i++ ) {
			if ( telefono == contactos.get(i).getTelefono()) {
				return i;
			}
		}
		return -1;
	}
	
	public int buscarAmigoNombre( String nombre ) {
		for( int i = 0 ; i < contactos.size() ; i++ ) {
			if ( nombre.equals(contactos.get(i).getNombre())) {
				return i;
			}
		}
		return -1;
	}
	
	public boolean insertarContacto (String n , String c , long t) {
		int rta = 0 ;
		
		rta = buscarAmigoTelefono(t);
		
		if( rta == -1 ) {
			contactos.add(new Amigo ( n , c , t));
			return true;
		}else {
			 return false;
		}
	}
	
	public String verListaContactos() {
		String rta = "";
		for (Amigo amigo : contactos) {
			rta += amigo.obtenerAmigo() + "\n";
		}
		return rta;
	}
	
	public String buscarAmigoPorNombre( String nombre ) {
		String rta = "";
		for( Amigo amigo : contactos) {
			if ( nombre.equals(amigo.getNombre())) {
				rta += amigo.obtenerAmigo();
			}
		}
		return rta;
	}
	
	public void modificarAmigoPorNombre( String nombre, String correo, long telefono , int rta ) {
			contactos.add(rta, new Amigo(nombre, correo, telefono));
	}
	
	public boolean eliminarAmigo(String nombre) {
		int pos_eli = buscarAmigoNombre(nombre);
		if(pos_eli != -1) {
			contactos.remove(pos_eli);
			return true;
		}else {
			return false;
		}
	}

}
