package tests;

import org.junit.Test;

import wrappers.GenericWrappers;

public class Day4LearnWrappers2 extends GenericWrappers {
	@Test
	public void selectEgypt(){
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
		/*WebElement src=driver.findElementById("createLeadForm_dataSourceId");
		Select source=new Select(src);
		source.selectByVisibleText("Direct Mail");*/
		System.out.println("before");
		selectVisibileTextById("createLeadForm_dataSourceId","Direct Mail");
		System.out.println("before");
		
		/*WebElement src1=driver.findElementById("createLeadForm_industryEnumId");
		Select source1=new Select(src1);
		source1.selectByValue("IND_DISTRIBUTION");*/
		
		selectVisibileTextById("createLeadForm_industryEnumId","Distribution");
		
		/*WebElement src2=driver.findElementById("createLeadForm_ownershipEnumId");
		Select source2=new Select(src2);
		source2.selectByIndex(2);*/
		selectIndexById("createLeadForm_ownershipEnumId",2);
		/*
		WebElement src3=driver.findElementById("createLeadForm_currencyUomId");
		Select source3=new Select(src3);
		List<WebElement> alloptions = source3.getOptions();
		int count =alloptions.size();
		for (WebElement obj2 : alloptions) {
			String s=obj2.getText();
			if(s.startsWith("E")){
				if(s.contains("g")){
					source3.selectByVisibleText(s);
				//System.out.println("ok");
				}
			}
		}
		System.out.println(count);*/
	}
	
}
