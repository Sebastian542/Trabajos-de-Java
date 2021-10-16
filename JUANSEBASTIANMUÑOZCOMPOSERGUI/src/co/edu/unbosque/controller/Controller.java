package co.edu.unbosque.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import co.edu.unbosque.model.Crear_cancion;
import co.edu.unbosque.model.persistence.EjemploFile;
import co.edu.unbosque.view.View;

public class Controller implements ActionListener {
	
	private Crear_cancion c;

	private View gui;
	private int  numeroEst;
	private int  numeroReng;
	
	public Controller() {
		
		
		c=new Crear_cancion();

		gui = new View(this);
		
		gui.setVisible(true);
		

	
	}

	public void funcionar() {
		
		gui.mostrarResultados("Bienvenido señor usuario a continuacion proporcione las caracteristicas que va a contener su cancion");
		
		int numeroEst=gui.pedirDatoEntero("Escriba el numero de estrofas");	
	int numeroReng=gui.pedirDatoEntero("Escriba el número de frases");	
	  
	  	c.setNumeroEstrofas(numeroEst);
	
		c.setNumeroRenglones(numeroReng);
	  	
	   gui.mostrarResultados("A continuacion indique donde guardara la cancion");

        gui.mostrarResultados(c.generarCancion());
		
		
	}
	
	
	//Gui
	public void actionPerformed(ActionEvent evento) {
		// TODO Auto-generated method stub
		if (evento.getActionCommand().equals(gui.getPanelEntrada().CONVERTIR)) {
			//String resultado = m.procesarDato(gui.getPanelEntrada().getTxtNumero().getText());
			//String resultado1 =c.generarCancion().getPanelEntrada().getTxtNumero().getText();
			
			System.out.println("Ejecuto desde action");
			
			String resultado1 =gui.getPanelEntrada().getTxtNumero().getText(); 
			int numeroEst = Integer.parseInt(resultado1); 
			c.setNumeroEstrofas(numeroEst);
			
			String resultado2 =gui.getPanelEntrada().getTxtNumero2().getText();
	        int numeroReng = Integer.parseInt(resultado2); 
			c.setNumeroRenglones(numeroReng);
		
			
			
			gui.getPanelResultados().getTxtMonto().setText(c.generarCancion());

		}
	}
}
