package com.seleniumCode;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class C_DataDrivenFramework_WriteFile {
	
	public static void main(String[] args) throws IOException, InvalidFormatException {
		
		File f = new File("C:\\Users\\MBUSSA\\OneDrive - Capgemini\\Documents\\ReadFile.xlsx");
		
		FileInputStream fis = new FileInputStream(f);
		
		Workbook w = new XSSFWorkbook(fis);
		
		Sheet s = w.getSheet("Sheet1");
		
		Row r = s.getRow(1);
		
		Cell c = r.getCell(0);
		
		c.setCellValue("Python");
		
		FileOutputStream fos = new FileOutputStream(f);
		
		w.write(fos);
		
						
		
	}

}
