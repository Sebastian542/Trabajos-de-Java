package co.edu.unbosque.view;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import co.edu.unbosque.controller.Controller;

import java.awt.GridBagLayout;
import javax.swing.JTextField;
import java.awt.GridBagConstraints;
import javax.swing.JLabel;
import java.awt.Insets;
import java.awt.Font;
import java.awt.Color;
public class Panel1 extends  JDialog {

	private static final long serialVersionUID = 1L;


	private final JPanel contentPanel = new JPanel();
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JButton butVolver;
	private JButton escrButton;
	private JButton leerButton;

	public static final String LEER1 = "Leer";
	public static final String ESCRIBIR1 = "Escribir";
	public static final String VOLVER1 = "Volver";

	
	public Panel1(Controller control) {
		getContentPane().setBackground(Color.BLACK);
		

		setVisible(false);
		setBounds(100, 100, 331, 289);
		getContentPane().setLayout(null);
		contentPanel.setBackground(Color.BLACK);
		contentPanel.setBounds(0, 0, 315, 250);
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel);
		contentPanel.setLayout(null);
		{
			JLabel lblNewLabel = new JLabel("Nombre");
			lblNewLabel.setForeground(Color.WHITE);
			lblNewLabel.setFont(new Font("Times New Roman", Font.PLAIN, 14));
			lblNewLabel.setBounds(10, 27, 86, 14);
			contentPanel.add(lblNewLabel);
		}
		{
			textField = new JTextField();
			textField.setBounds(75, 25, 86, 20);
			contentPanel.add(textField);
			textField.setColumns(10);
		}
		{
			JLabel lblNewLabel_1 = new JLabel("Edad");
			lblNewLabel_1.setForeground(Color.WHITE);
			lblNewLabel_1.setFont(new Font("Times New Roman", Font.PLAIN, 14));
			lblNewLabel_1.setBounds(10, 62, 70, 14);
			contentPanel.add(lblNewLabel_1);
		}
		{
			textField_1 = new JTextField();
			textField_1.setBounds(75, 60, 86, 20);
			contentPanel.add(textField_1);
			textField_1.setColumns(10);
		}
		{
			JLabel lblNewLabel_2 = new JLabel("Genero");
			lblNewLabel_2.setForeground(Color.WHITE);
			lblNewLabel_2.setFont(new Font("Times New Roman", Font.PLAIN, 14));
			lblNewLabel_2.setBounds(10, 105, 70, 14);
			contentPanel.add(lblNewLabel_2);
		}
		{
			textField_2 = new JTextField();
			textField_2.setBounds(75, 103, 86, 20);
			contentPanel.add(textField_2);
			textField_2.setColumns(10);
		}
		{
			JLabel lblNewLabel_3 = new JLabel("Puntos");
			lblNewLabel_3.setForeground(Color.WHITE);
			lblNewLabel_3.setFont(new Font("Times New Roman", Font.PLAIN, 14));
			lblNewLabel_3.setBounds(10, 158, 70, 14);
			contentPanel.add(lblNewLabel_3);
		}
		{
			textField_3 = new JTextField();
			textField_3.setBounds(75, 156, 86, 20);
			contentPanel.add(textField_3);
			textField_3.setColumns(10);
		}
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setBounds(0, 210, 315, 40);
			contentPanel.add(buttonPane);
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			{
				leerButton = new JButton("Leer");
				leerButton.setActionCommand(LEER1);
				buttonPane.add(leerButton);
				getRootPane().setDefaultButton(leerButton);
			}
			{
				escrButton = new JButton("Escribir");
				escrButton.setActionCommand(ESCRIBIR1);
				buttonPane.add(escrButton);
				getRootPane().setDefaultButton(escrButton);
			}
			{
				butVolver = new JButton("Volver");
				butVolver.setActionCommand(VOLVER1);
				buttonPane.add(butVolver);
				getRootPane().setDefaultButton(butVolver);
			}
		}


	}

	
	public static String getLeer1() {
		return LEER1;
	}

	public static String getEscribir1() {
		return ESCRIBIR1;
	}
	
	public static String getVolver1() {
		return VOLVER1;
	}

	public JButton getButVolver() {
		return butVolver;
	}


	public void setButVolver(JButton butVolver) {
		this.butVolver = butVolver;
	}


	public JButton getEscrButton() {
		return escrButton;
	}


	public void setEscrButton(JButton escrButton) {
		this.escrButton = escrButton;
	}


	public JButton getLeerButton() {
		return leerButton;
	}


	public void setLeerButton(JButton leerButton) {
		this.leerButton = leerButton;
	}
	

}

