package project1;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DeleteLead extends ProjectLogin{

	
	@Test(groups={"sanity"},dependsOnGroups={"smoke"},dataProvider="fetchdata2")
	public void deleteLead1(String phn)throws InterruptedException{
		clickByLinkNoSnap("Leads");
		clickByLinkNoSnap("Find Leads");
		clickByXpathNoSnap("//span[text()='Phone']");
		enterByName("phoneNumber", phn);
		clickByXpath("//button[text()='Find Leads']");
		Thread.sleep(3000);
		takeSnap();
		String s=getTextByXpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId'])[1]/a");
		clickByXpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId'])[1]/a");
		clickByLink("Delete");
		clickByLink("Find Leads");
		enterByName("id", s);
		takeSnap();
		clickByXpath("//button[text()='Find Leads']");
		verifyTextContainsByXpath("//div[contains(text(),'No records to display')]","No records to display");
	}
	
	@DataProvider(name="fetchdata2")
	public static String[][] getData(){
		String[][] testdata=new String[1][1];
		testdata[0][0]="888";
		return testdata;
	}
}
