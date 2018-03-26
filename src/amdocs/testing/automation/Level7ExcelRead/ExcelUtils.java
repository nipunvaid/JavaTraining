package amdocs.testing.automation.Level7ExcelRead;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtils {

	
  public static XSSFSheet ExcelWSheet;
  public static XSSFWorkbook ExcelWBook;
  public static XSSFCell Cell;
  public static XSSFRow Row ;
  	
  	public static void setExcelFile(String Path , String SheetName)  throws Exception {
  		try {
  			FileInputStream ExcelFile = new FileInputStream(Path);
  			
  			ExcelWBook = new XSSFWorkbook(ExcelFile);
  			
  			ExcelWSheet = ExcelWBook.getSheet(SheetName);
  		
  			  				
  		}catch(IllegalArgumentException e)
  		{
  			e.printStackTrace();
  		}catch(IOException e1)
  		{
  			e1.printStackTrace();
  		} 
  	}
  	
  	public static String getCellData(int iRow , int iCol) throws Exception{
  		String CellData = null;
  		try {	
  		Cell = ExcelWSheet.getRow(iRow).getCell(iCol);
  		
  		CellData	= Cell.getStringCellValue();
  		
  		
  	} catch(NullPointerException e2) {
  		e2.printStackTrace();
  	}
	return CellData;
 }
  	
  	public static void setCellData(String Result, int iRow , int iCol) throws Exception{
  		try {
  			Row = ExcelWSheet.getRow(iRow);
  			//Cell = Row.getCell(iCol, Row.RETURN_BLANK_AS_NULL)
  			Cell = Row.getCell(iCol);
  			//System.out.println(Cell.CELL_TYPE_BLANK);
  			if (Cell == null) {
  				Cell = Row.createCell(iCol);
  				Cell.setCellValue(Result);
  			}
  			else {
  				Cell.setCellValue(Result);
  			}
  			
  			FileOutputStream fileout = new FileOutputStream(Constant.Path_TestData + Constant.File_TestData);
  			
  			ExcelWBook.write(fileout);
  			
  			fileout.flush();
  			
  			fileout.close();
  			
  		}
  		catch (Exception e) {
  			throw (e);
  		}
  	}
}
