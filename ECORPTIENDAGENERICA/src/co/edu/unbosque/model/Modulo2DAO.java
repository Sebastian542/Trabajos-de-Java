package co.edu.unbosque.model;

import java.util.ArrayList;


import co.edu.unbosque.model.persistence.Modelo2Persistencia;
import co.edu.unbosque.view.Modulo2Registro;



public class Modulo2DAO {
	
	private ArrayList<Modulo2DTO> m2DTO;
	private Modelo2Persistencia archivoModelo2;
	
	public Modulo2DAO() {
		//prueba
		m2DTO = new ArrayList<Modulo2DTO>();
		archivoModelo2 = new Modelo2Persistencia();
	}

	
	

	public void agregarCliente(Modulo2DTO cliente) {
		
		
		m2DTO = archivoModelo2.leerArchivoModulo2();
		m2DTO.add(cliente);
	
		archivoModelo2.escribirArchivoModulo2(m2DTO);
	}
	
	public Modelo2Persistencia getArchivoModelo2(Modelo2Persistencia archivoModelo2) {
		
		
		
		return this.archivoModelo2 = archivoModelo2;
	}


	
	

}
