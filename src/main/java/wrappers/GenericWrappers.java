package wrappers;

import java.io.File;
import java.io.IOException;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.ElementNotVisibleException;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.Select;



public class GenericWrappers implements Wrappers {

	RemoteWebDriver driver;

	//Alert alt;
	int i=1;
	public void invokeApp(String browser, String url) {
		
		try {
			if(browser.equalsIgnoreCase("chrome")){
				System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
				driver = new ChromeDriver(); // launch browser	
			}else if(browser.equalsIgnoreCase("firefox")){
				System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
				driver = new FirefoxDriver(); // launch browser	
			}		
			driver.get(url); // enter url 
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
			System.out.println("The Browser "+browser+" launched successfully");
		} catch (RuntimeException e) {
			System.err.println("Runtime Time Error");
		}

	}


	public void enterById(String idValue, String data) {
		try {
			driver.findElementById(idValue).clear();
			driver.findElementById(idValue).sendKeys(data);
			System.out.println("The Text field "+idValue+ " is entered with text data");
		}catch (NoSuchElementException e) {
			System.err.println("The Text field "+idValue+ " is not found.");
			throw new RuntimeException();
		}catch (ElementNotVisibleException e){
			System.err.println("The Text field "+idValue+ " is not Visible.");
			throw new RuntimeException();
		}catch (WebDriverException e){
			System.err.println("Browser Closed for due to unknown reason.");
		}finally {
			takeSnap();
		}
	}

	public void enterByClassName(String classnameValue, String data) {
		// TODO Auto-generated method stub
		try {
			driver.findElementByClassName(classnameValue).clear();
			driver.findElementByClassName(classnameValue).sendKeys(data);
			System.out.println("The Text field "+classnameValue+ " is entered with text data");
		} catch (NoSuchElementException e) {
			System.err.println("The Text field "+classnameValue+ " is not found.");
			throw new RuntimeException();
		}catch (ElementNotVisibleException e){
			System.err.println("The Text field "+classnameValue+ " is not Visible.");
			throw new RuntimeException();
		} catch (WebDriverException e){
			System.err.println("Browser Closed for due to unknown reason.");
		}finally {
			takeSnap();
		}
	}

	public void enterByName(String nameValue, String data) {
		try {
			driver.findElementByName(nameValue).clear();
			driver.findElementByName(nameValue).sendKeys(data);
			System.out.println("The Text field "+nameValue+ " is entered with text data");
		} catch (NoSuchElementException e) {
			System.err.println("The Text field "+nameValue+ " is not found.");
			throw new RuntimeException();
		}catch (ElementNotVisibleException e){
			System.err.println("The Text field "+nameValue+ " is not Visible.");
			throw new RuntimeException();
		} catch (WebDriverException e){
			System.err.println("Browser Closed for due to unknown reason.");
		}finally {
			takeSnap();
		}
	}

	public void enterByXpath(String xpathValue, String data) {
		try {
			driver.findElementByXPath(xpathValue).clear();
			driver.findElementByXPath(xpathValue).sendKeys(data);
			System.out.println("The Text field "+xpathValue+ " is entered with text data");
		} catch (NoSuchElementException e) {
			System.err.println("The Text field "+xpathValue+ " is not found.");
			throw new RuntimeException();
		}catch (ElementNotVisibleException e){
			System.err.println("The Text field "+xpathValue+ " is not Visible.");
			throw new RuntimeException();
		} catch (WebDriverException e){
			System.err.println("Browser Closed for due to unknown reason.");
		}finally {
			takeSnap();
		}
	}

	public void verifyTitle(String title) {
		try{
			if(driver.getTitle().equalsIgnoreCase(title)){
				System.out.println("Title="+title+" matches with the WindowTitle");
			}else{
				System.err.println("Title="+title+" does not matches with the requirement");
			}
		}catch (WebDriverException e){
			System.err.println("Browser Closed for due to unknown reason.");
		}finally {
			takeSnap();
		}
	}

	public void verifyTextById(String id, String text) {
		try{
			String s=driver.findElementById(id).getText();
			if(s.equalsIgnoreCase(text))
				System.out.println("Text="+text+" matches with the id element "+s);
			else
				System.err.println("Text="+text+" does not matches with the id element "+s);
		}catch(NoSuchElementException e){
			System.err.println("No such id ="+id+" exist");
		} catch (WebDriverException e){
			System.err.println("Browser Closed for due to unknown reason.");
		}finally {
			takeSnap();
		}
	}

	public void verifyTextByXpath(String xpath, String text) {
		try{
			String s=driver.findElementByXPath(xpath).getText();
			if(s.equalsIgnoreCase(text))
				System.out.println("Text="+text+" matches with the xpath element "+s);
			else
				System.err.println("Text="+text+" does not matches with the xpath element "+s);
		}catch(NoSuchElementException e){
			System.err.println("No such Xpath ="+xpath+" exist");
		} catch (WebDriverException e){
			System.err.println("Browser Closed for due to unknown reason.");
		}finally {
			takeSnap();
		}
	}

	public void verifyTextContainsByXpath(String xpath, String text) {
		try{
			String s=driver.findElementByXPath(xpath).getText();
			if(s.contains(text))
				System.out.println("Text="+text+" contains in the xpath element "+s);
			else
				System.err.println("Text="+text+" does not contains in the xpath element "+s);
		}catch(NoSuchElementException e){
			System.err.println("No such Xpath ="+xpath+" exist");
		} catch (WebDriverException e){
			System.err.println("Browser Closed for due to unknown reason.");
		}finally {
			takeSnap();
		}
	}

	public void clickById(String id) {
		try{
			driver.findElementById(id).click();
			System.out.println("The Buttton with class Name "+id+ " is clicked");
		}catch(NoSuchElementException e){
			System.err.println("No such Id ="+id+" exist");
		} catch (WebDriverException e){
			System.err.println("Browser Closed for due to unknown reason.");
		}finally {
			takeSnap();
		}
	}

	public void clickByClassName(String classVal) {
		try{
			driver.findElementByClassName(classVal).click();
			System.out.println("The Buttton with class Name "+classVal+ " is clicked");
		}catch(NoSuchElementException e){
			System.err.println("No such className ="+classVal+" exist");
		} catch (WebDriverException e){
			System.err.println("Browser Closed for due to unknown reason.");
		}finally {
			takeSnap();
		}
	}

	public void clickByName(String name) {
		try{
			driver.findElementByName(name).click();
			System.out.println("The Buttton with class Name "+name+ " is clicked");
		}catch(NoSuchElementException e){
			System.err.println("No such Name ="+name+" exist");
		} catch (WebDriverException e){
			System.err.println("Browser Closed for due to unknown reason.");
		}finally {
			takeSnap();
		}
	}

	public void clickByLink(String name) {
		try{
			driver.findElementByLinkText(name).click();
			System.out.println("The Buttton with Link Text "+name+" is clicked");
			takeSnap();
		}catch(NoSuchElementException e){
			System.err.println("No such Link ="+name+" exist");
		} catch (WebDriverException e){
			System.err.println("Browser Closed for due to unknown reason.");
		}finally {
			takeSnap();
		}
	}

	public void clickByLinkNoSnap(String name) {
		try{
			driver.findElementByLinkText(name).click();
			System.out.println("The Buttton with Link Text "+name+" is clicked");
		}catch(NoSuchElementException e){
			System.err.println("No suchname ="+name+" exist");
		} catch (WebDriverException e){
			System.err.println("Browser Closed for due to unknown reason.");
		}
	}

	public void clickByXpath(String xpathVal) {
		try{
			driver.findElementByXPath(xpathVal).click();
			System.out.println("The Buttton with Xpath "+xpathVal+" is clicked");
			takeSnap();
		}catch(NoSuchElementException e){
			System.err.println("No such Xpath ="+xpathVal+" exist");
		}catch (WebDriverException e){
			System.err.println("Browser Closed for due to unknown reason.");
		}finally {
			takeSnap();
		}
	}

	public void clickByXpathNoSnap(String xpathVal) {
		try{
			driver.findElementByXPath(xpathVal).click();
			System.out.println("The Buttton with Xpath "+xpathVal+" is clicked");
		}catch(NoSuchElementException e){
			System.err.println("No such Xpath ="+xpathVal+" exist");
		} catch (WebDriverException e){
			System.err.println("Browser Closed for due to unknown reason.");
		}
	}

	public String getTextById(String idVal) {
		try{
			String s=driver.findElementById(idVal).getText();
			System.out.println("Getting the visible Text using the id ="+idVal +" Value ="+s);
			return s;
		}catch(NoSuchElementException e){
			System.err.println("No such id ="+idVal+" exist");
		} catch (WebDriverException e){
			System.err.println("Browser Closed for due to unknown reason.");
		}
		return null;
	}

	public String getTextByXpath(String xpathVal) {
		try{
			String s=driver.findElementByXPath(xpathVal).getText();
			System.out.println("Getting the visible Text using the xpath ="+xpathVal+" Value ="+s);
			return s;
		}catch(NoSuchElementException e){
			System.err.println("No such xpath ="+xpathVal+" exist");
		} catch (WebDriverException e){
			System.err.println("Browser Closed for due to unknown reason.");
		}
		return null;
	}

	public void selectVisibileTextById(String id, String value) {
		try{
			new Select(driver.findElementById(id)).selectByVisibleText(value);
			System.out.println("Selected the visible Text "+value+" from the drop dowwn.");
		}catch(NoSuchElementException e){
			System.err.println("No such visible text ="+value+" exist");
		} catch (WebDriverException e){
			System.err.println("Browser Closed for due to unknown reason.");
		}finally {
			takeSnap();
		}
	}

	public void selectIndexById(String id, int value) {
		try{
			new Select(driver.findElementById(id)).selectByIndex(value);
			System.out.println("Selected the Index value "+value+" from the drop dowwn.");
		}catch(NoSuchElementException e){
			System.err.println("No such Index ="+value+" exist");
		} catch (WebDriverException e){
			System.err.println("Browser Closed for due to unknown reason.");
		}finally {
			takeSnap();
		}
	}

	public void switchToParentWindow() {
		try{
			Set<String> allwindows=driver.getWindowHandles();
			for (String eachwindow : allwindows) {
				driver.switchTo().window(eachwindow);
				break;
			}
			System.out.println("Switching to parent window "+driver.getCurrentUrl());
		} catch (WebDriverException e){
			System.err.println("Browser Closed for due to unknown reason.");
		}
	}

	public void switchToLastWindow() {
		try{
			Set<String> allwindows=driver.getWindowHandles();
			for (String eachwindow : allwindows) {
				driver.switchTo().window(eachwindow);

			}
			System.out.println("Switch to last window"+driver.getCurrentUrl()+" Title="+driver.getTitle());
		} catch (WebDriverException e){
			System.err.println("Browser Closed for due to unknown reason.");
		}
	}

	public void acceptAlert() {
		try{
			driver.switchTo().alert().accept();
			System.out.println("Alert Accepted");
		}catch (NoAlertPresentException e){
			System.err.println("No Alert Present.");
		}catch (WebDriverException e){
			System.err.println("Browser Closed for due to unknown reason.");
		}
	}

	public void dismissAlert() {
		try{
			driver.switchTo().alert().dismiss();
			System.out.println("Alert Dismissed.");
		}catch (NoAlertPresentException e){
			System.err.println("No Alert Present.");
		}catch (WebDriverException e){
			System.err.println("Browser Closed for due to unknown reason.");
		}
	}

	public String getAlertText() {
		try{
			System.out.println("Alert Text Sent.");
			return driver.switchTo().alert().getText();
		}catch (NoAlertPresentException e){
			System.err.println("No Alert Present.");
		}catch (WebDriverException e){
			System.err.println("Browser Closed for due to unknown reason.");
		}
		return null;
	}

	public void takeSnap() {
		File tmp= driver.getScreenshotAs(OutputType.FILE);
		File dest= new File("./snap/snap"+i+".PNG");
		try {
			FileUtils.copyFile(tmp, dest);
		} catch (IOException e) {
			System.err.println("Snapshot not working");
		}
		i++;
	}

	public void closeBrowser() {
		try{
			driver.close();
		}catch (WebDriverException e){
			System.err.println("Browser Closed for due to unknown reason.");
		}
	}

	public void closeAllBrowsers() {
		try{
			driver.quit();
		}catch (WebDriverException e){
			System.err.println("Browser Closed for due to unknown reason.");
		}
	}

}
