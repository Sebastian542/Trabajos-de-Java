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
	private Modulo2DTO rgmd2;
	private Modulo5VentasDTO rgmd5;
	private Modulo5VentasDAO bcvmd5;
	private Modulo5Calculos mc5;
	
	public Controller() {
		
		bd = new Mundo();
		rgsModulo2 = new ArrayList<Modulo2DTO>();
		rgmd2 = new Modulo2DTO(0, null, null, 0, null);
		rgmd5 = new Modulo5VentasDTO(null, null, 0);
		bcvmd5 = new Modulo5VentasDAO();
		mc5 = new Modulo5Calculos();
		gui = new View(this);
		gui.setVisible(true);
		
	}
	
	public void actionPerformed(ActionEvent evento) {

		String aux1,aux2,aux7,aux8,aux9,aux10 = "";
		int aux3,aux4,aux11 = 0;
        double aux5,aux6,aux12,aux13,aux14 = 0;
	
		
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
		}
		
		if(evento.getActionCommand().equals(gui.getM2().VOLVER2)) {
			gui.getPl().setVisible(true);
			gui.setSize(635,200);
			gui.getM2().setVisible(false);
		}
		
		if(evento.getActionCommand().equals(gui.getPl().MOD3)) {
			gui.getPl().setVisible(false);
			gui.setSize(635,270);
			gui.getM3().setVisible(true);
		}
		
		if(evento.getActionCommand().equals(gui.getM3().VOLVER3)) {
			gui.getPl().setVisible(true);
			gui.setSize(635,200);
			gui.getM3().setVisible(false);
		}
		
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
		
		if(evento.getActionCommand().equals(gui.getPl().MOD5)) {
			gui.getPl().setVisible(false);
			gui.setSize(635,300);
			gui.getM5().setVisible(true);
		}
		
		if(evento.getActionCommand().equals(gui.getM5().VOLVER5)) {
			gui.getPl().setVisible(true);
			gui.setSize(635,200);
			gui.getM5().setVisible(false);
		}
		
		if(evento.getActionCommand().equals(gui.getM5().BUSCAR5)) {
			gui.getM5().setVisible(false);
			gui.getPl().setVisible(false);
			aux1 = gui.getM5().getTxtCedula().getText();
			gui.getMd5().setVisible(true);
		}
		
		if(evento.getActionCommand().equals(gui.getMd5().ESCRIBIR5)) {
			aux5=Double.parseDouble(gui.getMd5().getTxtCantidadVen().getText());
			aux6=Double.parseDouble(gui.getMd5().getTxtCodProd().getText());
			aux12 = mc5.calcularIvaTotalVenta(aux5, aux6);
		}
		
		if(evento.getActionCommand().equals(gui.getM5().VOLVER5)) {
			gui.getPl().setVisible(true);
			gui.setSize(635,200);
			gui.getM5().setVisible(false);
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

