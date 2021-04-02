package com.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class GetSpreadsheetData extends BaseClass {
	
	public static XSSFWorkbook wb;	// XSSF (XML SpreadSheet Format) Used to reading & writing open office XML 
	public static XSSFSheet sheet;
	public FileInputStream fis= null;	// used to read data (in bytes) from file
	public FileOutputStream fileOut= null;	// used to write data (in bytes) to the file
	public XSSFRow row = null;	// The object of this class owns a row of excel sheet which is obtained by XSSFSheet
	public XSSFCell cell = null; // The object of XSSFCELL represents a cell to the corresponding row
	public String filePath;
	
	//contractor
	public GetSpreadsheetData(String excelPath) throws IOException 
	{  
		try 
		{
		filePath= excelPath;
		File file = new File (this.filePath);
		
		FileInputStream fis = new FileInputStream(file);
		wb= new XSSFWorkbook(fis);			
		} 
		catch (FileNotFoundException e) 
		{
			
			e.printStackTrace();
		}		
	}
	
	// Function to get string cell data from excel	
	public String getCellData(String sheetName, int row,String columnName) 
	{
		sheet =wb.getSheet(sheetName);
		XSSFRow rowHeader = wb.getSheet(sheetName).getRow(0);
		int col = 0 ;
		for(int i=0;i<rowHeader.getLastCellNum();i++) 
		{
			if(rowHeader.getCell(i).getStringCellValue().equals(columnName)) 
			{
				col=i;
				break;
			}
		}
		String data= sheet.getRow(row).getCell(col).getStringCellValue();
		return data;				
	}
		
		
	//Function to count the row in excel
	public int getRowCount(String sheetName) 
	{	
		int row = wb.getSheet(sheetName).getLastRowNum();
		row = row +1;
		return row;		
	}
	
	// Get numeric cell data from excel
	public int getNumericCellData (String sheetName, int row, int columnName) 
	{
		sheet =wb.getSheet(sheetName);
		XSSFRow rowHeader = wb.getSheet(sheetName).getRow(0);
		int col = 0 ;
		for(int i=0;i<rowHeader.getLastCellNum();i++) 
		{
			if(rowHeader.getCell(i).getStringCellValue().equals(columnName)) 
			{
				col=i;
				break;
			}
		}
		int data= (int)sheet.getRow(row).getCell(col).getNumericCellValue();
		return data;		
	}
}

// Date Format, Decimal Format, Double Format Data Read From Excel
// Use Class For Data Read From Apache POI 