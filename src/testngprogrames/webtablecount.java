package testngprogrames;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class webtablecount {
	FirefoxDriver driver;
	@BeforeTest
	public void openbrowser(){
		driver=new FirefoxDriver();
		driver.get("http://www.timeanddate.com/worldclock/");
	}
	
@Test
public void countrows(){
	WebElement table=driver.findElementByCssSelector(".zebra.fw.tb-wc");
	List<WebElement>rows=table.findElements(By.tagName("tr"));
	
	System.out.println(rows.size());
}
}