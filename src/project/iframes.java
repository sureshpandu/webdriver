package project;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class iframes {
	FirefoxDriver driver;
@Test
public void open(){
	driver=new FirefoxDriver();
	driver.get("http://www.angelfire.com/super/badwebs/");
	JavascriptExecutor js=(JavascriptExecutor)driver;
	String DomainName = js.executeScript("return document.domain;").toString();			
    System.out.println("Domain name of the site = "+DomainName);	
}

}
