package apachepoi;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class getstringdataexcel {

	public static void main(String[] args) throws IOException {
		FileInputStream exo=new FileInputStream("C:\\Users\\user\\Desktop\\book1.xlsx");
		XSSFWorkbook wbo=new XSSFWorkbook(exo);
		XSSFSheet wsh=wbo.getSheet("sheet1");
		Row r;
		r=wsh.getRow(2);
		System.out.println(r.getCell(2).getStringCellValue());
		
		

	}

}
