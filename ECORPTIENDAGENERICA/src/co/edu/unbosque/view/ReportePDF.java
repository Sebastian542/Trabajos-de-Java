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
import javax.swing.JPanel;
import javax.swing.JTextField;

public class ReportePDF extends JPanel {
	
	private JTextField GenerarPDF;

	private AbstractButton JTextField;
		
	public static final String GENERARPDF = "GenerarPDF";
		
	public ReportePDF() {
		
		setBounds(300, 80, 450, 450);
		setLayout(null);
		
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
					
					
	


