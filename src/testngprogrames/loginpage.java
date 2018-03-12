package testngprogrames;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class loginpage {
	public loginpage(FirefoxDriver driver){
		PageFactory.initElements( driver,this);
	}
@FindBy(id="txtUsername")
WebElement user;
@FindBy(id="txtPassword")
WebElement password;
@FindBy(id="btnLogin")
WebElement ok;
@FindBy(xpath=".//*[@id='menu_admin_viewAdminModule']/b")
WebElement admin;
}

