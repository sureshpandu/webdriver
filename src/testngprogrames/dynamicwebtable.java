package testngprogrames;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class dynamicwebtable {
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
		List<WebElement>rows=driver.findElementsByTagName("tr");
		for(int i=1;i<=rows.size();i++){
			List<WebElement>columns=rows.get(i).findElements(By.tagName("td"));
			for(int j=1;j<columns.size();j++){
				String x=driver.findElementByXPath(part1+i+part2+j+part3).getText();
				System.out.println(x+"   ");
				
			}
			System.out.println();
			
		}
	}

}
 
