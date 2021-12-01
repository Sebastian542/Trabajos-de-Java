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
	
	public RegistroModelo1(String nombre_de_la_tienda, String tipo_de_comercio, int NIT_de_la_tienda,
			int ubicacion ,double valor_IVA,double tasa_de_interes,
			String nombre_del_banco, String numero_de_cuenta,String nombre_del_gerente){
		
		this.nombre_de_la_tienda=nombre_de_la_tienda;
		this.tipo_de_comercio=tipo_de_comercio;
		this.NIT_de_la_tienda = NIT_de_la_tienda;
		this.ubicacion=ubicacion;
		this.valor_IVA=valor_IVA;
		this.tasa_de_interes=tasa_de_interes;
		this.nombre_del_banco=nombre_del_banco;
		this.numero_de_cuenta=numero_de_cuenta;
		this.numero_de_cuenta=numero_de_cuenta;
		
	}

	public String getNombre_de_la_tienda() {
		return nombre_de_la_tienda;
	}

	public void setNombre_de_la_tienda(String nombre_de_la_tienda) {
		this.nombre_de_la_tienda = nombre_de_la_tienda;
	}

	public String getTipo_de_comercio() {
		return tipo_de_comercio;
	}

	public void setTipo_de_comercio(String tipo_de_comercio) {
		this.tipo_de_comercio = tipo_de_comercio;
	}

	public int getNIT_de_la_tienda() {
		return NIT_de_la_tienda;
	}

	public void setNIT_de_la_tienda(int nIT_de_la_tienda) {
		NIT_de_la_tienda = nIT_de_la_tienda;
	}

	public int getUbicacion() {
		return ubicacion;
	}

	public void setUbicacion(int ubicacion) {
		this.ubicacion = ubicacion;
	}

	public double getValor_IVA() {
		return valor_IVA;
	}

	public void setValor_IVA(double valor_IVA) {
		this.valor_IVA = valor_IVA;
	}

	public double getTasa_de_interes() {
		return tasa_de_interes;
	}

	public void setTasa_de_interes(double tasa_de_interes) {
		this.tasa_de_interes = tasa_de_interes;
	}

	public String getNombre_del_banco() {
		return nombre_del_banco;
	}

	public void setNombre_del_banco(String nombre_del_banco) {
		this.nombre_del_banco = nombre_del_banco;
	}

	public String getNumero_de_cuenta() {
		return numero_de_cuenta;
	}

	public void setNumero_de_cuenta(String numero_de_cuenta) {
		this.numero_de_cuenta = numero_de_cuenta;
	}

	public String getNombre_del_gerente() {
		return nombre_del_gerente;
	}

	public void setNombre_del_gerente(String nombre_del_gerente) {
		this.nombre_del_gerente = nombre_del_gerente;
	}

	@Override
	public String toString() {
		return "Nombre de la tienda:" + nombre_de_la_tienda + "\n tipo_de_comercio:" + tipo_de_comercio
				+ "\n NIT_de_la_tienda=" + NIT_de_la_tienda + "\nubicacion=" + ubicacion + "\n valor_IVA=" + valor_IVA
				+ "\n tasa_de_interes=" + tasa_de_interes + "\n nombre_del_banco=" + nombre_del_banco
				+ "\n numero_de_cuenta=" + numero_de_cuenta + "\n nombre_del_gerente=" + nombre_del_gerente;
	}
	
	

}
