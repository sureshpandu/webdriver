package webprograms;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;

public class countnoofvaluesfromdropdown {

	public static void main(String[] args) {
		// // open firefox with mercury travels
		ProfilesIni pr=new ProfilesIni();
		FirefoxProfile fp=pr.getProfile("Qaclasses");
		FirefoxDriver  driver=new FirefoxDriver(fp);
		driver.get("http://mercurytravels.co.in");
		//count no of values from listbox
		WebElement Dropdown=driver.findElement(By.id("frm:searchForm:departTime0"));
		List<WebElement>values=Dropdown.findElements(By.tagName("option"));
		System.out.println(values.size());

	}

}
