package apachepoi;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class getdatafromnoofrows {

	public static void main(String[] args) throws IOException {
		FileInputStream exo=new FileInputStream("C:\\Users\\user\\Desktop\\book1.xlsx");
		XSSFWorkbook wbo=new XSSFWorkbook(exo);
		XSSFSheet wsh=wbo.getSheet("sheet3");
		Row r;
		for(int i=0;i<10;i++){
			r=wsh.getRow(i);
			for(int j=0;j<10;j++){
			System.out.print(r.getCell(i).getStringCellValue()+"     ");
			}
			System.out.println();
			
			

		}
		 

	}

}

