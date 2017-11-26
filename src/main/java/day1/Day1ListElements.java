package day1;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Day1ListElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("http://www.leaftaps.com");
		driver.manage().window().maximize();
		driver.findElementById("username").sendKeys("DemoSalesManager");
		driver.findElementById("password").sendKeys("crmsfa");
		driver.findElementByClassName("decorativeSubmit").click();
		driver.findElementByLinkText("CRM/SFA").click();
		driver.findElementByLinkText("Create Lead").click();
		
		driver.findElementById("createLeadForm_companyName").sendKeys("Aon");
		driver.findElementById("createLeadForm_firstName").sendKeys("Praveen");
		driver.findElementById("createLeadForm_lastName").sendKeys("Kannan");
		WebElement src=driver.findElementById("createLeadForm_dataSourceId");
		Select source=new Select(src);
		source.selectByVisibleText("Direct Mail");
		WebElement src1=driver.findElementById("createLeadForm_industryEnumId");
		Select source1=new Select(src1);
		source1.selectByValue("IND_DISTRIBUTION");
		WebElement src2=driver.findElementById("createLeadForm_ownershipEnumId");
		Select source2=new Select(src2);
		source2.selectByIndex(2);
		
		WebElement src3=driver.findElementById("createLeadForm_currencyUomId");
		Select source3=new Select(src3);
		List<WebElement> alloptions = source3.getOptions();
		int count =alloptions.size();
		for (WebElement obj2 : alloptions) {
			String s=obj2.getText();
			if(s.startsWith("E")){
				if(s.contains("g")){
					source3.selectByVisibleText(s);
				//System.out.println("ok");
				}
			}
		}
		System.out.println(count);
	}

}
