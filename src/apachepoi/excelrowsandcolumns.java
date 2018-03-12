package apachepoi;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class excelrowsandcolumns {

	public static void main(String[] args) throws IOException {
		FileInputStream exo=new FileInputStream("C:\\Users\\user\\Desktop\\book1.xlsx");
		XSSFWorkbook wbo=new XSSFWorkbook(exo);
		XSSFSheet wsh=wbo.getSheet("sheet3");
		Row r;
		for(int i=0;i<10;i++){
		r=wsh.createRow(i);
		for(int j=0;j<10;j++){
		r.createCell(j).setCellValue("selenium123");
		FileOutputStream f=new FileOutputStream("C:\\Users\\user\\Desktop\\book1.xlsx");
		wbo.write(f);
		

	}
		}
}}

 