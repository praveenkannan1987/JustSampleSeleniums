package day1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Week1Ex4 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.irctc.co.in/");
		driver.manage().window().maximize();
		driver.findElementByLinkText("Sign up").click();
		driver.findElementById("userRegistrationForm:userName").sendKeys("kannan198j");
		driver.findElementById("userRegistrationForm:password").sendKeys("Robo1234");
		driver.findElementById("userRegistrationForm:confpasword").sendKeys("Robo1234");
		WebElement src=driver.findElementById("userRegistrationForm:securityQ");
		Select source=new Select(src);
		source.selectByValue("0");
		driver.findElementById("userRegistrationForm:securityAnswer").sendKeys("tiger");
		driver.findElementById("userRegistrationForm:firstName").sendKeys("Praveen");
		driver.findElementById("userRegistrationForm:middleName").sendKeys("U");
		driver.findElementById("userRegistrationForm:lastName").sendKeys("Kannan");
		driver.findElementByName("userRegistrationForm:gender").click();
		Thread.sleep(3000);
		driver.findElementByName("userRegistrationForm:maritalStatus").click();
		WebElement src1=driver.findElementById("userRegistrationForm:dobDay");
		Select source1=new Select(src1);
		source1.selectByValue("16");
		WebElement src2=driver.findElementById("userRegistrationForm:dobMonth");
		Select source2=new Select(src2);
		source2.selectByValue("08");
		WebElement src3=driver.findElementById("userRegistrationForm:dateOfBirth");
		Select source3=new Select(src3);
		source3.selectByVisibleText("1987");
		WebElement src4=driver.findElementById("userRegistrationForm:occupation");
		Select source4=new Select(src4);
		source4.selectByValue("2");
		driver.findElementById("userRegistrationForm:email").sendKeys("praveenkannan1987@gmail.com");
		driver.findElementById("userRegistrationForm:mobile").sendKeys("9940321879");
		WebElement src5=driver.findElementById("userRegistrationForm:nationalityId");
		Select source5=new Select(src5);
		source5.selectByVisibleText("India");
		driver.findElementById("userRegistrationForm:address").sendKeys("flat 1");
		driver.findElementById("userRegistrationForm:street").sendKeys("bhel nagar");
		driver.findElementById("userRegistrationForm:area").sendKeys("manapakkam");
		WebElement src6=driver.findElementById("userRegistrationForm:countries");
		Select source6=new Select(src6);
		source6.selectByVisibleText("India");
		Thread.sleep(5000);
		driver.findElementById("userRegistrationForm:pincode").sendKeys("600125");
		Thread.sleep(30000);
		driver.findElementById("userRegistrationForm:pincode").sendKeys(Keys.TAB);
		WebElement src7=driver.findElementById("userRegistrationForm:cityName");
		Select source7=new Select(src7);
		Thread.sleep(5000);
		source7.selectByVisibleText("Kanchipuram");
		
		WebElement src8=driver.findElementById("userRegistrationForm:postofficeName");
		Select source8=new Select(src8);
		Thread.sleep(5000);
		source8.selectByVisibleText("Manapakkam B.O");
		driver.findElementById("userRegistrationForm:landline").sendKeys("044246125");
		
	}

}
