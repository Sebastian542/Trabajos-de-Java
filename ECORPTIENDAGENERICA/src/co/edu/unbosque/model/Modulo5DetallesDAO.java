package co.edu.unbosque.model;

import java.util.ArrayList;

import co.edu.unbosque.model.persistence.Modulo5file;

public class Modulo5DetallesDAO {
	
	private ArrayList<Modulo5DetallesDTO> m5deto;
	private Modulo5file mod5;
	
	public Modulo5DetallesDAO() {
		m5deto = new ArrayList<Modulo5DetallesDTO>();
		mod5 = new Modulo5file();
	}
	
	public void agregarDetallesVentas(Modulo5DetallesDTO m5det) {
		m5deto = mod5.leerArchivoDetalleVentas();
		m5deto.add(m5det);
		mod5.escribirArchivoDetalleVentas(m5deto);
	}

	public ArrayList<Modulo5DetallesDTO> getM5deto() {
		return m5deto;
	}

	public void setM5deto(ArrayList<Modulo5DetallesDTO> m5deto) {
		this.m5deto = m5deto;
	}
	
}
