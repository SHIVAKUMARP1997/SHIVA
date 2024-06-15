package sel_Assignments;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

//176) Take the data from the excel sheet and write the Data Driven Test program using method chaining concept.
public class Sel_Assignments176 {

		public static void main(String[] args) throws EncryptedDocumentException, IOException {
			FileInputStream f1 = new FileInputStream("C:\\Users\\LENOVO\\eclipse-workspace\\MKT_Selenium_Assignments\\TestData\\Shiv.xlsx");
			Workbook bk = WorkbookFactory.create(f1);	
			String value = bk.getSheet("user").getRow(0).getCell(0).getStringCellValue();
			System.out.println(value);
	}

}
