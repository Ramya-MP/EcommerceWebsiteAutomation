package MuMavenProject.ecommercewebsite.TestCases;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import MuMavenProject.ecommercewebsite.contactusPage;
import MuMavenProject.ecommercewebsite.homePage;
import TestBase.Baseclass;


public class TC01_ContactUs_MessageSubmission extends Baseclass {
	contactusPage contactus;
	homePage homepageobj;
	
	

	  @BeforeTest	  
	  public void setup(){	    	 
		  init();		  
		  contactus = PageFactory.initElements(driver, contactusPage.class);
		  homepageobj = PageFactory.initElements(driver, homePage.class);
	  }
	  
	  @Test(priority =1)
      public void serviceMessagesubmission(){
		    
		    homepageobj.contactusLink();	  
	        String list = "Customer Service";
		    contactus.selectSubjectheading(list );   
		    contactus.submitServiceRequest( "eami@gmail.com","tencbtbbbb"); 
		    boolean message =contactus.checksuccessMessage();			  
			  if(message){
			  Assert.assertTrue(true,"message send to customer service");
			  }
			  else{
				  Assert.assertFalse(false,"message not send");
			  }
		    WebDriverWait wait = new WebDriverWait( driver, 60);				
			WebElement elem=  wait.until(ExpectedConditions.elementToBeClickable(contactus.backhomeLink()));
		    elem.click();
}
}
