package CommLoanPublicPages;

import java.io.IOException;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import adminPages.homePage;

public class SwitchTabWindow {
	static homePage hp = new homePage();
	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\onsumaye\\Downloads\\chromedriver_win32/chromedriver.exe");
		WebDriver webDriver = new ChromeDriver();
		webDriver.manage().window().maximize();
		webDriver.manage().deleteAllCookies();
		webDriver.get("https://www.commloan.com");
		hp.login(webDriver);
		
		webDriver.switchTo().newWindow(WindowType.WINDOW);
		Set<String> handels  =webDriver.getWindowHandles();
		Iterator<String> it = handels.iterator();	
		String parentWindow= it.next();
		String childWindow= it.next();
		webDriver.switchTo().window(childWindow);
		webDriver.get("https://www.commloan.com");
		hp.login(webDriver);
		webDriver.switchTo().window(parentWindow);
		
	}

}
