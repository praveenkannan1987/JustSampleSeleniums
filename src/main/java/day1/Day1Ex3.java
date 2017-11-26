package day1;

import org.openqa.selenium.firefox.FirefoxDriver;

public class Day1Ex3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver_64bit.exe");
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("http://www.leaftaps.com");
		driver.manage().window().maximize();
		driver.findElementById("username").sendKeys("DemoSalesManager");
		driver.findElementById("password").sendKeys("crmsfa");
		driver.findElementByClassName("decorativeSubmit").click();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.findElementByLinkText("CRM/SFA").click();
		try {
			Thread.sleep(8000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.findElementByLinkText("Create Lead").click();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		driver.findElementById("createLeadForm_companyName").sendKeys("Aon");
		driver.findElementById("createLeadForm_firstName").sendKeys("Praveen");
		driver.findElementById("createLeadForm_lastName").sendKeys("Kannan");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.findElementByClassName("smallSubmit").click();
	}

}
