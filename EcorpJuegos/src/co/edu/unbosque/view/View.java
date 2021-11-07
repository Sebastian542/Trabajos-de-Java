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
		//
		
		
		
		
		p1 = new Panel1(control);
		add(p1,BorderLayout.NORTH);
		
		
	    p2 = new Panel2(control);
		add(p2,BorderLayout.CENTER);
		

		
		p3 = new Panel3(control);
		add(p3,BorderLayout.WEST);
		


		p4 = new Panel4(control);
	   add(p4,BorderLayout.SOUTH);
		

	   
	   
		//Se agrega al layout en la parte CENTER, el panel de entrada definido
		
		//p3 = new Panel3(control);
		//add(p3,BorderLayout.SOUTH);
		
		//se agrega al boton ActionListener del objeto de Controlador
		//panelEntrada.getButConvertir().addActionListener(control);
	}


	
	
	
	


	public PanelResultados getPanelResultados() {
		return panelResultados;
	}

	public void setPanelResultados(PanelResultados panelResultados) {
		this.panelResultados = panelResultados;
	}
	
	
	
}
