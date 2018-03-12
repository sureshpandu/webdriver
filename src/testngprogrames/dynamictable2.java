package testngprogrames;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class dynamictable2 {
	FirefoxDriver driver;
	@BeforeTest
	public void openbrowser(){
		driver=new FirefoxDriver();
		driver.get("http://www.timeanddate.com/worldclock/");
	}
     @Test
     public void getdata(){
    WebElement	 table=driver.findElementByXPath("html/body/div[1]/div[7]/section[2]");
    List<WebElement>rows=table.findElements(By.tagName("tr"));
    for(int i=0;i<rows.size();i++){
    	List<WebElement>columns=rows.get(i).findElements(By.tagName("td"));
    	for(int j=0;j<columns.size();j++){
    		System.out.print( columns.get(j).getText()+"          ");
    	}
    	System.out.println();
    }
     
}
}
