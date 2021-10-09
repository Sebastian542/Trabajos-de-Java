package co.edu.unbosque.model;

public class Bird extends Animal implements Flyer {

	
	public String takeOff() {

		return "Soy ave y despego";
	
	}
	
	public String buildNest() {
		
		return "Soy ave y tengo un nido";

		
	}
	
	public String layEggs() {
		
		return 	"Soy ave y pongo huevos";
		
	}
	
	
	
	public String comer() {

		return "Soy ave y como";
	}


	public String land() {
		
		return "Soy ave y vivo en la tierra";
	}


	public String fly() {
		
		return "Soy ave y puedo volar";
	}

}
