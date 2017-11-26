package day1;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class WeekDay5ex2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.irctc.co.in/");
		driver.manage().window().maximize();
		driver.findElementByLinkText("Sign up").click();
		WebElement src6=driver.findElementById("userRegistrationForm:countries");
		Select source6=new Select(src6);
		List<WebElement> alloption= source6.getOptions();
		for (WebElement obj : alloption) {
			System.out.println(obj.getText());
		}
		
	}

}
