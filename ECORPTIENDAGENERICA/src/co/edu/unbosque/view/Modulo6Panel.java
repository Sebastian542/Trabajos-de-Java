package co.edu.unbosque.view;

import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.border.TitledBorder;

public class Modulo6Panel extends JPanel {
	private static final long serialVersionUID = 1L;
	private JTextArea listadoClientes;
	private JTextArea totalVentasCliente;
	private JTextArea detalleVentasCliente;
	private JTextArea totalComprasProveedor;
	private JTextArea detalleChequesExpedidos;
	
	public Modulo6Panel() {
		setVisible(false);
		setLayout( new GridLayout(1,6, 1, 2) );
		setBackground(new Color(255, 69, 0));
		TitledBorder border = BorderFactory.createTitledBorder("  Clientes                                                Total de Ventas           "
				+"               "+ "Detalle de Ventas                 Compras por proveedor              Cheques expedidos");
		border.setTitleColor(Color.WHITE);
		setBorder( border );
		
		listadoClientes = new JTextArea();
		listadoClientes.setForeground(Color.BLACK);
		listadoClientes.setBackground(Color.WHITE);

		totalVentasCliente = new JTextArea();
		totalVentasCliente.setForeground(Color.BLACK);
		totalVentasCliente.setBackground(Color.WHITE);
		
		detalleVentasCliente = new JTextArea();
		detalleVentasCliente.setForeground(Color.BLACK);
		detalleVentasCliente.setBackground(Color.WHITE);
		
		totalComprasProveedor = new JTextArea();
		totalComprasProveedor.setForeground(Color.BLACK);
		totalComprasProveedor.setBackground(Color.WHITE);
		
		detalleChequesExpedidos = new JTextArea();
		detalleChequesExpedidos.setForeground(Color.BLACK);
		detalleChequesExpedidos.setBackground(Color.WHITE);

		add(listadoClientes);
		add(totalVentasCliente);
		add(detalleVentasCliente);
		add(totalComprasProveedor);
		add(detalleChequesExpedidos);
	}

	public JTextArea getListadoClientes() {
		return listadoClientes;
	}

	public void setListadoClientes(JTextArea listadoClientes) {
		this.listadoClientes = listadoClientes;
	}

	public JTextArea getTotalVentasCliente() {
		return totalVentasCliente;
	}

	public void setTotalVentasCliente(JTextArea totalVentasCliente) {
		this.totalVentasCliente = totalVentasCliente;
	}

	public JTextArea getDetalleVentasCliente() {
		return detalleVentasCliente;
	}

	public void setDetalleVentasCliente(JTextArea detalleVentasCliente) {
		this.detalleVentasCliente = detalleVentasCliente;
	}

	public JTextArea getTotalComprasProveedor() {
		return totalComprasProveedor;
	}

	public void setTotalComprasProveedor(JTextArea totalComprasProveedor) {
		this.totalComprasProveedor = totalComprasProveedor;
	}

	public JTextArea getDetalleChequesExpedidos() {
		return detalleChequesExpedidos;
	}

	public void setDetalleChequesExpedidos(JTextArea detalleChequesExpedidos) {
		this.detalleChequesExpedidos = detalleChequesExpedidos;
	}
	
}
