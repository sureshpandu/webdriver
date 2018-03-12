package project;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class selectdropdown {
	FirefoxDriver driver;
@BeforeTest
public void openbrowser(){
	driver=new FirefoxDriver();

driver.navigate().to("http://mercurytravels.co.in");
}
@Test
public void dropdown(){
Select s=new Select(driver.findElement(By.id("frm:searchForm:departTime0")));
for(int i=0;i<3;i++)


s.selectByIndex(1);
Boolean string=s.getFirstSelectedOption().isSelected();
System.out.println(string);
driver.close();

}





	
	

}


