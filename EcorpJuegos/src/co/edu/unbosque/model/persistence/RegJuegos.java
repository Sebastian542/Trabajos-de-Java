package co.edu.unbosque.model.persistence;

import java.io.Serializable;

public class RegJuegos implements Serializable{
	

		private static final long serialVersionUID = 1L;
		
		private String nombre;
		private String tipo;
		
		public RegJuegos(String nombre, String tipo){
			this.nombre = nombre;
			this.tipo = tipo;

		}
		
		public String getNombre() {
			return nombre;
		}
		
		public void setNombre(String nombre) {
			this.nombre = nombre;
		}

		public String getTipo() {
			return tipo;
		}

		public void setTipo(String tipo) {
			this.tipo = tipo;
		}
		
		
}
