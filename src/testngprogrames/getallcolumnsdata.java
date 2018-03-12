package testngprogrames;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class getallcolumnsdata {
	FirefoxDriver driver;
	@BeforeTest
	public void openbrowser(){
	driver=new FirefoxDriver();
	driver.get("http://www.timeanddate.com/worldclock/");
	}
	@Test
	public void getdata(){
		
		String part1="html/body/div[1]/div[7]/section[2]/div[1]/table/tbody/tr[1]/td[";
		String part2="]";
		for(int i=1;i<=8;i++){
			String x=driver.findElementByXPath(part1+i+part2).getText();
			System.out.println(x);
		}
	}

}



