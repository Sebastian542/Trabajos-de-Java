package co.edu.unbosque.model;

public class Fachada {


	private Car c;
	private Helicopter h;
	private SeaPlane s;
	private Superman sp;
	private Bird b;
	private Heroe2 h2;
	private Heroe3 h3;
	
	public Fachada() {
		
		
		c=new Car();
		h=new Helicopter();
		s=new SeaPlane();
		sp=new Superman();
		b=new Bird();
		h2=new Heroe2();
		h3=new Heroe3();
		
		funcionar();
	}
	
	public String funcionar() {
	
		return c.color()+"\n"+b.comer()+"\n"+h.land()+"\n"+sp.comer()+"\n"+h2.comer()+"\n"+h3.comer()+"\n"+c.color();
		
		
	
		
		
		
	}
	
	
}
