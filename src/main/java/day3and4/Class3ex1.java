package day3and4;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

public class Class3ex1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("http://www.leaftaps.com");
		driver.manage().window().maximize();
		driver.findElementById("username").sendKeys("DemoSalesManager");
		driver.findElementById("password").sendKeys("crmsfa");
		Thread.sleep(3000);
		driver.findElementByClassName("decorativeSubmit").click();
		driver.findElementByLinkText("CRM/SFA").click();
		driver.findElementByLinkText("Leads").click();
		driver.findElementByLinkText("Merge Leads").click();
		driver.findElementByXPath("(//img[@alt='Lookup'])[1]").click();
		//String parenttitle=driver.getTitle();
		//String parenturl=driver.getCurrentUrl();
		String parentWindow = driver.getWindowHandle();
		Set<String> allwindows=driver.getWindowHandles();
		System.out.println(allwindows.size());
		for (String eachwindow : allwindows) {
			//System.out.println(eachwindow.length());
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
		driver.findElementByLinkText("Merge").click();
		driver.switchTo().alert().accept();
		driver.findElementByLinkText("Find Leads").click();
		driver.findElementByXPath("//label[contains(text(),'Lead ID:')]/following::input").sendKeys("16461");
		driver.findElementByXPath("//button[contains(text(),'Find Leads')]").click();
		System.out.println(driver.findElementByXPath("//div[contains(text(),'No records to display')]").getText());
		driver.close();
	}

}
