package webprograms;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;

public class countradiobuttonsandnames {

	public static void main(String[] args) {
		// open ff with mercurytravels
		ProfilesIni pr=new ProfilesIni();
		FirefoxProfile fp=pr.getProfile("Qaclasses");
		FirefoxDriver driver=new FirefoxDriver(fp);
		driver.get("http://mercurytravels.co.in");
		//count no.of radio buttons
		List<WebElement>Radio=driver.findElementsByXPath("//input[@type='radio']");
	System.out.println(Radio.size());
		
//names of radio buttons
	for(int i=0;i<Radio.size();i++){
		System.out.println(Radio.get(i).getAttribute("value")+"      "+Radio.get(i).isSelected());
	}
	}

}

