package testngprogrames;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;

public class actionkeyword {
	FirefoxDriver driver;
	
	public void launchbrowser(){
		driver=new FirefoxDriver();
		driver.get("http://gmail.com");
	}
	
	public void login(){
		driver.findElement(By.id("Email")).sendKeys("sureshbtech594");
	     driver.findElement(By.id("next")).click();
		Sleeper.sleepTightInSeconds(5);
		driver.findElement(By.id("Passwd")).sendKeys("9963662678");
		driver.findElement(By.id("signIn")).click();
		    }
	
public void logout(){
	Sleeper.sleepTightInSeconds(15);
	driver.findElementByXPath(".//*[@id=':3d']/span").click();
	Sleeper.sleepTightInSeconds(5);
	driver.findElement(By.xpath(".//*[@id='gb']/div[1]/div[1]/div[2]/div[4]/div[1]/a/span")).click();
	Sleeper.sleepTightInSeconds(2);
    driver.findElement(By.id("gb_71")).click();
    
}
	
public void close(){
	driver.close();
}


	}
