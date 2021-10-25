package Controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import Modelo.Mundo;
import Vista.InterfazGUI;

public class Controlador implements ActionListener{

	//Atributos que vienen del Modelo (mundo) 
	private Mundo bd;
	
	//Atributos que vienen de Vista - GUI
	private InterfazGUI gui;
	
	public Controlador() {

		//aqui van los constructores tanto de Mundo, como de Vista
		
		bd = new Mundo();
		//se Modifica contructor de InterfazGUI para que reciba como parámetro la instancia de Controlador
		gui = new InterfazGUI(this);
		gui.setVisible(true); //hacer visible la ventana principal
		
	}

	@Override
	public void actionPerformed(ActionEvent evento) {
		// TODO Auto-generated method stub
		String resultado;
		if (evento.getActionCommand().equals(gui.getPanelEntrada().ESCRIBIR)) {
			resultado = bd.getBD().escribirArchivoBinario();
			gui.escribirMensaje(resultado);
		}
		
		if(evento.getActionCommand().equals(gui.getPanelEntrada().LEER)) {
			//haga algo de por Dios!!
			bd.getBD().leerArchivoBinario();
			mostrarCifras();
		}
		
		if(evento.getActionCommand().equals(gui.getPanelEntrada().ESCRIBIR_REG)) {
			gui.escribirMensaje(bd.getBD().escribirRegistro());
		}
		
		if(evento.getActionCommand().equals(gui.getPanelEntrada().LEER_REG)) {
			bd.getBD().leerRegistro();
			mostrarRegistros();
			
		}
	}
	
	private void mostrarCifras() {
		for (int i= 0 ; i<bd.getBD().getREGISTROS() ; i++) {
			gui.getPanelResultados().getTxtMonto().append(String.valueOf(bd.getBD().getNumeros()[i])+"\n");
			gui.getPanelResultados().getTxtValores().append(String.valueOf(bd.getBD().getValores()[i])+"\n");
		}	
	}
	
	private void mostrarRegistros() {
		for (int i= 0 ; i<3 ; i++) {
			gui.getPanelRegistro().getTxtEdad().append(String.valueOf(bd.getBD().getDatos()[i].getEdad())+"\n");
			gui.getPanelRegistro().getTxtNombre().append(String.valueOf(bd.getBD().getDatos()[i].getNombre())+"\n");
			gui.getPanelRegistro().getTxtSalario().append(String.valueOf(bd.getBD().getDatos()[i].getSalario())+"\n");
		}	
	}
}
