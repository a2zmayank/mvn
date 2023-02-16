package factory;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

import resusable.CommonFunctions;

public class BrowserFactory {

	static ChromeDriver driver;
	
	public static ChromeDriver getBrowser() throws IOException {
		if(driver==null) {
			String strProjectPath = System.getProperty("user.dir");
			System.setProperty("webdriver.chrome.driver", strProjectPath + "/driver/chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get(CommonFunctions.getConfigValue("url"));
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		}
		
		return driver;
	}
	
	public static String getBrowserTitle() throws IOException {
		return getBrowser().getTitle();
	}
}
