package testngprogrames;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class oreangehrmproperties {
	FirefoxDriver driver;
	@BeforeTest
	public void open(){
		driver=new FirefoxDriver();
		driver.get("http://opensource.demo.orangehrmlive.com/");
	}
	@Test
	public void login() throws IOException{
		FileInputStream f=new FileInputStream("C:\\Users\\user\\Desktop\\key.rtf");
		Properties pr=new Properties();
		pr.load(f);
		driver.findElementById(pr.getProperty("u")).sendKeys("Admin");
		driver.findElementById(pr.getProperty("p")).sendKeys("admin");
		driver.findElementById(pr.getProperty("l")).click();
	}

}
