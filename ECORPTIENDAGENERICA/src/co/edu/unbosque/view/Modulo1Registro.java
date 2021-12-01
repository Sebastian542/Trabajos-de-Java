package co.edu.unbosque.view;

import java.awt.Color;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import co.edu.unbosque.controller.Controller;


public class Modulo1Registro extends JDialog {
	private static final long serialVersionUID = 1L;
	public static final String LEER = "Leer";
	
	private JLabel nombre_de_la_tienda;	
	
	private JLabel tipo_de_comercio;
	
	private JLabel NIT_de_la_tienda;
	
	private JLabel ubicacion;	
	
	private JLabel valor_IVA;	
	
	private JLabel tasa_de_interes;	
	
	private JLabel nombre_del_banco;
	
	private JLabel numero_de_cuenta;
	
	private JLabel nombre_del_gerente;
	
    private JTextField nombre_de_la_tienda1;	
	
	private JTextField tipo_de_comercio1;
	
	private JTextField NIT_de_la_tienda1;
	
	private JTextField ubicacion1;	
	
	private JTextField valor_IVA1;	
	
	private JTextField tasa_de_interes1;	
	
	private JTextField nombre_del_banco1;
	
	private JTextField numero_de_cuenta1;
	
	private JTextField nombre_del_gerente1;
	
	private JButton butLeer;
	

    	public Modulo1Registro(Controller control) {
    		setBounds(300, 100, 450, 350);	
    		getContentPane().setBackground(Color.RED);
    		setBackground(Color.RED);
    		setLayout(null);
    		
    		nombre_de_la_tienda = new JLabel("Nombre de la tienda");
    		nombre_de_la_tienda.setForeground(Color.WHITE);
    		nombre_de_la_tienda.setBounds(10, 9, 200, 20);
    		nombre_de_la_tienda.setFont(new Font("Times new roman", Font.PLAIN, 14));	
    		add(nombre_de_la_tienda);
    				
    		tipo_de_comercio = new JLabel("Tipo de comercio");
    		tipo_de_comercio.setForeground(Color.WHITE);
    		tipo_de_comercio.setBounds(10, 39, 200, 20);
    		tipo_de_comercio.setFont(new Font("Times new roman", Font.PLAIN, 14));
    		add(tipo_de_comercio);
    			 	
    		NIT_de_la_tienda = new JLabel("NIT de la tienda");
    		NIT_de_la_tienda.setForeground(Color.WHITE);
    		NIT_de_la_tienda.setBounds(10, 69, 200, 20);
    		NIT_de_la_tienda.setFont(new Font("Times new roman", Font.PLAIN, 14));
    		add(NIT_de_la_tienda);
    				
    		ubicacion = new JLabel("ubicación");
    		ubicacion.setForeground(Color.WHITE);
    		ubicacion.setBounds(10, 99, 86, 20);
    		ubicacion.setFont(new Font("Times new roman", Font.PLAIN, 14));
    		add(ubicacion);
    		    		
    		valor_IVA = new JLabel("Valor de IVA");
    		valor_IVA.setForeground(Color.WHITE);
    		valor_IVA.setBounds(10, 129, 200, 20);
    		valor_IVA.setFont(new Font("Times new roman", Font.PLAIN, 14));
    		add(valor_IVA);
		
    		tasa_de_interes = new JLabel("Tasa de interés");
    		tasa_de_interes.setForeground(Color.WHITE);
    		tasa_de_interes.setBounds(10, 159, 200, 20);
    		tasa_de_interes.setFont(new Font("Times new roman", Font.PLAIN, 14));
    		add(tasa_de_interes);
    		
    		nombre_del_banco = new JLabel("Nombre del banco");
    		nombre_del_banco.setForeground(Color.WHITE);
    		nombre_del_banco.setBounds(10, 189, 200, 20);
    		nombre_del_banco.setFont(new Font("Times new roman", Font.PLAIN, 14));
    		add(nombre_del_banco);
    		
    		numero_de_cuenta = new JLabel("Número de cuenta");
    		numero_de_cuenta.setForeground(Color.WHITE);
    		numero_de_cuenta.setBounds(10, 219, 190, 20);
    		numero_de_cuenta.setFont(new Font("Times new roman", Font.PLAIN, 14));
    		add(numero_de_cuenta);
    		   		    	    
    		nombre_del_gerente = new JLabel("Nombre del gerente");
    		nombre_del_gerente.setForeground(Color.WHITE);
    		nombre_del_gerente.setBounds(10, 249, 190, 20);
    		nombre_del_gerente.setFont(new Font("Times new roman", Font.PLAIN, 14));
    		add(nombre_del_gerente);
    		
    		
    		nombre_de_la_tienda1 = new JTextField();
    		nombre_de_la_tienda1.setBounds(130, 9, 110, 20);
    		add(nombre_de_la_tienda1);   		
    		
    		tipo_de_comercio1 = new JTextField();
    		tipo_de_comercio1.setBounds(130, 39, 110, 20);
    		add(tipo_de_comercio1);   		
    	
    		NIT_de_la_tienda1 = new JTextField();
    		NIT_de_la_tienda1.setBounds(130, 69, 110, 20);
    		add(NIT_de_la_tienda1);
    		
    		ubicacion1 = new JTextField();
    		ubicacion1.setBounds(130, 99, 110, 20);
    		add(ubicacion1);

    		valor_IVA1 = new JTextField();
    		valor_IVA1.setBounds(130, 129, 110, 20);
    		add(valor_IVA1);
    		   
    		tasa_de_interes1 = new JTextField();
    		tasa_de_interes1.setBounds(130, 159, 110, 20);
    		add(tasa_de_interes1);
    		
    		nombre_del_banco1 = new JTextField();
    		nombre_del_banco1.setBounds(130, 189, 110, 20);
    		add(nombre_del_banco1);
    		    		
    		numero_de_cuenta1 = new JTextField();
    		numero_de_cuenta1.setBounds(130, 219, 110, 20);
    		add(numero_de_cuenta1);
    		    		
    		nombre_del_gerente1 = new JTextField();
    		nombre_del_gerente1.setBounds(130, 249, 110, 20);
    		add(nombre_del_gerente1);
    		
   		    butLeer = new JButton("Almacenar");		
    		butLeer.setActionCommand(LEER);
    		butLeer.setBounds(300, 95, 100, 50);
    	     add(butLeer);
    	       	       	      	    
       }

		public JLabel getNombre_de_la_tienda() {
			return nombre_de_la_tienda;
		}

		public void setNombre_de_la_tienda(JLabel nombre_de_la_tienda) {
			this.nombre_de_la_tienda = nombre_de_la_tienda;
		}

		public JLabel getTipo_de_comercio() {
			return tipo_de_comercio;
		}

		public void setTipo_de_comercio(JLabel tipo_de_comercio) {
			this.tipo_de_comercio = tipo_de_comercio;
		}

		public JLabel getNIT_de_la_tienda() {
			return NIT_de_la_tienda;
		}

		public void setNIT_de_la_tienda(JLabel nIT_de_la_tienda) {
			NIT_de_la_tienda = nIT_de_la_tienda;
		}

		public JLabel getUbicacion() {
			return ubicacion;
		}

		public void setUbicacion(JLabel ubicacion) {
			this.ubicacion = ubicacion;
		}

		public JLabel getValor_IVA() {
			return valor_IVA;
		}

		public void setValor_IVA(JLabel valor_IVA) {
			this.valor_IVA = valor_IVA;
		}

		public JLabel getTasa_de_interes() {
			return tasa_de_interes;
		}

		public void setTasa_de_interes(JLabel tasa_de_interes) {
			this.tasa_de_interes = tasa_de_interes;
		}

		public JLabel getNombre_del_banco() {
			return nombre_del_banco;
		}

		public void setNombre_del_banco(JLabel nombre_del_banco) {
			this.nombre_del_banco = nombre_del_banco;
		}

		public JLabel getNumero_de_cuenta() {
			return numero_de_cuenta;
		}

		public void setNumero_de_cuenta(JLabel numero_de_cuenta) {
			this.numero_de_cuenta = numero_de_cuenta;
		}

		public JLabel getNombre_del_gerente() {
			return nombre_del_gerente;
		}

		public void setNombre_del_gerente(JLabel nombre_del_gerente) {
			this.nombre_del_gerente = nombre_del_gerente;
		}

		public JTextField getNombre_de_la_tienda1() {
			return nombre_de_la_tienda1;
		}

		public void setNombre_de_la_tienda1(JTextField nombre_de_la_tienda1) {
			this.nombre_de_la_tienda1 = nombre_de_la_tienda1;
		}

		public JTextField getTipo_de_comercio1() {
			return tipo_de_comercio1;
		}

		public void setTipo_de_comercio1(JTextField tipo_de_comercio1) {
			this.tipo_de_comercio1 = tipo_de_comercio1;
		}

		public JTextField getNIT_de_la_tienda1() {
			return NIT_de_la_tienda1;
		}

		public void setNIT_de_la_tienda1(JTextField nIT_de_la_tienda1) {
			NIT_de_la_tienda1 = nIT_de_la_tienda1;
		}

		public JTextField getUbicacion1() {
			return ubicacion1;
		}

		public void setUbicacion1(JTextField ubicacion1) {
			this.ubicacion1 = ubicacion1;
		}

		public JTextField getValor_IVA1() {
			return valor_IVA1;
		}

		public void setValor_IVA1(JTextField valor_IVA1) {
			this.valor_IVA1 = valor_IVA1;
		}

		public JTextField getTasa_de_interes1() {
			return tasa_de_interes1;
		}

		public void setTasa_de_interes1(JTextField tasa_de_interes1) {
			this.tasa_de_interes1 = tasa_de_interes1;
		}

		public JTextField getNombre_del_banco1() {
			return nombre_del_banco1;
		}

		public void setNombre_del_banco1(JTextField nombre_del_banco1) {
			this.nombre_del_banco1 = nombre_del_banco1;
		}

		public JTextField getNumero_de_cuenta1() {
			return numero_de_cuenta1;
		}

		public void setNumero_de_cuenta1(JTextField numero_de_cuenta1) {
			this.numero_de_cuenta1 = numero_de_cuenta1;
		}

		public JTextField getNombre_del_gerente1() {
			return nombre_del_gerente1;
		}

		public void setNombre_del_gerente1(JTextField nombre_del_gerente1) {
			this.nombre_del_gerente1 = nombre_del_gerente1;
		}

		public static String getLeer() {
			return LEER;
		}

		public JButton getButLeer() {
			return butLeer;
		}

		public void setButLeer(JButton butLeer) {
			this.butLeer = butLeer;
		}
    	    	 
		
}    
    
		
    		
    		
    		
		
	

	
		
		

