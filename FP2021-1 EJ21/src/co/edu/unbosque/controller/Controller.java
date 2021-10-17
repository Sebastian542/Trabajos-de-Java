package co.edu.unbosque.controller;

import co.edu.unbosque.model.Agenda;
import co.edu.unbosque.view.ViewConsola;
import co.edu.unbosque.view.VistaVentanas;

public class Controller {
	
	private VistaVentanas vista;
	private Agenda agenda;
	
	public Controller() {
		vista = new VistaVentanas();
		agenda = new Agenda ();
		funcionar();
	}
	
	public void funcionar() {
		
		String menu = "..: AGENDA DE CONTACTOS DE VALENTINA :.." + "\n" +
					  "\nQu� deseas hacer ??? :)"	 + "\n" +
				      "    1. Agregar amigo" + "\n" +
					  "    2. Ver listado" + "\n" +
				      "    3. Buscar amigo por nombre" + "\n" +
					  "    4. Modificar amigo" + "\n" +
				      "    5. Eliminar amigo" + "\n" +
					  "    6. Salir" + "\n" + "\n" +
				      "Tu opci�n es: ";
		
		int opcion = vista.leerDatoEntero(menu);
		
		String n = "";
		String c = "";
		long t = 0;
		String rta = "";
		switch (opcion) {
		case 1:
			n = vista.leerDatoString("Ingrese nombre de amigo: ");
			n = n.toUpperCase();
			do {
				c = vista.leerDatoString("Ingrese correo electr�nico de amigo: ");
				if(!c.contains("@") || !c.contains("unbosque.edu.co") ) {
					vista.mostrarInformacionError("ERROR: El correo electr�nico fue mal ingresado");
				}
			}while(!c.contains("@") || !c.contains("unbosque.edu.co"));
			t = vista.leerDatoLong("Ingrese n�mero telef�nico del amigo:");
			if(agenda.insertarContacto(n, c, t)) {
				vista.mostrarInformacion("Contacto insertado correctamente");
			}else {
				vista.mostrarInformacion("Contacto no se insert� correctamente");
			}
			
			break;
		case 2:
			vista.mostrarInformacion("Mis amigos son : \n\n" + agenda.verListaContactos());
			break;
		case 3:
			n = vista.leerDatoString("Ingrese nombre de amigo que quiere ver: ");
			n = n.toUpperCase();
			rta = agenda.buscarAmigoPorNombre(n);
			if(!rta.equals("")) {
				vista.mostrarInformacion("Los datos de mi amigo son:\n\n "+rta);
			}else {
				vista.mostrarInformacion("Contacto no se encuentra en la lista");
			}
			break;
		case 4:
			n = vista.leerDatoString("Ingrese nombre de amigo a modificar: ");
			n = n.toUpperCase();
			int pos = agenda.buscarAmigoNombre(n);
			if( pos != -1) {
				c = vista.leerDatoString("Ingrese correo electr�nico de amigo: ");
				t = vista.leerDatoLong("Ingrese n�mero telef�nico del amigo:");
				agenda.modificarAmigoPorNombre(n, c, t, pos);
				vista.mostrarInformacion("Contacto modificado correctamente");
			}else {
				vista.mostrarInformacion("Contacto no se modific�, ya que no se encuentra en la agenda");
			}
			break;
		case 5:
			n = vista.leerDatoString("Ingrese nombre de amigo a eliminar: ");
			n = n.toUpperCase();
			if( agenda.eliminarAmigo(n) ) {
				vista.mostrarInformacion("Contacto eliminado correctamente");
			}else {
				vista.mostrarInformacion("Contacto no se elimin�, ya que no se encuentra en la agenda");
			}
			break;
		case 6:
			vista.mostrarInformacion("Hasta pronto Valentina :)");
			break;
		default:
			vista.mostrarInformacion("Opci�n inv�lida Valentina");
			break;
		}
		
		if(opcion != 6) {
			funcionar();
		}
		
	}
	
}
