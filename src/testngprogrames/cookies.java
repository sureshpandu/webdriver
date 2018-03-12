package testngprogrames;

import java.util.Set;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class cookies {
	 Logger log=Logger.getLogger(cookies.class);
FirefoxDriver driver;
@BeforeTest
public void openbrowser(){
	PropertyConfigurator.configure("Log4j.properties");
driver=new FirefoxDriver();
log.info("open ff browser"); 
	driver.get("http://onlineqaclasses.com");
}
@Test
 public void countcookies(){
	Set<Cookie>mycookies=driver.manage().getCookies(); 
	System.out.println(mycookies.size());
	driver.manage().deleteAllCookies();
	mycookies=driver.manage().getCookies();
	System.out.println(mycookies.size());
	log.info("count cookies");
}
}
