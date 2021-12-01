package co.edu.unbosque.model;

import java.util.ArrayList;

import co.edu.unbosque.model.persistence.Modelo1Persistencia;


public class Modulo1DAO {
	private ArrayList<Modulo1DTO> m1dto;
	private Modelo1Persistencia p1File;
	
	public Modulo1DAO() {
		m1dto = new ArrayList<Modulo1DTO>();
		p1File = new Modelo1Persistencia();
	}
	
	public void agregarTienda(Modulo1DTO m1do) {
		m1dto = p1File.leerArchivoPropiedades();
		m1dto.add(m1do);
		p1File.escribirArchivoPropiedades(m1dto);
	}

	public ArrayList<Modulo1DTO> getM1dto() {
		return m1dto;
	}

	public void setM1dto(ArrayList<Modulo1DTO> m1dto) {
		this.m1dto = m1dto;
	}
	
}