package project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class maillogin {

	public static void main(String[] args) throws Exception {
	//launch browser
		
		WebDriver driver=new FirefoxDriver();
		driver.get("http://gmail.com");
//enter details
		driver.findElement(By.id("Email")).sendKeys("graviteja1991");
		driver.findElement(By.name("signIn")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("Passwd")).sendKeys("ravicherry123");
		driver.findElement(By.id("signIn")).click();
		
	}

}
