	package testngprogrames;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class crossbrowsing {
WebDriver driver;
@Parameters("browser")
@Test
public void verifytitle(String browsername){
	if(browsername.equalsIgnoreCase("firefox"))
	{
		driver=new FirefoxDriver();
	}else if(browsername.equalsIgnoreCase("chrome"))
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\user\\Downloads\\chromedriver.exe");
		driver=new ChromeDriver();
		
	}
	driver.manage().window().maximize();
	driver.get("http://google.com");
	System.out.println(driver.getTitle());
	driver.close();
}
}
