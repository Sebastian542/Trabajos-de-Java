package co.edu.unbosque.model;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

public class Conjuntos {
	
	
	private ArrayList<Numero>numeroA;
	private ArrayList<Numero>numeroB;
	
	
	public Conjuntos () {
		numeroA = new ArrayList<Numero>();
		numeroB = new ArrayList<Numero>();
	}
	
	
	public void insertarNumeroA(int n ) {
			
			numeroA.add(new Numero ( n ));
	
	}
	
	public String verListaNumeros() {
		String rta = "";
		for (Numero numeroA : numeroA) {
			rta += numeroA.obtenerNumeroA() + "\n";
		}
		return rta;
	}
	
	
	public void insertarNumeroB(int n ) {
		
		numeroA.add(new Numero ( n ));

	}

	public String verListaNumerosB() {
	String rta = "";
	for (Numero numeroB : numeroB) {
		rta += numeroB.obtenerNumeroB() + "\n";
	}
	return rta;
	}
	
	
	


	public ArrayList<Numero> getNumeroA() {
		return numeroA;
	}


	public void setNumeroA(ArrayList<Numero> numeroA) {
		this.numeroA = numeroA;
	}


	public ArrayList<Numero> getNumeroB() {
		return numeroB;
	}


	public void setNumeroB(ArrayList<Numero> numeroB) {
		this.numeroB = numeroB;
	}


	public void conjuntoNumerico() {
		
		Collection<Numero> similar = new HashSet<Numero>();
		Collection<Numero> different = new HashSet<Numero>(); 
		different.addAll( numeroA);
		different.addAll( numeroB ); 
		similar.retainAll( numeroB );
		different.removeAll( similar ); 
		
		System.out.println(different.addAll( numeroA)); 
		System.out.println(different.addAll( numeroB)); 
		System.out.println("Imprimo similar"+similar );
		
		System.out.printf("los resultados son",similar, different);


        }
		
		
		
	
	
	
	public void conjuntoPalabras() {
		
		
	}

}
