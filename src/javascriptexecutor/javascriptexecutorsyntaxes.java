package javascriptexecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class javascriptexecutorsyntaxes {

	public static void main(String[] args) {
		// TO click on element
		WebDriver driver = new FirefoxDriver();
		driver.navigate().to("http://seleniumhq.org");
		WebElement download = driver.findElement(By.xpath(".//*[@id='menu_download']/a"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", download);

		// to get title of webpage
		JavascriptExecutor js1 = (JavascriptExecutor) driver;
		String title = js1.executeScript("retun document.title;").toString();
		System.out.println(title);
	}
	/*
	 * to get url of current web page
	 * 
	 * JavascriptExecutor js1=(JavascriptExecutor)driver; String
	 * url=js1.executeScript("retun document.URL;").toString();
	 * System.out.println(url);
	 */

	/*
	 * to scroll JavascriptExecutor js=(JavascriptExecutor)driver;
	 * js.executeScript("window.scrollBy(0,50)"); Note:- for scrolling till the
	 * bottom of the page we can use the code like
	 * js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
	 */

	/*
	 * Navigate to new Page JavascriptExecutor js = (JavascriptExecutor)driver;
	 * js.executeScript("window.location = 'https://www.facebook.com/uftHelp'");
	 */

}
