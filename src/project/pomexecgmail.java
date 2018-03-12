package project;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class pomexecgmail {
	FirefoxDriver driver;
	@BeforeTest
	public void open(){
		driver=new FirefoxDriver();
		driver.navigate().to("http://gmail.com");
	}
	@Test
	public void login(){
		driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS );
		pomgmail obj=new pomgmail(driver);
		obj.user.sendKeys("sureshbtech594");
		obj.next.click();
		obj.password.sendKeys("9963662678");
		obj.signin.click();
		obj.openlog.click();
		obj.logout.click();
	}

}
