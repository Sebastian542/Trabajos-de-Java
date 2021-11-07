package co.edu.unbosque.controller;



import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import co.edu.unbosque.model.ClaseX;
import co.edu.unbosque.view.Panel1;
import co.edu.unbosque.view.Panel2;
import co.edu.unbosque.view.View;

public class Controller implements ActionListener{


	private ClaseX m;
	private View gui;
	private Panel1 pan1;
	
	public Controller() {
		m = new ClaseX();
		
		pan1 = new Panel1(null);
		pan1.getOkButton().addActionListener(null);
		pan1.getCancelButton().addActionListener(null);
		//p2 = new Panel2(this);
		//p2.setVisible(true);	
		
		
		gui = new View(this);
		gui.setVisible(true);
		
			
		
		
		///funcionar();
		
	}
	
	public void funcionar() {
		
	

	}

	@Override
	public void actionPerformed(ActionEvent evento) {
		if(evento.getActionCommand().equals(gui.getP4().JUGADORES)) {
			pan1.setVisible(true);
			gui.getP4().setVisible(false);
			gui.setVisible(false);
			
			if(evento.getActionCommand().equals(pan1.CANCEL)) {
				pan1.setVisible(false);
				gui.getP4().setVisible(true);
				gui.setVisible(true);
			}
		}
		
		if(evento.getActionCommand().equals(gui.getP4().JUEGOS)) {
			gui.getP2().setVisible(true);
			gui.getP4().setVisible(false);
		}
		
		if(evento.getActionCommand().equals(gui.getP4().PARTIDAS)) {
			gui.getP3().setVisible(true);
			gui.getP4().setVisible(false);
		}

		
		/*if (evento.getActionCommand().equals(gui.getPanel2().ESCRIBIR)) {
			//String resultado = m.procesarDato(gui.getIngresarDatos().getNombre());
			String resultado1 = m.getY().procesarDatoClaseY(gui.getPanel2().getGenero().getText());
			
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
