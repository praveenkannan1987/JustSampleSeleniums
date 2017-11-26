package project1;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DuplicateLead extends ProjectLogin{
	
	@Test(groups={"sanity"},dependsOnGroups={"smoke"},dataProvider="fetchdata3")
	public void duplicateLead1(String emal) throws InterruptedException {
		clickByLink("Leads");
		clickByLink("Find Leads");
		clickByLink("Email");
		enterByName("emailAddress",emal) ;
		clickByXpath("//button[contains(text(),'Find Leads')]");
		String firstResultName=getTextByXpath("(//*[@class='x-grid3-cell-inner x-grid3-col-firstName'])[1]");
		clickByXpath("(//*[@class='x-grid3-cell-inner x-grid3-col-partyId'])[1]/a");
		clickByLink("Duplicate Lead");
		verifyTextById("sectionHeaderTitle_leads","Duplicate Lead");
		clickByName("submitButton");
		verifyTextById("viewLead_firstName_sp",firstResultName);
	}
	@DataProvider(name="fetchdata3")
	public static String[][] getData(){
		String[][] testdata=new String[1][1];
		testdata[0][0]="are";
		return testdata;
	}
}
