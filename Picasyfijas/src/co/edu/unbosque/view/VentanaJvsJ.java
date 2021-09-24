package co.edu.unbosque.view;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class VentanaJvsJ extends JFrame {
		
		private JPanel contentPane;
		
		private JLabel comojugar;
		private JLabel explicaci�n;
		private JLabel explicaci�n2;
		private JLabel explicaci�n3;
		private JLabel explicaci�n4;
		private JLabel explicaci�n5;
		private JLabel explicaci�n6;
		private JLabel jugador1;
		private JLabel jugador2;
		
		private JTextField textField;
		private JTextField textField_1;
		
		private JButton btnJugar;
		
		public VentanaJvsJ() {
			
			setTitle("PICAS Y FIJAS");
			setSize(500,200);
			
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			setBounds(100, 100, 525, 352);
			contentPane = new JPanel();
			contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
			setContentPane(contentPane);
			contentPane.setLayout(null);
			
			setResizable(false);
			setVisible(true);
			
			inicializarcomponentes();
		}
		
		

		public void inicializarcomponentes() {
			comojugar = new JLabel("�C�mo jugar?");
			comojugar.setForeground(Color.RED);
			comojugar.setFont(new Font("Times New Roman", Font.BOLD, 13));
			comojugar.setBounds(10, 11, 158, 24);
			
			
			explicaci�n = new JLabel("Cada jugador ingresa un n�mero de varios d�gitos , pero tiene un l�mite de 10 ");
			explicaci�n.setBounds(10, 26, 471, 24);
			
			
			explicaci�n2 = new JLabel("d�gitos del n�mero, el programa les da pistas de cu�ntos aciertos tuvo ");
			explicaci�n2.setBounds(10, 46, 433, 14);
	
			
			explicaci�n3 = new JLabel("cada jugador, sin decirle cuales fueron. Es FIJA si el d�gito es el correcto y se");
			explicaci�n3.setBounds(10, 60, 454, 14);
			
			explicaci�n4 = new JLabel("encuentra en posici�n adecuada, es PICA si alg�n d�gito es el correcto, pero no");
			explicaci�n4.setBounds(10, 71, 471, 14);
			
			explicaci�n5 = new JLabel("se encuentra en la posici�n adecuada. El juego termina cuando el jugador.adivin� el n�mero");
			explicaci�n5.setBounds(10, 85, 193, 14);
			
			explicaci�n6 = new JLabel("sin una sola fija.");
			explicaci�n6.setBounds(10,100,110,14);

			
			jugador1 = new JLabel("Jugador 1");
			jugador1.setForeground(Color.BLUE);
			jugador1.setFont(new Font("Rockwell", Font.PLAIN, 13));
			jugador1.setBounds(99, 132, 67, 24);
		
			
			jugador2 = new JLabel("Jugador 2");
			jugador2.setForeground(Color.BLUE);
			jugador2.setFont(new Font("Rockwell", Font.PLAIN, 13));
			jugador2.setBounds(334, 132, 67, 24);
			
			textField = new JTextField();
			textField.setBounds(61, 167, 143, 31);
			textField.setColumns(10);
			
			textField_1 = new JTextField();
			textField_1.setBounds(289, 167, 143, 31);
			textField_1.setColumns(10);
			
			btnJugar = new JButton("Jugar");
			btnJugar.setBounds(203, 244, 89, 23);
			btnJugar.setActionCommand("jugarJvsJ");
			
			add(comojugar);
			add(explicaci�n);
			add(explicaci�n2);
			add(explicaci�n3);
			add(explicaci�n4);
			add(explicaci�n5);
			add(explicaci�n6);
			add(jugador1);
			add(jugador2);
			
			add(btnJugar);
			add(textField);
			add(textField_1);
			
		}
		

		public JLabel getExplicaci�n6() {
			return explicaci�n6;
		}

		public void setExplicaci�n6(JLabel explicaci�n6) {
			this.explicaci�n6 = explicaci�n6;
		}

		public JLabel getComojugar() {
			return comojugar;
		}

		public void setComojugar(JLabel comojugar) {
			this.comojugar = comojugar;
		}

		public JLabel getExplicaci�n() {
			return explicaci�n;
		}

		public void setExplicaci�n(JLabel explicaci�n) {
			this.explicaci�n = explicaci�n;
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

		public JLabel getJugador1() {
			return jugador1;
		}

		public void setJugador1(JLabel jugador1) {
			this.jugador1 = jugador1;
		}

		public JLabel getJugador2() {
			return jugador2;
		}

		public void setJugador2(JLabel jugador2) {
			this.jugador2 = jugador2;
		}

		public JTextField getTextField() {
			return textField;
		}

		public void setTextField(JTextField textField) {
			this.textField = textField;
		}

		public JTextField getTextField_1() {
			return textField_1;
		}

		public void setTextField_1(JTextField textField_1) {
			this.textField_1 = textField_1;
		}

		public JButton getBtnJugar() {
			return btnJugar;
		}

		public void setBtnJugar(JButton btnJugar) {
			this.btnJugar = btnJugar;
		}
		
}
