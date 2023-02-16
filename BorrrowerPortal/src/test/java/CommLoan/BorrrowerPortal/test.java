package CommLoan.BorrrowerPortal;

import java.time.Duration;
import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class test extends ScannerClass {
	
	public static void main(String [] arr) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\onsumaye\\Downloads\\chromedriver_win32/chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofMillis(10));
		driver.get("https://rahulshettyacademy.com/client");
		
		String username= "userEmail";
		String password= "userPassword";
		String login= "login";
		driver.findElement(By.id(username)).sendKeys("mg.gautam86@gmail.com");
		driver.findElement(By.id(password)).sendKeys("123456");
		driver.findElement(By.id(login)).click();
		Thread.sleep(1000);
		
		
		String productName= "ADIDAS ORIGINAL";
		List<WebElement> products= driver.findElements(By.cssSelector(".mb-3"));
		Thread.sleep(1000);
		WebElement Prod= products.stream().filter(product -> 
		product.findElement(By.cssSelector("b")).getText().equals(productName)).findFirst().orElse(null);
		Prod.findElement(By.cssSelector(".card-body button:last-of-type")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("[routerlink='/dashboard/cart']")).click();	
		
		List<WebElement> CartProducts= driver.findElements(By.cssSelector(".cartSection h3"));
		boolean match=CartProducts.stream().anyMatch(CartProduct-> CartProduct.getText().equalsIgnoreCase(productName));
		//Assert.assertTrue(match);
		
		String textValue= driver.findElement(By.cssSelector("li:nth-child(1) span:nth-child(1)")).getText();
		String ProductValue= driver.findElement(By.cssSelector("li:nth-child(1) span:nth-child(2)")).getText();
		System.out.println(textValue+"= "+ProductValue);
		String TotalText= driver.findElement(By.cssSelector("li:nth-child(2) span:nth-child(1)")).getText();
		String TotalValue= driver.findElement(By.cssSelector("li:nth-child(2) span:nth-child(2)")).getText();
		System.out.println(TotalText+"= "+TotalValue);
		driver.findElement(By.cssSelector("li[class='totalRow'] button[type='button']")).click();
		String CartPrice= driver.findElement(By.cssSelector(".item__price")).getText();
		//Assert.assertNotEquals(CartPrice, TotalValue);
		
		driver.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys("123");
		driver.findElement(By.xpath("(//input[@type='text'])[3]")).sendKeys("Mayank Gautam");
		
		Actions action = new Actions(driver);
		action.sendKeys(driver.findElement(By.cssSelector("input[placeholder='Select Country']")), "India").build().perform();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(5));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".ta-results")));
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[normalize-space()='India']")).click();
		driver.findElement(By.cssSelector(".action__submit")).click();
		
		ScannerClass scOBJ= new ScannerClass();
		scOBJ.main();
	}
}