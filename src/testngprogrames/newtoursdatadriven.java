package testngprogrames;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class newtoursdatadriven {
	FirefoxDriver driver;
	@BeforeTest
	public void openbrowser(){
		driver=new FirefoxDriver();
		driver.get("http://newtours.demoaut.com/");
	}
	@Test
	public void registration() throws IOException{
		FileInputStream exo=new FileInputStream("C:\\Users\\user\\Desktop\\book1.xlsx");
		XSSFWorkbook wbo=new XSSFWorkbook(exo);
		XSSFSheet wsh=wbo.getSheet("sheet3");
		int rc=wsh.getLastRowNum();
		for(int i=1;i<rc;i++){
			Row r;
			r=wsh.getRow(i);
			Sleeper.sleepTightInSeconds(5);
		driver.findElementByXPath("html/body/div[1]/table/tbody/tr/td[2]/table/tbody/tr[2]/td/table/tbody/tr/td[2]/a").click();	
		driver.findElementByXPath("html/body/div[1]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[2]/td[2]/input").sendKeys(r.getCell(0).getStringCellValue());
		driver.findElementByXPath("html/body/div[1]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[3]/td[2]/input").sendKeys(r.getCell(1).getStringCellValue());
		driver.findElementByName("phone").sendKeys(r.getCell(2).getStringCellValue());
		driver.findElementByXPath(".//*[@id='userName']").sendKeys(r.getCell(3).getStringCellValue());
		driver.findElementByXPath("html/body/div[1]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[7]/td[2]/input").sendKeys(r.getCell(4).getStringCellValue());
		driver.findElementByXPath("html/body/div[1]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[9]/td[2]/input").sendKeys(r.getCell(5).getStringCellValue());
		driver.findElementByXPath("html/body/div[1]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[10]/td[2]/input").sendKeys(r.getCell(6).getStringCellValue());
		driver.findElementByXPath("html/body/div[1]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[11]/td[2]/input").sendKeys(r.getCell(7).getStringCellValue());
		driver.findElementByName("country").sendKeys(r.getCell(8).getStringCellValue());
		driver.findElementByXPath(".//*[@id='email']").sendKeys(r.getCell(9).getStringCellValue());
		driver.findElementByXPath("html/body/div[1]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[15]/td[2]/input").sendKeys(r.getCell(10).getStringCellValue());
		driver.findElementByXPath("html/body/div[1]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[16]/td[2]").sendKeys(r.getCell(11).getStringCellValue());
		driver.findElementByXPath("html/body/div[1]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[18]/td/input").click();
	Sleeper.sleepTightInSeconds(5);
	String Actual=driver.getCurrentUrl();
		String exp=r.getCell(12).getStringCellValue();
		r.createCell(13).setCellValue(Actual);
		if(exp.equals(Actual)){
			r.createCell(14).setCellValue("pass");
		}else{
			r.createCell(14).setCellValue("fail");
		} 
		
		FileOutputStream f=new FileOutputStream("C:\\Users\\user\\Desktop\\book1.xlsx");
		wbo.write(f);
		driver.findElementByXPath("html/body/div[1]/table/tbody/tr/td[2]/table/tbody/tr[2]/td/table/tbody/tr/td[2]/a").click();
		
		
		}
		
	}

}
