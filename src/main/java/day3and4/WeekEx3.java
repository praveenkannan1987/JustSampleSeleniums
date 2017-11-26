package day3and4;

import org.junit.Test;

import wrappers.GenericWrappers;

public class WeekEx3 extends GenericWrappers {

	@Test
	public void createLead1() throws InterruptedException {
		// TODO Auto-generated method stub
		
		invokeApp("chrome", "http://www.leaftaps.com");
		
/*		driver.findElementById("username").sendKeys("DemoSalesManager");
		driver.findElementById("password").sendKeys("crmsfa");*/
		enterById("username","DemoSalesManager");
		enterById("password","crmsfa");
		
//		driver.findElementByClassName("decorativeSubmit").click();
		Thread.sleep(3000);
		clickByClassName("decorativeSubmit");

//		driver.findElementByLinkText("CRM/SFA").click();
		clickByLinkNoSnap("CRM/SFA");
		
//		driver.findElementByLinkText("Create Lead").click();
		clickByLinkNoSnap("Create Lead");
		
/*		driver.findElementById("createLeadForm_companyName").sendKeys("Aon");
		driver.findElementById("createLeadForm_firstName").sendKeys("Praveen");
		driver.findElementById("createLeadForm_lastName").sendKeys("Kannan");*/
		
		enterById("createLeadForm_companyName","Aon");
		
		
		enterById("createLeadForm_parentPartyId","13591");
		enterById("createLeadForm_firstName","Praveen");
		enterById("createLeadForm_lastName","Kannan");
		
//		driver.findElementByClassName("smallSubmit").click();
//		clickByClassName("smallSubmit");
		/*WebElement src=driver.findElementById("createLeadForm_dataSourceId");
		Select source=new Select(src);
		source.selectByVisibleText("Direct Mail");*/
		
		selectVisibileTextById("createLeadForm_dataSourceId","Direct Mail");
		selectVisibileTextById("createLeadForm_marketingCampaignId","Car and Driver");
		
		enterById("createLeadForm_firstNameLocal","Praveen");
		enterById("createLeadForm_lastNameLocal","Kannan");
		enterById("createLeadForm_personalTitle","Mr.");
		enterById("createLeadForm_generalProfTitle","Simple");
		enterById("createLeadForm_departmentName","Testing");
		enterById("createLeadForm_annualRevenue","6000");
		selectVisibileTextById("createLeadForm_currencyUomId","INR - Indian Rupee");
		
		/*WebElement src1=driver.findElementById("createLeadForm_industryEnumId");
		Select source1=new Select(src1);
		source1.selectByValue("IND_DISTRIBUTION");*/
		
		selectVisibileTextById("createLeadForm_industryEnumId","Distribution");
		enterById("createLeadForm_numberEmployees","500");
		selectVisibileTextById("createLeadForm_ownershipEnumId","Partnership");
		enterById("createLeadForm_sicCode","1234");
		enterById("createLeadForm_tickerSymbol","%@#");
		enterById("createLeadForm_description","Good Luck....");
		enterById("createLeadForm_importantNote","Good luck2....");
		enterById("createLeadForm_primaryPhoneCountryCode","+91");
		enterById("createLeadForm_primaryPhoneAreaCode","85");
		enterById("createLeadForm_primaryPhoneNumber","8888888888");
		enterById("createLeadForm_primaryPhoneExtension","4321");
		enterById("createLeadForm_primaryPhoneAskForName","praveen");
		enterById("createLeadForm_primaryEmail","sek2525@gmail.com");
		enterById("createLeadForm_primaryWebUrl","http://www.leaftaps.com");
		
		enterById("createLeadForm_generalToName","Praveen");
		enterById("createLeadForm_generalAttnName","kannan");
		enterById("createLeadForm_generalAddress1","SS no1");
		enterById("createLeadForm_generalAddress2","KK NAgar");
		enterById("createLeadForm_generalCity","Chennai");
		selectVisibileTextById("createLeadForm_generalCountryGeoId","India");
		enterById("createLeadForm_generalPostalCode","600030");
		enterById("createLeadForm_generalPostalCodeExt","044");
		selectVisibileTextById("createLeadForm_generalStateProvinceGeoId","TAMILNADU");
		clickByClassName("smallSubmit");
		clickByLinkNoSnap("Duplicate Lead");
		verifyTextById("createLeadForm_companyName","Aon");
		verifyTextById("createLeadForm_parentPartyId","13591");
		verifyTextById("createLeadForm_firstName","Praveen");
		verifyTextById("createLeadForm_lastName","Kannan");
		
//		driver.findElementByClassName("smallSubmit").click();
//		clickByClassName("smallSubmit");
		/*WebElement src=driver.findElementById("createLeadForm_dataSourceId");
		Select source=new Select(src);
		source.selectByVisibleText("Direct Mail");*/
		
		verifyTextById("createLeadForm_dataSourceId","Direct Mail");
		verifyTextById("createLeadForm_marketingCampaignId","Car and Driver");
		
		verifyTextById("createLeadForm_firstNameLocal","Praveen");
		verifyTextById("createLeadForm_lastNameLocal","Kannan");
		verifyTextById("createLeadForm_personalTitle","Mr.");
		verifyTextById("createLeadForm_generalProfTitle","Simple");
		verifyTextById("createLeadForm_departmentName","Testing");
		verifyTextById("createLeadForm_annualRevenue","6,000");
		verifyTextById("createLeadForm_currencyUomId","INR - Indian Rupee");
		
		/*WebElement src1=driver.findElementById("createLeadForm_industryEnumId");
		Select source1=new Select(src1);
		source1.selectByValue("IND_DISTRIBUTION");*/
		
		verifyTextById("createLeadForm_industryEnumId","Distribution");
		verifyTextById("createLeadForm_numberEmployees","500");
		verifyTextById("createLeadForm_ownershipEnumId","Partnership");
		verifyTextById("createLeadForm_sicCode","1234");
		verifyTextById("createLeadForm_tickerSymbol","%@#");
		verifyTextById("createLeadForm_description","Good Luck....");
		verifyTextById("createLeadForm_importantNote","Good luck2....");
		verifyTextById("createLeadForm_primaryPhoneCountryCode","+91");
		verifyTextById("createLeadForm_primaryPhoneAreaCode","85");
		verifyTextById("createLeadForm_primaryPhoneNumber","8888888888");
		verifyTextById("createLeadForm_primaryPhoneExtension","4321");
		verifyTextById("createLeadForm_primaryPhoneAskForName","praveen");
		verifyTextById("createLeadForm_primaryEmail","sek2525@gmail.com");
		verifyTextById("createLeadForm_primaryWebUrl","http://www.leaftaps.com");
		
		verifyTextById("createLeadForm_generalToName","Praveen");
		verifyTextById("createLeadForm_generalAttnName","kannan");
		verifyTextById("createLeadForm_generalAddress1","SS no1");
		verifyTextById("createLeadForm_generalAddress2","KK NAgar");
		verifyTextById("createLeadForm_generalCity","Chennai");
		verifyTextById("createLeadForm_generalCountryGeoId","India");
		verifyTextById("createLeadForm_generalPostalCode","600030");
		verifyTextById("createLeadForm_generalPostalCodeExt","044");
		verifyTextById("createLeadForm_generalStateProvinceGeoId","IN-TN");
		clickByClassName("smallSubmit");
	}
	
}
