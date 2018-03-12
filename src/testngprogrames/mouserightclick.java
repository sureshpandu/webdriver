package testngprogrames;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class mouserightclick {
	
	FirefoxDriver driver;
	@BeforeTest
	public void openbrowser(){
		driver=new FirefoxDriver();
		driver.get("http://google.com");
		driver.manage().window().maximize();
		
	}
	@Test
	public void mouseclick(){
		Actions action=new Actions(driver);
		WebElement gmaillink=driver.findElement(By.xpath(".//*[@id='gbw']/div/div/div[1]/div[1]/a"));
		action.contextClick(gmaillink).build().perform();
	
		
	}
	
	}


