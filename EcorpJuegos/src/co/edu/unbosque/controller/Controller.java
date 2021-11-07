package co.edu.unbosque.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import co.edu.unbosque.model.ClaseX;
import co.edu.unbosque.view.View;

public class Controller implements ActionListener{


	private ClaseX m;
	private View gui;
	
	public Controller() {
		m = new ClaseX();

		gui = new View(this);
		gui.setVisible(true);

		///funcionar();
		
	}
	
	public void funcionar() {

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
			gui.getP3().setVisible(true);
			gui.getP4().setVisible(false);
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

