package com.seleniumCode;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class C_DataDrivenFramework_ReadFile {
	
	public static void main(String[] args) throws IOException {
		
		File f = new File("C:\\Users\\MBUSSA\\OneDrive - Capgemini\\Documents\\ReadFile.xlsx"); 
		
		FileInputStream stream  = new FileInputStream(f);
		
		Workbook w = new XSSFWorkbook(stream);
		
		Sheet s = w.getSheet("Sheet1");
		
		Row r = s.getRow(0);
		
		Cell c = r.getCell(0);
		
		System.out.println(c);
	
		
	}

}
