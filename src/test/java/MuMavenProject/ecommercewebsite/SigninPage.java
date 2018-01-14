package MuMavenProject.ecommercewebsite;import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.openqa.selenium.WebElement;
 import org.openqa.selenium.support.FindBy; 
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.*;;

public class SigninPage {
	
	 WebDriver driver;
	 @FindBy(how=How.ID,using ="email")
	 public WebElement emailid;	
	 @FindBy(how=How.ID,using ="passwd")
	 public WebElement password;	
	 @FindBy(how=How.ID,using ="SubmitLogin")
	 public WebElement submitbutton;	 
	 @FindBy(how=How.XPATH,using=("//a[@title='Log in to your customer account']"))
     public WebElement Signinlink;
	 @FindBy(how=How.XPATH, using =("//*[@id='center_column']/div[1]/ol/li"))
	 public WebElement autentication;
	 
	
	 

    /* public SigninPage(WebDriver driver){
	        PageFactory.initElements(driver, this);
	}*/
	
	 public void LoginActionvaliduser( String actualemail,String actualpassword){
		
		Signinlink.click();
		emailid.sendKeys(actualemail);
		password.sendKeys(actualpassword);
		submitbutton.click();
		}
	 
	 public void LoginActioninvaliduser( String actualemail,String actualpassword){
			
			Signinlink.click();
			emailid.sendKeys(actualemail);
			password.sendKeys(actualpassword);
			submitbutton.click();
			}	 
		
     public String authenticationfailedtextcheck(){
	        return autentication.getText();
	        }

     public void alreadyregistereduser(String actualemail, String actualpassword){
    	 Signinlink.click();
    	 emailid.sendKeys(actualemail);
    	 password.sendKeys(actualpassword);
    	 submitbutton.click();
     }
}	
    


