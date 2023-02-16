package pages;

import java.io.IOException;

import org.openqa.selenium.By;

import factory.BrowserFactory;
import factory.ElementFactory;

public class LoginPage {
	String locUserName = "//input[@id='txtUsername']";
	String locPassword = "//input[@id='txtPassword']";
	String locLogin = "//input[@id='btnLogin']";
	
	public void setUserName(String strData) throws IOException {
		ElementFactory.setData(locUserName, strData); 
		}
		
	
	public void setPassword(String strData) throws IOException {
		ElementFactory.setData(locPassword, strData);	
	}
	
	public void clickLogin() throws IOException {
		ElementFactory.clickElement(locLogin);
	}
}
