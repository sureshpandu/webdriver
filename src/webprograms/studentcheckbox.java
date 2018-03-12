package webprograms;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;

public class studentcheckbox {

	public static void main(String[] args) {
	//open ff with spicejet
		ProfilesIni pr=new ProfilesIni();
		FirefoxProfile fp=pr.getProfile("Qaclasses");
		FirefoxDriver driver=new FirefoxDriver(fp);
		driver.get("http://spicejet.com");
		//verify student checkbox
		driver.findElementById("ctl00_mainContent_chk_StudentDiscount").click();
		WebElement checkbox=driver.findElementById("ctl00_mainContent_chk_StudentDiscount");
if(checkbox.isSelected())
{
	System.out.println("checkbox working");
}else{
	System.out.println("checkbox not working");
}
	}

}