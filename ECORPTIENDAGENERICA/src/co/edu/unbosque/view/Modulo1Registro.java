package co.edu.unbosque.view;

import java.awt.BorderLayout;

import java.awt.EventQueue;

import java.awt.Font;

import javax.swing.JButton;

import javax.swing.JFrame;

import javax.swing.JLabel;

import javax.swing.JTextField;

import java.awt.event.ActionListener;

import java.awt.event.ActionEvent;

public class Modulo1Registro extends JFrame {
	
		// modulo 1 OK
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
	
	public static void main(String[] args) {
		
		EventQueue.invokeLater(new Runnable() {
			
			public void run() {
				
				try {
					
					Modulo1Registro frame = new Modulo1Registro();
					
					frame.setVisible(true);
					
				} catch (Exception e) {
					
					e.printStackTrace();
					
				}
				
			}
			
		});
		
	}

    	public Modulo1Registro() {
    		
    		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	
    		setBounds(300, 100, 450, 350);		
    		getContentPane().setLayout(null);
    		
    		JLabel lblNewLabel = new JLabel("Nombre de la tienda");
    		lblNewLabel.setBounds(51, 33, 46, 14);
    		getContentPane().add(lblNewLabel);
    		
    		JLabel lblNewLabel1 = new JLabel("Tipo de comercio");
    		lblNewLabel1.setBounds(51, 33, 46, 14);
    		getContentPane().add(lblNewLabel1);
    		
    		JLabel lblNewLabel_1 = new JLabel("NIT de la tienda");
    		lblNewLabel_1.setBounds(51, 33, 46, 14);
    		getContentPane().add(lblNewLabel_1);
    		
    		JLabel lblNewLabel11  = new JLabel("ubicacion");
    		lblNewLabel11.setBounds(51, 33, 46, 14);
    		getContentPane().add(lblNewLabel11);
    		
    		JLabel lblNewLabel_2 = new JLabel("valor IVA");
    		lblNewLabel_2.setBounds(51, 33, 46, 14);
    		getContentPane().add(lblNewLabel_2);
    		
    		JLabel lblNewLabel_ = new JLabel("Tasa de interes");
    		lblNewLabel_.setBounds(51, 33, 46, 14);
    		getContentPane().add(lblNewLabel_);
    		
    		JLabel lblNewLabel2 = new JLabel("Nombre del banco");
    		lblNewLabel2.setBounds(51, 33, 46, 14);
    		getContentPane().add(lblNewLabel2);
    		
    		JLabel lblNewLabe2 = new JLabel("Numero de cuenta");
    		lblNewLabel.setBounds(51, 33, 46, 14);
    		getContentPane().add(lblNewLabel);
    		
    		JLabel lblNewLabe_2 = new JLabel("Nombre del gerente");
    		lblNewLabel.setBounds(51, 33, 46, 14);
    		getContentPane().add(lblNewLabel);
    		
    		nombre_de_la_tienda = new JLabel("Nombre de la tienda");
    		nombre_de_la_tienda.setForeground(getForeground());
    		nombre_de_la_tienda.setBounds(10, 9, 200, 20);
    		nombre_de_la_tienda.setFont(new Font("Times new roman", Font.PLAIN, 14));	
    		add(nombre_de_la_tienda);
    				
    		tipo_de_comercio = new JLabel("Tipo de comercio");
    		tipo_de_comercio.setForeground(getForeground());
    		tipo_de_comercio.setBounds(10, 39, 200, 20);
    		tipo_de_comercio.setFont(new Font("Times new roman", Font.PLAIN, 14));
    		add(tipo_de_comercio);
    			 	
    		NIT_de_la_tienda = new JLabel("NIT de la tienda");
    		NIT_de_la_tienda.setForeground(getForeground());
    		NIT_de_la_tienda.setBounds(10, 69, 200, 20);
    		NIT_de_la_tienda.setFont(new Font("Times new roman", Font.PLAIN, 14));
    		add(NIT_de_la_tienda);
    				
    		ubicacion = new JLabel("ubicación");
    		ubicacion.setForeground(getForeground());
    		ubicacion.setBounds(10, 99, 86, 20);
    		ubicacion.setFont(new Font("Times new roman", Font.PLAIN, 14));
    		add(ubicacion);
    		    		
    		valor_IVA = new JLabel("Valor de IVA");
    		valor_IVA.setForeground(getForeground());
    		valor_IVA.setBounds(10, 129, 200, 20);
    		valor_IVA.setFont(new Font("Times new roman", Font.PLAIN, 14));
    		add(valor_IVA);
		
    		tasa_de_interes = new JLabel("Tasa de interés");
    		tasa_de_interes.setForeground(getForeground());
    		tasa_de_interes.setBounds(10, 159, 200, 20);
    		tasa_de_interes.setFont(new Font("Times new roman", Font.PLAIN, 14));
    		add(tasa_de_interes);
    		
    		nombre_del_banco = new JLabel("Nombre del banco");
    		nombre_del_banco.setForeground(getForeground());
    		nombre_del_banco.setBounds(10, 189, 200, 20);
    		nombre_del_banco.setFont(new Font("Times new roman", Font.PLAIN, 14));
    		add(nombre_del_banco);
    		
    		numero_de_cuenta = new JLabel("Número de cuenta");
    		numero_de_cuenta.setForeground(getForeground());
    		numero_de_cuenta.setBounds(10, 219, 190, 20);
    		numero_de_cuenta.setFont(new Font("Times new roman", Font.PLAIN, 14));
    		add(numero_de_cuenta);
    		   		    	    
    		nombre_del_gerente = new JLabel("Nombre del gerente");
    		nombre_del_gerente.setForeground(getForeground());
    		nombre_del_gerente.setBounds(10, 249, 190, 20);
    		nombre_del_gerente.setFont(new Font("Times new roman", Font.PLAIN, 14));
    		add(nombre_del_gerente);
    		
    		nombre_de_la_tienda1 = new JTextField();
    		nombre_de_la_tienda1.setBounds(130, 9, 110, 20);
    		add(nombre_de_la_tienda1);
    		nombre_de_la_tienda1.setColumns(10);   		
    		
    		tipo_de_comercio1 = new JTextField();
    		tipo_de_comercio1.setBounds(130, 39, 110, 20);
    		add(tipo_de_comercio1);
    		tipo_de_comercio1.setColumns(10);    		
    	
    		NIT_de_la_tienda1 = new JTextField();
    		NIT_de_la_tienda1.setBounds(130, 69, 110, 20);
    		add(NIT_de_la_tienda1);
    		NIT_de_la_tienda1.setColumns(10);
    		
    		ubicacion1 = new JTextField();
    		ubicacion1.setBounds(130, 99, 110, 20);
    		add(ubicacion1);
    		ubicacion1.setColumns(10);
    		
    		valor_IVA1 = new JTextField();
    		valor_IVA1.setBounds(130, 129, 110, 20);
    		add(valor_IVA1);
    		valor_IVA1.setColumns(10);
    		   
    		tasa_de_interes1 = new JTextField();
    		tasa_de_interes1.setBounds(130, 159, 110, 20);
    		add(tasa_de_interes1);
    		tasa_de_interes1.setColumns(10);
    		
    		nombre_del_banco1 = new JTextField();
    		nombre_del_banco1.setBounds(130, 189, 110, 20);
    		add(nombre_del_banco1);
    		nombre_del_banco1.setColumns(10);
    		    		
    		numero_de_cuenta1 = new JTextField();
    		numero_de_cuenta1.setBounds(130, 219, 110, 20);
    		add(numero_de_cuenta1);
    		numero_de_cuenta1.setColumns(10);
    		    		
    		nombre_del_gerente1 = new JTextField();
    		nombre_del_gerente1.setBounds(130, 249, 110, 20);
    		add(nombre_del_gerente1);
    		nombre_del_gerente1.setColumns(10);
    		
   		    JButton butLeer = new JButton("Leer");		
    		butLeer.setActionCommand(LEER);
    		butLeer.setBounds(300, 95, 100, 50);
    	     add(butLeer);
    	       	       	      	    
       }
    	    	    	
    	public static String getLEER() {
    		return LEER;
    		
    	}
    	
    	public JLabel getnombre_de_la_tienda() {
    		return nombre_de_la_tienda;
    		
    	}
    	
    	public void setnombre_de_la_tienda(JLabel nombre_de_la_tienda) {
    		this.nombre_de_la_tienda = nombre_de_la_tienda;
    		
    	}
    	
    	public JLabel gettipo_de_comercio() {
			return tipo_de_comercio;
    		
    	}
    	
    	public void settipo_de_comercio(JLabel tipo_de_comercio) {
    		this.tipo_de_comercio = tipo_de_comercio;
    		
    	}
    	
    	public JLabel getNIT_de_la_tienda() {
    		return NIT_de_la_tienda;
    		
    	}
    	
    	public void setNIT_de_la_tienda(JLabel NIT_de_la_tienda) {
    		this.NIT_de_la_tienda = NIT_de_la_tienda;
    		
    	}
    	
    	public JLabel getubicacion() {
    		return ubicacion;
    		
    	}
    	
    	public void setubicacion(JLabel ubicacion) {
    		this.ubicacion = ubicacion;
    		
    	}
    	
    	public JLabel getvalor_IVA() {
    		return valor_IVA;
    		
    	}
    	
    	public void setvalor_IVA(JLabel valor_IVA) {
    		this.valor_IVA = valor_IVA;
    		
    	}
    	
    	public JLabel gettasa_de_interes() {
			return tasa_de_interes;
    		
    	}
    	
    	public void settasa_de_interes(JLabel tasa_de_interes) {
    		this.tasa_de_interes = tasa_de_interes;
    		
    	}
    	
    	public JLabel getnombre_del_banco() {
			return nombre_del_banco;
			
    	}	
    	
    	public void setnombre_del_banco(JLabel nombre_del_banco) {
    		this.nombre_del_banco = nombre_del_banco;
    		
    	}
    	
    	public JLabel getnumero_de_cuenta() {
    		return numero_de_cuenta;
    		
    	}
    	
    	public void setnumero_de_cuenta(JLabel numero_de_cuenta) {
    		this.numero_de_cuenta = numero_de_cuenta;
    		
    	}
    	
    	public JLabel getnombre_del_gerente() {
    		return nombre_del_gerente;
    		
    	}
    	
    	public void setnombre_del_gerente(JLabel nombre_del_gerente) {
    		this.nombre_del_gerente = nombre_del_gerente;
    		
    	}
    	
   }
    
    
		
    		
    		
    		
		
	

	
		
		

