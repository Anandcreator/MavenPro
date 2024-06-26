package com.MavenProject;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.sl.usermodel.Sheet;
//import org.apache.poi.ss.usermodel.Cell;
//import org.apache.poi.ss.usermodel.Row;
//import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Write_data {

	private static void writedata() throws IOException {
		
		File f = new File("C:\\Users\\anand\\Desktop\\ScoreCard.xlsx");
		FileInputStream fis = new FileInputStream(f);
		Workbook wb= new XSSFWorkbook(fis);
//		Sheet createSheet = wb.createSheet();
//		Row createRow = createSheet.createRow(0);
//		Cell createCell = createRow.createCell(0);
//		createCell.setCellValue("Employee ID");
		
		wb.createSheet("CreateData").createRow(0).createCell(0).setCellValue("S.NO");
		wb.getSheet("CreateData").getRow(0).createCell(1).setCellValue("NAME");
		wb.getSheet("CreateData").getRow(0).createCell(2).setCellValue("AGE");
		wb.getSheet("CreateData").createRow(1).createCell(0).setCellValue("1");
		wb.getSheet("CreateData").getRow(1).createCell(1).setCellValue("KAKACHI");
		wb.getSheet("CreateData").getRow(1).createCell(2).setCellValue("15");
		wb.getSheet("CreateData").createRow(2).createCell(0).setCellValue("2");
		wb.getSheet("CreateData").getRow(2).createCell(1).setCellValue("TUKOSHA");
		wb.getSheet("CreateData").getRow(2).createCell(2).setCellValue("18");
		
		FileOutputStream fos =new FileOutputStream(f);
		wb.write(fos);
		System.out.println("Written Succesfully");
		wb.close();	
	}
	
	public static void main(String[] args) throws IOException {
		writedata();
	}
}
