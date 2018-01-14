package MuMavenProject.ecommercewebsite;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
//import com.google.common.base.Function;
//import com.google.common.base.Preconditions;

import TestBase.Baseclass;

import org.openqa.selenium.support.ui.FluentWait.*;

public class contactusPage{
	public static WebDriver driver ;
	 WebDriverWait wait;
	   
	 @FindBy(css = "page-heading")
	 private WebElement customerservicecontactusheading;
	 @FindBy(css= "page-subheading")
	 private  WebElement sendmessagesubheading;
	 @FindBy(id= "id_contact")
	 private static WebElement subjectheadingdropdown;
	 @FindBy(id= "email")
	 private WebElement emailaddress;
	 @FindBy(id= "submitMessage")
	 private WebElement sendbutton;
	 @FindBy(id= "message")
	 private WebElement messagetextarea;
	 @FindBy(xpath = "//*[@class='alert alert-success']")
	 private boolean successmessage;
	 @FindBy(xpath="//ul[@class='footer_links clearfix']/li/a[@class='btn btn-default button button-small']")
	 public WebElement homebutton;
	 
	 public void contactusPage(WebDriver driver){
		 this.driver = driver;
				PageFactory.initElements(driver,this);
				} 
	 
	 
	 public  void selectSubjectheading(String service){
		  Select dropdown = new Select((WebElement)subjectheadingdropdown);
		  List<WebElement> serviceList = dropdown.getOptions();
		  for( WebElement list :serviceList){
			  if(list.getText().trim().equalsIgnoreCase(service)){
				  dropdown.selectByVisibleText(list.getText());
			  }
		      }		    
	          }
	 
	 
	  public void enteremailid(String emailcontact){
		  emailaddress.sendKeys(emailcontact);
	  }
	  
	  public void sendMessagebutton(){
		  sendbutton.click();
	  }
	  
	  public void messageTextarea(String text){
		  messagetextarea.sendKeys(text);
	  }
	  
	  public boolean checksuccessMessage(){
		 return successmessage;
	      }	    

	  public  WebElement backhomeLink() { 		
				return homebutton;
			
		}
		    
     public void submitServiceRequest( String emailcontact,String text) {		    
		//selectSubjectheading();
		enteremailid(emailcontact);
		messageTextarea(text);
		sendMessagebutton();
		checksuccessMessage();  		  
	  }	  
   	  } 		
	
	

	



