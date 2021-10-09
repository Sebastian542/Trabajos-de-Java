package co.edu.unbosque.model;

public class Airplane extends Vehicle implements Flyer{


	public double tamaño() {
		
		return this.altura=3;
	}
	
	public String takeOff() {
	
		return "El vehiculo de tipo airplane puede despegar";
	}


	public String land() {
		
	
		return "El vehiculo de tipo airplane vuela sobre la aire";
	}


	public String fly() {

		return "El vehiculo de tipo airplane puede volar";
	}
	
	

}
