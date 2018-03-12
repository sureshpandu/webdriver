package project;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class sample {
FirefoxDriver driver;
@BeforeTest
public void open(){
	driver=new FirefoxDriver();
	driver.get("http://www.timeanddate.com/worldclock/");
}
@Test
public void count(){
		List<WebElement>row=driver.findElementByXPath("html/body/div[1]/div[7]/section[2]").findElements(By.tagName("tr"));
	
			List<WebElement>column=row.get(1).findElements(By.tagName("td"));
			for(int j=0;j<column.size();j++){
				System.out.print(column.get(j).getText()+"  ");
			
			}
			System.out.println();
			
		}



		
}

		
		

  