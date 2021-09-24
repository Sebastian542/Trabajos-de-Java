package co.edu.unbosque.model;

public class Herencia {
	
	private Heroe heroe;
	
	private Mortales mortal;
	
	private Desterrados desterrado;
	
	public Herencia() {
		
		heroe=new Heroe();
		desterrado=new Desterrados();
		mortal=new Mortales();
	
	}
	
	public String mostrarInformacionHeroe() {
	
		return "Los heroes son :\n "+heroe.Personaje("Kira ")+"\n"+heroe.Personaje(" Astar");	
	}
	
	
	public String mostrarInformacionDesterrado() {
		
		return "El desterrado de nombre :"+desterrado.Personaje();
		
	}
	
	public String mostrarInformacionMortal() {
		
		return "El mortal de nombre :"+mortal.Personaje();
	}
	
	
	
	
}
