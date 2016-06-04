package Calculation;
import java.io.*;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

/**
 * Created by Грам on 01.06.2016.
 */
public class ExcelUtils {

    private static XSSFSheet ExcelWSheet;

    private static XSSFWorkbook ExcelWBook;

    private static XSSFCell Cell;

    private static XSSFRow Row;

    public static Object[][] getTableArray(String FilePath, String sheetName) throws Exception {
        Double[][] tabArray = null;
        try {

            FileInputStream ExcelFile = new FileInputStream(("C:\\Users\\Грам\\IdeaProjects\\HillelAutomation\\src\\Calculation\\dataTest\\TestData.xlsx"));
            ExcelWBook = new XSSFWorkbook(ExcelFile);
            ExcelWSheet = ExcelWBook.getSheetAt(0);
            int startRow = 1;
            int startCol = 1;
            int ci, cj;
            int totalRows = ExcelWSheet.getLastRowNum();
            int totalCols = 3;
            tabArray = new Double[totalRows][totalCols];
            for (ci=startRow;ci<totalRows;ci++){
                for(cj=startCol;cj<totalCols;cj++) {
                    tabArray[ci][cj] = Cell.getNumericCellValue();

                }
            }
           /* ci = 0;
            for (int i = startRow; i <= totalRows; i++, ci++) {
                cj = 0;
                for (int j = startCol; j <= totalCols; j++, cj++) {
                    //tabArray[ci][cj]=getCellData(i,j);
                    tabArray[ci][cj] = Cell.getNumericCellValue();
                    System.out.println(tabArray[ci][cj]);
                }
            }*/

        } catch (FileNotFoundException e) {
            System.out.println("Could not read the Exel sheet");
            e.printStackTrace();
        } catch (IOException e) {
            System.out.println("Could not read the Exel sheet");
            e.printStackTrace();
        }
        return (tabArray);
    }
}
   /* public static Double getCellData(int RowNum, int ColNum) throws Exception {
        try {
            Cell = ExcelWSheet.getRow(RowNum).getCell(ColNum);
            int dataType = Cell.getCellType();
            if (dataType == 3) {
                return Double.valueOf( "");
            } else {
                String CellData = Cell.getStringCellValue();
                return Double.valueOf(CellData);
            }
        }catch(Exception e){
            System.out.println(e.getMessage());
            throw (e);

        }
    }
}*/