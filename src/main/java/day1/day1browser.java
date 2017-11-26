package day1;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriverException;
//import org.openqa.selenium.Dimension;
//import org.openqa.selenium.Point;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
//import org.openqa.selenium.interactions.internal.Coordinates;

public class day1browser {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stu
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("http://www.amazon.in/");
		driver.manage().window().maximize();
		driver.findElementById("twotabsearchtextbox").sendKeys("Moto e4");
		driver.findElementByXPath("//input[@value='Go']").click();
		driver.findElementByXPath("//span[text()='Smartphones']").click();
		Select sel=new Select(driver.findElementByXPath("//select[@class='a-spacing-top-mini']"));
		sel.selectByVisibleText("Price: Low to High");
		Thread.sleep(3000);
		String prwin=driver.getWindowHandle();
		driver.findElementByXPath("//h2[contains(text(),'Motorola Moto E4')]").click();
		Set<String> str=driver.getWindowHandles();
		for (String s1 : str) {
			if(!s1.equals(prwin)){
				driver.switchTo().window(s1);
			}
		}
		driver.findElementById("add-to-cart-button").click();
		driver.findElementById("hlb-view-cart-announce").click();
		driver.findElementByName("proceedToCheckout").click();
	}

}
