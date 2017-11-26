package day7and8;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LearnAnnonation {
	@Test(invocationCount=2, invocationTimeOut=15000)
	public void main1() throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://www.leaftaps.com");
		driver.manage().window().maximize();
		driver.findElementById("username").sendKeys("DemoSalesManager");
		driver.findElementById("password").sendKeys("crmsfa");
		Thread.sleep(5000);
		driver.findElementByClassName("decorativeSubmit").click();
		driver.close();


	}

}
