package co.edu.unbosque.model;


import co.edu.unbosque.model.persistence.Modelo2Persistencia;

public class Mundo {
	


	Modelo2Persistencia BD;//se asocia a Mundo para que éste pueda interactuar con la data de Persistencia.

	

	public Mundo() {
		// TODO Auto-generated constructor stub
		BD = new Modelo2Persistencia();
	
	}


	public Modelo2Persistencia getBD() {
		return BD;
	}
	
	public void setBD(Modelo2Persistencia bD) {
		BD = bD;
	}
	

}
