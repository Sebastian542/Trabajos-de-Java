package co.edu.unbosque.view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.BorderLayout;
import javax.swing.JButton;
import java.awt.GridLayout;
import java.awt.GridBagLayout;
import javax.swing.JTextField;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.TextField;
import javax.swing.BoxLayout;
import javax.swing.JList;
import java.awt.Color;
import net.miginfocom.swing.MigLayout;
import javax.swing.JLabel;

public class window {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_3;
	private JButton btnNewButton;
	private JButton btnNewButton_1;
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_2;
	private JLabel lblNewLabel_3;
	private JTextField textField_4;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					window window = new window();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public window() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setForeground(Color.BLACK);
		frame.setBounds(100, 100, 496, 319);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new MigLayout("", "[grow]", "[][][][][][][][][][][]"));
		
		lblNewLabel = new JLabel("Nombre               ");
		frame.getContentPane().add(lblNewLabel, "flowx,cell 0 0");
		
		textField = new JTextField();
		frame.getContentPane().add(textField, "cell 0 0,alignx center");
		textField.setColumns(10);
		
		lblNewLabel_1 = new JLabel("Edad                     ");
		frame.getContentPane().add(lblNewLabel_1, "flowx,cell 0 2");
		
		lblNewLabel_2 = new JLabel("Genero                ");
		frame.getContentPane().add(lblNewLabel_2, "flowx,cell 0 4");
		
		textField_1 = new JTextField();
		textField_1.setForeground(Color.GRAY);
		frame.getContentPane().add(textField_1, "cell 0 4,alignx center");
		textField_1.setColumns(10);
		
		lblNewLabel_3 = new JLabel("Puntos                ");
		frame.getContentPane().add(lblNewLabel_3, "flowx,cell 0 6");
		
		textField_3 = new JTextField();
		frame.getContentPane().add(textField_3, "cell 0 6,alignx center");
		textField_3.setColumns(10);
		
		btnNewButton = new JButton("Leer");
		frame.getContentPane().add(btnNewButton, "flowx,cell 0 9,alignx center");
		
		btnNewButton_1 = new JButton("Escribir ");
		frame.getContentPane().add(btnNewButton_1, "cell 0 9");
		
		textField_4 = new JTextField();
		frame.getContentPane().add(textField_4, "cell 0 2,alignx center");
		textField_4.setColumns(10);
	}

}
