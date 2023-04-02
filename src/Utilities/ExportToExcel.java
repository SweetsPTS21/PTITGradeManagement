/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Utilities;

import java.io.FileOutputStream;
import java.io.IOException;
import javax.swing.table.DefaultTableModel;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

/**
 *
 * @author ThinkPad
 */
public class ExportToExcel {

    public static void export(String label, DefaultTableModel model, String filePath) {
        XSSFWorkbook workbook = new XSSFWorkbook();
        XSSFSheet sheet = workbook.createSheet(label);
        
        // Tạo label
//        XSSFRow labelRow = sheet.createRow(0);
//        XSSFCell labelCell = labelRow.createCell(0);
//        labelCell.setCellValue(label);
        

        // Tạo header
        XSSFRow headerRow = sheet.createRow(0);
        for (int i = 0; i < model.getColumnCount(); i++) {
            XSSFCell headerCell = headerRow.createCell(i);
            headerCell.setCellValue(model.getColumnName(i));
        }

        // Tạo các dòng dữ liệu
        for (int i = 0; i < model.getRowCount(); i++) {
            XSSFRow dataRow = sheet.createRow(i + 1);
            for (int j = 0; j < model.getColumnCount(); j++) {
                XSSFCell dataCell = dataRow.createCell(j);
                dataCell.setCellValue(model.getValueAt(i, j).toString());
            }
        }

        // Lưu file
        try (FileOutputStream outputStream = new FileOutputStream(filePath)) {
            workbook.write(outputStream);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
