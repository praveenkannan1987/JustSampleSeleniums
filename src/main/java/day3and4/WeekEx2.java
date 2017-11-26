package day3and4;


import org.junit.Test;

import wrappers.GenericWrappers;


public class WeekEx2 extends GenericWrappers{

	@Test
	public void mergeLead1() throws InterruptedException {
		
		invokeApp("chrome", "http://www.leaftaps.com");
		enterById("username","DemoSalesManager");
		enterById("password","crmsfa");
		Thread.sleep(3000);
		clickByClassName("decorativeSubmit");
		clickByLinkNoSnap("CRM/SFA");
		clickByLinkNoSnap("Leads");
		clickByLinkNoSnap("Merge Leads");
		clickByXpathNoSnap("(//img[@alt='Lookup'])[1]");
		
		switchToLastWindow();
		enterByXpath("//label[contains(text(),'Lead ID:')]/following::input", "15053");
		clickByXpathNoSnap("//button[contains(text(),'Find Leads')]");
		Thread.sleep(3000);
		clickByXpathNoSnap("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId'])[1]/a");
		switchToParentWindow();
		clickByXpathNoSnap("(//img[@alt='Lookup'])[2]");
		/*
		
		Set<String> allwindows=driver.getWindowHandles();
		
		for (String eachwindow : allwindows) {
			
			//if not parent window
			if(!eachwindow.equals(parentWindow)){
				
				//Switch second window and print title and url and first name
				driver.switchTo().window(eachwindow);
				//System.out.println("Child Window URL="+driver.getCurrentUrl()+" Title="+driver.getTitle());
				driver.findElementByXPath("//label[contains(text(),'Lead ID:')]/following::input").sendKeys("16461");
				driver.findElementByXPath("//button[contains(text(),'Find Leads')]").click();
				Thread.sleep(3000);
				driver.findElementByXPath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId'])[1]/a").click();
				//driver.close();
			}
		}
		//Switch back to parent window
		driver.switchTo().window(parentWindow);
		driver.findElementByXPath("(//img[@alt='Lookup'])[2]").click();
		*/
		
		switchToLastWindow();
		enterByXpath("//label[contains(text(),'Lead ID:')]/following::input", "15055");
		clickByXpathNoSnap("//button[contains(text(),'Find Leads')]");
		Thread.sleep(3000);
		clickByXpathNoSnap("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId'])[1]/a");
		/*
		Set<String> allwindows1=driver.getWindowHandles();
		
		for (String eachwindow : allwindows1) {
			
			//if not parent window
			if(!eachwindow.equals(parentWindow)){
				driver.switchTo().window(eachwindow);
				driver.findElementByXPath("//label[contains(text(),'Lead ID:')]/following::input").sendKeys("16465");
				driver.findElementByXPath("//button[contains(text(),'Find Leads')]").click();
				Thread.sleep(3000);
				driver.findElementByXPath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId'])[1]/a").click();
				//driver.close();
			}
				
		}
		driver.switchTo().window(parentWindow);
		*/
		switchToParentWindow();
		clickByLinkNoSnap("Merge");
		acceptAlert();
		clickByLinkNoSnap("Find Leads");
		enterByXpath("//label[contains(text(),'Lead ID:')]/following::input","15053");
		clickByXpathNoSnap("//button[contains(text(),'Find Leads')]");
		verifyTextByXpath("//div[contains(text(),'No records to display')]","No records to display");
		
		closeBrowser();
		/*
		driver.findElementByLinkText("Merge").click();
		driver.switchTo().alert().accept();
		driver.findElementByLinkText("Find Leads").click();
		driver.findElementByXPath("//label[contains(text(),'Lead ID:')]/following::input").sendKeys("16461");
		driver.findElementByXPath("//button[contains(text(),'Find Leads')]").click();
		System.out.println(driver.findElementByXPath("//div[contains(text(),'No records to display')]").getText());
		driver.close();
		 */
	}
}
