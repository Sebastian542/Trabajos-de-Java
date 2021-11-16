package co.edu.unbosque.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import co.edu.unbosque.model.*;
import co.edu.unbosque.model.persistence.*;
import co.edu.unbosque.view.View;

public class Controller implements ActionListener{

	private View gui;
	private Mundo md;
	private RegPartidas rgpartida;

	public Controller() {
		md = new Mundo();
		rgpartida = new RegPartidas();
		gui = new View(this);
		gui.setVisible(true);
		
		
	}

	public void actionPerformed(ActionEvent evento) {
		String aux = "";
		String aux2 = "";
		String aux3 = "";
		String aux4 = "";
//		String aux5 = "";
//		String aux6 = "";
		double aux7 = 0.0;
		double aux8 = 0.0;
//		int aux9;
	
		if(evento.getActionCommand().equals(gui.getP4().JUGADORES)) {
			gui.getP1().setVisible(true);

		}

		if(evento.getActionCommand().equals(gui.getP4().JUEGOS)) {
			gui.getP2().setVisible(true);
			gui.getP4().setVisible(false);
		
		}
	
//		///////////////PANEL 1//////////////////////////////////////////////////////
		if(evento.getActionCommand().equals(gui.getP1().VOLVER1)){
			gui.getP1().setVisible(false);
			gui.getP4().setVisible(true);
			gui.setVisible(true);
		}
//		///////////////PANEL 2//////////////////////////////////////////////////////
		if(evento.getActionCommand().equals(gui.getP2().VOLVER2)){
			gui.getP2().setVisible(false);
			gui.getP4().setVisible(true);

		}
//		///////////////PANEL 3//////////////////////////////////////////////////////
		
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
			
		}
		
		if(evento.getActionCommand().equals(gui.getP3().VOLVER3)){
			gui.getP3().setVisible(false);
			gui.getPr3().setVisible(false);
			gui.getP4().setVisible(true);
			gui.getP3().getTxtjuego().setText("");
			gui.getP3().getTxtjugador1().setText("");
			gui.getP3().getTxtjugador2().setText("");
			gui.getP3().getTxtpuntaje1().setText("");
			gui.getP3().getTxtpuntaje2().setText("");
			gui.getP3().getTxtTipoPartida().setText("");
			gui.setSize(600,400);
		}

		if(evento.getActionCommand().equals(gui.getP3().ESCRIBIR3)){
			aux = gui.getP3().getTxtjugador1().getText();
			rgpartida.setJugador1(aux);
			aux7 = Double.parseDouble(gui.getP3().getTxtpuntaje1().getText());
			rgpartida.setPuntaje1(aux7);
			aux2 = gui.getP3().getTxtjugador2().getText();
			rgpartida.setJugador2(aux2);
			aux8 =  Double.parseDouble(gui.getP3().getTxtpuntaje2().getText());
			rgpartida.setPuntaje2(aux8);
			aux3 = gui.getP3().getTxtjuego().getText();
			rgpartida.setJuego(aux3);
			aux4 = gui.getP3().getTxtTipoPartida().getText();
			rgpartida.setTipoPartida(aux4);
			md.getPF().escribirPartida(rgpartida);
		}
		
		if(evento.getActionCommand().equals(gui.getP3().LEER3)){
			md.getPF().leerPartida(rgpartida);
			System.out.println(rgpartida);
			gui.mostrarPartida(rgpartida);
		}
	}
}	

