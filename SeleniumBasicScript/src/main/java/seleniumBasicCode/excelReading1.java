package seleniumBasicCode;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class excelReading1 {
	
	public ArrayList<String> ReadTestData(int colnum) throws IOException {
		FileInputStream fis=new FileInputStream("C:\\Users\\ajha\\Desktop\\TestData.xlsx");
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		XSSFSheet sheet=wb.getSheetAt(0);
		 Iterator<Row> row=sheet.iterator();
		 row.next();
		 ArrayList<String> al=new ArrayList<String>();
		 
		 
		 while (row.hasNext()) {
	al.add(	row.next().getCell(colnum).getStringCellValue());
			
		}
		 
		 return al;

		 
		
	}
	public static void main(String[] args) throws IOException {
		excelReading1 ex=new excelReading1();
		ArrayList<String > username=ex.ReadTestData(0);
		ArrayList<String > password=ex.ReadTestData(1);
		
	for (int i = 0; i <username.size(); i++) {
		System.out.println(username.get(i));
		System.out.println(password.get(i));
		
	}
		
		System.out.println(username+"   "+password);
	}

}
