package day3and4;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day3LearnFrame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// initialise webdriver
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
				driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
				//Launch the URL
				driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_prompt");
			
				
				//declare frame
				WebElement framenm=driver.findElementById("iframeResult");
				driver.switchTo().frame(framenm);
				driver.findElementByXPath("/html/body/button").click();
				
				//declare alert and access it
				Alert alt=driver.switchTo().alert();
				System.out.println(alt.getText());
				alt.sendKeys("Praveen");
				//Thread.sleep(3000);
				alt.accept();
				System.out.println(driver.findElementById("demo").getText());
				driver.switchTo().defaultContent();
				driver.findElementById("tryhome").click();

	}

}
