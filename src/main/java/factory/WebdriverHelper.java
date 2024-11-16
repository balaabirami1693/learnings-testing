package factory;

import java.time.Duration;

import org.openqa.selenium.WebDriver;

public class WebdriverHelper {

	public static void browserActions(WebDriver driver) throws InterruptedException {
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.google.com");
		Thread.sleep(5000);
	}
}
