package co.edu.unbosque.model;


public class Mundo {
	
	private JuegosFile GF;//se asocia a Mundo para que �ste pueda interactuar con la data de Persistencia.
	private PartidasFile PF;
	private JugadorFile JF;
	
	

	public Mundo() {
		// TODO Auto-generated constructor stub
		GF = new JuegosFile();
	
	}
	
	public JuegosFile getGF() {
		return GF;
	}

	public void setGF(JuegosFile gF) {
		GF = gF;
	}

	public PartidasFile getPF() {
		return PF;
	}

	public void setPF(PartidasFile pF) {
		PF = pF;
	}

	public JugadorFile getJF() {
		return JF;
	}

	public void setJF(JugadorFile jF) {
		JF = jF;
	}
	
	

}
