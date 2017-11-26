package day9and10;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import wrappers.GenericWrappers;

public class ProjectLogin extends GenericWrappers {
	
	@Parameters({"url","username","password"})
	@BeforeMethod(groups={"common"})
	public void login(String url, String Username, String Password) throws InterruptedException{
				invokeApp("chrome",url);
				enterById("username",Username);
				enterById("password",Password);
				Thread.sleep(3000);
				clickByClassName("decorativeSubmit");
				clickByLinkNoSnap("CRM/SFA");
	}
	
	@AfterMethod(groups={"common"})
	public void atClose() {
		closeAllBrowsers();
	}
	
}
