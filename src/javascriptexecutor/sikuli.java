package javascriptexecutor;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;
import org.testng.annotations.Test;

public class sikuli {
	

	
	@Test
	public void gmaillogin() throws FindFailed {
		Screen screen=new Screen();
		Pattern e1=new Pattern("C:\\Images\\gmail.PNG");
		Pattern e2=new Pattern("C:\\Images\\uname.PNG");
        Pattern e3=new Pattern("C:\\Images\\next.PNG");
    	Pattern e4=new Pattern("C:\\Images\\pass.PNG");
    	Pattern e5=new Pattern("C:\\Images\\signin.PNG");
    	WebDriver	driver=new FirefoxDriver();
		driver.navigate().to("http://google.com");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

 screen.click(e1);
 screen.type(e2, "sureshbtech594");
 screen.click(e3);
 screen.type(e4,"9963662678");
 screen.click(e5);
 
	}

}
