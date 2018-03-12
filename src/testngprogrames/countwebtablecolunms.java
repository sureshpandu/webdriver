package testngprogrames;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class countwebtablecolunms {
	FirefoxDriver driver;
	@BeforeTest
	public void openbrowser(){
	driver=new FirefoxDriver();
	driver.get("http://www.timeanddate.com/worldclock/");
	}
	@Test
	public void countvalues(){
		WebElement table=driver.findElementByXPath("html/body/div[1]/div[7]/section[2]");
		List<WebElement>columns=table.findElements(By.tagName("td"));
		System.out.println(columns.size());
	}
	@AfterTest
	public void close(){
		driver.close();
	}

}
