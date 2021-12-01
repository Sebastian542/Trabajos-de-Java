package co.edu.unbosque.model;



import co.edu.unbosque.model.persistence.*;

public class Mundo {
	


	private Modelo2Persistencia md2;//se asocia a Mundo para que éste pueda interactuar con la data de Persistencia.
	private Modulo5file md5;
	private Modulo5Calculos mc5;


	public Mundo() {
		// TODO Auto-generated constructor stub
		md2 = new Modelo2Persistencia();
		md5 = new Modulo5file();
		mc5 = new Modulo5Calculos();
	}


	public Modelo2Persistencia getMd2() {
		return md2;
	}


	public void setMd2(Modelo2Persistencia md2) {
		this.md2 = md2;
	}

	public Modulo5file getMd5() {
		return md5;
	}



	public void setMd5(Modulo5file md5) {
		this.md5 = md5;
	}


	public Modulo5Calculos getMc5() {
		return mc5;
	}


	public void setMc5(Modulo5Calculos mc5) {
		this.mc5 = mc5;
	}

	
	
	

}
