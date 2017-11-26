package learn_pdfbox;
import java.io.File;
import java.io.IOException;

import org.apache.pdfbox.pdmodel.PDDocument; 
import org.apache.pdfbox.text.PDFTextStripper;

public class Lesson08_ReadingText {
	public static void main (String args[]) throws IOException {

		//Loading an existing document
		 //Loading an existing document
	      File file = new File("E:/Praveen/Selenium/JSON_Spring/pdf/my_doc.pdf");
	      PDDocument document = PDDocument.load(file);

	      //Instantiate PDFTextStripper class
	      PDFTextStripper pdfStripper = new PDFTextStripper();

	      //Retrieving text from PDF document
	      String text = pdfStripper.getText(document);
	      System.out.println(text);

	      //Closing the document
	      document.close();
	}
}