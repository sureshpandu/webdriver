package testngprogrames;  

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class orangehrmdatadriven {
	FirefoxDriver driver;
	@BeforeTest
	public void launchbrowser(){
		driver=new FirefoxDriver();
		driver.get("http://opensource.demo.orangehrmlive.com/");
	}
@Test
public void login() throws IOException{
	FileInputStream exo=new FileInputStream("C:\\Users\\user\\Desktop\\book1.xlsx");
	XSSFWorkbook wbo=new XSSFWorkbook(exo);
	XSSFSheet wsh=wbo.getSheet("sheet3");
	Row r;
	int cr=wsh.getLastRowNum();
	for(int i=1;i<=cr;i++){
	r=wsh.getRow(i);
	Sleeper.sleepTightInSeconds(5);
	driver.findElementByXPath(".//*[@id='txtUsername']").sendKeys(r.getCell(0).getStringCellValue());
	driver.findElementByXPath(".//*[@id='txtPassword']").sendKeys(r.getCell(1).getStringCellValue());
	driver.findElementByXPath(".//*[@id='btnLogin']").click();
	Sleeper.sleepTightInSeconds(5);
	
	String Actual=driver.getCurrentUrl();
	r.createCell(3).setCellValue(Actual);
	String exp=r.getCell(2).getStringCellValue();
	if(exp.equals(Actual)){
		
		r.createCell(4).setCellValue("pass");
		try{
			
		
		driver.findElementByCssSelector("#welcome").click();     
		 driver.findElementByXPath(".//*[@id='welcome-menu']/ul/li[2]/a").click();
		}catch(Exception e){
		}
		
		}else{
		r.createCell(4).setCellValue("fail");
	} 
	
	FileOutputStream f=new FileOutputStream("C:\\Users\\user\\Desktop\\book1.xlsx");   
	  
	wbo.write(f);  
	}
}

	 @AfterTest
	 public void close(){
		 driver.close();
		 
	 }
	  

}
	 
	

	
		
	
	
	
	
	


