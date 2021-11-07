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

	public static final String OK = "OK";
	public static final String CANCEL = "Cancel";
	public static final String VOLVER = "Volver";
	

	
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
				JButton okButton = new JButton("OK");
				okButton.setActionCommand(OK);
				buttonPane.add(okButton);
				getRootPane().setDefaultButton(okButton);
			}
			{
				butVolver = new JButton("Volver");
				butVolver.setActionCommand(VOLVER);
				buttonPane.add(butVolver);
			}
		}

	}

	
	public static String getOk() {
		return OK;
	}

	public static String getCancel() {
		return CANCEL;
	}
	
	public static String getVolver() {
		return VOLVER;
	}


	public JButton getButVolver() {
		return butVolver;
	}


	public void setButVolver(JButton butVolver) {
		this.butVolver = butVolver;
	}
	

}

