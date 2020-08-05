package com.Excel;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;


import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcelFileDemo {
	
	@SuppressWarnings("deprecation")
	public static void main(String args[]) throws IOException {
		String filepath = "C:\\Users\\jagadeesh\\Downloads\\Book.xlsx";
		File inputFile = new File(filepath);
		System.out.println(inputFile.getPath());
		FileInputStream fis = new FileInputStream(inputFile);
		@SuppressWarnings("resource")
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		int i,j;
		XSSFSheet sheet = wb.getSheetAt(0);
		
		
		
		for ( j = 0; j <=sheet.getLastRowNum(); j++) {
		
		
			XSSFRow row = sheet.getRow(j);
			for ( i = 0; i < row.getLastCellNum(); i++) {
				XSSFCell cell = row.getCell(i);
				if (cell.getCellType()==XSSFCell.CELL_TYPE_STRING) {
					String cellValue = cell.getStringCellValue();
					System.out.println(cellValue);
					
				}else if (cell.getCellType()==XSSFCell.CELL_TYPE_NUMERIC) {
					double cellValue = cell.getNumericCellValue();
					System.out.println(cellValue);
					
				}
					
				}
	
		}
			}
		
			}
		
	
