package apachepoi;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class workwithexcel {

	
	public static void main(String[] args) throws IOException {
		FileInputStream exo=new FileInputStream("C:\\Users\\user\\Desktop\\book1.xlsx");
		XSSFWorkbook wbo=new XSSFWorkbook(exo);
		XSSFSheet wsh=wbo.getSheet("sheet1");
		Row r;
		
		r=wsh.createRow(2);
		for(int i=0;i<10;i++){
		r.createCell(i).setCellValue("onlineqaclasses");
		FileOutputStream f=new FileOutputStream("C:\\Users\\user\\Desktop\\book1.xlsx");
		wbo.write(f);;

	}

}
}