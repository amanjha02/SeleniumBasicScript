package Assignment;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReaddataFromExcel {
	public String runvalue;
	public ArrayList<String> value=null;
	String basepath=System.getProperty("user.dir");
	
	public ArrayList<String> readData(int colum) throws IOException {
    FileInputStream fis=new FileInputStream(new File(basepath+"\\Utils\\TestDataForTest1.xlsx"));		
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		XSSFSheet sheet=wb.getSheetAt(0);
		value=new ArrayList<String>();
		int totalRowUsed =sheet.getLastRowNum();
		for (int i = 1; i <totalRowUsed; i++) {
			runvalue= sheet.getRow(i).getCell(colum).getStringCellValue();
			value.add(runvalue);
		}
		return value;
		
		
	}
	
	public void WriteData(String valuetobeUpdate) throws IOException {
		   FileInputStream fis=new FileInputStream(new File("C:\\Users\\ajha\\Desktop\\TestDataForTest1.xlsx"));
		   XSSFWorkbook wb=new XSSFWorkbook(fis);
		   XSSFSheet sheet=wb.getSheetAt(0);
		   int totalRowUsed =sheet.getLastRowNum();
			for (int i = 1; i <totalRowUsed; i++) {
				 XSSFRow row=sheet.getRow(i);
				   row.createCell(6).setCellValue("Pass");;
				   FileOutputStream  fout=new FileOutputStream(new File("C:\\Users\\ajha\\Desktop\\TestDataForTest1.xlsx"));
				   wb.write(fout);
					fout.close();
			}
			
		  
			
		   
	}

}
