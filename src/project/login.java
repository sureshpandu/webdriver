package project;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;

public class login {

	public static void main(String[] args) {
		// open ff browser along with guru.com
		ProfilesIni pr=new ProfilesIni();
		FirefoxProfile fp=pr.getProfile("Qaclasses");
		FirefoxDriver driver=new FirefoxDriver(fp);
	     driver.get("http://demo.guru99.com/V4/");
	     driver.findElement(By.name("uid")).sendKeys("mngr47452 ");
	     driver.findElement(By.name("password")).sendKeys("AzazahY");
	     driver.findElement(By.name("btnLogin")).click();
	     String exp="Guru99 Bank Manager HomePage";
	     String Actual=driver.getTitle();
	     if(exp.equals(Actual))
	     {
	    	 System.out.println("Test case pass");
	     }else
	     {
	    	 System.out.println("Test case fail");
	     }
	     
	

}
}
	
