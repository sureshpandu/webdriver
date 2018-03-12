package testngprogrames;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class orangehrm {
	FirefoxDriver driver;
	@BeforeTest
	 void openbrowser(){
		driver=new FirefoxDriver();
		driver.get("http://opensource.demo.orangehrmlive.com/");
		
	}
	@Test
	public void login(){
		driver.findElementByCssSelector("#txtUsername").sendKeys("Admin");
		driver.findElementByCssSelector("#txtPassword").sendKeys("admin");
		driver.findElementByCssSelector("#btnLogin").click();
		Sleeper.sleepTightInSeconds(5);
	}
	@Test(priority=1)
	public void logout(){
		driver.findElementByCssSelector("#welcome").click();
		driver.findElementByXPath(".//*[@id='welcome-menu']/ul/li[2]/a").click();
	}
	@AfterTest
	public void close(){
		driver.close();
	}
	}
	 


