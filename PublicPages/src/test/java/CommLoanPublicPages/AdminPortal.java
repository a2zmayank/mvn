package CommLoanPublicPages;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import adminPages.homePage;
import getValue.getValueData;

public class AdminPortal {

	static long s;
	static homePage hp = new homePage();
	static getValueData gvd = new getValueData();

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		String url = "https://www.commloan.com/";
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\onsumaye\\Downloads\\chromedriver_win32/chromedriver.exe");
		WebDriver webDriver = new ChromeDriver();
		webDriver.manage().window().maximize();
		webDriver.get(url);
		
		hp.login(webDriver);
		getLoadTime(webDriver);
		//login(webDriver);
		//GetDashboardValue(webDriver);
	}

	

	public static void GetDashboardValue(WebDriver webDriver) throws InterruptedException {
		gvd.getPageTitle(webDriver);
		String CurrentURL = webDriver.getCurrentUrl();
		System.out.println(CurrentURL);
		//getLoadTime(webDriver);

	}

	public static void getLoadTime(WebDriver webDriver) throws InterruptedException {
		//long s = System.currentTimeMillis();
		long e = System.currentTimeMillis();
		// compute time
		long r = e - s;		
		System.out.println(r);
	}

}
