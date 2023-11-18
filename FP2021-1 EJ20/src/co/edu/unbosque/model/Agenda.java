package co.edu.unbosque.model;

public class Agenda {
	
	private int limite_contactos;
	private int cantidad_contactos;
	private Amigo contactos[];
	
	public Agenda (int tam) {
		limite_contactos =  tam;
		cantidad_contactos = 0;
		contactos = new Amigo [ limite_contactos ];
	}
	
	//  C R U D
	
	public int buscarAmigoTelefono( long telefono ) {
		for( int i = 0 ; i < cantidad_contactos ; i++ ) {
			if ( telefono == contactos[i].getTelefono()) {
				return i;
			}
		}
		return -1;
	}
	
	public int buscarAmigoNombre( String nombre ) {
		for( int i = 0 ; i < cantidad_contactos ; i++ ) {
			if ( nombre.equals(contactos[i].getNombre())) {
				return i;
			}
		}
		return -1;
	}
	
	public boolean insertarContacto (String n , String c , long t) {
		int rta = 0 ;
		
		rta = buscarAmigoTelefono(t);
		
		if( rta == -1 ) {
			contactos[cantidad_contactos] = new Amigo ( n , c , t);
			cantidad_contactos ++ ;
			return true;
		}else {
			 return false;
		}
	}
	
	public String verListaContactos() {
		String rta = "";
		for( int i = 0 ; i < cantidad_contactos ; i++ ) {
			rta = rta + contactos[i].obtenerAmigo() + "\n";
		}
		return rta;
	}
	
	public String buscarAmigoPorNombre( String nombre ) {
		String rta = "";
		for( int i = 0 ; i < cantidad_contactos ; i++ ) {
			if ( nombre.equals(contactos[i].getNombre())) {
				rta = rta + contactos[i].obtenerAmigo();
			}
		}
		return rta;
	}
	
	public void modificarAmigoPorNombre( String nombre, String correo, long telefono , int rta ) {
		
		contactos[rta] = new Amigo(nombre, correo, telefono);
		
	}

}
