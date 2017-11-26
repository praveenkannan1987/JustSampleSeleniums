package day11and12;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class LearnActionsDragAndDrop {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://jqueryui.com/droppable/");
		driver.switchTo().frame(driver.findElementByClassName("demo-frame"));
		WebElement dr1=driver.findElementById("draggable");
		WebElement dr2=driver.findElementById("droppable");
		Actions builder=new Actions(driver);
		builder.dragAndDrop(dr1, dr2).perform();
		driver.close();		
	}

}
