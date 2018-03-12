package testngprogrames;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class getdataandprintinexcel {

	
		FirefoxDriver driver;
		@BeforeTest
		public void openbrowser(){
			driver=new FirefoxDriver();
			driver.get("http://newtours.demoaut.com/");
		}
			@Test
			public void getdata() throws IOException{
				FileInputStream exo=new FileInputStream("C:\\Users\\user\\Desktop\\book1.xlsx");
				XSSFWorkbook wbo=new XSSFWorkbook(exo);
				XSSFSheet wsh=wbo.getSheet("sheet2");
				driver.findElementByXPath("html/body/div[1]/table/tbody/tr/td[2]/table/tbody/tr[2]/td/table/tbody/tr/td[2]/a").click();
				WebElement listbox=driver.findElementByName("country");
				List<WebElement>values=listbox.findElements(By.tagName("option"));
				Row r;
				for(int i=1;i<values.size();i++){
					r=wsh.createRow(i);
					r.createCell(0).setCellValue(values.get(i).getText());
					FileOutputStream f=new FileOutputStream("C:\\Users\\user\\Desktop\\book1.xlsx");
					wbo.write(f);
			
				}
				
			}
			
			
		}
		

	

