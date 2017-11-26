package project1;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class EditLead extends ProjectLogin {
	@Test(groups={"smoke"},dataProvider="fetchdata4")
	public void editLead1(String fname)throws InterruptedException{
		
		clickByLinkNoSnap("Leads");
		clickByLinkNoSnap("Find Leads");
		enterByXpath("(//label[contains(text(),'First name:')])[3]/following::input",fname);
		clickByXpathNoSnap("//button[text()='Find Leads']");
		Thread.sleep(2000);
		clickByXpathNoSnap("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId'])[1]/a");
		verifyTitle("View Lead | opentaps CRM");
		clickByLinkNoSnap("Edit");
		enterById("updateLeadForm_companyName", "CTS");
		clickByClassName("smallSubmit");
		verifyTextById("viewLead_companyName_sp", "CTS");
		takeSnap();
	}
	@DataProvider(name="fetchdata4")
	public static String[][] getData(){
		String[][] testdata=new String[1][1];
		testdata[0][0]="praveen";
		return testdata;
	}
		
}
