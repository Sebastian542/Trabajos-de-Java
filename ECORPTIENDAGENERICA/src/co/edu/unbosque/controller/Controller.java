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
	
	public Controller() {
		bd = new Mundo();
		rgsModulo2 = new ArrayList<Modulo2DTO>();
		rgmd2 = new Modulo2DTO(0, null, null, 0, null);
		rgmd5 = new Modulo5VentasDTO(null, null, 0);
		bcvmd5 = new Modulo5VentasDAO();
		gui = new View(this);
		gui.setVisible(true);
		
	}
	
	public void actionPerformed(ActionEvent evento) {
		String aux1 = "";
		String aux2 = "";
		String aux7 = "";
		String aux8 = "";
		String aux9 = "";
		String aux10 = "";
		int aux3 = 0;
		int aux4 = 0;
		int aux11 = 0;
		double aux5 = 0;
		double aux6 = 0;
		double aux12 = 0;
		double aux13 = 0;
		double aux14 = 0;
		
		if(evento.getActionCommand().equals(gui.getPl().MOD2)) {
			gui.getPl().setVisible(false);
			gui.setSize(400,300);
			gui.getM2().setVisible(true);
		}
		
		if(evento.getActionCommand().equals(gui.getM2().VOLVER2)) {
			gui.getPl().setVisible(true);
			gui.setSize(635,160);
			gui.getM2().setVisible(false);
		}
		
		if(evento.getActionCommand().equals(gui.getPl().MOD3)) {
			gui.getPl().setVisible(false);
			gui.setSize(300,400);
			gui.getM3().setVisible(true);
		}
		
		if(evento.getActionCommand().equals(gui.getPl().MOD4)) {
			gui.getPl().setVisible(false);
			gui.setSize(450,200);
			gui.getM4().setVisible(true);
		}
		
		if(evento.getActionCommand().equals(gui.getPl().MOD5)) {
			gui.getPl().setVisible(false);
			gui.setSize(444,100);
			gui.getM5().setVisible(true);
		}
		
		if(evento.getActionCommand().equals(gui.getPl().MOD6)) {
			gui.getPl().setVisible(false);
			gui.setSize(835,500);
			gui.getM6().setSize(835,500);
			gui.getM6().setVisible(true);
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

