package test;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class ExcelWrite {
    public static void main(String[] args) throws Exception{
        XSSFWorkbook workbook;
        XSSFSheet worksheet;
        XSSFRow row;
        XSSFCell cell;
        String path ="src/SampleData555.xlsx";

        File file = new File(path);
        FileInputStream inputStream = new FileInputStream(file);
         workbook = new XSSFWorkbook(inputStream);
         worksheet = workbook.getSheet("Sheet1");
         row=worksheet.getRow(4);
         cell = row.getCell(0);
        System.out.println(cell.toString());
        XSSFCell adamCell =worksheet.getRow(5).getCell(0);
        System.out.println("BEFORE: "+ adamCell);
        adamCell.setCellValue("Madam");
        FileOutputStream outputStream = new FileOutputStream(path);
        workbook.write(outputStream);
        System.out.println("After: "+ adamCell);

        //TODO: CHANGE JOB_ID FOR SANDLER TO "PRESIDENT" , dYNAMICLY
        for (int i=0; i<worksheet.getPhysicalNumberOfRows();i++){
            if(worksheet.getRow(i).getCell(1).toString().equals("Sandler")){
                System.out.println("Before election: "+ worksheet.getRow(i).getCell(0));
                worksheet.getRow(i).getCell(1).setCellValue("President");
                System.out.println("After Election : "+ worksheet.getRow(i).getCell(2));
                workbook.write(outputStream);
                break;
            }        }

        outputStream.close();
        inputStream.close();
        workbook.close();







    }
}
