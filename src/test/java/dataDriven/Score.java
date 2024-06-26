package dataDriven;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Score {

	private static void cricket() throws IOException {
		File f = new File("C:\\Users\\anand\\eclipse-workspace\\MavenProject\\Excel\\ScoreCard.xlsx");
		FileInputStream fis = new FileInputStream(f);
		Workbook wb = new XSSFWorkbook(fis);
		Sheet sheetAt = wb.getSheetAt(0);
		Row row = sheetAt.getRow(4);
		Cell cell = row.getCell(1);
		CellType cellType = cell.getCellType();
		if (cellType.equals(CellType.STRING));
		String stringCellValue = cell.getStringCellValue();
		System.out.println(stringCellValue);
		wb.close();	
	}
	
	public static void main(String[] args) throws IOException {
		cricket();
	}
}

