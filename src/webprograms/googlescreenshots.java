package webprograms;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;
import org.openqa.selenium.server.browserlaunchers.Sleeper;

public class googlescreenshots {

	public static void main(String[] args) throws IOException {
		// open ff with google
		ProfilesIni pr=new ProfilesIni();
		FirefoxProfile fp=pr.getProfile("Qaclasses");
		FirefoxDriver  driver=new FirefoxDriver(fp);
		driver.get("http://google.com");
		//verify every link and click
		List<WebElement>links=driver.findElementsByTagName("a");
		for(int i=0;i<links.size();i++){
			if(links.get(i).isDisplayed()){
				String linkname=links.get(i).getText();
				links.get(i).click();
				Sleeper.sleepTight(2);
				//take screenshot of every next page
				File srcfile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
				FileUtils.copyFile(srcfile, new File("C:\\Users\\user\\Desktop\\"+linkname+".png"));

				driver.navigate().back();
				
				links=driver.findElementsByTagName("a");
				
		}
		}
	}

}
 