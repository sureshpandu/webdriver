package webprograms;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;

public class headerlinks {

	public static void main(String[] args) {
			ProfilesIni pr=new ProfilesIni();
			FirefoxProfile fp=pr.getProfile("Qaclasses");
			FirefoxDriver  driver=new FirefoxDriver(fp);
			driver.get("http://bing.com");
//verify header links in bing.com
			WebElement header=driver.findElementById("sc_hdu");
			List<WebElement>links=header.findElements(By.tagName("a"));
			System.out.println(links.size());
	}

}
