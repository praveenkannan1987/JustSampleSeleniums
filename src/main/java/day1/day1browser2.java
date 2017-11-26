package day1;

import org.openqa.selenium.chrome.ChromeDriver;

public class day1browser2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.youtube.com/watch?v=e5HP-iUvlC4&spfreload=10");
		driver.manage().window().maximize();
		//For play
		driver.findElementByXPath("//button[@class='ytp-play-button ytp-button']").click();
		
		// for total duration of the video
		String g1=driver.findElementByXPath("//span[@class='ytp-time-duration']").getText();
		System.out.println(g1);
		
		// timing played in the video
		String g2=driver.findElementByXPath("//span[@class='ytp-time-current']").getText();
		System.out.println(g2);
	}

}
