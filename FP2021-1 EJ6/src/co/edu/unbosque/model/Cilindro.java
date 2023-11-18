package co.edu.unbosque.model;

public class Cilindro {
	
	private double altura;
	private double radio;
	private double volumen;
	
	public Cilindro() {
		altura = 0.0;
		radio = 0.0;
		volumen = 0.0;
	}
	
	public Cilindro(double altura, double radio) {
		this.altura = altura;
		this.radio  = radio;
		volumen = 0.0;
	}
	
	public void calcularVolumen() {
		volumen = Math.PI*radio*radio*altura;
	}
	
	@Override
	public String toString() {
		return "\n.: Figura del Cilindro :.\n"
				+ "Altura 	= " + altura + "\n"
				+ "Radio	=" + radio + "\n"
				+ "Volumen	=" + volumen + "\n" ;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public double getRadio() {
		return radio;
	}

	public void setRadio(double radio) {
		this.radio = radio;
	}

	public double getVolumen() {
		return volumen;
	}

	public void setVolumen(double volumen) {
		this.volumen = volumen;
	}

}
