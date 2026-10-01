package com.automation.Tests;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadFile{
	public static void main(String[] args) throws IOException {
		File f = new File("C:\\Users\\MBUSSA\\Documents\\DailyActivityTrackerOnBench.xlsx");
		FileInputStream stream = new FileInputStream(f);
		XSSFWorkbook w = new XSSFWorkbook(stream);
		XSSFSheet s = w.getSheet("sheet1");
		XSSFRow r = s.getRow(2);
		XSSFCell c = r.getCell(0);
		System.out.println(c);
	}
}