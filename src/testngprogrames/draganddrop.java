package testngprogrames;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class draganddrop {
	FirefoxDriver driver;
	@BeforeTest
	public void openbrowser(){
		driver=new FirefoxDriver();
		driver.get("http:jqueryui.com/slider/");
		driver.manage().window().maximize();
		
	}
	@Test
	public void drag(){
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		Actions action=new Actions(driver);
		driver.switchTo().frame(0);
		WebElement slider=driver.findElementByXPath(".//*[@id='slider']");
		int x=slider.getLocation().x;
		action.dragAndDropBy(slider, 90, x).build().perform();
		
		
	}

}
