package co.edu.unbosque.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import co.edu.unbosque.model.*;
import co.edu.unbosque.model.persistence.*;
import co.edu.unbosque.view.View;

public class Controller implements ActionListener{

	private View gui;
	//private Partidas pd;
	private Mundo md;
	
	public Controller() {
		md = new Mundo();
		//pd = new Partidas();
		gui = new View(this);
		gui.setVisible(true);
		
	}

	public void actionPerformed(ActionEvent evento) {
	
		
		
	
		if(evento.getActionCommand().equals(gui.getP4().JUGADORES)) {
			gui.getP1().setVisible(true);
//			gui.getP4().setVisible(false);
//			gui.setVisible(false);
		}

		if(evento.getActionCommand().equals(gui.getP4().JUEGOS)) {
			gui.getP2().setVisible(true);
			gui.getP4().setVisible(false);
		
		}
		
		
		/*
		if(evento.getActionCommand().equals(gui.getP4().PARTIDAS)) {
			gui.getP4().setVisible(false);
			gui.getP3().setVisible(true);
			gui.getP3().getTxtjuego().setText("");
			gui.getP3().getTxtjugador1().setText("");
			gui.getP3().getTxtjugador2().setText("");
			gui.getP3().getTxtpuntaje1().setText("");
			gui.getP3().getTxtpuntaje2().setText("");
			gui.getP3().getTxtTipoPartida().setText("");
			gui.getPr3().setVisible(true);
			gui.getPr3().getTxtMonto().setText("");
			gui.getPr3().getTxtValores().setText("");
			gui.getPreg3().setVisible(true);
			gui.setSize(600,580);
			
		}
		
		*/

		if(evento.getActionCommand().equals(gui.getP1().VOLVER1)){
			gui.getP1().setVisible(false);
			gui.getP4().setVisible(true);
			gui.setVisible(true);
		}
		
		if(evento.getActionCommand().equals(gui.getP2().VOLVER2)){
			gui.getP2().setVisible(false);
			gui.getP4().setVisible(true);

		}
		
		if(evento.getActionCommand().equals(gui.getP3().VOLVER3)){
			gui.getP3().setVisible(false);
			gui.getPr3().setVisible(false);
			gui.getPreg3().setVisible(false);
			gui.getP4().setVisible(true);
			gui.setSize(600,400);
		}
		
		
		
		String resultado;
		
		if(evento.getActionCommand().equals(gui.getP2().ESCRIBIR2)){
			resultado = md.getPF().escribirArchivoBinario();
			//resultado = pd.getBf().escribirArchivoBinario();
			gui.escribirMensaje(resultado);
			
		}
		
		
		if(evento.getActionCommand().equals(gui.getP3().ESCRIBIR3)){
			resultado = md.getPF().escribirArchivoBinario();
			//resultado = pd.getBf().escribirArchivoBinario();
			gui.escribirMensaje(resultado);
			
		}
		
		if(evento.getActionCommand().equals(gui.getP3().ESCRIBIR_REG3)){
			gui.escribirMensaje(md.getPF().escribirRegistro());
			//gui.escribirMensaje(pd.getBf().escribirRegistro());
		}
		
		if(evento.getActionCommand().equals(gui.getP3().LEER3)){
			md.getPF().leerArchivoBinario();
			//pd.getBf().leerArchivoBinario();
			gui.mostrarCifras3(
					md.getPF().getREGISTROS(),
					md.getPF().getValores(), 
					md.getPF().getNumeros()
					);
		}
		
		if(evento.getActionCommand().equals(gui.getP3().LEER_REG3)){
			md.getPF().leerRegistro();
			//pd.getBf().leerRegistro();
			gui.mostrarRegistros3(6,
					md.getPF().getDatos());
		}
		
		/*if(evento.getActionCommand().equals(gui.getP1().LEER1)){//p1
			md.getJF().leerArchivoBinario();
			//pd.getBf().leerArchivoBinario();
			gui.mostrarCifras1(
					md.getJF().getREGISTROS(),
					md.getJF().getValores(), 
					md.getJF().getNumeros()
					);
		}
		
		if(evento.getActionCommand().equals(gui.getP1().ESCRIBIR1)){//p1
			resultado = md.getJF().escribirArchivoBinario();
			//resultado = pd.getBf().escribirArchivoBinario();
			gui.escribirMensaje(resultado);
			
		}
		
		if(evento.getActionCommand().equals(gui.getP2().LEER2)){//p2
			md.getGF().leerArchivoBinario();
			//pd.getBf().leerArchivoBinario();
			gui.mostrarCifras2(
					md.getGF().getREGISTROS(),
					md.getGF().getValores(), 
					md.getGF().getNumeros()
					);
		}
		
		if(evento.getActionCommand().equals(gui.getP2().ESCRIBIR2)){//p2
			resultado = md.getGF().escribirArchivoBinario();
			//resultado = pd.getBf().escribirArchivoBinario();
			gui.escribirMensaje(resultado);
			
		}*/
	}
}

