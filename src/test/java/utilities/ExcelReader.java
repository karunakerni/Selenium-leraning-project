package utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.util.NumberToTextConverter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebElement;

public class ExcelReader {
	public  XSSFWorkbook wb;
	public  XSSFSheet sheet;
	public  int rowcount;
	public  int cellcount;
	public  XSSFRow row;
	public  XSSFCell cell;



	public  String[][] readdata(String path,String Sheetname) throws IOException {
		File file = new File(path);
		FileInputStream fis = new FileInputStream(file);

		wb = new XSSFWorkbook(fis);
		sheet = wb.getSheet(Sheetname);
		rowcount = sheet.getPhysicalNumberOfRows();
		cellcount = sheet.getRow(0).getPhysicalNumberOfCells();
		String[][] data = new String[rowcount - 1][cellcount];
		String Value = null;
		for (int i = 1; i <= rowcount; i++) {
				row = sheet.getRow(i);
		try {
			for (int j = 0; j < cellcount; j++) {
			cell = sheet.getRow(i).getCell(j);
				if (cell.getCellType() == CellType.STRING) {
					Value = cell.getStringCellValue();
				} else {
					double val = cell.getNumericCellValue();
			Value=NumberToTextConverter.toText(val);
				}
				data[i-1][j]=Value;
				System.out.println(Value);

//				cell= row.createCell(cellcount+1);
//		if(elet.equals(Msg))
//		{
//			 sheet.getRow(i).createCell(j).setCellValue("Pass"); 
//		}
//		else
//		{
//			sheet.getRow(i).createCell(j).setCellValue("Fail"); 
//		}
//		FileOutputStream fos = new FileOutputStream(path); 
//	wb.write(fos);
//
//	fos.close();
			}	}catch(Exception e){
		}
		
	}
		
		return data;


	}

}



