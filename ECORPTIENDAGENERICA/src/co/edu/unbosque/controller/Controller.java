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
	
	
	
	ArrayList<Modulo2DTO> rgsModulo2;
	ArrayList<Modulo1DTO> rgsModulo1;
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
	private Modulo5Calculos mc5;
	
	public Controller() {
		
		bd = new Mundo();
		rgsModulo1 = new ArrayList<Modulo1DTO>();
		rgsModulo2 = new ArrayList<Modulo2DTO>();
		rgmd1 = new Modulo1DTO(null, null, 0, 0, 0, 0, null, null, null);
		rgmd2 = new Modulo2DTO(0, null, null, 0, null);
		rgmd3 = new Modulo3DTO(null, null, null, null, null, null);
		rgmd4 = new Modulo4DTO(null, null, 0, 0);
		rgmd5 = new Modulo5VentasDTO(null, null, 0);
		bcvmd1 = new Modulo1DAO();
		bcvmd2 = new Modulo2DAO();
		bcvmd3 = new Modulo3DAO();
		bcvmd4 = new Modulo4DAO();
		bcvmd5 = new Modulo5VentasDAO();
		mc5 = new Modulo5Calculos();
		gui = new View(this);
		gui.setVisible(true);
		
	}
	
	public void actionPerformed(ActionEvent evento) {

		String aux1,aux2,aux7,aux8,aux9,aux10,aux15,aux16,aux17,aux18 = "";
		int aux3,aux4,aux11 = 0;
        double aux5,aux6,aux12,aux13,aux14 = 0;

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
			aux3 = Integer.parseInt(gui.getM2().getCedula().getText());
			rgmd2.setCedula(aux3);
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
		}
		
//		MODULO 3
		
		if(evento.getActionCommand().equals(gui.getPl().MOD3)) {
			gui.getPl().setVisible(false);
			gui.setSize(635,270);
			gui.getM3().setVisible(true);
		}
		
		if(evento.getActionCommand().equals(gui.getM3().ESCRIBIR3)) {
			aux3 = Integer.parseInt(gui.getM2().getCedula().getText());
			rgmd2.setCedula(aux3);
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
		
		if(evento.getActionCommand().equals(gui.getM3().VOLVER3)) {
			gui.getPl().setVisible(true);
			gui.setSize(635,200);
			gui.getM3().setVisible(false);
		}
		
//		MODULO 4
		
		if(evento.getActionCommand().equals(gui.getPl().MOD4)) {
			gui.getPl().setVisible(false);
			gui.setSize(450,200);
			gui.getM4().setVisible(true);
		}
		
		if(evento.getActionCommand().equals(gui.getM4().VOLVER4)) {
			gui.getPl().setVisible(true);
			gui.setSize(635,200);
			gui.getM4().setVisible(false);
		}
		
		if(evento.getActionCommand().equals(gui.getM4().ESCRIBIR4)) {
			
			
			System.out.println("Click a escribir 4");
		
		}
		
		if(evento.getActionCommand().equals(gui.getM4().LEER4)) {
			
			
			bd.getMd2().leerArchivoModulo2();
			
		
			System.out.println(rgsModulo2);
			System.out.println(rgsModulo2);
			//gui.imprimirJuego(rgsModulo2;
	
		}
//		MODULO 5
		
		if(evento.getActionCommand().equals(gui.getPl().MOD5)) {
			gui.getPl().setVisible(false);
			gui.setSize(450,200);
			gui.getM5().setVisible(true);
		}
		
		if(evento.getActionCommand().equals(gui.getM5().VOLVER5)) {
			gui.getPl().setVisible(true);
			gui.setSize(635,200);
			gui.getM5().setVisible(false);
		}
		
		if(evento.getActionCommand().equals(gui.getM5().BUSCAR5)) {
			if(gui.getM5().getTxtCedula().equals(gui.getM2().getCedula())) {
				gui.getM5().setVisible(false);
				gui.getPl().setVisible(false);
				aux1 = gui.getM5().getTxtCedula().getText();
				gui.getMd5().setVisible(true);
			}
		}
		

		
		if(evento.getActionCommand().equals(gui.getM5().VOLVER5)) {
			gui.getPl().setVisible(true);
			gui.setSize(635,200);
			gui.getM5().setVisible(false);
		}
		
		
		
		
		
		
		
		
		
		
		




		
//		if(evento.getActionCommand().equals(gui.getM1().LEER)) {
//			
//			aux5 = Double.parseDouble(gui.getM1().getValor_IVA1().getText());
//			aux6 = Double.parseDouble(gui.getM4().getTextField_3().getText());
//			bd.getMc5().calcularIvaTotalVenta(aux5, aux6);
//
//			bcvmd5.agregarVenta(rgmd5);
//		}
//		
//		
//		
//		if(evento.getActionCommand().equals(gui.getM1().LEER)) {
//			
//			aux5 = Double.parseDouble(gui.getM1().getValor_IVA1().getText());
//			aux6 = Double.parseDouble(gui.getM4().getTextField_3().getText());
//			bd.getMc5().calcularIvaTotalVenta(aux5, aux6);
//
//			bcvmd5.agregarVenta(rgmd5);
//		}
		
		
//		if(evento.getActionCommand().equals(gui.getM5().BUSCAR5)) {
//			aux5 = Double.parseDouble(gui.getM1().getValor_IVA1().getText());
//			aux6 = Double.parseDouble(gui.getM4().getTextField_3().getText());
//			bd.getMc5().calcularIvaTotalVenta(aux5, aux6);
//
//			bcvmd5.agregarVenta(rgmd5);
//		}


	}
	
//	if(evento.getActionCommand().equals(gui.getM2().ESCRIBIR2)) {
//	System.out.println("Click a escribir");
//	
//	aux1=Integer.parseInt(gui.getM2().getCedula().getText());
//	rgmd2.setCedula(aux1);
//	String aux2=gui.getM2().getNombre().getText();
//	bd.getMd2().escribirArchivoModulo2(rgsModulo2);
//}
//if(evento.getActionCommand().equals(gui.getM2().LEER2)) {
//	
//	bd.getMd2().leerArchivoModulo2();
//	
//	System.out.println(rgsModulo2);
//	System.out.println(rgsModulo2);
//	//gui.imprimirJuego(rgsModulo2;
//
//}
	
	
}

