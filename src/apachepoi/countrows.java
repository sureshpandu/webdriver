package apachepoi;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class countrows {

	public static void main(String[] args) throws IOException {
		FileInputStream exo=new FileInputStream("C:\\Users\\user\\Desktop\\book1.xlsx");
		XSSFWorkbook wbo=new XSSFWorkbook(exo);
		XSSFSheet wsh=wbo.getSheet("sheet1");
		Row r;
	int cr=wsh.getLastRowNum();
	for(int i=0;i<cr;i++){
		r=wsh.getRow(i);
		int cc=r.getLastCellNum();
		for(int j=0;j<cc;j++){
		System.out.print(r.getCell(j).getStringCellValue()+"   ");
	}
		System.out.println();

	}

}
} 
