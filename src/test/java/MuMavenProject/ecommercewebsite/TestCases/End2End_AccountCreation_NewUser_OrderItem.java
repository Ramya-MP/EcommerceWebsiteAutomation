package MuMavenProject.ecommercewebsite.TestCases;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import MuMavenProject.ecommercewebsite.SigninPage;
import MuMavenProject.ecommercewebsite.contactusPage;
import MuMavenProject.ecommercewebsite.createAccountPage;
import MuMavenProject.ecommercewebsite.productaddtocart;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import TestBase.Baseclass;

public class End2End_AccountCreation_NewUser_OrderItem extends Baseclass{

	 
	//String invalidemailid ="dfgrjj";
	String firstname ="ramya";
	String lastname ="manikkoth";
	String password ="remya123";
	String daysel = "5";
	String monthsel ="February";
	String yearsel = "2017";
	String name ="vidyatech";
	String address1="ygfgh" ;
	String address2="hhujhh";
	String city="redmond";
	String stateidsel="WA";
	String email= System.currentTimeMillis() +"@gmail.com";
	String countrysel ="UNITED STATES OF AMERICA";
	String code="98064";
	String phone="99999999";
	String text="hjbhhjhjhjhjhj";
	String phonemob="9876567677";
	String aliasaddress="bhhghjgh";
	String genderopt = "1";
	int st;
	int vert;
	
	SigninPage singpage;
	createAccountPage crtacc;
	productaddtocart addtocart;
	contactusPage contactus;
	
		

  @BeforeTest
  
  public void setup(){
    	 
	  init();
	  singpage = PageFactory.initElements(driver, SigninPage.class);
	  crtacc =   PageFactory.initElements(driver, createAccountPage.class);
	  addtocart =PageFactory.initElements(driver, productaddtocart.class);
	  contactus = PageFactory.initElements(driver, contactusPage.class);
  }
  
	  
        @Test(priority =1)        
        public void launchApplication() throws InterruptedException{	
        	log.info("Launched the application");
	        Assert.assertEquals("My Store",driver.getTitle() );        
	        }
            
	   
        @Test(priority =2)
	   public void signin()  { 
	          
              singpage.LoginActioninvaliduser("email@gmail.com", "actualpassword");
              log.info("Signedin with invalid username");
              Assert.assertEquals( singpage.authenticationfailedtextcheck(),"Authentication failed.");
	   }
        
        
        @Test(priority =3)
	   public void createaccount() throws InterruptedException{             
               
			   crtacc.invalidemail();
			   log.info("Verified invaild email error message");
               crtacc.createAccount(email);
               log.info("Created new account");
	           crtacc.registration(genderopt,firstname,lastname,password,daysel,monthsel,yearsel,name,address1,address2,city,stateidsel,countrysel,code,phone,text,phonemob,aliasaddress);
	           Assert.assertEquals( "My account - My Store",driver.getTitle());
	   }
        
        
        @Test(priority =4)
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
	   
	
	
  
          @AfterTest
          public void closeBrowser(){
	      driver.close();


}
          }
  

			