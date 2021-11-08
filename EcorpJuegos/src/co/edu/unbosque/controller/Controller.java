package co.edu.unbosque.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import co.edu.unbosque.model.*;
import co.edu.unbosque.model.persistence.*;
import co.edu.unbosque.view.View;

public class Controller implements ActionListener{


	private ClaseX m;
	private View gui;
	private Partidas pd;
	
	public Controller() {
		m = new ClaseX();
		pd = new Partidas();
		gui = new View(this);
		gui.setVisible(true);
		
	}

	public void actionPerformed(ActionEvent evento) {
		
	
		if(evento.getActionCommand().equals(gui.getP4().JUGADORES)) {
			gui.getP1().setVisible(true);
			gui.getP4().setVisible(false);
			gui.setVisible(false);
		}

		if(evento.getActionCommand().equals(gui.getP4().JUEGOS)) {
			gui.getP2().setVisible(true);
			gui.getP4().setVisible(false);
		
		}
		
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

		}
		
		if(evento.getActionCommand().equals(gui.getP1().VOLVER)){
			gui.getP1().setVisible(false);
			gui.getP4().setVisible(true);
			gui.setVisible(true);
		}
		
		if(evento.getActionCommand().equals(gui.getP2().VOLVER)){
			gui.getP2().setVisible(false);
			gui.getP4().setVisible(true);
		}
		
		if(evento.getActionCommand().equals(gui.getP3().VOLVER)){
			gui.getP3().setVisible(false);
			gui.getPr3().setVisible(false);
			gui.getPreg3().setVisible(false);
			gui.getP4().setVisible(true);
		}
		String resultado;
		if(evento.getActionCommand().equals(gui.getP3().ESCRIBIR)){
			resultado = pd.getBf().escribirArchivoBinario();
			gui.escribirMensaje(resultado);
			
		}
		
		if(evento.getActionCommand().equals(gui.getP3().ESCRIBIR_REG)){
			gui.escribirMensaje(pd.getBf().escribirRegistro());
		}
		
		if(evento.getActionCommand().equals(gui.getP3().LEER)){
			pd.getBf().leerArchivoBinario();
			gui.mostrarCifras3(
					pd.getBf().getREGISTROS(),
					pd.getBf().getValores(), 
					pd.getBf().getNumeros()
					);
		}
		
		if(evento.getActionCommand().equals(gui.getP3().LEER_REG)){
			pd.getBf().leerRegistro();
			gui.mostrarRegistros3(6,
					pd.getBf().getDatos());
		}
		

		
		/*if (evento.getActionCommand().equals(gui.getPanel2().ESCRIBIR)) {
>>>>>>> branch 'master' of https://github.com/Sebastian542/Trabajos-de-Java
			//String resultado = m.procesarDato(gui.getIngresarDatos().getNombre());
			String resultado1 = m.getY().procesarDatoClaseY(gui.getPanel1());
			
			System.out.println("Almacene esto"+resultado1);
			gui.getPanelResultados().getTxtMonto().setText(resultado1);
		
		}*/
		
		/*
		if (evento.getActionCommand().equals(gui.getIngresarDatos().LEER)) {
			//String resultado = m.procesarDato(gui.getIngresarDatos().getNombre());
			String resultado1 = m.getY().procesarDatoClaseY(gui.getIngresarDatos().getGenero().getText());
			
			System.out.println("Almacene esto"+resultado1);
			gui.getPanelResultados().getTxtMonto().setText(resultado1);
		
		}
		*/
	}
}

