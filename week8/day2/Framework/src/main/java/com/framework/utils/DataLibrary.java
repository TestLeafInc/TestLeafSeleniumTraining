package com.framework.utils;

import java.io.IOException;

import javax.sound.midi.SysexMessage;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DataLibrary {
	public static Object[][] readExcelData(String excelfileName) {
		XSSFWorkbook wbook;
		Object[][] data = null ;
		try {
			wbook = new XSSFWorkbook("./data/"+excelfileName+".xlsx");
			XSSFSheet sheet = wbook.getSheetAt(0);
			int rowCount = sheet.getLastRowNum();
			int colCount = sheet.getRow(0).getLastCellNum();
			data = new Object[rowCount][colCount];
			for (int i = 1; i <= rowCount; i++) {
				for (int j = 0; j < colCount; j++) {
					data[i-1][j] =  sheet.getRow(i).getCell(j).getStringCellValue();
				} 
			}
			wbook.close();
		} catch (IOException e) {
			System.err.println(e.getMessage());
		}
		return data;
	}
}