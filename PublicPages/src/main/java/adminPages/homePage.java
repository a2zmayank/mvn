package adminPages;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class homePage {

	static String clickSignIn = "//a[@title='Sign In']";
	static String username = "username";
	static String password = "password";
	static String ClickLoginSubmit = "Submit";

	public void login(WebDriver webDriver) throws InterruptedException, IOException {
		WebElement LoginClick= webDriver.findElement(By.xpath(clickSignIn));
		LoginClick.click();
		Thread.sleep(1000);
		File filee = LoginClick.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(filee, new File("Logo.png"));		
		
		webDriver.findElement(By.name(username)).sendKeys("abhishek.kumar");
		webDriver.findElement(By.name(password)).sendKeys("@bhishek!@#");
		long s = System.currentTimeMillis();
		webDriver.findElement(By.name(ClickLoginSubmit)).click();
		
		//getLoadTime(webDriver);
		

	}

}
