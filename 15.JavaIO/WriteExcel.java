import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileOutputStream;
import java.io.IOException;

public class WriteExcel {
    public static void main(String[] args) {
        // Create a new workbook and a sheet
        Workbook workbook = new XSSFWorkbook();
        Sheet sheet = workbook.createSheet("Sheet1");

        // Sample data to write (2D array)
        String[][] data = {
            {"ID", "Name", "Email"},
            {"1", "A", "a@example.com"},
            {"2", "B", "b@example.com"},
            {"3", "C", "c@example.com"}
        };

        // Fill the sheet with data
        int rowCount = 0;
        for (String[] rowData : data) {
            Row row = sheet.createRow(rowCount++);
            int colCount = 0;
            for (String field : rowData) {
                Cell cell = row.createCell(colCount++);
                cell.setCellValue(field);
            }
        }

        // Write the output to a file
        try (FileOutputStream fos = new FileOutputStream("data.xlsx")) {
            workbook.write(fos);
            System.out.println("Excel file written successfully.");
        } catch (IOException e) {
            System.out.println("Error writing Excel file: " + e.getMessage());
        } finally {
            try {
                workbook.close();
            } catch (IOException e) {
                // Ignore or print error
            }
        }
    }
}
// This program creates an Excel file named "data.xlsx" with sample data.