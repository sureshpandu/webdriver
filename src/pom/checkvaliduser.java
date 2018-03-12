package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;



public class checkvaliduser {

	@Test
	public void validuser()
	
	{
		WebDriver driver=new FirefoxDriver();
		driver.get("http://127.0.0.1/orangehrm/symfony/web/index.php/auth/login");
		homepage hp=PageFactory.initElements(driver,homepage.class);
		hp.loginhrm("admin","manager");
		

	}

}
