package com.utils;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.IOException;

public class Dataprovider {
    public static String[][] Data(String sheetname1) throws IOException {
        FileInputStream fis = new FileInputStream(
                "C:\\Users\\DELL\\git\\EmpireHome_Crm_10\\Empirehomecrm\\src\\main\\java\\com\\testdata\\AddinventoryproductData66.xlsx");
        Workbook workbook = new XSSFWorkbook(fis);
        Sheet sheet1 = workbook.getSheet(sheetname1);

        int rowCount = sheet1.getLastRowNum();
        int colCount = sheet1.getRow(1).getLastCellNum();

        String[][] data = new String[rowCount][colCount];
        DataFormatter dataFormatter = new DataFormatter();
        for (int i = 1; i <= rowCount; i++) {
            Row row = sheet1.getRow(i);
            if (row != null) {
                for (int j = 0; j < colCount; j++) {
                    Cell cell = row.getCell(j);
                    if (cell != null) {
                        data[i - 1][j] = dataFormatter.formatCellValue(cell);
                    }
                }
            }
        }
        return data; 
    }
}
