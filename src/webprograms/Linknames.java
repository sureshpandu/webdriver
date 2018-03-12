package webprograms;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;

public class Linknames {
//open ff with mercury travels.com
	public static void main(String[] args) {
		ProfilesIni pr=new ProfilesIni();
		FirefoxProfile fp=pr.getProfile("Qaclasses");
		FirefoxDriver  driver=new FirefoxDriver(fp);
		driver.get("http://yatragenie.com");
		//count no.of links
		List<WebElement>links=driver.findElementsByTagName("a");
		System.out.println(links.size());
		//display link names
		for(int i=0;i<links.size();i++){
			System.out.println(links.get(i).getText());
		}
		

	}

}
