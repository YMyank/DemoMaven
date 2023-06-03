package com.demomaven.generic;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class FileLib {
	    public String getPropertyData(String key) throws IOException {
		FileInputStream fis=new FileInputStream("./src/test/resources/VtigerPropFile.property");
		Properties p=new Properties();
		p.load(fis);
		String value = p.getProperty(key);
		return value;
		
		             }
		
	    public String getExcelData(String sheetname, int row, int cell) throws EncryptedDocumentException, IOException{
		FileInputStream fis= new FileInputStream("./src/test/resources/VtigerExcelData.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		String cellvalue = wb.getSheet(sheetname).getRow(row).getCell(cell).getStringCellValue();
		return cellvalue;
		
	                 }
	
	    
	    
	    
	    

	

}
