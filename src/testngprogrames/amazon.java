package testngprogrames;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class amazon {
@Test
public void openbrowser(){
	WebDriver driver=new FirefoxDriver();
	driver.get("https://www.google.co.in/?gfe_rd=cr&ei=zI3vWJSQHsbpugSa5JJo");
	
}
}
