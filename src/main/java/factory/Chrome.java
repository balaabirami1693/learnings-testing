package factory;

import java.util.logging.Logger;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Chrome implements Browser  {

	private static final Logger logger = Logger.getLogger(Chrome.class.getName());
	@Override
	public WebDriver launchBrowser() {
		// TODO Auto-generated method stub
		logger.info("Launching chrome browser...");
		return new ChromeDriver();
		
	}

}
