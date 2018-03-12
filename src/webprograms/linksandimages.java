package webprograms;

import java.util.List;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;



public class linksandimages {

	public static void main(String[] args) {
		ProfilesIni pr=new ProfilesIni();
		FirefoxProfile fp=pr.getProfile("Qaclasses");
		FirefoxDriver  driver=new FirefoxDriver(fp);
		driver.get("http://flipcart.com");
		//count links and images
		List<WebElement>Elements=driver.findElementsByTagName("a");
		System.out.println(Elements.size());
		Elements.addAll(driver.findElementsByTagName("img"));
		System.out.println(Elements.size());
		driver.close();

	}

}
