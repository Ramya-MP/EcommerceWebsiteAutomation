package MuMavenProject.ecommercewebsite;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import TestBase.Baseclass;

public class productaddtocart extends Baseclass  {
  public WebDriver driver ;
  
  
   
  
  
	@FindBy(how=How.LINK_TEXT,using="Women")	
	 public WebElement women;
	
	@FindBy(how=How.XPATH,using="//span[@class='grower CLOSE']")	
	 public  WebElement topss;
	
	@FindBy(how=How.LINK_TEXT,using="Tops")
	 public  WebElement Tops;
	
	@FindBy(how=How.ID,using="T-shirts")
	 public  WebElement Tshirts;
	
	@FindBy(how=How.XPATH,using="//label[@id='layered_id_attribute']/span[1]")
	 public  WebElement smallcheckbox;
	
	@FindBy(how=How.LINK_TEXT,using="Add to cart")
	 public  WebElement addtocartbtn;
	
	@FindBy(how=How.XPATH,using="//*[@id='layer_cart']/div[1]/div[2]/div[4]/a/span")
	public  WebElement checkout;
	
	@FindBy(how=How.XPATH,using="//a[@class='button btn btn-default standard-checkout button-medium']/span")
	public  WebElement checkingout;
	
	@FindBy(how=How.ID_OR_NAME,using ="processAddress")
	public  WebElement  checkoutsubmit;
	
	@FindBy(how=How.ID_OR_NAME,using ="processCarrier")
	public  WebElement  checkoutshipping;
	
	@FindBy(how=How.CSS ,using ="#uniform-cgv")
	public  WebElement  termscheckbox;
	
	@FindBy(how=How.CSS ,using ="a.bankwire")
	public  WebElement  paymentselection;
	@FindBy(how=How.CSS ,using ="button.button-medium")
	public  WebElement  confirmorder;
	
    
    //WebElement menuElement = driver.findElement(By.linkText("Women"));
    	
	 public productaddtocart(WebDriver driver){
	 this.driver = driver;
			PageFactory.initElements(driver,this);
			} 
	 
	 

      public void selectwomen(){ 
    	  women.click();    	 
    	  Assert.assertTrue( women.isDisplayed(),"Women tab displayed");
      }
     
     public void smallcheckbox(){
         smallcheckbox.click();

        }    
 
     
     public void selectfirstitem() {
 		Actions obj = new Actions(driver);
 		obj.moveToElement(driver.findElements(By.xpath(".//*[@id='center_column']/ul/li")).get(0)).build().perform();
 		driver.findElement(By.xpath(".//*[@id='center_column']/ul/li[1]/div/div[2]/div[2]/a[1]/span")).click();
 		
     }
     
     
     public void proccedtocheckout(){
    	 checkout.click();
     }
    	 
    	 public void checkoutpage(){
    		 checkingout.click();
    		 
    	 }
    	 
    	 public void finalcheckout(){
    		 checkoutsubmit.click();
    		 
    	 }
    	 public void proceedshipping(){
    		 termscheckbox.click();
    		 checkoutshipping.click();
    	 }
    	 
    	 
    	public void paymentmethod(){
    		paymentselection.click();
    	}
    	public void confirmorder(){
    		confirmorder.click();
    	}
       
		
	
	public void selectproduct() throws InterruptedException{
    	
    	 selectwomen();
    	 scrolldown(800);
    	 selectfirstitem();
    	 Thread.sleep(1000);
    	 proccedtocheckout();
    	 
    	
    	 
    	 
     }
}
