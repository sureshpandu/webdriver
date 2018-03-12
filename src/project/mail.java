package project;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;

public class mail {

	public static void main(String[] args) {
		//open firefox 
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("http://gmail.com");
		driver.findElement( By.name("Email")).sendKeys("sureshbtech594");
		driver.findElement(By.id("next")).click();
		Sleeper.sleepTightInSeconds(5);
		driver.findElementById("Passwd").sendKeys("9963662678");
		driver.findElementById("signIn").click();
		
		
		
	

	}

}
