package testngprogrames;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class keyworddrivenscript {
	@Test
	public void login()throws IOException{
       actionkeyword key=new actionkeyword();
		FileInputStream f=new FileInputStream("C:\\Users\\user\\Desktop\\book1.xlsx");
		XSSFWorkbook wbo=new XSSFWorkbook(f);
		XSSFSheet wsh=wbo.getSheet("sheet1");
		Row r;
		int rc=wsh.getLastRowNum();
		for(int i=1;i<rc;i++ ){
			r=wsh.getRow(i);
			String runmode=r.getCell(4).getStringCellValue();
			if(runmode.equals("y")){
				String action=r.getCell(3).getStringCellValue();
				if(action.equals("launchbrowser")){
					key.launchbrowser();
				}
				else if(action.equals("login")){
					key.login();
					}
			
			else if(action.equals("logout")){
				key.logout();
			}
			else if(action.equals("close")){
				key.close();
			}
				
	}


}
}}