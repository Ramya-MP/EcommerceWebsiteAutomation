package MuMavenProject.ecommercewebsite.TestCases;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import MuMavenProject.ecommercewebsite.SigninPage;
import MuMavenProject.ecommercewebsite.createAccountPage;
import MuMavenProject.ecommercewebsite.productaddtocart;
import TestBase.Baseclass;

public class End2End_RegisteredUser_orderItem extends Baseclass {
	SigninPage singpage;
	productaddtocart addtocart;
	createAccountPage crtacc;
	
	/*@DataProvider (name="Authentication")
	public static Object[] credentials(){
		return new Object[]{"testuser@gmail.com","testuserpassword"};
		
	}*/
	
	@BeforeTest	  
	  public void setup(){	    	 
		  init();
		  singpage = PageFactory.initElements(driver, SigninPage.class);
		  addtocart =PageFactory.initElements(driver, productaddtocart.class);
		  
	  }
	@Test(priority =1)
	@Parameters({"actualemail","actualpassword"})	
	  public void registereduserlogin(String actualemail, String actualpassword){		  
		singpage.alreadyregistereduser(actualemail, actualpassword);
	  }
	
	 
      
      
      @Test(priority =2)
	   public void itemshopping() throws InterruptedException{
	      
	           addtocart.selectproduct();   
	           scrolldown(900);	 	   
	           addtocart. checkoutpage();	   
	           scrolldown(900);		 
	           addtocart.finalcheckout();
	           scrolldown(900);	 
	           addtocart.proceedshipping();
	           addtocart.paymentmethod();
	           addtocart.confirmorder();
	     
             }
	
	}
	
	
	


