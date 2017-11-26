package day11and12;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnActionsEx1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leafground.com/pages/table.html");
		WebElement tb=driver.findElementByTagName("table");
		List<WebElement> row=tb.findElements(By.tagName("tr"));
		int r=row.size(),k=0;
		int a[]=new int[r];
		for(int i=1;i<r;i++){
			System.out.println(r);
			List<WebElement> col=row.get(i).findElements(By.tagName("td"));
			String s=col.get(1).getText();
			a[k]=Integer.parseInt(s.replace("%",""));
			k++;
		}
		int small=a[0],m=0;
		for(int i=1; i< k; i++)
        {
			if (a[i] < small){
				small = a[i];
				m=i;
			}   
        }
		List<WebElement> col=row.get(m+1).findElements(By.tagName("td"));
		col.get(2).click();
	}

}
