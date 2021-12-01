package co.edu.unbosque.model;

import java.util.ArrayList;

import co.edu.unbosque.model.persistence.Modulo5file;

public class Modulo5VentasDAO {
	
	private ArrayList<Modulo5VentasDTO> m5dto;
	private Modulo5file mod5;
	
	public Modulo5VentasDAO() {
		m5dto = new ArrayList<Modulo5VentasDTO>();
		mod5 = new Modulo5file();
	}
	
	public Modulo5VentasDTO buscarCliente(String cedula) {
		m5dto = mod5.leerArchivoVentas();
		for(Modulo5VentasDTO m5dt : m5dto) {
			if(m5dt.getCedula().equals(cedula)) {
				return m5dt;
			}
		}
		return null;
	}
	
	public void agregarVenta(Modulo5VentasDTO m5dt) {
		m5dto = mod5.leerArchivoVentas();
		m5dto.add(m5dt);
		mod5.escribirArchivoVentas(m5dto);
	}
	
	public ArrayList<Modulo5VentasDTO> getM5dto() {
		return m5dto;
	}

	public void setM5dto(ArrayList<Modulo5VentasDTO> m5dto) {
		this.m5dto = m5dto;
	}
	
}
