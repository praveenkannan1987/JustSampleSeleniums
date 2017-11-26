package day13and14;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HwEx1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://erail.in");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		driver.findElementById("txtStationFrom").clear();
		driver.findElementById("txtStationFrom").sendKeys("MS", Keys.TAB);

		driver.findElementById("txtStationTo").clear();
		driver.findElementById("txtStationTo").sendKeys("RMM", Keys.TAB);

		WebElement table = driver.findElementByXPath("//table[@class='DataTable TrainList']");
		
		List<WebElement> rows = table.findElements(By.tagName("tr"));
		System.out.println(rows.size());
		int r=rows.size();
		List<Integer> trainno = new ArrayList<Integer>();
		for(int i=0;i<r;i++){
			String s=rows.get(i).findElements(By.tagName("td")).get(0).getText();
			trainno.add(Integer.parseInt(s));
		}
		driver.findElementByXPath("//a[text()='Train']").click();
		int k=0;
		Collections.sort(trainno);
		WebElement table1 = driver.findElementByXPath("//table[@class='DataTable TrainList']");
		
		List<WebElement> rows1 = table1.findElements(By.tagName("tr"));
		System.out.println(rows1.size());
		r=rows1.size();
		for (int i = 0; i < trainno.size(); i++) {
			String s=rows1.get(i).findElement(By.tagName("td")).getText();
			if(trainno.get(i)==Integer.parseInt(s))
				k++;
		}
		
		if(k==trainno.size())
			System.out.println("Sort matches");
		else
			System.out.println("Sort Not matches");
	}

}
