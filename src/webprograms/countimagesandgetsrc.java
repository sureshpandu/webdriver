package webprograms;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;

public class countimagesandgetsrc {

	public static void main(String[] args) {
		// open ff with snapdeal.com
		ProfilesIni pr=new ProfilesIni();
		FirefoxProfile fp=pr.getProfile("Qaclasses");
		FirefoxDriver  driver=new FirefoxDriver(fp);
		driver.get("http://snapdeal.com");
		//count no.of images
		List<WebElement>Images=driver.findElementsByTagName("img");
		System.out.println(Images.size());
//src of images
		for(int i=0;i<Images.size();i++){
			System.out.println(Images.get(i).getAttribute("src"));
		}
	}

}
