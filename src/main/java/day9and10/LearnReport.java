package day9and10;

import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class LearnReport {

	@Test
	public void sample(){
		//push to @beforesuite
		ExtentReports reports=new ExtentReports("./reports/DeleteLead.HTML", false);
		//reports.loadConfig("extent-config.xml");
		
		//push this to @before method
		ExtentTest test =reports.startTest("Delete Lead", "Start Delete Lead");
		test.assignAuthor("Praveen Kannan");
		test.assignCategory("Regression");
		
		test.log(LogStatus.WARNING, "Warning", " Warning step");
		test.log(LogStatus.FAIL, "Fatal", " Fatal step");
		
		//push this to @after method
		reports.endTest(test);
		//push this to @before suite
		reports.flush();
		
	}
}
