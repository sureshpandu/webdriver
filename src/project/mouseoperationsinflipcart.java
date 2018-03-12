package project;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class mouseoperationsinflipcart {
FirefoxDriver driver;
@BeforeTest
public void openbrowser(){
	driver =new FirefoxDriver();
	driver.get("http://flipcart.com");
	driver.manage().window().maximize();
	
}
@Test
public void mobilescreenshot() throws IOException{
	Actions action =new Actions(driver);
	WebElement event1=driver.findElementByXPath(".//*[@id='container']/div/header/div[2]/div/ul/li[1]/a/span");
	WebElement event2=driver.findElementByXPath(".//*[@id='container']/div/header/div[2]/div/ul/li[1]/ul/li/ul/li[1]/ul/li[8]/a");
	action.moveToElement(event1).click().moveToElement(event2).build().perform();
	event2.click();
	driver.findElementByXPath(".//*[@id='fk-mainbody-id']/div/div[3]/div[2]/div/div/div/div/a/img").click();
	File srcfile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	FileUtils.copyFile(srcfile, new File("C:\\Users\\user\\Desktop\\asus1.png"));
}
}
