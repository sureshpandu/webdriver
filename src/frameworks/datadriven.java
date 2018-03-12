package frameworks;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class datadriven {
	WebDriver driver;
	@BeforeTest
	public void open(){
		driver=new FirefoxDriver();
		driver.get("http://gmail.com");
	}
@Test
public void gmaillogin() throws IOException {
	
	FileInputStream fi=new FileInputStream("C:\\Users\\user\\Desktop\\Book1.xlsx");
	XSSFWorkbook wb=new XSSFWorkbook(fi);
	XSSFSheet sh=wb.getSheet("sheet1");
	Row r;
	int rc=sh.getLastRowNum();
	for(int i=1;i<rc;i++){
	r=sh.getRow(i);
	
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	driver.findElement(By.id("Email")).sendKeys(r.getCell(0).getStringCellValue());
	driver.findElement(By.id("next")).click();
	Sleeper.sleepTightInSeconds(5);
	driver.findElement(By.id("Passwd")).sendKeys(r.getCell(1).getStringCellValue());
	driver.findElement(By.id("signIn")).click();
	String act=driver.getTitle();
	r.createCell(3).setCellValue(act);
	String exp=r.getCell(2).getStringCellValue();
	if(exp.equals(act)){
		r.createCell(4).setCellValue("pass");
		driver.findElement(By.xpath(".//*[@id=':3d']/span")).click();
driver.findElement(By.id("gb_71")).click();
	}else{
		r.createCell(4).setCellValue("fail");
	}
	FileOutputStream fo=new FileOutputStream("C:\\Users\\user\\Desktop.Book1.xlsx");
	wb.write(fo);
}
}}