package factory;

import org.openqa.selenium.WebDriver;

public class BrowserFactory {
	
	private static WebDriver driver;

	public static void createWebDriver(BrowserType type) throws InterruptedException {
		
		switch (type) {
		case Chrome:
			driver = new Chrome().launchBrowser();
			break;
		case Edge:
			driver = new Edge().launchBrowser();
			break;
		default:
			throw new IllegalArgumentException("Unknown Browser type");
		}
		
		WebdriverHelper.browserActions(driver);
	}
}
