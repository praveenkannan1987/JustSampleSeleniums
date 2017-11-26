package day1;

import java.util.concurrent.TimeUnit;
import java.util.List;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day1listex3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("http://leafground.com/");
		driver.manage().window().maximize();
		driver.findElementByLinkText("Checkbox").click();
		List<WebElement> result=driver.findElementsByTagName("input");
		int n=result.size();
		for(int i=0;i<=n-1;i++)
		{
			if(result.get(i).isSelected())
			{
				result.get(i).click();
			}
		}
	}

}
