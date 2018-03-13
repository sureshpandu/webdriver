package webprograms;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;

public class getlinksnameandurl {

	public static void main(String[] args) {
		// open ff with bing.com
		ProfilesIni pr=new ProfilesIni();
		FirefoxProfile fp=pr.getProfile("Qaclasses");
		FirefoxDriver  driver=new FirefoxDriver(fp);
		driver.get("http://yatragenie.com");
		//get no of links and names
		List<WebElement>links=driver.findElementsByTagName("a");
		for(int i=0;i<links.size();i++){
			if(links.get(i).isDisplayed())
				System.out.println(links.get(i).getText());
			
			links.get(i).click();
			System.out.println(driver.getCurrentUrl());
			driver.navigate().back();
			links=driver.findElementsByTagName("a");

			

	}

}
}