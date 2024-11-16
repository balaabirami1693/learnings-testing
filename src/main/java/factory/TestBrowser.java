package factory;

public class TestBrowser {
	
	public static void main(String[] args) throws InterruptedException {
		
		BrowserFactory.createWebDriver(BrowserType.Edge);
	}

}
