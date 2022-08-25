package util;



import java.io.File;  
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.DecimalFormat;
import java.util.Iterator;  
import org.apache.poi.ss.usermodel.Cell;  
import org.apache.poi.ss.usermodel.Row;  
import org.apache.poi.xssf.usermodel.XSSFSheet;  
import org.apache.poi.xssf.usermodel.XSSFWorkbook;  


public class Util {
	private static double total;
	public static String getRowCount(int row,int cell) throws IOException, InterruptedException {
	        String projectPath = System.getProperty("user.dir");
		    XSSFWorkbook workBook = new XSSFWorkbook(projectPath + "\\src\\main\\java\\data\\DataSheet.xlsx");					
			XSSFSheet sheet = workBook.getSheet("Verify");
			int rowCount = sheet.getPhysicalNumberOfRows();				
			String cellData = sheet.getRow(row).getCell(cell).getStringCellValue();			
			return cellData;
		}
	
	public static void markSheet(int row,int cell,boolean verifyTitle) throws IOException, InterruptedException {
        
		String projectPath = System.getProperty("user.dir");
		File file = new File(projectPath + "\\src\\main\\java\\data\\DataSheet.xlsx");
		FileInputStream fis = new FileInputStream(file);
	    XSSFWorkbook workBook = new XSSFWorkbook(fis);	
	    XSSFSheet sheet = workBook.getSheet("Verify");
		int rowCount = sheet.getPhysicalNumberOfRows();
		if(verifyTitle == true) {
		sheet.getRow(row).createCell(cell).setCellValue("Results Match");
		}else {
		sheet.getRow(row).createCell(cell).setCellValue("Results Don't Match");
		}
		FileOutputStream fos = new FileOutputStream(file);
		workBook.write(fos);
	}
	
	
	public static String calculateTotal(String unitPrice,String quantity) throws Exception {
		
		    DecimalFormat df=new DecimalFormat("0.00");
			total = (Double.parseDouble(unitPrice)) * (Double.parseDouble(quantity));
			customWait();
		return df.format(total);
	}
	public static void customWait() throws Exception {		
	  Thread.sleep(5000);
}
	public static void main(String[] args) throws Exception {
		//getRowCount();
		}
}
