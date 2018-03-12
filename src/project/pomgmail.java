package project;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class pomgmail {

	public pomgmail(WebDriver driver){
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="Email")
	WebElement user;
	@FindBy(id="next")
	WebElement next;
	@FindBy(id="Passwd")
	WebElement password;
	@FindBy(id="signIn")
	WebElement signin;
	@FindBy(xpath=".//*[@id='gb']/div[1]/div[1]/div[2]/div[4]/div[1]/a/span")
	WebElement openlog;
	@FindBy(id="gb_71")
	WebElement logout;
	} 

