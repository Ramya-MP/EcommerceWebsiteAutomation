package TestBase;

import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import customListener.Listener;



public class Baseclass {
	public static final Logger log = Logger.getLogger(Baseclass.class.getName());

	
	public static WebDriver driver;
	String url ="http://automationpractice.com/";
	String Browser ="Firefox";
	Listener lis;
		
	public  void init(){
		String log4jConfPath = "log4j.properties";
		PropertyConfigurator.configure(log4jConfPath);
		selectBrowser(Browser);
		//lis = new Listener(driver);
		geturl(url);
		
		
		
		
	}
	public void selectBrowser(String Browser){
		 System.setProperty("webdriver.gecko.driver","C:\\Users\\v-bipach\\Desktop\\SELENIUM\\geckodriver-v0.19.1-win64\\geckodriver.exe");
		 driver = new FirefoxDriver();
	}

	
	public void geturl(String url){
		driver.get(url);
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(30,TimeUnit.SECONDS);
		
	}
	
	public void scrolldown(int i){
		 try {
			
		JavascriptExecutor jse = (JavascriptExecutor)driver ;
			 jse.executeScript("window.scrollTo(0,"+i+")");		
					 
					 			 
					
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		 
	
	    }

}

