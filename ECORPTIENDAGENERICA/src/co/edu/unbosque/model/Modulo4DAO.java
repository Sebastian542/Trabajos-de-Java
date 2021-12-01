package co.edu.unbosque.model;

import java.util.ArrayList;


import co.edu.unbosque.model.persistence.Modelo2Persistencia;
import co.edu.unbosque.model.persistence.Modulo4file;
import co.edu.unbosque.view.Modulo2Registro;

public class Modulo4DAO {
	
	private ArrayList<Modulo4DTO> m4DTO;
	private Modulo4file m4file;
	
	public Modulo4DAO() {
		m4DTO = new ArrayList<Modulo4DTO>();
		m4file = new Modulo4file();
	}
	public void agregarProveedor(Modulo4DTO m4do) {
		m4DTO = m4file.leerArchivoProductos();
		m4DTO.add(m4do);
		m4file.escribirArchivoProductos(m4DTO);
	}
	public ArrayList<Modulo4DTO> getM4DTO() {
		return m4DTO;
	}
	public void setM4DTO(ArrayList<Modulo4DTO> m4dto) {
		m4DTO = m4dto;
	}
	public Modulo4file getM4file() {
		return m4file;
	}
	public void setM4file(Modulo4file m4file) {
		this.m4file = m4file;
	}
	
}
