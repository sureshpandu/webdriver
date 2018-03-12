package webprograms;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;

public class dispalyselectedvaluse {

	public static void main(String[] args) {
		// openfirefox with mercury travels
		ProfilesIni pr=new ProfilesIni();
		FirefoxProfile fp=pr.getProfile("Qaclasses");
		FirefoxDriver driver=new FirefoxDriver(fp);
		driver.get("http://mercurytravels.co.in");

	//display selected value ia active or not
	WebElement Dropdown=driver.findElement(By.id("frm:searchForm:departTime0"));
	List<WebElement>values=Dropdown.findElements(By.tagName("option"));
	for(int i=0;i<values.size();i++){
		values.get(i).click();
		if(values.get(i).isDisplayed())
		{
			System.out.println(values.get(i).getText()+"  "+"Active");
		}else{
			System.out.println(values.get(i).getText()+"   "+"inActive");
		}
	}
	}
}


