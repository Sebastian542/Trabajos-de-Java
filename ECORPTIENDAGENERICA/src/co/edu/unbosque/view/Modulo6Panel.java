package co.edu.unbosque.view;

import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.border.TitledBorder;

public class Modulo6Panel extends JDialog {
	private static final long serialVersionUID = 1L;
	public static final String VOLVER9 = "Volver9";
	private JTextArea listadoClientes;
	private JTextArea totalVentasCliente;
	private JTextArea detalleVentasCliente;
	private JTextArea totalComprasProveedor;
	private JTextArea detalleChequesExpedidos;
	private JButton butVolver;
	
	public Modulo6Panel() {
		setLayout( new GridLayout(1,6, 1,1) );
		setBackground(new Color(255, 69, 0));
		TitledBorder border = BorderFactory.createTitledBorder("  Clientes                                                Total de Ventas           "
				+"               "+ "Detalle de Ventas                 Compras por proveedor              Cheques expedidos");
		border.setTitleColor(Color.WHITE);
//		setBorder( border );
		
		butVolver = new JButton("Volver");
		butVolver.setActionCommand(VOLVER9);
		
		listadoClientes = new JTextArea();
		listadoClientes.setForeground(Color.WHITE);
		listadoClientes.setBackground(new Color(255, 69, 0));

		totalVentasCliente = new JTextArea();
		totalVentasCliente.setForeground(Color.WHITE);
		totalVentasCliente.setBackground(new Color(255, 80, 0));
		
		detalleVentasCliente = new JTextArea();
		detalleVentasCliente.setForeground(Color.WHITE);
		detalleVentasCliente.setBackground(new Color(255, 69, 0));
		
		totalComprasProveedor = new JTextArea();
		totalComprasProveedor.setForeground(Color.WHITE);
		totalComprasProveedor.setBackground(new Color(255,80, 0));
		
		detalleChequesExpedidos = new JTextArea();
		detalleChequesExpedidos.setForeground(Color.WHITE);
		detalleChequesExpedidos.setBackground(new Color(255, 69, 0));
		
		add(butVolver);
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

	public JButton getButVolver() {
		return butVolver;
	}

	public void setButVolver(JButton butVolver) {
		this.butVolver = butVolver;
	}

	public static String getVolver9() {
		return VOLVER9;
	}
	
}
