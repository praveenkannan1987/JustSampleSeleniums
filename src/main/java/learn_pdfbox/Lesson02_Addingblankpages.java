package learn_pdfbox;

import java.io.IOException;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.pdmodel.PDPage;

public class Lesson02_Addingblankpages {

	public static void main(String[] args) throws IOException {
		PDDocument document = new PDDocument();

	      for (int i=0; i<3; i++) {
	         //Creating a blank page 
	         PDPage blankPage = new PDPage();

	         //Adding the blank page to the document
	         document.addPage( blankPage );
	      } 
	     
	      //Saving the document
	      document.save("E:/Praveen/Selenium/JSON_Spring/pdf/my_doc.pdf");
	      System.out.println("PDF created");
	      
	      //Closing the document
	      document.close();

	}

}
