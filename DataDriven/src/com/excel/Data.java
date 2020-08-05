package com.excel;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public  class Data{
	public void course() throws IOException {
	FileInputStream file=new FileInputStream("C:\\Users\\jagadeesh\\Downloads\\BookCourse.xlsx");
	@SuppressWarnings("resource")
	Workbook w= new XSSFWorkbook(file);
	Sheet s=w.getSheetAt(0);
	Iterator<Row> iterator = s.iterator();
	System.out.println("Total number of ROWS: "+s.getPhysicalNumberOfRows());
	System.out.println("Total number of COLUMNS: "+s.getRow(0).getPhysicalNumberOfCells());
	s.shiftRows(7, s.getLastRowNum(), 1, true, false);
	@SuppressWarnings("unused")
	Row newRow = s.createRow(9);
	newRow = s.getRow(9);
	System.out.println("DATA of EXCEL");
	while (iterator.hasNext()) {
		Row next = iterator.next();
		Iterator<Cell> iterator2 = next.iterator();
		while (iterator2.hasNext()) {
			Cell cell = (Cell) iterator2.next();
			System.out.print(cell+"  ");
		}System.out.println();
		
	}
	
	
	}
	
	public static void main(String[] args) throws IOException {
		Data d=new Data();
		d.course();
		
	}
}
