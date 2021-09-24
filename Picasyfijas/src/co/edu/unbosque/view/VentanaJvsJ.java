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
		private JLabel explicación;
		private JLabel explicación2;
		private JLabel explicación3;
		private JLabel explicación4;
		private JLabel explicación5;
		private JLabel explicación6;
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
			comojugar = new JLabel("¿Cómo jugar?");
			comojugar.setForeground(Color.RED);
			comojugar.setFont(new Font("Times New Roman", Font.BOLD, 13));
			comojugar.setBounds(10, 11, 158, 24);
			
			
			explicación = new JLabel("Cada jugador ingresa un número de varios dígitos , pero tiene un límite de 10 ");
			explicación.setBounds(10, 26, 471, 24);
			
			
			explicación2 = new JLabel("dígitos del número, el programa les da pistas de cuántos aciertos tuvo ");
			explicación2.setBounds(10, 46, 433, 14);
	
			
			explicación3 = new JLabel("cada jugador, sin decirle cuales fueron. Es FIJA si el dígito es el correcto y se");
			explicación3.setBounds(10, 60, 454, 14);
			
			explicación4 = new JLabel("encuentra en posición adecuada, es PICA si algún dígito es el correcto, pero no");
			explicación4.setBounds(10, 71, 471, 14);
			
			explicación5 = new JLabel("se encuentra en la posición adecuada. El juego termina cuando el jugador.adivinó el número");
			explicación5.setBounds(10, 85, 193, 14);
			
			explicación6 = new JLabel("sin una sola fija.");
			explicación6.setBounds(10,100,110,14);

			
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
			add(explicación);
			add(explicación2);
			add(explicación3);
			add(explicación4);
			add(explicación5);
			add(explicación6);
			add(jugador1);
			add(jugador2);
			
			add(btnJugar);
			add(textField);
			add(textField_1);
			
		}
		

		public JLabel getExplicación6() {
			return explicación6;
		}

		public void setExplicación6(JLabel explicación6) {
			this.explicación6 = explicación6;
		}

		public JLabel getComojugar() {
			return comojugar;
		}

		public void setComojugar(JLabel comojugar) {
			this.comojugar = comojugar;
		}

		public JLabel getExplicación() {
			return explicación;
		}

		public void setExplicación(JLabel explicación) {
			this.explicación = explicación;
		}

		public JLabel getExplicación2() {
			return explicación2;
		}

		public void setExplicación2(JLabel explicación2) {
			this.explicación2 = explicación2;
		}

		public JLabel getExplicación3() {
			return explicación3;
		}
		
		public void setExplicación3(JLabel explicación3) {
			this.explicación3 = explicación3;
		}

		public JLabel getExplicación4() {
			return explicación4;
		}

		public void setExplicación4(JLabel explicación4) {
			this.explicación4 = explicación4;
		}

		public JLabel getExplicación5() {
			return explicación5;
		}

		public void setExplicación5(JLabel explicación5) {
			this.explicación5 = explicación5;
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
