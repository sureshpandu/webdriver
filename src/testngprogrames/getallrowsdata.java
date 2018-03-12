package testngprogrames;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class getallrowsdata {
	FirefoxDriver driver;
	@BeforeTest
	public void openbrowser(){
	driver=new FirefoxDriver();
	driver.get("http://www.timeanddate.com/worldclock/");
	}
	@Test
	public void getdata(){
		
		String part1="html/body/div[1]/div[7]/section[2]/div[1]/table/tbody/tr[";
		String part2="]/td[1]";
		for(int i=1;i<=37;i++){
			String x=driver.findElementByXPath(part1+i+part2).getText();
			System.out.println(x);
		}
	}

}
