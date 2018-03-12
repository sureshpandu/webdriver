package project;

import java.util.Set;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class cookieswithlogs {
	
	FirefoxDriver driver;
	@BeforeTest
	public void openbrowser(){
		
		driver=new FirefoxDriver();
		driver.navigate().to("http://yatragenie.com");
	}
	@Test
	public void getcookies(){
	Set<Cookie>mycookies=driver.manage().getCookies();
		System.out.println(mycookies.size());
	}
		
	

}
