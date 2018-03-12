package project;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.server.browserlaunchers.Sleeper;

public class methodsandoperations {

	public static void main(String[] args) throws InterruptedException, IOException {
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("http://google.com");
		driver.manage().window().maximize();
		driver.findElementByXPath(".//*[@id='gs_htif0']").sendKeys("manual");
	driver.findElementByXPath(".//*[@id='gbw']/div/div/div[1]/div[1]/a").click();
	driver.findElementByXPath(".//*[@id='sb_ifc0']").sendKeys("manual");
	driver.close();
	driver.switchTo().frame(1);
	driver.switchTo().frame("gmail");
	driver.switchTo().frame("link");
	driver.getCurrentUrl();
	driver.getTitle();
	Actions act=new Actions(driver);
	WebElement gmail =driver.findElement(By.xpath("  "));
	act.moveToElement(gmail).build().perform();
	driver.manage().deleteAllCookies();
	Sleeper.sleepTightInSeconds(5);
	Thread.sleep(5);
driver.manage().getCookies();
driver.manage().getCookies(); 
driver.getPageSource();
driver.navigate().back();
driver.navigate().forward();
driver.getWindowHandle();
driver.getWindowHandles();
List<WebElement>link=driver.findElementsByXPath("  ");
link.size();
File srcfile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
FileUtils.copyFile(srcfile, new File("c:user\\desktop\\.png"));
driver.quit();

	WebElement drop=	driver.findElementByXPath(" ");
	System.out.println(drop.getText());
	System.out.println(drop.getAttribute("value"));

		driver.findElementByXPath(" ").getAttribute("checked");
Set<Cookie>mycookies=driver.manage().getCookies();
mycookies.size();
	}

}