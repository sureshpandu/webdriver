package testngprogrames;

import java.io.IOException;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Autoit {
	FirefoxDriver driver;
	@BeforeTest
	public void open(){
		driver=new FirefoxDriver();
		driver.get("http://www.seleniumhq.org/download/");
	}
@Test
public void download() throws IOException{
	driver.findElementByXPath(".//*[@id='mainContent']/p[3]/a").click();
	Sleeper.sleepTightInSeconds(5);
	java.lang.Runtime.getRuntime().exec("C:\\Users\\user\\Desktop\\ex1.exe");
}
}
