package day1;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class day1listex2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("http://leafground.com/");
		driver.manage().window().maximize();
		driver.findElementByLinkText("Drop down").click();
		WebElement src3=driver.findElementById("dropdown1");
		Select source3=new Select(src3);
		List<WebElement> alloptions = new Select(driver.findElementById("dropdown1")).getOptions();
		
		//List<WebElement> alloptions1=new Select(driver.findElementsById("dropdown1")).getOptions();
		int count =alloptions.size();
		source3.selectByIndex(count-2);
	}

}
