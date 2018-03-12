package project;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class example {
	FirefoxDriver driver;
@BeforeTest
public void launchwaytosms(){
	driver=new FirefoxDriver();
	driver.get("http://site21.way2sms.com/content/index.html");
}
@Test
public void signin() throws Exception{
	driver.findElement(By.xpath(".//*[@id='loginBTN']")).click();
	driver.switchTo().alert().accept();
	ArrayList<String>win=new ArrayList<String>(driver.getWindowHandles());
	driver.switchTo().window(win.get(1));
	driver.close();
	driver.switchTo().window(win.get(0));

	driver.quit();
	
}}
