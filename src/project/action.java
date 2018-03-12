package project;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class action {

	public static void main(String[] args) {
		WebDriver driver=new FirefoxDriver();
		driver.navigate().to("http://www.ufthelp.com/2014/11/working-with-action-class-in-selenium.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		//click and hold
		Actions action=new Actions(driver);
		WebElement search=driver.findElement(By.xpath(".//*[@id='Blog1']/div/div/div/div/div[1]/div/div[4]/div[1]/div[6]/pre/span[35]"));
		WebElement search1=driver.findElement(By.xpath(".//*[@id='Blog1']/div/div/div/div/div[1]/div/div[4]/div[1]/div[6]/pre/span[42]"));
		action.clickAndHold(search).moveToElement(search1).release().build().perform();
		
	}

}
