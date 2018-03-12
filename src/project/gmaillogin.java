package project;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;

public class gmaillogin {

	public static void main(String[] args) {
		FirefoxDriver driver=new FirefoxDriver();
	     driver.get("http://gmail.com");
	     driver.findElement(By.id("Email")).sendKeys("sureshbtech594");
	     driver.findElement(By.id("next")).click();
Sleeper.sleepTightInSeconds(5);
driver.findElement(By.id("Passwd")).sendKeys("9963662678");
driver.findElement(By.id("signIn")).click();
Sleeper.sleepTightInSeconds(20);
driver.manage().window().maximize();
driver.findElement(By.xpath(".//*[@id=':ig']/div/div")).click();






	}

}
