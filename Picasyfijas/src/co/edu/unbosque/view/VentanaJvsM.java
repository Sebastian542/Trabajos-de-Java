package co.edu.unbosque.view;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class VentanaJvsM extends JFrame {
		
		private JPanel contentPane;
		private JTextField textField;
		private JButton btnJugar;
		
		private JLabel comojugarJvsM;
		private JLabel explicaci�n1;
		private JLabel explicaci�n2;
		private JLabel explicaci�n3;
		private JLabel explicaci�n4;
		private JLabel explicaci�n5;
		private JLabel explicaci�n6;
		
		public VentanaJvsM() {
			
			setTitle("PICAS Y FIJAS");
			setSize(500,200);
			
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			setBounds(100, 100, 461, 296);
			contentPane = new JPanel();
			contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
			setContentPane(contentPane);
			contentPane.setLayout(null);
			
			setResizable(false);
			setVisible(true);
			
			inicializarcomponentes();
		}
		
		public void inicializarcomponentes() {
			
			comojugarJvsM = new JLabel("�C�mo jugar?");
			comojugarJvsM.setFont(new Font("Tahoma", Font.PLAIN, 14));
			comojugarJvsM.setForeground(Color.RED);
			comojugarJvsM.setBounds(10, 0, 110, 25);
		
			
			explicaci�n1 = new JLabel("Ingresa un n�mero de varios d�gitos, pero tienes un l�mite de 10 ");
			explicaci�n1.setBounds(10, 30, 399, 14);
			
			explicaci�n2 = new JLabel("d�gitos del n�mero, el programa le da pistas de cu�ntos aciertos tuvo sin");
			explicaci�n2.setBounds(10, 47, 424, 14);
			
			explicaci�n3 = new JLabel("decirle cuales fueron.Es FIJA si el d�gito es el correcto y se encuentra en");
			explicaci�n3.setBounds(10, 66, 438, 14);
			
			explicaci�n4 = new JLabel("posici�n adecuada, es PICA si alg�n d�gito es el correcto,");
			explicaci�n4.setBounds(10, 83, 356, 14);
			
			
			explicaci�n5 = new JLabel("pero no se encuentra en la posici�n adecuada. El juego");
			explicaci�n5.setBounds(10, 101, 356, 14);
		
			explicaci�n6 = new JLabel("termina cuando el jugador adivin� el n�mero sin una sola fija.");
			explicaci�n6.setBounds(10, 121, 366, 14);
			
			textField = new JTextField();
			textField.setBounds(155, 147, 138, 25);
			textField.setColumns(10);
			
			btnJugar = new JButton("Jugar");
			btnJugar.setBounds(181, 183, 89, 23);
			btnJugar.setActionCommand("jugarJvsMv2");
		
			add(comojugarJvsM);
			add(explicaci�n1);
			add(explicaci�n2);
			add(explicaci�n3);
			add(explicaci�n4);
			add(explicaci�n5);
			add(explicaci�n6);
			
			add(textField);
			add(btnJugar);
			
		}
		

		public JLabel getComojugarJvsM() {
			return comojugarJvsM;
		}

		public void setComojugarJvsM(JLabel comojugarJvsM) {
			this.comojugarJvsM = comojugarJvsM;
		}

		public JLabel getExplicaci�n1() {
			return explicaci�n1;
		}

		public void setExplicaci�n1(JLabel explicaci�n1) {
			this.explicaci�n1 = explicaci�n1;
		}

		public JLabel getExplicaci�n2() {
			return explicaci�n2;
		}

		public void setExplicaci�n2(JLabel explicaci�n2) {
			this.explicaci�n2 = explicaci�n2;
		}

		public JLabel getExplicaci�n3() {
			return explicaci�n3;
		}

		public void setExplicaci�n3(JLabel explicaci�n3) {
			this.explicaci�n3 = explicaci�n3;
		}

		public JLabel getExplicaci�n4() {
			return explicaci�n4;
		}

		public void setExplicaci�n4(JLabel explicaci�n4) {
			this.explicaci�n4 = explicaci�n4;
		}

		public JLabel getExplicaci�n5() {
			return explicaci�n5;
		}

		public void setExplicaci�n5(JLabel explicaci�n5) {
			this.explicaci�n5 = explicaci�n5;
		}

		public JTextField getTextField() {
			return textField;
		}

		public void setTextField(JTextField textField) {
			this.textField = textField;
		}

		public JButton getBtnJugar() {
			return btnJugar;
		}

		public void setBtnJugar(JButton btnJugar) {
			this.btnJugar = btnJugar;
		}
		
}
