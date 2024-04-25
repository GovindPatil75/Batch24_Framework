package com.Utility;

import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcleDataProvider {
	
	XSSFWorkbook wb;
	
	public ExcleDataProvider() throws Exception {
		
		String path=System.getProperty("user.dir")+"\\TestData\\Data.xlsx";
		FileInputStream fis=new FileInputStream(path);
		wb=new XSSFWorkbook(fis);
		
	}

	public String getStringTestData(String Sheetname,int row,int cell) {
		return wb.getSheet(Sheetname).getRow(row).getCell(cell).getStringCellValue();
	}
	
	public double getNumericeTestData(String Sheetname,int row,int cell) {
		return wb.getSheet(Sheetname).getRow(row).getCell(cell).getNumericCellValue();
	}
	
}
