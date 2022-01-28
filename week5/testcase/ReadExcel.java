package week5.testcase;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;



public class ReadExcel {

	public static void main (String[] args) throws IOException 
	{
		//Set the path of the  excel workbook
		XSSFWorkbook wb = new XSSFWorkbook("./data/CreateLead.xlsx");
				
		// Get into the sheet
		XSSFWorkbook ws=wb.getSheet("CreateLead");
		//wb.getsheetAt(0);
		
		for(int i=1;i<=2;i++)
			
			
		XSSFRow row=ws.getRow(i);
					
		//Get into the firstrow( excluding Header)
		//XSSFRow row=ws.getRow(1);
		
		//Get into First cell
		XSSFCell cell=row.getCell(0);
		
		//retrieve the data
		//String data=cell.getStringCellValue();
		//System.out.println(data);
		String[][] data = new String[rowCount][cellCount];
		for (int i = 1; i <= rowCount; i++) {
			XSSFRow row = ws.getRow(i);
			for (int j = 0; j < cellCount; j++) {
				XSSFCell cell = row.getCell(j);
				String cellValue = cell.getStringCellValue();
				data[i-1][j] = cellValue;
			}
		}
		
		wb.close();
		return data;

		
	}

}
