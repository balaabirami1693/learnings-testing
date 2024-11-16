package factory;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.logging.Logger;

public class ExcelReader implements TestDataProvider {

	private static final Logger logger = Logger.getLogger(Edge.class.getName());
	
	@Override
	public Object GetData() {
	    logger.info("Reading test data from Excel...");
	    try (FileInputStream fis = new FileInputStream("C:\\Users\\Abirami\\Downloads\\TestData.xlsx");
	         Workbook workbook = new XSSFWorkbook(fis)) {
	        Sheet sheet = workbook.getSheetAt(0);
	        StringBuilder result = new StringBuilder();

	        // Iterate through all rows and cells
	        for (Row row : sheet) {
	            for (Cell cell : row) {
	                result.append(cell.toString()).append(" ");
	            }
	            result.append("\n");
	        }

	        // Log and return data
	        String data = result.toString();
	        logger.info("Retrieved data:\n" + data);
	        return data;
	    } catch (IOException e) {
	        logger.severe("Error reading Excel file: " + e.getMessage());
	        e.printStackTrace();
	        return null;
	    }
    }
}
