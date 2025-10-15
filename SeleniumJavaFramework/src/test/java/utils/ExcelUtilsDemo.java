package utils;

import java.io.IOException;


public class ExcelUtilsDemo {
	
	

	public static void main(String[] args) throws IOException {
		
		 
		String path=System.getProperty("user.dir");
		ExcelUtils excel=new ExcelUtils(path+"/excel/data.xlsx", "chaluva");
		excel.getRowCount();
		excel.getCellData(0, 0);
		excel.getCellDataNumber(1, 1);
		

	}

}
