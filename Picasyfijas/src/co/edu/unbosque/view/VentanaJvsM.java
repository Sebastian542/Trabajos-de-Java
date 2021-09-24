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
		private JLabel explicación1;
		private JLabel explicación2;
		private JLabel explicación3;
		private JLabel explicación4;
		private JLabel explicación5;
		private JLabel explicación6;
		
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
			
			comojugarJvsM = new JLabel("¿Cómo jugar?");
			comojugarJvsM.setFont(new Font("Tahoma", Font.PLAIN, 14));
			comojugarJvsM.setForeground(Color.RED);
			comojugarJvsM.setBounds(10, 0, 110, 25);
		
			
			explicación1 = new JLabel("Ingresa un número de varios dígitos, pero tienes un límite de 10 ");
			explicación1.setBounds(10, 30, 399, 14);
			
			explicación2 = new JLabel("dígitos del número, el programa le da pistas de cuántos aciertos tuvo sin");
			explicación2.setBounds(10, 47, 424, 14);
			
			explicación3 = new JLabel("decirle cuales fueron.Es FIJA si el dígito es el correcto y se encuentra en");
			explicación3.setBounds(10, 66, 438, 14);
			
			explicación4 = new JLabel("posición adecuada, es PICA si algún dígito es el correcto,");
			explicación4.setBounds(10, 83, 356, 14);
			
			
			explicación5 = new JLabel("pero no se encuentra en la posición adecuada. El juego");
			explicación5.setBounds(10, 101, 356, 14);
		
			explicación6 = new JLabel("termina cuando el jugador adivinó el número sin una sola fija.");
			explicación6.setBounds(10, 121, 366, 14);
			
			textField = new JTextField();
			textField.setBounds(155, 147, 138, 25);
			textField.setColumns(10);
			
			btnJugar = new JButton("Jugar");
			btnJugar.setBounds(181, 183, 89, 23);
			btnJugar.setActionCommand("jugarJvsMv2");
		
			add(comojugarJvsM);
			add(explicación1);
			add(explicación2);
			add(explicación3);
			add(explicación4);
			add(explicación5);
			add(explicación6);
			
			add(textField);
			add(btnJugar);
			
		}
		

		public JLabel getComojugarJvsM() {
			return comojugarJvsM;
		}

		public void setComojugarJvsM(JLabel comojugarJvsM) {
			this.comojugarJvsM = comojugarJvsM;
		}

		public JLabel getExplicación1() {
			return explicación1;
		}

		public void setExplicación1(JLabel explicación1) {
			this.explicación1 = explicación1;
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
