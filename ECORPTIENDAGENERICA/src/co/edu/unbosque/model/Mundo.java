package co.edu.unbosque.model;

import co.edu.unbosque.model.persistence.*;

public class Mundo {
	

	private Modelo1Persistencia md1;
	private Modelo2Persistencia md2;//se asocia a Mundo para que éste pueda interactuar con la data de Persistencia.
	private Modulo3file md3;
	private Modulo4file md4;
	private Modulo5file md5;
	private Modulo5Calculos mc5;


	public Mundo() {
		// TODO Auto-generated constructor stub
		md1 = new Modelo1Persistencia();
		md2 = new Modelo2Persistencia();
		md3 = new Modulo3file();
		md4 = new Modulo4file();
		md5 = new Modulo5file();
		mc5 = new Modulo5Calculos();
	}

	
	public Modelo1Persistencia getMd1() {
		return md1;
	}


	public void setMd1(Modelo1Persistencia md1) {
		this.md1 = md1;
	}


	public Modulo3file getMd3() {
		return md3;
	}


	public void setMd3(Modulo3file md3) {
		this.md3 = md3;
	}


	public Modulo4file getMd4() {
		return md4;
	}


	public void setMd4(Modulo4file md4) {
		this.md4 = md4;
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
