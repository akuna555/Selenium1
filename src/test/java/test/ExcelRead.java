package test;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;

public class ExcelRead {
    public static void main(String[] args) throws Exception{
        File file = new File("C:\\Users\\Vitali\\IdeaProjects\\chicago10cucumberjunit\\src\\SampleData555.xlsx");
        System.out.println(file.exists());
        //Openning reading File
        FileInputStream inputStream = new FileInputStream(file);
        //Loading into the class
        XSSFWorkbook workbook = new XSSFWorkbook(inputStream);
        //Passing worksheet & name
        XSSFSheet worksheet = workbook.getSheet("Sheet1");
        System.out.println(worksheet.getRow(2).getCell(1));
        System.out.println(worksheet.getRow(5).getCell(0));

        //to get the physical number of rows used
        int usedRows = worksheet.getPhysicalNumberOfRows();
        System.out.println("PhsyicalNumberOfRows: "+ usedRows);

        int lastUsedRow = worksheet.getLastRowNum();
        System.out.println("LastUsedRow:"+ lastUsedRow);
        //TODO: PRINT NANCY'S JOB_ID DYNAMICALLY
        for(int rowNum =0; rowNum <=usedRows;rowNum++){
            if(worksheet.getRow(rowNum).getCell(0).toString().equals("Nancy")){
                System.out.println(worksheet.getRow(rowNum).getCell(2));
                break;

            }
        }




    }
}
