package javascriptexecutor;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class js1{
	public static void main(String[]args){
		
		WebDriver driver=new FirefoxDriver();
		driver.navigate().to("http:seleniumhq.org");
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("alert('hello world);");
driver.close();
		
		
	}}
 