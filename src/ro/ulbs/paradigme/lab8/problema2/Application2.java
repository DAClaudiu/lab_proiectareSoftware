package ro.ulbs.paradigme.lab8.problema2;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFCellStyle;
import org.apache.poi.xssf.usermodel.XSSFFont;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileOutputStream;
import java.util.Map;
import java.util.TreeMap;

import static java.awt.Color.YELLOW;
import static java.awt.Color.yellow;

public class Application2 {
    public static void main(String[] args) {
        Map<String, Object[]> data = new TreeMap<String, Object[]>();
        data.put("2", new Object[] {"Amit", "Shukla", 9,8,7,5});
        data.put("3", new Object[] {"Lokesh", "Gupta", 8,9,6,7});
        data.put("4", new Object[] {"John", "Adwards", 8,8,7,6 });
        data.put("5", new Object[] {"Brian", "Schultz", 7,6,8,9});

        XSSFWorkbook workbook2 = new XSSFWorkbook();
        XSSFSheet sheet2 = workbook2.createSheet();
        Row row = sheet2.createRow(0);
        XSSFCellStyle greenCellStyle = workbook2.createCellStyle();
        greenCellStyle.setFillForegroundColor(IndexedColors.LIGHT_GREEN.getIndex());
        greenCellStyle.setFillPattern(FillPatternType.SOLID_FOREGROUND);
        XSSFFont boldFont = workbook2.createFont();
        boldFont.setBold(true);
        greenCellStyle.setFont(boldFont);

        row.createCell(0).setCellStyle(greenCellStyle);
        row.getCell(0).setCellValue("Name");
        row.createCell(1).setCellStyle(greenCellStyle);
        row.getCell(1).setCellValue("Surname");
        row.createCell(2).setCellStyle(greenCellStyle);
        row.getCell(2).setCellValue("Grade 1");
        row.createCell(3).setCellStyle(greenCellStyle);
        row.getCell(3).setCellValue("Grade 2");
        row.createCell(4).setCellStyle(greenCellStyle);
        row.getCell(4).setCellValue("Grade 3");
        row.createCell(5).setCellStyle(greenCellStyle);
        row.getCell(5).setCellValue("Grade 4");
        row.createCell(6).setCellStyle(greenCellStyle);
        row.getCell(6).setCellValue("Max");
        row.createCell(7).setCellStyle(greenCellStyle);
        row.getCell(7).setCellValue("Average");

        int rowNum=1;
        for (Map.Entry<String, Object[]> entry : data.entrySet()) {
            Row row2 = sheet2.createRow(rowNum);
            Object[] rowData = entry.getValue();

            for (int colNum = 0; colNum < rowData.length; colNum++) {
                Cell cell2 = row2.createCell(colNum);
                if (rowData[colNum] instanceof Integer) {
                    cell2.setCellValue((Integer) rowData[colNum]);
                } else if (rowData[colNum] instanceof Double) {
                    cell2.setCellValue((Double) rowData[colNum]);
                } else {
                    cell2.setCellValue(String.valueOf(rowData[colNum]));
                }
            }

            XSSFCellStyle yellowStyle = workbook2.createCellStyle();
            yellowStyle.setFillForegroundColor(IndexedColors.LIGHT_YELLOW.getIndex());
            yellowStyle.setFillPattern(FillPatternType.SOLID_FOREGROUND);

            Cell cell = row2.createCell(6);
            cell.setCellFormula("MAX(C" + (rowNum + 1) + ":F" + (rowNum + 1) + ")");
            cell.setCellStyle(yellowStyle);

            cell = row2.createCell(7);
            cell.setCellFormula("AVERAGE(C" + (rowNum + 1) + ":F" + (rowNum + 1) + ")");
            cell.setCellStyle(yellowStyle);

            rowNum++;
        }
        try {
          FileOutputStream out = new FileOutputStream(new File("output8.xlsx"));
          workbook2.write(out);
          out.close();
        } catch (Exception e) {
          e.printStackTrace();
        }
    }

}
