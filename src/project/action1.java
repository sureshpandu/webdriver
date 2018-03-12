
package project;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class action1 {
@Test
public void open(){
	
		WebDriver driver=new FirefoxDriver();
		driver.navigate().to("http://google.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.findElement(By.xpath(".//*[@id='sb_ifc0']")).sendKeys("selenium");
		Actions action=new Actions(driver);
		action.sendKeys(Keys.DOWN).build().perform();
		action.sendKeys(Keys.DOWN).build().perform();
		action.sendKeys(Keys.ENTER).build().perform();
		
	
	}}