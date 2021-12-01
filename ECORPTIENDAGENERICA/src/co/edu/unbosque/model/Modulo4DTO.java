package co.edu.unbosque.model;

public class Modulo4DTO {
	private static final long serialVersionUID = 1L;
	
	public int cproducto;
	public String nproducto;
	public int nitproveedor;
	public int pcompra;
	public int pventa;
	
	public Modulo4DTO(int cproducto, String nproducto, int nitproveedor, int pcompra, int pventa) {
	
		this.cproducto = cproducto;
		this.nproducto = nproducto;
		this.nitproveedor = nitproveedor;
		this.pcompra = pcompra;
		this.pventa = pventa;
	}

	public int getCproducto() {
		return cproducto;
	}

	public void setCproducto(int cproducto) {
		this.cproducto = cproducto;
	}

	public String getNproducto() {
		return nproducto;
	}

	public void setNproducto(String nproducto) {
		this.nproducto = nproducto;
	}

	public int getNitproveedor() {
		return nitproveedor;
	}

	public void setNitproveedor(int nitproveedor) {
		this.nitproveedor = nitproveedor;
	}

	public int getPcompra() {
		return pcompra;
	}

	public void setPcompra(int pcompra) {
		this.pcompra = pcompra;
	}

	public int getPventa() {
		return pventa;
	}

	public void setPventa(int pventa) {
		this.pventa = pventa;
	}
	
	
	

}
