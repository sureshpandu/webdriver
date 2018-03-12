package frameworks;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class dataprovider {
	WebDriver driver;
	@Test(dataProvider="orangehrm")
public void login(String username,String password){
		driver=new FirefoxDriver();
		driver.get("http://opensource.demo.orangehrmlive.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.findElement(By.cssSelector("#txtUsername")).sendKeys(username);
		driver.findElement(By.cssSelector("#txtPassword")).sendKeys(password);
		driver.findElement(By.cssSelector("#btnLogin")).click();
		driver.findElement(By.cssSelector("#welcome")).click();
		driver.findElement(By.cssSelector(".//*[@id='welcome-menu']/ul/li[2]/a")).click();
		driver.quit();
	}
	@DataProvider(name="orangehrm")
	public Object[][] passdata(){
		Object[][] data=new Object[3][2];
		data[0][0]="Admin";
		data[0][1]="admin";
		data[1][0]="Admin";
	    data[1][1]="admin";
		data[2][0]="Admin";
		data[2][1]="admin";
		return data;
	}
}
