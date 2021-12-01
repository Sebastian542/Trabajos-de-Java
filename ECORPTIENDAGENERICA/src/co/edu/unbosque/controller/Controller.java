package co.edu.unbosque.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;


import co.edu.unbosque.model.*;
import co.edu.unbosque.model.persistence.*;

import co.edu.unbosque.view.View;

public class Controller implements  ActionListener {

	//Atributos que vienen del Modelo (mundo) 
	private Mundo bd;
	
	//Atributos que vienen de Vista - GUI
	private View gui;
	
	
	ArrayList<Modulo1DTO> rgsModulo1;
	ArrayList<Modulo2DTO> rgsModulo2;
	ArrayList<Modulo3DTO> rgsModulo3;
	ArrayList<Modulo4DTO> rgsModulo4;
	ArrayList<Modulo5VentasDTO> rgsModulo5;
	ArrayList<Modulo5DetallesDTO> dgsModulo5;
	private Modulo1DAO bcvmd1;
	private Modulo2DAO bcvmd2;
	private Modulo3DAO bcvmd3;
	private Modulo4DAO bcvmd4;
	private Modulo1DTO rgmd1;
	private Modulo2DTO rgmd2;
	private Modulo3DTO rgmd3;
	private Modulo4DTO rgmd4;
	private Modulo5VentasDTO rgmd5;
	private Modulo5VentasDAO bcvmd5;
	private Modulo5DetallesDTO dgmd5;
	private Modulo5DetallesDAO dcvmd5;
	private Modulo5Calculos mc5;
	
	public Controller() {
		
		bd = new Mundo();
		rgsModulo1 = new ArrayList<Modulo1DTO>();
		rgsModulo2 = new ArrayList<Modulo2DTO>();
		rgsModulo3 = new ArrayList<Modulo3DTO>();
		rgsModulo4 = new ArrayList<Modulo4DTO>();
		rgsModulo5 = new ArrayList<Modulo5VentasDTO>();
		dgsModulo5 = new ArrayList<Modulo5DetallesDTO>();
		rgmd1 = new Modulo1DTO(null, null, 0, 0, 0, 0, null, null, null);
		rgmd2 = new Modulo2DTO(null, null, null, 0, null);
		rgmd3 = new Modulo3DTO(null, null, null, null, null, null);
		rgmd4 = new Modulo4DTO(null, null, null, 0, 0);
		rgmd5 = new Modulo5VentasDTO(null, null, 0, 0, 0, 0);
		dgmd5 = new Modulo5DetallesDTO(null, 0, 0, 0, null);
		bcvmd1 = new Modulo1DAO();
		bcvmd2 = new Modulo2DAO();
		bcvmd3 = new Modulo3DAO();
		bcvmd4 = new Modulo4DAO();
		bcvmd5 = new Modulo5VentasDAO();
		dcvmd5 = new Modulo5DetallesDAO();
		mc5 = new Modulo5Calculos();
		gui = new View(this);
		gui.setVisible(true);
		
	}
	
	@SuppressWarnings("unlikely-arg-type")
	public void actionPerformed(ActionEvent evento) {

		String aux1,aux2,aux7,aux8,aux9,aux10,aux15,aux16,aux18 = "";
		String ax1,ax2,ax3,ax4,ax5,ax6,ax7,ax8,ax9,ax10,ax11="";
		String a1,a2,a3 = "";
		int aux3,aux4,aux11 = 0;
        double aux5,aux6,aux12,aux13,aux14,aux24,aux34,aux44= 0;
        double c1,c2,c3,c4,c5 = 0;

//      MODULO 1
		if(evento.getActionCommand().equals(gui.getM1().ESCRIBIR)) {
			aux8 = gui.getM1().getNombre_de_la_tienda1().getText();
			rgmd1.setNombre_de_la_tienda(aux8);
			aux9 = gui.getM1().getTipo_de_comercio1().getText();
			rgmd1.setTipo_de_comercio(aux9);
			aux3 = Integer.parseInt(gui.getM1().getNIT_de_la_tienda1().getText());
			rgmd1.setNIT_de_la_tienda(aux3);
			aux4 = Integer.parseInt(gui.getM1().getUbicacion1().getText());
			rgmd1.setUbicacion(aux4);
			aux5 = Double.parseDouble(gui.getM1().getValor_IVA1().getText());
			rgmd1.setValor_IVA(aux5);
			aux6 = Double.parseDouble(gui.getM1().getTasa_de_interes1().getText());
			rgmd1.setTasa_de_interes(aux6);
			aux10 = gui.getM1().getNombre_del_banco1().getText();
			rgmd1.setNombre_del_banco(aux10);
			aux15 = gui.getM1().getNumero_de_cuenta1().getText();
			rgmd1.setNumero_de_cuenta(aux15);
			aux16 =gui.getM1().getNombre_del_gerente1().getText();
			rgmd1.setNombre_del_gerente(aux16);
			
			bd.getMd1().escribirArchivoPropiedades(rgsModulo1);
			bcvmd1.agregarTienda(rgmd1);
			System.out.println(rgmd1);

			
		}
//      MODULO 2	
		
		if(evento.getActionCommand().equals(gui.getPl().MOD2)) {
			gui.getPl().setVisible(false);
			gui.setSize(400,300);
			gui.getM2().setVisible(true);
		}
		if(evento.getActionCommand().equals(gui.getM2().ESCRIBIR2)) {
			aux18 = gui.getM2().getCedula().getText();
			rgmd2.setCedula(aux18);
			aux2 = gui.getM2().getNombre().getText();
			rgmd2.setNombre(aux2);
			aux1 = gui.getM2().getDireccion().getText();
			rgmd2.setDireccion(aux1);
			aux4 = Integer.parseInt(gui.getM2().getTelefono().getText());
			rgmd2.setTelefono(aux4);
			aux7 = gui.getM2().getCorreo().getText();
			rgmd2.setCorreo(aux7);
			
			bd.getMd2().escribirArchivoModulo2(rgsModulo2);
			bcvmd2.agregarCliente(rgmd2);
			System.out.println(rgmd2);
		}
		
		if(evento.getActionCommand().equals(gui.getM2().VOLVER2)) {
			gui.getPl().setVisible(true);
			gui.setSize(635,200);
			gui.getM2().setVisible(false);
			gui.getM2().getCedula().setText("");
			gui.getM2().getNombre().setText("");
			gui.getM2().getDireccion().setText("");
			gui.getM2().getTelefono().setText("");
			gui.getM2().getCorreo().setText("");
		}
		
//		MODULO 3
		
		if(evento.getActionCommand().equals(gui.getPl().MOD3)) {
			gui.getPl().setVisible(false);
			gui.setSize(635,270);
			gui.getM3().setVisible(true);
		}
		
		if(evento.getActionCommand().equals(gui.getM3().ESCRIBIR3)) {
			ax1 = gui.getM3().getTxtNIT().getText();
			rgmd3.setNIT(ax1);
			ax2 = gui.getM3().getTxtnombre().getText();
			rgmd3.setNombre(ax2);
			ax6 = gui.getM3().getTxtproveedor().getText();
			rgmd3.setProveedor(ax6);
			ax3 = gui.getM3().getTxtdireccion().getText();
			rgmd3.setDireccion(ax3);
			ax4 = gui.getM3().getTxttelefono().getText();
			rgmd3.setTelefono(ax4);
			ax5 = gui.getM3().getTxtciudad().getText();
			rgmd3.setCiudad(ax5);
			
			bd.getMd3().escribirArchivoProveedores(rgsModulo3);
			bcvmd3.agregarProveedor(rgmd3);
			System.out.println(rgmd3);
		}
		
		if(evento.getActionCommand().equals(gui.getM3().VOLVER3)) {
			gui.getPl().setVisible(true);
			gui.setSize(635,200);
			gui.getM3().setVisible(false);
			gui.getM3().getTxtciudad().setText("");
			gui.getM3().getTxtdireccion().setText("");
			gui.getM3().getTxtNIT().setText("");
			gui.getM3().getTxtnombre().setText("");
			gui.getM3().getTxttelefono().setText("");
		}
		
//		MODULO 4
		
		if(evento.getActionCommand().equals(gui.getPl().MOD4)) {
			gui.getPl().setVisible(false);
			gui.setSize(510,200);
			gui.getM4().setVisible(true);
		}
		
		if(evento.getActionCommand().equals(gui.getM4().VOLVER4)) {
			gui.getPl().setVisible(true);
			gui.setSize(635,200);
			gui.getM4().setVisible(false);
			gui.getM4().getCodProducto().setText("");
			gui.getM4().getNomProducto().setText("");
			gui.getM4().getPrCompra().setText("");
			gui.getM4().getPrVenta().setText("");
		}
		
		if(evento.getActionCommand().equals(gui.getM4().ESCRIBIR4)) {
			ax8 = gui.getM4().getCodProducto().getText();
			rgmd4.setCodigoproducto(ax8);
			a1 = gui.getM4().getNomProducto().getText();
			rgmd4.setNombreproducto(a1);
			ax7 = rgmd3.getNIT();
			rgmd4.setNitProveedor(ax7);
			
			aux12 = Double.parseDouble(gui.getM4().getPrCompra().getText());
			rgmd4.setPrecio_Compra(aux12);
			aux13 = Double.parseDouble(gui.getM4().getPrVenta().getText());
			rgmd4.setPrecio_Venta(aux13);
			
			bd.getMd4().escribirArchivoProductos(rgsModulo4);
			bcvmd4.agregarProveedor(rgmd4);
			System.out.println(rgmd4);
		
		}
//		MODULO 5
		
		if(evento.getActionCommand().equals(gui.getPl().MOD5)) {
			gui.getPl().setVisible(false);
			gui.setSize(450,100);
			gui.getM5().setVisible(true);
		}
		
		if(evento.getActionCommand().equals(gui.getM5().VOLVER5)) {
			gui.getPl().setVisible(true);
			gui.setSize(635,200);
			gui.getM5().setVisible(false);
		}
		
		if(evento.getActionCommand().equals(gui.getM5().BUSCAR5)) {
			gui.getPl().setVisible(false);
			ax9 = gui.getM5().getTxtCedula().getText();
			if(ax9.equals(rgmd2.getCedula())) {
				gui.setVisible(false);
				gui.getM5().setVisible(false);
				gui.getMd5().setVisible(true);
				gui.getMd5().getTxtCantidadVen().setEnabled(false);
			}
		}
		if(evento.getActionCommand().equals(gui.getMd5().VOLVER7)) {
			gui.getPl().setVisible(true);
			gui.setVisible(true);
			gui.getM5().setVisible(false);
			gui.getMd5().setVisible(false);
			gui.getMd5().getTxtCantidadVen().setText("");
			gui.getMd5().getTxtCodProd().setText("");
		}
		
		if(evento.getActionCommand().equals(gui.getMd5().CHECK5)) {
			ax10 = gui.getMd5().getTxtCodProd().getText();
			ax11 = rgmd4.getCodigoproducto();
			if(ax10.equals(ax11)) {
				gui.getMd5().getTxtCantidadVen().setEnabled(true);
			}
		}
		
		if(evento.getActionCommand().equals(gui.getMd5().ESCRIBIR5)) {
			a1 = rgmd2.getCedula();
			rgmd5.setCedula(a1);
			a2 = rgmd4.getCodigoproducto();
			dgmd5.setCodigoproducto(a2);
			
			a3 = String.valueOf(Math.random());
			rgmd5.setCodigoventa(a3);
			dgmd5.setCodigoventa(a3);
			
			aux14 = rgmd1.getValor_IVA();
			rgmd5.setValorIVA(aux14);
			aux11 = Integer.parseInt(gui.getMd5().getTxtCantidadVen().getText());
			rgmd5.setCantidadVender(aux11);
			dgmd5.setCantidadVender(aux11);
			
			aux24 = rgmd4.getPrecio_Venta();
			aux34 = rgmd4.getPrecio_Compra();
			
			c2 = mc5.totalProductos(aux24, aux11);
			rgmd5.setValorTOTAL(c2);
			
			aux34 = mc5.calcularIvaTotalVenta(aux14, aux24);
			rgmd5.setValorIVA(aux34);
			
			c1 = rgmd4.getPrecio_Venta();
			
			aux44 = mc5.valorTotalConIvaVenta(c1, aux14, c1);
			rgmd5.setValorIVAtotal(aux44);
			
			bd.getMd5().escribirArchivoVentas(rgsModulo5);
			bd.getMd5().escribirArchivoDetalleVentas(dgsModulo5);
			bcvmd5.agregarVenta(rgmd5);
			dcvmd5.agregarDetallesVentas(dgmd5);
			System.out.println(rgmd5);
			System.out.println(dgmd5);
		}
		if(evento.getActionCommand().equals(gui.getMd5().VOLVER7)) {
			gui.getPl().setVisible(true);
			gui.setSize(635,200);
			gui.getM5().setVisible(false);
			gui.getM5().getTxtCedula().setText("");
			gui.getMd5().getTxtCantidadVen().setText("");
			gui.getMd5().getTxtCodProd().setText("");
		}
		
		if(evento.getActionCommand().equals(gui.getM5().VOLVER5)) {
			gui.getPl().setVisible(true);
			gui.setSize(635,200);
			gui.getM5().setVisible(false);
			gui.getM5().getTxtCedula().setText("");
		}
//		Modulo6
		if(evento.getActionCommand().equals(gui.getPl().MOD6)) {
			gui.getPl().setVisible(false);
			gui.setVisible(false);
			gui.getMd6().setSize(1500,500);
			gui.getMd6().setVisible(true);
			bd.getMd1().leerArchivoPropiedades();
			bd.getMd2().leerArchivoModulo2();
			bd.getMd3().leerArchivoProveedores();
			bd.getMd4().leerArchivoProductos();
			bd.getMd5().leerArchivoVentas();
			bd.getMd5().leerArchivoDetalleVentas();
			gui.mostrarConsultas(rgmd1, rgmd2, rgmd3, rgmd5, dgmd5);
		}
		if(evento.getActionCommand().equals(gui.getMd6().VOLVER9)) {
			gui.getPl().setVisible(true);
			gui.setVisible(true);
			gui.setSize(635,200);
			gui.getMd6().setVisible(false);
			gui.getMd6().getListadoClientes().setText("");
			gui.getMd6().getTotalVentasCliente().setText("");
			gui.getMd6().getDetalleVentasCliente().setText("");
			gui.getMd6().getTotalComprasProveedor().setText("");
			gui.getMd6().getDetalleChequesExpedidos().setText("");
		}
	}
}

