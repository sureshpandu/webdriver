package testngprogrames;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class mouseoperations {
	FirefoxDriver driver;
	@BeforeTest
	public void openbrowser(){
		driver=new FirefoxDriver();
		driver.get("http://flipcart.com");
		driver.manage().window().maximize();
		
	}
	@Test
	public void move(){
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		Actions action=new Actions(driver);
		WebElement event1=driver.findElementByXPath(".//*[@id='container']/div/header/div[2]/div/ul/li[3]/a/span");
		WebElement event2=driver.findElementByXPath(".//*[@id='menu-men-tab-0-content']/ul[1]/li[4]/a");
		action.moveToElement(event1).click().moveToElement(event2).build().perform();
		event2.click();
	}
	 
}

