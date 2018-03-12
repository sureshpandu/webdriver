package project;

import org.openqa.selenium.By;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;

public class gmaillink {

	public static void main(String[] args) {
		ProfilesIni pr=new ProfilesIni();
		FirefoxProfile fp=pr.getProfile("Qaclasses");
		FirefoxDriver driver=new FirefoxDriver(fp);
	     driver.get("http://google.com");
	    // click on gmail link
	     driver.findElement(By.className("gb_P")).click();
	    String exp="Gmail";
	    String Actual=driver.getTitle();
	    if(exp.equals(Actual))
	    {
	    	System.out.println("link working correct");
	    }else
	    {System.out.println("link not working");
	    }

	}

}
