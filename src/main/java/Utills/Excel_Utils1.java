package Utills;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel_Utils1 
{
	public static Object[][] getTestData(String filePath, String sheetName) 
    {
        Object[][] data = new Object[0][0];
        try (FileInputStream fis = new FileInputStream(filePath);
             XSSFWorkbook workbook = new XSSFWorkbook(fis)) {

            Sheet sheet = workbook.getSheet(sheetName);
            if (sheet == null) {
                System.out.println("Sheet not found: " + sheetName);
                return data;
            }
            
            int rowCount = sheet.getPhysicalNumberOfRows();
            if (rowCount <= 1) {
                System.out.println("No data rows found in sheet: " + sheetName);
                return data;
            }

            int colCount = sheet.getRow(0).getPhysicalNumberOfCells();
            data = new Object[rowCount - 1][colCount];

            for (int i = 1; i < rowCount; i++) 
            {
                Row row = sheet.getRow(i);
                for (int j = 0; j < colCount; j++) 
                {
                    Cell cell = row.getCell(j);
                    data[i - 1][j] = cell != null ? cell.toString().trim() : "";
                }
            }

        } catch (IOException e) {
            System.out.println("Excel read failed: " + e.getMessage());
            e.printStackTrace();
        }
        return data;
    }
}
