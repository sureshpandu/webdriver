package frameworks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class failurescrrenshots { 

	WebDriver driver;
	
	@Test
	public void capturescreenshot()throws Exception{
		driver=new FirefoxDriver();
		driver.get("http://gmail.com");
		driver.manage().window().maximize();
		driver.findElement(By.id("name")).sendKeys("suresh");
	}
	@AfterMethod
	public void close(ITestResult result){
		if(ITestResult.FAILURE==result.getStatus()){
		//	Utility.capturscreenshot(driver,result.getName());
		}
		driver.quit();
	}
	
}
