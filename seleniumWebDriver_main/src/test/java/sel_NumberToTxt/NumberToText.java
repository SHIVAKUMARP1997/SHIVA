package sel_NumberToTxt;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.ss.util.NumberToTextConverter;


//illegalStateException
// NumberToTextConverter
public class NumberToText {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream f1 = new FileInputStream("C:\\Users\\LENOVO\\eclipse-workspace\\seleniumWebDriver_main\\Shivakumar\\testingSheet.xlsx");
		Workbook vb= WorkbookFactory.create(f1);
		
//		String value = vb.getSheet("LoginMain").getRow(5).getCell(2).getStringCellValue();
//		
//		System.out.println(value);

		String numbr = NumberToTextConverter.toText(vb.getSheet("LoginMain").getRow(5).getCell(2).getNumericCellValue());
		
		System.out.println(numbr);
	}

}
