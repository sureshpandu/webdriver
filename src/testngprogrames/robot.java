package testngprogrames;

import java.awt.AWTException;
import java.awt.Robot;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.sun.glass.events.KeyEvent;

public class robot {
	FirefoxDriver driver;
	@BeforeTest
	public void openbrowser(){
		driver=new FirefoxDriver();
		driver.get("http://seleniumhq.org");
	}
	@Test
	public void download() throws AWTException, Exception{
		Sleeper.sleepTightInSeconds(5);
		driver.findElementByXPath(".//*[@id='menu_download']/a").click();
		driver.findElementByXPath(".//*[@id='mainContent']/p[3]/a").click();
		Sleeper.sleepTightInSeconds(5);
		Robot rb=new Robot();
		rb.keyPress(KeyEvent.VK_TAB);
		rb.keyRelease(KeyEvent.VK_TAB);
		rb.keyPress(KeyEvent.VK_TAB);
		rb.keyRelease(KeyEvent.VK_TAB);
        rb.keyPress(KeyEvent.VK_ENTER);
		rb.keyRelease(KeyEvent.VK_ENTER);
	}

}
