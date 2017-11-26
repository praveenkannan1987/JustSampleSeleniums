package tests;


import org.junit.Test;

import wrappers.GenericWrappers;


public class Day4LearnWrappers extends GenericWrappers {

	@Test
	public void creatLead() {
		// TODO Auto-generated method stub
		
		/*System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("http://www.leaftaps.com");
		driver.manage().window().maximize();*/
		invokeApp("chrome", "http://www.leaftaps.com");
		
//		driver.findElementById("username").sendKeys("DemoSalesManager");
//		driver.findElementById("password").sendKeys("crmsfa");
		enterById("username","DemoSalesManager");
		enterById("password","crmsfa");
		
//		driver.findElementByClassName("decorativeSubmit").click();
		
		clickByClassName("decorativeSubmit");

//		driver.findElementByLinkText("CRM/SFA").click();
		clickByLinkNoSnap("CRM/SFA");
		
//		driver.findElementByLinkText("Create Lead").click();
		clickByLinkNoSnap("Create Lead");
		
/*		driver.findElementById("createLeadForm_companyName").sendKeys("Aon");
		driver.findElementById("createLeadForm_firstName").sendKeys("Praveen");
		driver.findElementById("createLeadForm_lastName").sendKeys("Kannan");*/
		
		enterById("createLeadForm_companyName","Aon");
		enterById("createLeadForm_firstName","Praveen");
		enterById("createLeadForm_lastName","Kannan");
		
//		driver.findElementByClassName("smallSubmit").click();
//		clickByClassName("smallSubmit");
	}

}
