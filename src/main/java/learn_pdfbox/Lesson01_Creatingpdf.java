package learn_pdfbox;

import java.io.IOException;

import org.apache.pdfbox.pdmodel.PDDocument;

public class Lesson01_Creatingpdf {

	public static void main(String[] args) throws IOException {
		PDDocument document = new PDDocument();    
	       
	      //Saving the document
	      document.save("E:/Praveen/Selenium/JSON_Spring/pdf/my_doc.pdf");
	         
	      System.out.println("PDF created");  
	    
	      //Closing the document  
	      document.close();

	}

}
