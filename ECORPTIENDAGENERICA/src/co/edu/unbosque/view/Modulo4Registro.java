package co.edu.unbosque.view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.Font;

public class Modulo4Registro extends JFrame {
	
	
	private static final long serialVersionUID = 1L;
	private JButton btnEscribir;//Escribir
	private JButton btnLeer;//Leer
	private JButton btnVolver;//Volver
	
	public static final String ESCRIBIR4 = "Escribir4";
	public static final String LEER4 = "Leer4";
	public static final String VOLVER4 = "Volver4";
	
	
	

	private JPanel contentPane;
	private JTextField nproducto;
	private JTextField nproveedor;
	private JTextField pcompra;
	private JTextField pventa;



	public Modulo4Registro() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 202);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 69, 0));
		contentPane.setForeground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Nombre del producto");
		lblNewLabel.setFont(new Font("Roboto", Font.PLAIN, 11));
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setBounds(10, 30, 114, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Nit del proveedor");
		lblNewLabel_1.setFont(new Font("Roboto", Font.PLAIN, 11));
		lblNewLabel_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1.setBounds(230, 30, 114, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Precio de compra");
		lblNewLabel_2.setForeground(new Color(255, 255, 255));
		lblNewLabel_2.setFont(new Font("Roboto", Font.PLAIN, 11));
		lblNewLabel_2.setBounds(10, 79, 114, 14);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Precio de venta");
		lblNewLabel_3.setForeground(new Color(255, 255, 255));
		lblNewLabel_3.setFont(new Font("Roboto", Font.PLAIN, 11));
		lblNewLabel_3.setBounds(230, 79, 114, 14);
		contentPane.add(lblNewLabel_3);
		
		nproducto = new JTextField();
		nproducto.setBounds(134, 27, 86, 20);
		contentPane.add(nproducto);
		nproducto.setColumns(10);
		
		nproveedor = new JTextField();
		nproveedor.setBounds(338, 27, 86, 20);
		contentPane.add(nproveedor);
		nproveedor.setColumns(10);
		
		pcompra = new JTextField();
		pcompra.setBounds(134, 76, 86, 20);
		contentPane.add(pcompra);
		pcompra.setColumns(10);
		
		pventa = new JTextField();
		pventa.setBounds(338, 76, 86, 20);
		contentPane.add(pventa);
		pventa.setColumns(10);
		
		JButton btnEscribir = new JButton("Escribir");
		btnEscribir.setBounds(86, 135, 89, 23);
		btnEscribir.setActionCommand(ESCRIBIR4);
		contentPane.add(btnEscribir);
		
		JButton btnLeer = new JButton("Leer");
		btnLeer.setBounds(205, 135, 89, 23);
		btnLeer.setActionCommand(LEER4);
		contentPane.add(btnLeer);
		
		JButton btnVolver = new JButton("Volver");
		btnVolver.setBounds(304, 135, 89, 23);
		btnVolver.setActionCommand(VOLVER4);
		contentPane.add(btnVolver);
	}



	public JButton getBtnEscribir() {
		return btnEscribir;
	}



	public void setBtnEscribir(JButton btnEscribir) {
		this.btnEscribir = btnEscribir;
	}



	public JButton getBtnLeer() {
		return btnLeer;
	}



	public void setBtnLeer(JButton btnLeer) {
		this.btnLeer = btnLeer;
	}



	public JButton getBtnVolver() {
		return btnVolver;
	}



	public void setBtnVolver(JButton btnVolver) {
		this.btnVolver = btnVolver;
	}



	public JPanel getContentPane() {
		return contentPane;
	}



	public void setContentPane(JPanel contentPane) {
		this.contentPane = contentPane;
	}



	public JTextField getNproducto() {
		return nproducto;
	}



	public void setNproducto(JTextField nproducto) {
		this.nproducto = nproducto;
	}



	public JTextField getNproveedor() {
		return nproveedor;
	}



	public void setNproveedor(JTextField nproveedor) {
		this.nproveedor = nproveedor;
	}



	public JTextField getPcompra() {
		return pcompra;
	}



	public void setPcompra(JTextField pcompra) {
		this.pcompra = pcompra;
	}



	public JTextField getPventa() {
		return pventa;
	}



	public void setPventa(JTextField pventa) {
		this.pventa = pventa;
	}



	public static String getEscribir4() {
		return ESCRIBIR4;
	}



	public static String getLeer4() {
		return LEER4;
	}



	public static String getVolver4() {
		return VOLVER4;
	}
	
	
	
	
	
}
