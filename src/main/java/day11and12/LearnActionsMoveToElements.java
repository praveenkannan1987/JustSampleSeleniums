package day11and12;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class LearnActionsMoveToElements {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		WebElement elec=driver.findElementByXPath("//span[text()='Electronics']");
		Actions builder=new Actions(driver);
		builder.moveToElement(elec).perform();
		WebElement ac1=driver.findElementByXPath("//span[text()='Asus']");
		builder.click(ac1).perform();
		
	}

}
