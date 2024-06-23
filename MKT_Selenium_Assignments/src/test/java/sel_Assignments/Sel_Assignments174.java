package sel_Assignments;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

//174) Which exception will come when you try to fetch mobile number from excel sheet?


public class Sel_Assignments174 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
FileInputStream n1 = new FileInputStream("C:\\Users\\LENOVO\\eclipse-workspace\\MKT_Selenium\\TestData\\Shiv.xlsx");
		
		//b) Open the excel sheet.
		Workbook wb = WorkbookFactory.create(n1); //Workbook--is Interface
		
		
	     // c) Goto the perticular sheet, in which values are present.
		
		Sheet sh1 = wb.getSheet("user"); //Sheet --- is an Interface
		
		
		 // d) goto to the perticular row.
		Row r1 = sh1.getRow(2);        //Row-- is an Interface.
		
		
		 // e) goto the perticular cell. 
		Cell c1 = r1.getCell(2); 		// Cell ---- is an Interface.
		
			
		 // f) fetch value from a cell using getStringCellValue()
		String s2 = c1.getStringCellValue();
		System.out.println(s2);
	}

}
