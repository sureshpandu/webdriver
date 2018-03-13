package project;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class action2 {

	public static void main(String[] args) {
		WebDriver driver=new FirefoxDriver();
		driver.navigate().to("http://jqueryui.com/resources/demos/droppable/default.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		Actions action=new Actions(driver);
		//drag and drop
		WebElement drag=driver.findElement(By.xpath(".//*[@id='draggable']"));
		WebElement drop=driver.findElement(By.xpath(".//*[@id='droppable']"));
		action.dragAndDrop(drag, drop).build().perform();

	}

}
