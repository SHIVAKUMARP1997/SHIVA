package sel_Fetching_XLSX_Sheet;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

/*
 * 
 * 
 * fetching-- the exact cell ----- (row-n, col-n) : cause indexing starts from (0,0)
 * 
 * 
 * --Steps involved to fetch the value from an excel sheet:
 * 
 *  --Non-technical:
 *   
 *   a) Let the java know where is that excel sheet present.
 *   b) Open the excel sheet.
 *   c) Goto the perticular sheet, in which values are present.
 *   d) goto to the perticular row.
 *   e) goto the perticular cell. 
 *   f) fetch value from a cell using getStringCellValue()
 * 
 *  --Technical :
 * 	 a) Create an object of  'FileInputStream' class and pass parameter that is path of the folder.
 * 	 b) Using WorkbookFactory.create()--- open Excel sheet.
 * 	 c) Using getSheet("nameof the Sheet") ---- provide sheet name.
 *   d) Using getRow(Coordinate of Row) --- to get the row.
 *   e) Using getCell(Cell_CooRdinate) ------Provide column coordinate.
 * 	 f) Using getStringCellValue()
 *  
 *  
 *  
 * 
 * 
 */




public class Fetch_XLSXsheet {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		// a) Let the java know where is that excel sheet present.
		FileInputStream f1 = new FileInputStream("C:\\Users\\LENOVO\\eclipse-workspace\\seleniumWebDriver_main\\Shivakumar\\testingSheet.xlsx");
		
		//b) Open the excel sheet.
		Workbook wb = WorkbookFactory.create(f1); //Workbook--is Interface
		
		
	     // c) Goto the perticular sheet, in which values are present.
		
		Sheet s1 = wb.getSheet("LoginMain"); //Sheet --- is an Interface
		
		
		 // d) goto to the perticular row.
		Row r1 = s1.getRow(1);        //Row-- is an Interface.
		
		
		 // e) goto the perticular cell. 
		Cell c1 = r1.getCell(0); 		// Cell ---- is an Interface.
		
			
		 // f) fetch value from a cell using getStringCellValue()
		String s2 = c1.getStringCellValue();
		
		
		
		//Easy way is
		
		String s3 = wb.getSheet("LoginMain").getRow(0).getCell(1).getStringCellValue(); // return type is always the last function's.
		
		System.out.println(s3);
		
		
		
		System.out.println(s2);

	}

}
