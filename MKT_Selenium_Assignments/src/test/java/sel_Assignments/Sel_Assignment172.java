package sel_Assignments;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

/*
 *172) Data driver testing - Which exception will come if user provide wrong excel file location
 * java.io.FileNotFoundException
 */
public class Sel_Assignment172 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream f1 = new FileInputStream("N:\\Users\\LENOVO\\eclipse-workspace\\MKT_Selenium\\TestData\\Shiv.xlsx");
		
		//b) Open the excel sheet.
		Workbook wb = WorkbookFactory.create(f1); //Workbook--is Interface
		
		
	     // c) Goto the perticular sheet, in which values are present.
		
		Sheet sh1 = wb.getSheet("Login"); //Sheet --- is an Interface
		
		
		 // d) goto to the perticular row.
		Row r1 = sh1.getRow(1);        //Row-- is an Interface.
		
		
		 // e) goto the perticular cell. 
		Cell c1 = r1.getCell(0); 		// Cell ---- is an Interface.
		
			
		 // f) fetch value from a cell using getStringCellValue()
		String s2 = c1.getStringCellValue();
		System.out.println(s2);
		
	}

}
