package factory;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class ElementFactory {
	private static WebElement getElement(String strXpath) throws IOException {
		return BrowserFactory.getBrowser().findElement(By.xpath(strXpath));
	}
	
	public static void setData(String strLoc,String strData) throws IOException {
		getElement(strLoc).clear();
		getElement(strLoc).sendKeys(strData);
	}
	
	public static void clickElement(String strLoc) throws IOException  {
		getElement(strLoc).click();
	}
}
