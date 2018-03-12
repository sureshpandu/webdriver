package testngprogrames;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class pageobjectscript {
	FirefoxDriver driver;
	@BeforeTest
	public void openbrowser(){
	driver=new FirefoxDriver();
	driver.navigate().to("http://opensource.demo.orangehrmlive.com/");
	}
	@Test
	public void loginprogram(){
		loginpage obj=new loginpage(driver);
		obj.user.sendKeys("Admin");
		obj.password.sendKeys("admin");
		obj.ok.click();
		obj.admin.click();
		
	}
	@AfterTest
	public void close(){
		driver.quit();
	}
}

