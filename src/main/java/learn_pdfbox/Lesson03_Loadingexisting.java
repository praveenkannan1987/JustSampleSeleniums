package learn_pdfbox;
import java.io.File;
import java.io.IOException;
import org.apache.pdfbox.pdmodel.PDDocument; 
import org.apache.pdfbox.pdmodel.PDPage;

public class Lesson03_Loadingexisting {

	public static void main(String args[]) throws IOException {

			    //ading an existing document 
			File file = new File("E:/Praveen/Selenium/JSON_Spring/pdf/my_doc.pdf"); 
			PDDocument document = PDDocument.load(file); 

			System.out.println("PDF loaded"); 

			//Adding a blank page to the document 
			document.addPage(new PDPage());  
			
			//Saving the document 
			document.save("E:/Praveen/Selenium/JSON_Spring/pdf/my_doc.pdf");

			//Closing the document  
			document.close(); 

	}  
}