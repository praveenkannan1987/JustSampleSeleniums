package learn_pdfbox;
import java.io.File;
import java.io.IOException;
import org.apache.pdfbox.pdmodel.PDDocument; 
//import org.apache.pdfbox.pdmodel.PDPage;

public class Lesson04_removingpages {

	public static void main(String args[]) throws IOException {

		File file = new File("E:/Praveen/Selenium/JSON_Spring/pdf/my_doc.pdf"); 
		PDDocument document = PDDocument.load(file); 
	       
	      //Listing the number of existing pages
	      int noOfPages= document.getNumberOfPages();
	      System.out.print(noOfPages);
	       
	      //Removing the pages
	      document.removePage(2);
	      
	      System.out.println("page removed");

	      //Saving the document
	      document.save("E:/Praveen/Selenium/JSON_Spring/pdf/my_doc.pdf");

	      //Closing the document
	      document.close();
	}  
}