package testngprogrames;

import java.io.IOException;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Autoitupload {
	FirefoxDriver driver;
	@BeforeTest
	public void open(){
		driver=new FirefoxDriver();
		driver.get("http://opensource.demo.orangehrmlive.com/");
	}
	@Test
	public void login() throws IOException{
		driver.findElementByCssSelector("#txtUsername").sendKeys("Admin");
		driver.findElementByCssSelector("#txtPassword").sendKeys("admin");
		driver.findElementByCssSelector("#btnLogin").click();
		Sleeper.sleepTightInSeconds(5);
		driver.findElementByXPath(".//*[@id='menu_pim_viewPimModule']/b").click();
		driver.findElementByXPath(".//*[@id='menu_pim_addEmployee']").click();
		driver.findElementByXPath(".//*[@id='photofile']").click();
		Sleeper.sleepTightInSeconds(5);
	
	java.lang.Runtime.getRuntime().exec("C:\\Users\\user\\Desktop\\ex3.exe");
}
}