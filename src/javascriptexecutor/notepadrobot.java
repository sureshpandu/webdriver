package javascriptexecutor;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;
import org.testng.annotations.Test;

import com.sun.glass.events.KeyEvent;

public class notepadrobot {
	@Test
	public void opennotepad() throws IOException, AWTException{
	Runtime.getRuntime().exec("Notepad.exe");
	Robot r=new Robot();
	r.keyPress(KeyEvent.VK_I);
	r.keyRelease(KeyEvent.VK_I);
	r.keyPress(KeyEvent.VK_U);
	r.keyRelease(KeyEvent.VK_U);
	r.keyPress(KeyEvent.VK_CONTROL);
    r.keyPress(KeyEvent.VK_S);
    r.keyRelease(KeyEvent.VK_CONTROL);
    r.keyRelease(KeyEvent.VK_S);
    r.delay(3000);
    r.keyPress(KeyEvent.VK_BACK_SLASH);
    r.keyPress(KeyEvent.VK_T);
    r.keyRelease(KeyEvent.VK_T);
    r.keyPress(KeyEvent.VK_E);
    r.keyRelease(KeyEvent.VK_E);
    r.keyPress(KeyEvent.VK_S);
    r.keyRelease(KeyEvent.VK_S);
    r.keyPress(KeyEvent.VK_T);
    r.keyRelease(KeyEvent.VK_T);
    r.keyPress(KeyEvent.VK_ENTER);
    r.keyRelease(KeyEvent.VK_ENTER);
    r.keyPress(KeyEvent.VK_ENTER);
    r.keyRelease(KeyEvent.VK_ENTER);
    r.keyPress(KeyEvent.VK_ENTER);
    r.keyRelease(KeyEvent.VK_ENTER);
 Sleeper.sleepTight(5);   
    FirefoxDriver driver=new FirefoxDriver();
    driver.get("http://gmail.com");
    driver.manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS);
    driver.findElement(By.id("Email")).sendKeys("sureshbtech594");
    driver.findElement(By.id("next")).click();
driver.findElement(By.id("Passwd")).sendKeys("9963662678");
driver.findElement(By.id("signIn")).click();
driver.findElementByXPath(".//*[@id=':it']/div/div").click();
driver.findElementByXPath(".//*[@id=':on']").sendKeys("hasini.pesala@gmail.com");
driver.findElementByXPath(".//*[@id=':q2']").click();
r.keyPress(KeyEvent.VK_T);
r.keyRelease(KeyEvent.VK_T);
r.keyPress(KeyEvent.VK_DOWN);
r.keyRelease(KeyEvent.VK_DOWN);
r.keyPress(KeyEvent.VK_ENTER);
r.keyRelease(KeyEvent.VK_ENTER);
driver.findElementByXPath(".//*[@id=':nx']").click();


//how to enter data by using clipboard in robot
//Create instance of Robot class
Robot robot = new Robot();

//Create instance of Clipboard class
Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();

//Set the String to Enter
StringSelection stringSelection = new StringSelection("String to enter");

//Copy the String to Clipboard
clipboard.setContents(stringSelection, null);

//Use Robot class instance to simulate CTRL+C and CTRL+V key events :
robot.keyPress(KeyEvent.VK_CONTROL);
robot.keyPress(KeyEvent.VK_V);
robot.keyRelease(KeyEvent.VK_V);
robot.keyRelease(KeyEvent.VK_CONTROL);

//Simulate Enter key event
robot.keyPress(KeyEvent.VK_ENTER);
robot.keyRelease(KeyEvent.VK_ENTER);


}

	
	
	
	
}
