package Practice1;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadExcelData {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream fis = new FileInputStream("./data/testscript.xlsx");// throws FileNotFoundException
		Workbook wb = WorkbookFactory.create(fis);//throws EncryptedDocumentException
		String data = wb.getSheet("CreatCustomer").getRow(1).getCell(2).getStringCellValue();
		System.out.println(data);
	}
}
