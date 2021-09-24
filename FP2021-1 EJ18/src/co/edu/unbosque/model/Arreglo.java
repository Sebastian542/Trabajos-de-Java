package co.edu.unbosque.model;

public class Arreglo {
	
	private double numeros[];
	
	public Arreglo(int tam) {
		numeros= new double[tam];
	}
	
	public void inicializarArreglo() {
		for(int i = 0; i < numeros.length ; i++) {
			numeros[i] = 0.0;
		}
	}
	
	public double sumaArreglo() {
		double suma = 0.0;
		for(int i = 0; i < numeros.length ; i++) {
			suma = suma + numeros[i];
		}
		return suma;
	}
	
	public double promArreglo() {
		double suma = sumaArreglo();
		double prom = suma / numeros.length;
		return prom;
	}
	
	public int buscarNumeroSinRepeticiones(double num) {
		int pos = -1;
		for (int i = 0; i < numeros.length; i++) {
			if ( num == numeros[i]) {
				pos = i;
				i = numeros.length;
			}
		}
		return pos ;
	}
	
	public String buscarNumeroConRepeticiones(double num) {
		String rta = "";
		int pos = 0;
		for (int i = 0; i < numeros.length; i++) {
			if ( num == numeros[i]) {
				pos = i;
				rta = rta + pos + " ";
			}
		}
		return rta ;
	}
	
	public double maxArreglo() {
		double max = numeros[0];
		for(int i = 1 ; i < numeros.length ; i++) {
			if(numeros[i] > max) {
				max = numeros[i];
			}
		}
		return max;
	}
	
	public double minArreglo() {
		double min = numeros[0];
		for(int i = 1 ; i < numeros.length ; i++) {
			if(numeros[i] < min) {
				min = numeros[i];
			}
		}
		return min;
	}
	
	public String obtenerArreglo() {
		String rta = "";
		for(int i = 0; i < numeros.length ; i++) {
			rta = rta + "Arreglo[" + i + "] = " + numeros[i] + "\n";
		}
		return rta;
	}
	
	public void asignarValorPosicion(int pos, double valor) {
		numeros[pos] = valor;
	}

	public double[] getNumeros() {
		return numeros;
	}

	public void setNumeros(double[] numeros) {
		this.numeros = numeros;
	}
	


}
