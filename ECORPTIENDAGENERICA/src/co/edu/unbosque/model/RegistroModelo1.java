package co.edu.unbosque.model;

import java.io.Serializable;

public class RegistroModelo1 implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	private String nombre_de_la_tienda;
	private String tipo_de_comercio;
	private int NIT_de_la_tienda;
	private int ubicacion;
	private double valor_IVA;
	private double tasa_de_interes;
	private String nombre_del_banco;
	private String numero_de_cuenta;
	private String nombre_del_gerente;
	
	public RegistroModelo1() {
		this.nombre_de_la_tienda = nombre_de_la_tienda;
		this.tipo_de_comercio = tipo_de_comercio;
		this.NIT_de_la_tienda = NIT_de_la_tienda;
		this.ubicacion = ubicacion;
		this.valor_IVA = valor_IVA;
		this.tasa_de_interes = tasa_de_interes;
		this.nombre_del_banco = nombre_del_banco;
		this.numero_de_cuenta = numero_de_cuenta;
		this.nombre_del_gerente = nombre_del_gerente;
		
	
	}
	
	

}
