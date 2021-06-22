import java.io.File;  
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;  
import org.apache.poi.hssf.usermodel.HSSFSheet;  
import org.apache.poi.hssf.usermodel.HSSFWorkbook;  
import org.apache.poi.ss.usermodel.Cell;  
import org.apache.poi.ss.usermodel.FormulaEvaluator;  
import org.apache.poi.ss.usermodel.Row;  
public class ReadExcelFileDemo  
{  
public static void main(String args[])  
{  
//obtaining input bytes from a file  
FileInputStream fis;
try {
	fis = new FileInputStream(new File("C:\\Users\\Administrator\\Desktop\\CSV\\Original_1.xlsx"));

} catch (Exception e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}  

}  
}  