package seleniumBasicCode;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReading {
	public static void main(String[] args) throws IOException {
		FileInputStream fis=new FileInputStream(new File ("C://Users//ajha//Desktop//TestData.xlsx"));
		
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		
		XSSFSheet sheet=wb.getSheetAt(0);
		
		int totalrow=sheet.getLastRowNum();
		
		for (int i = 0; i <totalrow; i++) {
			
			Row row=sheet.getRow(i);
			for (int j = 0; j <row.getLastCellNum(); j++) {
				System.out.println(row.getCell(j).getStringCellValue().toString());			
			}
			
		}
		
	}
}
