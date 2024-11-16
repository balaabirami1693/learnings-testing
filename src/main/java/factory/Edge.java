package factory;

import java.util.logging.Logger;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Edge implements Browser{

	private static final Logger logger = Logger.getLogger(Edge.class.getName());
	
	@Override
	public WebDriver launchBrowser() {
		// TODO Auto-generated method stub
		
		logger.info("Launching edge browser...");
		return new EdgeDriver();
		
	}

}
