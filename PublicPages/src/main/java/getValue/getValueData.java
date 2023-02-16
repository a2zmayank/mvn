package getValue;

import org.openqa.selenium.WebDriver;

public class getValueData {

	public  void getPageTitle(WebDriver webDriver) {

		String getTitle = webDriver.getTitle();
		System.out.println(getTitle);		

	}
	
	public static void getLoadTime(WebDriver webDriver) throws InterruptedException {
		long s = System.currentTimeMillis();
		long e = System.currentTimeMillis();
		// compute time
		long r = e - s;		
		System.out.println(r);
	}
}
