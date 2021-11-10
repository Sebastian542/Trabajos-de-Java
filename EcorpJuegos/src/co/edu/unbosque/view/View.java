package co.edu.unbosque.view;

import java.awt.BorderLayout;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import java.awt.Color;

import co.edu.unbosque.controller.Controller;
import co.edu.unbosque.model.persistence.RegPartidas;


public class View extends JFrame{

	//Constante generada por Eclipse  
	private static final long serialVersionUID = 1L;
	
	private Panel1 p1;
	private Panel2 p2;
	private Panel3 p3;
	private Panel4 p4;
	

	private Panel3Resultados pr3;
	private Panel3Registro preg3;


	public View(Controller control) {
		
		// Definición de los parámetros básicos de la ventana principal
		setBackground(Color.BLACK);
		setSize(600,400); //Tamaño en ancho y alto en pixeles
		setResizable(false); //Se puede cambiar el tamaño de la ventana?
		getContentPane().setLayout(null);
		setTitle("Sistema de Informacion de Juegos"); //Tìtulo de la ventana
		setDefaultCloseOperation(EXIT_ON_CLOSE);//Qué debe hacer si cierra la ventana
		setLocationRelativeTo(null); //Coloca la ventana al centro de la pantalla
		setLayout( null); //Establece el layout (lienzo) que vamos a utilizar dentro de la ventana principal.

		p1 = new Panel1(control);
		
	    p2 = new Panel2(control);
	    p2.setBounds(0, 0, 584, 362);
	    getContentPane().add(p2);

		p3 = new Panel3(control);
		p3.setBounds(0, 0, 584, 180);
		getContentPane().add(p3);
		
		pr3 = new Panel3Resultados();
		pr3.setBounds(0,180,584,180);
		getContentPane().add(pr3);
		
		preg3 = new Panel3Registro();
		preg3.setBounds(0,360,584,180);
		getContentPane().add(preg3);
		
		p4 = new Panel4(control);
		p4.setBounds(0, 0, 584, 362);
		getContentPane().add(p4);

		//se agrega al boton ActionListener del objeto de Controlador
		p1.getButVolver().addActionListener(control);
		
		p1.getLeerButton().addActionListener(control);
		p1.getEscrButton().addActionListener(control);
			
		
	
		
		p2.getBtnVolver().addActionListener(control);
	
		p2.getBtnEscribir().addActionListener(control);
	
		p2.getBtnLeer().addActionListener(control);
		
		
		p3.getButEscribir().addActionListener(control);
		p3.getButEscribirReg().addActionListener(control);
	   	p3.getButLeer().addActionListener(control);
	   	p3.getButLeerReg().addActionListener(control);
	   	p3.getButVolver().addActionListener(control);
			
		p4.getButjugadores().addActionListener(control);
	   	p4.getButjuegos().addActionListener(control);
    	p4.getButpartidas().addActionListener(control);
	}
	
	public void escribirMensaje(String mensaje) {
		JOptionPane.showMessageDialog(null, mensaje, "archivos binarios", JOptionPane.INFORMATION_MESSAGE);
	}
	
	public void mostrarCifras3(int numReg, int valores[], double numeros[]) {
		for (int i= 0 ; i<numReg ; i++) {
			getPr3().getTxtMonto().append(String.valueOf(numeros[i])+"\n");
			getPr3().getTxtValores().append(String.valueOf(valores[i])+"\n");
		}
		
	}
	
	/*public void mostrarCifras2(int numReg, int valores[], double numeros[]) {
		for (int i= 0 ; i<numReg ; i++) {
			getPr3().getTxtMonto().append(String.valueOf(numeros[i])+"\n");
			getPr3().getTxtValores().append(String.valueOf(valores[i])+"\n");
		}
		
	}
	
	public void mostrarCifras1(int numReg, int valores[], double numeros[]) {
		for (int i= 0 ; i<numReg ; i++) {
			getPr3().getTxtMonto().append(String.valueOf(numeros[i])+"\n");
			getPr3().getTxtValores().append(String.valueOf(valores[i])+"\n");
		}
		
	}*/	
	
	public void mostrarRegistros3(int numReg, RegPartidas[] datos) {
		for (int i= 0 ; i<numReg ; i++) {
			getPreg3().getTxtjugador1().append(String.valueOf(datos[i].getJugador1())+"\n");
			getPreg3().getTxtjugador2().append(String.valueOf(datos[i].getJugador2())+"\n");
			getPreg3().getTxtpuntaje1().append(String.valueOf(datos[i].getPuntaje1())+"\n");
			getPreg3().getTxtpuntaje2().append(String.valueOf(datos[i].getPuntaje2())+"\n");
			getPreg3().getTxtTipoPartida().append(String.valueOf(datos[i].getTipoPartida())+"\n");
			getPreg3().getTxtJuego().append(String.valueOf(datos[i].getJuego())+"\n");
		}	
	}
	
	/*public void mostrarRegistros2(int numReg, RegPartidas[] datos) {
		for (int i= 0 ; i<numReg ; i++) {
			getPreg3().getTxtjugador1().append(String.valueOf(datos[i].getJugador1())+"\n");
			getPreg3().getTxtjugador2().append(String.valueOf(datos[i].getJugador2())+"\n");
			getPreg3().getTxtpuntaje1().append(String.valueOf(datos[i].getPuntaje1())+"\n");
			getPreg3().getTxtpuntaje2().append(String.valueOf(datos[i].getPuntaje2())+"\n");
			getPreg3().getTxtTipoPartida().append(String.valueOf(datos[i].getTipoPartida())+"\n");
			getPreg3().getTxtJuego().append(String.valueOf(datos[i].getJuego())+"\n");
		}	
	}
	
	public void mostrarRegistros1(int numReg, RegPartidas[] datos) {
		for (int i= 0 ; i<numReg ; i++) {
			getPreg3().getTxtjugador1().append(String.valueOf(datos[i].getJugador1())+"\n");
			getPreg3().getTxtjugador2().append(String.valueOf(datos[i].getJugador2())+"\n");
			getPreg3().getTxtpuntaje1().append(String.valueOf(datos[i].getPuntaje1())+"\n");
			getPreg3().getTxtpuntaje2().append(String.valueOf(datos[i].getPuntaje2())+"\n");
			getPreg3().getTxtTipoPartida().append(String.valueOf(datos[i].getTipoPartida())+"\n");
			getPreg3().getTxtJuego().append(String.valueOf(datos[i].getJuego())+"\n");
		}	
	}*/

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

	public Panel3Resultados getPr3() {
		return pr3;
	}

	public void setPr3(Panel3Resultados pr3) {
		this.pr3 = pr3;
	}

	public Panel3Registro getPreg3() {
		return preg3;
	}

	public void setPreg3(Panel3Registro preg3) {
		this.preg3 = preg3;
	}
	
}