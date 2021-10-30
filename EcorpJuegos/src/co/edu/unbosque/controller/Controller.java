package co.edu.unbosque.controller;



import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import co.edu.unbosque.model.ClaseX;
import co.edu.unbosque.view.Panel2;
import co.edu.unbosque.view.View;

public class Controller implements ActionListener{


	private ClaseX m;
	private View gui;
	
	public Controller() {
		m = new ClaseX();
		
		
		//p2 = new Panel2(this);
		//p2.setVisible(true);	
		
		
		gui = new View(this);
		gui.setVisible(true);
		
			
		
		
		funcionar();
		
	}
	
	public void funcionar() {
		
	

	}
	

	
	
	@Override
	public void actionPerformed(ActionEvent evento) {
	
		
		if (evento.getActionCommand().equals(gui.getPanel1)) {
			String resultado = m.procesarDato(gui.getPanel1().getTxtNumero().getText());
			String resultado1 = m.getY().procesarDatoClaseY(gui.getPanel1().getTxtNumero().getText());
			gui.getPanelResultados().getTxtMonto().setText(resultado1);
		
		}
	}
}
