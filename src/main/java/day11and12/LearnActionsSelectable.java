package day11and12;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class LearnActionsSelectable {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://jqueryui.com/selectable/");
		driver.switchTo().frame(driver.findElementByClassName("demo-frame"));
		//WebElement li2=driver.findElementByXPath("//li[text()='Item 2']");
		WebElement li4=driver.findElementByXPath("//li[text()='Item 4']");
		//WebElement li6=driver.findElementByXPath("//li[text()='Item 6']");
		WebElement li7=driver.findElementByXPath("//li[text()='Item 7']");
		Actions builder=new Actions(driver);
		builder.clickAndHold(li4)
		.clickAndHold(li7)
		.release()
		.build()
		.perform();
	}

}
