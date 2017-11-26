package day3and4;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

public class Day3LernWindow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://legacy.crystalcruises.com/");
		driver.manage().window().maximize();
		String parenttitle=driver.getTitle();
		String parenturl=driver.getCurrentUrl();
		String parentWindow = driver.getWindowHandle();
		
		//Launch Guest check in
		driver.findElementByLinkText("GUEST CHECK-IN").click();
		
		//assign window handles
		Set<String> allwindows=driver.getWindowHandles();
		
		for (String eachwindow : allwindows) {
			
			//if not parent window
			if(!eachwindow.equals(parentWindow)){
				
				//Switch second window and print title and url and first name
				driver.switchTo().window(eachwindow);
				System.out.println("Child Window URL="+driver.getCurrentUrl()+" Title="+driver.getTitle());
				System.out.println(driver.findElementByXPath("//*[@id='leftColumn']/div[2]/table/tbody/tr/td[1]/table/tbody/tr[1]/td[1]").getText());
				driver.close();
			}
		}
		//Switch back to parent window
		driver.switchTo().window(parentWindow);
		//print phone number
		System.out.println("Phone Number:"+driver.findElementById("PlanAndBookPhoneNumber").getText());
		//print parent url and title
		System.out.println("parent url="+parenturl+" Title="+parenttitle);
	}

}
