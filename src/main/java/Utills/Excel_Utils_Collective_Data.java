package Utills;

import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.List;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel_Utils_Collective_Data 
{
	  public static Object[][] getTestData(String path, String sheetName) {
	        try {
	            FileInputStream file = new FileInputStream(path) ;
	            XSSFWorkbook workbook = new XSSFWorkbook(file);
	            XSSFSheet sheet = workbook.getSheet(sheetName);

	            int rowCount = sheet.getPhysicalNumberOfRows();
	            Object[][] data = new Object[rowCount - 1][1];

	            for (int i = 1; i < rowCount; i++) {
	                XSSFRow row = sheet.getRow(i);
	                List<String> values = new ArrayList<>();
	                for (int j = 0; j < 3; j++) { // Read 3 values
	                    values.add(row.getCell(j).toString());
	                }
	                data[i - 1][0] = values;
	            }

	            //workbook.close();
	            return data;
	        } catch (Exception e) {
	            e.printStackTrace();
	            return null;
	        }
	    }
}
