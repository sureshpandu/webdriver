package pom;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class homepage {
	WebDriver driver;
	public homepage(WebDriver driver)
	{
		this.driver=driver;
	}
	@FindBy(id="txtUsername")
	WebElement username;
	
	@FindBy(id="txtPassword")
	WebElement password;
	
	@FindBy(id="btnLogin")
	WebElement btnlogin;
	
	@FindBy(xpath="//span[text()='Username cannot be empty']")
	WebElement errmsg;
	
 public void  loginhrm(String uid,String pwd)
 {
	 username.sendKeys(uid);
	 password.sendKeys(pwd);
	 btnlogin.click();
 }



}
