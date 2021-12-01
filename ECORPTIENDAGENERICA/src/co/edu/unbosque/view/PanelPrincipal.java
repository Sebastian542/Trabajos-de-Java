package co.edu.unbosque.view;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;
import java.awt.BorderLayout;

import co.edu.unbosque.controller.Controller;

import java.awt.Color;
import java.awt.GridLayout;

public class PanelPrincipal extends JPanel {
	private static final long serialVersionUID = 1L;
	private JButton  butMod2;
	private JButton  butMod3;
	private JButton  butMod4;
	private JButton	 butMod5;
	private JButton  butMod6;
	public static final String MOD2 = "MOD2";
	public static final String MOD3 = "MOD3";
	public static final String MOD4 = "MOD4";
	public static final String MOD5 = "MOD5";
	public static final String MOD6 = "MOD6";
	
	/**
	 * Create the panel.
	 * @param control 
	 */
	
	public PanelPrincipal(Controller control) {
		setLayout(new BorderLayout());
		setBackground(new Color(255, 69, 0));
		TitledBorder border = BorderFactory.createTitledBorder("Menu");
		border.setTitleColor(Color.WHITE);
		setBorder( border );
		
		butMod2 = new JButton("Gestion de Clientes");
		butMod2.setActionCommand(MOD2);
		add(butMod2, BorderLayout.PAGE_START);
		
		butMod3 = new JButton("Gestion de Proveedores");
		butMod3.setActionCommand(MOD3);
		add(butMod3, BorderLayout.LINE_END);
		
		butMod4 = new JButton("Gestion de Productos");
		butMod4.setActionCommand(MOD4);
		add(butMod4, BorderLayout.CENTER);
		
		butMod5 = new JButton("Gestion de Ventas");
		butMod5.setActionCommand(MOD5);
		add(butMod5, BorderLayout.LINE_START);
		
		butMod6 = new JButton("Consultas y Reportes");
		butMod6.setActionCommand(MOD6);
		add(butMod6, BorderLayout.PAGE_END);
	}

	public JButton getButMod2() {
		return butMod2;
	}

	public void setButMod2(JButton butMod2) {
		this.butMod2 = butMod2;
	}

	public JButton getButMod3() {
		return butMod3;
	}

	public void setButMod3(JButton butMod3) {
		this.butMod3 = butMod3;
	}

	public JButton getButMod4() {
		return butMod4;
	}

	public void setButMod4(JButton butMod4) {
		this.butMod4 = butMod4;
	}

	public JButton getButMod5() {
		return butMod5;
	}

	public void setButMod5(JButton butMod5) {
		this.butMod5 = butMod5;
	}

	public JButton getButMod6() {
		return butMod6;
	}

	public void setButMod6(JButton butMod6) {
		this.butMod6 = butMod6;
	}

	public static String getMod2() {
		return MOD2;
	}

	public static String getMod3() {
		return MOD3;
	}

	public static String getMod4() {
		return MOD4;
	}

	public static String getMod5() {
		return MOD5;
	}

	public static String getMod6() {
		return MOD6;
	}
	

}
