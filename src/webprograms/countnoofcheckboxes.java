package webprograms;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;

public class countnoofcheckboxes {

	public static void main(String[] args) {
		// open ff with spicejet
		ProfilesIni pr=new ProfilesIni();
		FirefoxProfile fp=pr.getProfile("Qaclasses");
		FirefoxDriver driver=new FirefoxDriver(fp);
		driver.get("http://spicejet.com");
		// count no of checkboxes 
		List<WebElement>Checkboxes=driver.findElementsByXPath("//input[@type='checkbox']");
		System.out.println(Checkboxes.size());
		//get names of checkboxes and 
		for(int i=0;i<Checkboxes.size();i++)
		{
			System.out.println(Checkboxes.get(i).getAttribute("name")+"   "+Checkboxes.get(i).isSelected());
		}
		

	}

}
