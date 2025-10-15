package utils;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtils {

	static String path;
	static XSSFWorkbook workbook;
	static XSSFSheet sheet;

	public ExcelUtils(String excelPath, String sheetName) {

		try {
			workbook = new XSSFWorkbook(excelPath);
			sheet = workbook.getSheet(sheetName);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}



	public static int getRowCount() throws IOException {
		int rowCount = sheet.getPhysicalNumberOfRows();
		//System.out.println("No of rows " + rowCount);
		return rowCount;
	}
	
	public static int getColumnCount() throws IOException {
		int columnCount = sheet.getRow(0).getPhysicalNumberOfCells();
		//System.out.println("No of rows " + columnCount);
		return columnCount;
	}

	public static String getCellData(int rowNo, int ColNo) throws IOException {
		String celldata = sheet.getRow(rowNo).getCell(ColNo).getStringCellValue();
		//System.out.println(celldata);
		return celldata;
	}

	public static void getCellDataNumber(int rowNo, int colNo) throws IOException {
		double value1 = sheet.getRow(rowNo).getCell(colNo).getNumericCellValue();
		System.out.println(value1);
	}

}
