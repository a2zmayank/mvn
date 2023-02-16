package adminPages;

import org.openqa.selenium.WebDriver;

public class Dashboard {
	
	public static void GetDashboardValue(WebDriver webDriver) throws InterruptedException {
		String CurrentURL = webDriver.getCurrentUrl();
		System.out.println(CurrentURL);
		//getLoadTime(webDriver);

	}

}
