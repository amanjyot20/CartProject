package ImportData;

import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;

import org.apache.poi.xssf.streaming.SXSSFRow;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcelData {

	public static void main(String[] args) throws IOException {
		//Read  Excel file ->> Workbook->> Sheet ->> Rows->> Cells
	//	FileInputStream readExcel = new FileInputStream("C:\\Projects\\SeleniumWebDriver\\testData\\Data.xlsx");
		FileInputStream readExcel = new FileInputStream(System.getProperty("user.dir")+"\\testData\\Data.xlsx");
		XSSFWorkbook workbook =  new XSSFWorkbook(readExcel);
		XSSFSheet sheet= workbook.getSheet("Sheet1");   // XSSFSheet sheet= workbook.getSheetAt(0);
		
		int totalRows = sheet.getLastRowNum();
		int totalCells = sheet.getRow(1).getLastCellNum();
		System.out.println( "Total Rows  "+ totalRows + ", Total Cells  "+ totalCells);
		for (int r= 0; r<=totalRows; r++)
		{
			XSSFRow currentRow = sheet.getRow(r);
			//System.out.println(currentRow.toString());
			for(int j=0; j<totalCells; j++)
			{
				XSSFCell currentCell =  currentRow.getCell(j);
				System.out.print("   "+currentCell.toString());
			}
			System.out.println();
		}
	workbook.close();
	readExcel.close();
	} 
}
