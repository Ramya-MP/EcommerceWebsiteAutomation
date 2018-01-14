package MuMavenProject.ecommercewebsite;

import java.util.List;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import junit.framework.Assert;

public class createAccountPage {
	WebDriver driver;
	 @FindBy(how=How.ID,using="email_create")
	 public  WebElement createaccount;	 
	 @FindBy(how=How.ID,using="SubmitCreate")
	 public WebElement submitemail;
	 @FindBy(name="id_gender")
	 public List<WebElement> gender;    
	 @FindBy(how=How.ID,using="customer_firstname")
     public WebElement firstname;
	 @FindBy(how=How.ID,using="customer_lastname")
     public WebElement lastname;
	 @FindBy(how=How.ID,using="passwd")
     public WebElement password;
	 @FindBy(how=How.XPATH,using="//*[@id='days']")
     public WebElement selectday;
	 @FindBy(how=How.XPATH,using="//*[@id='months']")
     public WebElement selectmonth;
	 @FindBy(how=How.XPATH,using="//*[@id='years']")
     public WebElement selectyear;
	 @FindBy(how=How.ID,using="newsletter")
     public WebElement newsletterchkbox;
	 @FindBy(how=How.ID,using="company")
     public WebElement companytxtbox;
	 @FindBy(how=How.ID,using="address1")
     public WebElement address1txtbox;
	 @FindBy(how=How.ID,using="address2")
     public WebElement address2txtbox;
	 @FindBy(how=How.ID,using="city")
     public WebElement citytxtbox;
	 @FindBy(how=How.ID,using="id_state")
     public WebElement statedropdown;
	 @FindBy(how=How.ID,using="postcode")
     public WebElement zipcodetxtbox;
	 @FindBy(how=How.ID,using="id_country")
     public WebElement countrydropdown;
	 @FindBy(how=How.ID,using="other")
     public WebElement additionalinfotextbox;
	 @FindBy(how=How.ID,using="phone")
     public WebElement phonetextbox;
	 @FindBy(how=How.ID,using="phone_mobile")
     public WebElement mobphonetextbox;
	 @FindBy(how=How.ID,using="alias")
     public WebElement alliastext;
	 @FindBy(how=How.ID,using="submitAccount")
     public WebElement registerbutton;
	 @FindBy(how=How.XPATH,using ="//div[@id='create_account_error']/ol/li[1]")
     public WebElement invalidemailidmessage;
	 
	 
	 
	   /* public createAccountPage(WebDriver driver){
			PageFactory.initElements(driver, this);
			}*/
	 
	    public void invalidemail(){		
		    createaccount.sendKeys("invalidemailid");
		    submitemail.click();
		    String errormessage = invalidemailidmessage.getText();
	    	Assert.assertEquals("Invalid email address.", errormessage);
	    }
	    
	 	
	    public void createAccount(String email){
		    createaccount.sendKeys(email);
		    submitemail.click();
	}	    	   
	   
	
	    public  void radioIdGenderString(String genderValue) {
			
			for (WebElement genderopt : gender) {
				if (genderopt.getAttribute("value".toString()).equals(genderValue)) {
					genderopt.click();
				}
			    }
	}
	  

	
	    public void firstnametextbox(String firstname){
		    this.firstname.sendKeys(firstname);
		
	}
	    public void lastnametextbox(String lastname)	{
		    this.lastname.sendKeys(lastname);
		
	}
		public void passwoordtextbox(String password){
		    this.password.sendKeys(password);
			
		
	}
		public void daysselection(String days) {						
		    Select dropdown = new Select((WebElement)selectday);
		    List <WebElement> dayList= dropdown.getOptions();
		      for(WebElement daysel : dayList){
		    	if (daysel.getText().trim().equalsIgnoreCase(days.toString())){
		               dropdown.selectByVisibleText(daysel.getText());
		    	
		           }		       
	               }
	}
		public void monthselection(String month) {						
		    Select dropdown = new Select((WebElement)this.selectmonth);		
		    List<WebElement> monthlist =dropdown.getOptions();
		    for (WebElement monthsel : monthlist){
		    	if(monthsel.getText().trim().equalsIgnoreCase(month.toString())){
		    		dropdown.selectByVisibleText(monthsel.getText());
		    	}
		        }
   }
		    
	    public void yearselection(String year) {						
			    Select dropdown = new Select((WebElement)this.selectyear);		
			   List<WebElement> yearList = dropdown.getOptions();
			   for(WebElement yearsel:yearList){
				   if(yearsel.getText().trim().equalsIgnoreCase(year.toString())){
					   dropdown.selectByVisibleText(yearsel.getText());
			   }
			   }		  
     }
	    
	    public void signup(){
	    	newsletterchkbox.click();
	    	
    }
	    public void companyname(String name){
	    	companytxtbox.sendKeys(name);
    }
	    
	    public void address1(String address){
	    	address1txtbox.sendKeys(address);
    }
	    public void address2(String address){
	    	address2txtbox.sendKeys(address);
    }
	    public void city(String city){
	    	citytxtbox.sendKeys(city);
	}
	    public void state(String stateid){
	    	Select dropdown = new Select((WebElement)this.statedropdown);
	    	
		    List<WebElement> stateList =dropdown.getOptions();
		    for(WebElement statesel:stateList){
		    	if(statesel.getText().trim().equalsIgnoreCase(stateid.toString())){
		    	dropdown.selectByVisibleText(statesel.getText());
		    		
		    }
		    }
	 	    	
    }
	    
	    public void zipcode(String code){
	    	zipcodetxtbox.sendKeys(code);
    }
	    public void country(String countrys){
	    	Select dropdown = new Select((WebElement)this.countrydropdown);		
		    List<WebElement> countryList=dropdown.getOptions();
		    for(WebElement countrysel: countryList){
			   if(countrysel.getText().trim().equalsIgnoreCase(countrys.toString())){
				   dropdown.selectByVisibleText(countrysel.getText());
			   }
		       }
    }
	    
	    public void additionalinfo(String text){
	    	additionalinfotextbox.sendKeys(text);;
	    }
	    
	    public void homephonetext(String phone){
	    	phonetextbox.sendKeys(phone);
	    }
	    public void mobphonetext(String phonemob){
	    	mobphonetextbox.sendKeys(phonemob);
	    }
	    public void alias(String aliasaddress){
	    	alliastext.sendKeys(aliasaddress);
	    }
	    public void submit(){
	    	registerbutton.click();
	    }
	    
	    

	public void registration(String genderopt,String firstname, String lastname, String password, String daysel,String monthsel,String yearsel,String name,String address1, String  address2,String city,String stateidsel,String countrysel,String code,String phone,String text,String phonemob,String aliasaddress){
		radioIdGenderString(genderopt);
	    firstnametextbox(firstname);
	    lastnametextbox(lastname);
	    passwoordtextbox(password);
	    daysselection(daysel);
        monthselection(monthsel);
	    yearselection(yearsel);
	    companyname(name);
	    address1(address1);
	    address2(address2);
	    city(city);
	    state(stateidsel);
	    country(countrysel);
	    additionalinfo(text);
	    homephonetext(phone);
	    mobphonetext(phonemob);
	    alias(aliasaddress);
	    zipcode(code);
	    submit();
	    
	    
	    
	    
	    
		
		
	}
}


