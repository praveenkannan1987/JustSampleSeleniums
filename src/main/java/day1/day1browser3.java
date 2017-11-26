package day1;

import org.openqa.selenium.Point;
import org.openqa.selenium.chrome.ChromeDriver;

public class day1browser3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://www.leaftaps.com");
		driver.manage().window().maximize();
		driver.findElementById("username").sendKeys("DemoSalesManager");
		driver.findElementById("password").sendKeys("crmsfa");
		driver.findElementByClassName("decorativeSubmit").click();
		driver.findElementByClassName("decorativeSubmit").click();
		Point n1=driver.manage().window().getPosition();
		System.out.println(n1.getX()+""+n1.getY());
	}

}
