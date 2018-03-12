package project;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.firefox.FirefoxDriver;

public class practice {

	public static void main(String[] args) {
		
		FirefoxDriver driver=new FirefoxDriver();
		driver.navigate().to("http://google.com");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.findElementByXPath(".//*[@id='gbw']/div/div/div[1]/div[1]/a").click();
		driver.navigate().back();
		
		
		

	}

}
