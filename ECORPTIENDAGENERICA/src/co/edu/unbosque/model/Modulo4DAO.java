package co.edu.unbosque.model;

import java.util.ArrayList;


import co.edu.unbosque.model.persistence.Modulo4file;



public class Modulo4DAO {
	
	private ArrayList<Modulo4DTO> m4dto;
	private Modulo4file productosFile;
	
	public Modulo4DAO() {
		
		
		m4dto= new ArrayList<Modulo4DTO>();
		 
		productosFile = new Modulo4file();
		
	}
	
	

	public void agregarJuego(Modulo4DTO prorgs) {
		
		 m4dto = productosFile.leerArchivoProductos();
		 m4dto.add( prorgs);
		
		 productosFile.escribirArchivoProveedores(m4dto);
	}



	public Modulo4file getProductosFile() {
		return productosFile;
	}



	public void setProductosFile(Modulo4file productosFile) {
		this.productosFile = productosFile;
	}
	
	


}

