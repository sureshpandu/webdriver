package project;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class frame {

FirefoxDriver driver;
@BeforeTest
public void openbrowser(){
	driver=new FirefoxDriver();
	driver.get("http://www.angelfire.com/super/badwebs/");

}

@Test
public void verifylinkinframe(){
	List<WebElement>frames=driver.findElements(By.tagName("frame"));
	System.out.println(frames.size());
	for(int i=0;i<frames.size();i++){
		driver.switchTo().frame(i);
		try
		{
			driver.findElementByXPath("html/body/p[5]/b/a/font").click();
			break;
		}
		catch(Exception e)
		{
		
		driver.switchTo().defaultContent();
	}
}

}
@AfterTest
public void closebrowser(){
	driver.quit();
}
}

 