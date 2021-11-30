package co.edu.unbosque.view;

import java.awt.EventQueue;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.pdmodel.PDPage;
import org.apache.pdfbox.pdmodel.PDPageContentStream;
import org.apache.pdfbox.pdmodel.common.PDRectangle;
import org.apache.pdfbox.pdmodel.font.PDType1Font;

import javax.swing.AbstractButton;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;
// conectar al controller y termino este modulo y OK :) :) ..
public class ReportePDF extends JFrame {
	
	private JTextField GenerarPDF;
	
	private String ruta = "C:\\data\\prueba.out";
	private String rutaReg = "C:\\data\\registro.out";

	private AbstractButton JTextField;
		
	public static final String GENERARPDF = "GenerarPDF";
		
	public static void main(String[] args) {
		
		EventQueue.invokeLater(new Runnable() {
		
			public void run() {
				
				try {
					
					ReportePDF frame = new ReportePDF();
					
					frame.setVisible(true);
					
				} catch (Exception e) {
					
					e.printStackTrace();
}
				
			}
			
		});
		
	}
	
	public ReportePDF() {
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(300, 80, 450, 450);
		getContentPane().setLayout(null);
		
		JButton butGenerarPDF = new JButton("GenerarPDF");
		butGenerarPDF.setActionCommand(GENERARPDF);
		butGenerarPDF.setBounds(200, 200, 150, 40);
		add(butGenerarPDF);
		
		GenerarPDF = new JTextField();
		GenerarPDF.setBounds(200, 200, 150, 40);
		add(GenerarPDF);
		GenerarPDF.setColumns(10);
		
	
	
    try{
		
		PDDocument documento = new PDDocument();
		PDPage pagina = new PDPage(PDRectangle.A6);
		documento.addPage(pagina);
		PDPageContentStream contenido = new PDPageContentStream(documento,pagina);
		
	
		contenido.beginText();
		contenido.setFont (PDType1Font.TIMES_BOLD, 12);
		contenido.newLineAtOffset (20, pagina.getMediaBox() .getHeight()-52);
		contenido.showText("Hola Mundo");
		contenido.endText ();		
		contenido.close();
		documento.save("C:\\data\\Prueba.pdf");
		
	}
    

	catch (Exception e) {
		
	    System.out.println("Error: " + e.getMessage() .toString());
	    
	 }
   }
	
		
	}
					
					
	


