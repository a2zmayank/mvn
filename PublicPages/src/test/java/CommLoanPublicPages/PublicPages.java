package CommLoanPublicPages;

import java.time.Duration;
import java.util.ArrayList;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PublicPages {
	
	WebDriver webDriver;
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
			String Home = "https://www.commloan.com/";
			String AboutUS= "about-us";
			String Careers= "careers";		
			String cmbsLoans= "cmbs-loans";
			String commercial1 = "commercial-bank-loans";
			String commercial2 ="commercial-bridge-loans";
			String commercial3 = "commercial-lenders";
			String commercial4 = "commercial-mortgages/mortgage-rates";
			String commercial5 = "commercial-mortgages";
			String contact= "contact";
			
			String fannie1= "fannie-mae-multifamily-loans/affordable-housing";
			String fannie2 = "fannie-mae-multifamily-loans/dus";
			String fannie3 ="fannie-mae-multifamily-loans/green-financing";
			String fannie4 = "fannie-mae-multifamily-loans/manufactured-home";
			String fannie5= "fannie-mae-multifamily-loans/small-loans";
			String fannie6="fannie-mae-multifamily-loans";
			String fha1="fha-hud-loans/221d4";
			String fha2="fha-hud-loans/223a7";
			String fha3="fha-hud-loans/223f";
			String fha4="fha-hud-loans/232-223a7";
			
			String fha5 ="fha-hud-loans/241a";
			String fha6="fha-hud-loans/242";
			String fha7="fha-hud-loans";
			String freddie1="freddie-mac-multifamily-loans/fixed-rate";
			String freddie2="freddie-mac-multifamily-loans/floating-rate";
			String freddie3="freddie-mac-multifamily-loans/green-advantage";
			String freddie4="freddie-mac-multifamily-loans/manufactured-housing";
			String freddie5="freddie-mac-multifamily-loans/senior-housing";
			String freddie6="freddie-mac-multifamily-loans/small-balance";
			String freddie7="freddie-mac-multifamily-loans/student-housing";
			
			String freddie8="freddie-mac-multifamily-loans/supplemental";
			String freddie9="freddie-mac-multifamily-loans";
			String givingBack="giving-back";
			String lifeins= "life-insurance-loans";
			String loanFunded= "loans-funded";
			String login= "login";
			String security= "our-security-practices";
			String press= "press"; 
			String privacy= "privacy-policy";
			String sba1= "sba-504";
			
			String sba2= "sba-7a";
			String term= "terms-conditions";
			String testimonial="testimonials";
			
			//********Chrome*********//
						
			
			//ChromeOptions object
		      //ChromeOptions opt = new ChromeOptions();
		      //headless parameter
		     // opt.addArguments("headless");
		      // set parameter to Chrome driver
		     // WebDriver webDriver = new ChromeDriver(opt);
			
			
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\onsumaye\\Downloads\\chromedriver_win32/chromedriver.exe");
   WebDriver webDriver =new ChromeDriver();
      
			//********Mozila*********//
      //System.setProperty("webdriver.gecko.driver","C:\\Users\\onsumaye\\Downloads\\geckodriver-v0.32.0-win-aarch64/geckodriver.exe");
     //WebDriver webDriver = new FirefoxDriver();
     
			//********Edge*********//
       //System.setProperty("webdriver.edge.driver", "C:\\Users\\onsumaye\\Downloads\\edgedriver_win64 (1)/msedgedriver.exe");
      // WebDriver webDriver = new EdgeDriver();
    
       webDriver.manage().window().maximize();
       webDriver.manage().deleteAllCookies();
		
		
       openNewTab(webDriver, Home, 1);
       openNewTab(webDriver, Home+AboutUS, 2);
       openNewTab(webDriver, Home+Careers, 3);
       openNewTab(webDriver, Home+cmbsLoans, 4);
       openNewTab(webDriver, Home+commercial1, 5);
       openNewTab(webDriver, Home+commercial2, 6);
       openNewTab(webDriver, Home+commercial3, 7);
       openNewTab(webDriver, Home+commercial4, 8);
       openNewTab(webDriver, Home+commercial5, 9);
       openNewTab(webDriver, Home+contact, 10);
       
       openNewTab(webDriver, Home+fannie1, 11);
       openNewTab(webDriver, Home+fannie2, 12);
       openNewTab(webDriver, Home+fannie3, 13);
       openNewTab(webDriver, Home+fannie4, 14);
       openNewTab(webDriver, Home+fannie5, 15);
       openNewTab(webDriver, Home+fannie6, 16);
       openNewTab(webDriver, Home+fha1, 17);
       openNewTab(webDriver, Home+fha2, 18);
       openNewTab(webDriver, Home+fha3, 19);
       openNewTab(webDriver, Home+fha4, 20);
       
       openNewTab(webDriver, Home+fha5, 21);
       openNewTab(webDriver, Home+fha6, 22);
       openNewTab(webDriver, Home+fha7, 23);
       openNewTab(webDriver, Home+freddie1, 24);
       openNewTab(webDriver, Home+freddie2, 25);
       openNewTab(webDriver, Home+freddie3, 26);
       openNewTab(webDriver, Home+freddie4, 27);
       openNewTab(webDriver, Home+freddie5, 28);
       openNewTab(webDriver, Home+freddie6, 29);
       openNewTab(webDriver, Home+freddie7, 30);
       
       openNewTab(webDriver, Home+freddie8, 31);
       openNewTab(webDriver, Home+freddie9, 32);
       openNewTab(webDriver, Home+givingBack, 33);
       openNewTab(webDriver, Home+lifeins, 34);
       openNewTab(webDriver, Home+loanFunded, 35);
       openNewTab(webDriver, Home+login, 36);
       openNewTab(webDriver, Home+security, 37);
       openNewTab(webDriver, Home+press, 38);
       openNewTab(webDriver, Home+privacy, 39);
       openNewTab(webDriver, Home+sba1, 40);
       openNewTab(webDriver, Home+sba2, 41);
       openNewTab(webDriver, Home+term, 42);
       openNewTab(webDriver, Home+testimonial, 43);
       
       webDriver.quit();
    }

	static int c=0;
	static long TotalCount =0;
    public static void openNewTab(WebDriver webDriver, String url, int position) throws InterruptedException {
        ((JavascriptExecutor) webDriver).executeScript("window.open()");
        ArrayList<String> tabs = new ArrayList<String>(webDriver.getWindowHandles());
       // System.out.println("tabs : " + tabs.size() + " >position: " + position + " >\t" + url);
        webDriver.switchTo().window(tabs.get(position));
        long s = System.currentTimeMillis();        
        webDriver.get(url);  
        WebDriverWait wt = new WebDriverWait(webDriver,Duration.ofSeconds(10));
        //wt.until(ExpectedConditions.elementToBeClickable (By.cssSelector("a[title='Sign In']")));
        //driver.get("https://<username>:<password>@"+url)
        long e = System.currentTimeMillis();
        //compute time
        long r = e - s;
        
        System.out.print(url + " " + r);
        if (r<3000) {
        	System.out.println(" Pass");
        	
        	}
        // 180018001025557
        else if(r==3000) {
        	System.out.println(" Pass");
        }
        
        else if(r>3000) {
        	System.out.println(" Failed");
        }
        
         TotalCount =TotalCount+r;
         Thread.sleep(1000);
         //System.out.println(TotalCount);
         c++;
         if(c==43) {
        	 
        	 long avg = TotalCount/43;
             System.out.println("Average Load Time= "+avg+".");
         }
         
    }
    
      
		/*WebDriver driver;
		WebDriverManager.chromedriver().setup();
		 driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(Home);*/
		
		}    
    
