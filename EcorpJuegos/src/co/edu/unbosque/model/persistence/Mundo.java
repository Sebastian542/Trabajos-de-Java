package co.edu.unbosque.model.persistence;



public class Mundo {
	
	PersistenciaPanel2 BD;//se asocia a Mundo para que éste pueda interactuar con la data de Persistencia.

	public Mundo() {
		// TODO Auto-generated constructor stub
		BD = new PersistenciaPanel2();
	}

	public PersistenciaPanel2 getBD() {
		return BD;
	}

	public void setBD(PersistenciaPanel2 bD) {
		BD = bD;
	}

}
