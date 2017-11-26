package project1;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class MergeLead extends ProjectLogin{
	
	@Test(groups={"sanity"},dependsOnGroups={"smoke"}, enabled=false,dataProvider="fetchdata5")
	public void mergeLead1(String input1,String input2) throws InterruptedException {
		clickByLinkNoSnap("Leads");
		clickByLinkNoSnap("Merge Leads");
		clickByXpathNoSnap("(//img[@alt='Lookup'])[1]");
		
		switchToLastWindow();
		enterByXpath("//label[contains(text(),'Lead ID:')]/following::input", input1);
		clickByXpathNoSnap("//button[contains(text(),'Find Leads')]");
		Thread.sleep(3000);
		clickByXpathNoSnap("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId'])[1]/a");
		switchToParentWindow();
		clickByXpathNoSnap("(//img[@alt='Lookup'])[2]");
		
		switchToLastWindow();
		enterByXpath("//label[contains(text(),'Lead ID:')]/following::input", input2);
		clickByXpathNoSnap("//button[contains(text(),'Find Leads')]");
		Thread.sleep(3000);
		clickByXpathNoSnap("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId'])[1]/a");
		
		switchToParentWindow();
		clickByLinkNoSnap("Merge");
		acceptAlert();
		clickByLinkNoSnap("Find Leads");
		enterByXpath("//label[contains(text(),'Lead ID:')]/following::input",input1);
		clickByXpathNoSnap("//button[contains(text(),'Find Leads')]");
		verifyTextByXpath("//div[contains(text(),'No records to display')]","No records to display");
	}
	@DataProvider(name="fetchdata5")
	public static String[][] getData(){
		String[][] testdata=new String[1][2];
		testdata[0][0]="15062";
		testdata[0][1]="15063";
		return testdata;
	}
}
