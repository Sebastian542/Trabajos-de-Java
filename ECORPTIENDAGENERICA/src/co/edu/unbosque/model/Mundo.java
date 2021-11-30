package co.edu.unbosque.model;



import co.edu.unbosque.model.persistence.Modelo2Persistencia;

public class Mundo {
	


	private Modelo2Persistencia md2;//se asocia a Mundo para que éste pueda interactuar con la data de Persistencia.



	public Mundo() {
		// TODO Auto-generated constructor stub
		md2 = new Modelo2Persistencia();
	
	}



	public Modelo2Persistencia getMd2() {
		return md2;
	}



	public void setMd2(Modelo2Persistencia md2) {
		this.md2 = md2;
	}


	
	

}
