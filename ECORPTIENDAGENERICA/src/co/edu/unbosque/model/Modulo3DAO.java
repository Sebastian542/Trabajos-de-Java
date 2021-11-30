package co.edu.unbosque.model;

import java.util.ArrayList;

import co.edu.unbosque.model.persistence.Modulo3file;

public class Modulo3DAO {
	
	private ArrayList<Modulo3DTO> m3dto;
	private Modulo3file proveedorFile;
	
	public Modulo3DAO() {
		m3dto = new ArrayList<Modulo3DTO>();
		proveedorFile = new Modulo3file();
	}
	
	public void agregarProveedor(Modulo3DTO m3do) {
		m3dto = proveedorFile.leerArchivoProveedores();
		m3dto.add(m3do);
		proveedorFile.escribirArchivoProveedores(m3dto);
	}

	public ArrayList<Modulo3DTO> getM3dto() {
		return m3dto;
	}

	public void setM3dto(ArrayList<Modulo3DTO> m3dto) {
		this.m3dto = m3dto;
	}
	
	
}
