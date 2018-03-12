package webprograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class button {
	@Test
	public void login() {
		//System.setProperty("webdriver.firefox.marionette","D:\\Softwares\\Selenium softwares\\geckodriver.exe");


		WebDriver driver=new FirefoxDriver();
		driver.navigate().to("http://opensource.demo.orangehrmlive.com/");
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@id='btnLogin']")).click();
		driver.quit();
	
	}

}
