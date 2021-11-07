package co.edu.unbosque.view;

import java.awt.BorderLayout;
import javax.swing.JFrame;
import co.edu.unbosque.controller.Controller;

public class View extends JFrame{

	//Constante generada por Eclipse  
	private static final long serialVersionUID = 1L;
	
	private Panel1 p1;
	private Panel2 p2;
	private Panel3 p3;
	private Panel4 p4;
	



	//private PanelEntrada panelEntrada; //Se declara un objeto de tipo PanelEntrada
	private PanelResultados panelResultados; //Se declara un objeto de tipo PanelResultados

	public View(Controller control) {
		
		// Definición de los parámetros básicos de la ventana principal
		
		setSize(600,400); //tamaño en ancho y alto en pixeles
		setResizable(true); //Se puede cambiar el tamaño de la ventana?
		
		setTitle("Título de la Ventana Principal MVC"); //tìtulo de la ventana
		setDefaultCloseOperation(EXIT_ON_CLOSE);//qué debe hacer si cierra la ventana
		setLocationRelativeTo(null); //coloca la ventana al centro de la pantalla
		
		//Establece el layout (lienzo) que vamos a utilizar dentro de la ventana principal.
		setLayout( new BorderLayout() );

		//IngresarDatos.getButEscribir().addActionListener(control);
		
		//Se agrega al layout en la parte NORTH, el panel de entrada definido

		p1 = new Panel1(control);

	    	p2 = new Panel2(control);
		add(p2,BorderLayout.CENTER);	

		p3 = new Panel3(control);
		add(p3,BorderLayout.CENTER);

		p4 = new Panel4(control);
		add(p4,BorderLayout.CENTER);

	   
		//Se agrega al layout en la parte CENTER, el panel de entrada definido
		
		//se agrega al boton ActionListener del objeto de Controlador
		
		p4.getButJugadores().addActionListener(control);
	    	p4.getButJuegos().addActionListener(control);
	    	p4.getButPartidas().addActionListener(control);
	}


	public PanelResultados getPanelResultados() {
		return panelResultados;
	}

	public void setPanelResultados(PanelResultados panelResultados) {
		this.panelResultados = panelResultados;
	}


	public Panel1 getP1() {
		return p1;
	}


	public void setP1(Panel1 p1) {
		this.p1 = p1;
	}


	public Panel2 getP2() {
		return p2;
	}


	public void setP2(Panel2 p2) {
		this.p2 = p2;
	}


	public Panel3 getP3() {
		return p3;
	}


	public void setP3(Panel3 p3) {
		this.p3 = p3;
	}


	public Panel4 getP4() {
		return p4;
	}


	public void setP4(Panel4 p4) {
		this.p4 = p4;
	}
	
	
	
	
	
}
