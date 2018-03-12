package testngprogrames;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class allrowsandcolumns {
	FirefoxDriver driver;
	@BeforeTest
	public void openbrowser(){
	driver=new FirefoxDriver();
	driver.get("http://www.timeanddate.com/worldclock/");
	}
	@Test
	public void getdata(){
		String part1="html/body/div[1]/div[7]/section[2]/div[1]/table/tbody/tr[";
		String part2="]/td[";
		String part3="]";
		for(int i=1;i<=36;i++){
			for(int j=1;j<=6;j++){
				String x=driver.findElementByXPath(part1+i+part2+j+part3).getText();
				System.out.print(x+"   ");
				
			}
			System.out.println();
			
		}
	}
		@AfterTest
		public void closebrowser(){
			driver.close();
		}
	

}

