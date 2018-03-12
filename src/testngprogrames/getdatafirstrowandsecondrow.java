package testngprogrames;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class getdatafirstrowandsecondrow {
	FirefoxDriver driver;
	@BeforeTest
	public void openbrowser(){
	driver=new FirefoxDriver();
	driver.get("http://www.timeanddate.com/worldclock/");
	}
	@Test
	public void getdata(){
		String x=driver.findElementByXPath("html/body/div[1]/div[7]/section[2]/div[1]/table/tbody/tr[1]/td[1]").getText();
	    String y=driver.findElementByXPath("html/body/div[1]/div[7]/section[2]/div[1]/table/tbody/tr[2]/td[1]/a").getText();
	System.out.println(x);
	System.out.println(y);
	}
	
	

}
