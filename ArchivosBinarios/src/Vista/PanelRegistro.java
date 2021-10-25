package Vista;

import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.border.TitledBorder;

public class PanelRegistro extends JPanel{

	/**
	 * 
	 */
	private JTextArea txtNombre;
	private JTextArea txtEdad;
	private JTextArea txtSalario;
	private JLabel labArchivo;
	
	private static final long serialVersionUID = 1L;
	
	public PanelRegistro() {
		setLayout( new GridLayout(1,3) );
		TitledBorder border = BorderFactory.createTitledBorder("Lectura Registros");
		border.setTitleColor(Color.BLACK);
		setBorder( border );
		labArchivo = new JLabel("Resultado de Registros");
		txtNombre = new JTextArea("");
		txtNombre.setForeground(Color.BLACK);
		txtNombre.setBackground(Color.WHITE);
	
		txtEdad = new JTextArea("");
		txtEdad.setForeground(Color.BLACK);
		txtEdad.setBackground(Color.WHITE);
		
		txtSalario = new JTextArea("");
		txtSalario.setForeground(Color.BLACK);
		txtSalario.setBackground(Color.WHITE);
		
		//add(labArchivo);
		//add(new JLabel(""));
		add(txtNombre);
		add(txtEdad);
		add(txtSalario);
	}

	public JTextArea getTxtNombre() {
		return txtNombre;
	}

	public void setTxtNombre(JTextArea txtNombre) {
		this.txtNombre = txtNombre;
	}

	public JTextArea getTxtEdad() {
		return txtEdad;
	}

	public void setTxtEdad(JTextArea txtEdad) {
		this.txtEdad = txtEdad;
	}

	public JTextArea getTxtSalario() {
		return txtSalario;
	}

	public void setTxtSalario(JTextArea txtSalario) {
		this.txtSalario = txtSalario;
	}

	public JLabel getLabArchivo() {
		return labArchivo;
	}

	public void setLabArchivo(JLabel labArchivo) {
		this.labArchivo = labArchivo;
	}
	
}
