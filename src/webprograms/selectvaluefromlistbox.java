package webprograms;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;

public class selectvaluefromlistbox {

	public static void main(String[] args) {
		// open firefox with mercury travels
		ProfilesIni pr=new ProfilesIni();
		FirefoxProfile fp=pr.getProfile("Qaclasses");
		FirefoxDriver  driver=new FirefoxDriver(fp);
		driver.get("http://mercurytravels.co.in");
		//select mrng value from dropdown
		driver.findElement(By.id("frm:searchForm:departTime0")).sendKeys("Morning");
		System.out.println("morning");
	}

}
