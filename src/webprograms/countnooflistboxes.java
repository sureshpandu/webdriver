package webprograms;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;

public class countnooflistboxes {

	public static void main(String[] args) {
		// open firefox with mercury travels
		ProfilesIni pr=new ProfilesIni();
		FirefoxProfile fp=pr.getProfile("Qaclasses");
		FirefoxDriver  driver=new FirefoxDriver(fp);
		driver.get("http://mercurytravels.co.in");
		//count no of listboxes from mercury travels
		List<WebElement>Dropdowns=driver.findElements(By.tagName("select"));
		System.out.println(Dropdowns.size());

	}

}
