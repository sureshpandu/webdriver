package project;


import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;

public class facebook {

	public static void main(String[] args) {
		ProfilesIni pr=new ProfilesIni();
		FirefoxProfile fp=pr.getProfile("Qaclasses");
		FirefoxDriver driver=new FirefoxDriver(fp);
	     driver.get("http://facebook.com");
	     driver.findElementById("email").sendKeys("8500755877");
	     driver.findElementById("pass").sendKeys("9866454565");
	     driver.findElementById("u_0_l").click();
	}

}
