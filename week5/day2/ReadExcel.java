package testcase;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel {

	public static String[][] excelRead(String fileName) throws IOException {
		//step1: set up the excel document path
		XSSFWorkbook wb = new XSSFWorkbook("./data/"+fileName+".xlsx");
		
		//step2: set up the worksheet
		XSSFSheet ws = wb.getSheet("Sheet1");
		
		//to find the number of rows in the worksheet
		int rowCount = ws.getLastRowNum();
			
		//to find the number of cells in a row
		int cellCount = ws.getRow(1).getLastCellNum();
		
		//declare 2D array
		String[][] data = new String[rowCount][cellCount];
		
				
		for (int i = 1; i <= rowCount; i++) {
			
			for (int j = 0; j < cellCount; j++) {
				
				String text = ws.getRow(i).getCell(j).getStringCellValue();
				System.out.println(text);
				data[i-1][j] = text;
				
				
			}
				
		}
		//to close the workbook
		wb.close();
		
		return data;
		
		
		/*
		 * //step3: get into the row XSSFRow row = ws.getRow(i);
		 * 
		 * //step4: get into the cell XSSFCell cell = row.getCell(0);
		 * 
		 * //to read the data from a cell String text = cell.getStringCellValue();
		 * System.out.println(text);
		 */
		
		
		//to count including the first row
				/*
				 * int countIncludingFirstRows = ws.getPhysicalNumberOfRows();
				 * System.out.println(countIncludingFirstRows);
				 */

	}

}
