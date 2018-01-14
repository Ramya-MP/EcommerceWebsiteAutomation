package MuMavenProject.ecommercewebsite;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;

import TestBase.Baseclass;

public class homePage extends Baseclass {
     WebDriver driver;
     @FindBy(how=How.XPATH,using=("//a[@title='Log in to your customer account']"))
     public WebElement Signinlink;
     @FindBy(how=How.XPATH,using=("//a[@title='Contact Us']"))
     public WebElement contactuslink;   
     @FindBy(how=How.ID,using=("search_query_top"))
     public WebElement search; 
     @FindBy(how=How.NAME,using=("submit_search"))
     public WebElement searchbutton; 
     
     
     
     public  void signinLink(){
    	 Signinlink.click();
     }
     
     public void contactusLink(){
    	 contactuslink.click();
     }
     
     public void searchbox(String searchtext){
    	 search.sendKeys(searchtext);
    	 
   	 }
     public void submitSearch(){
    	searchbutton.click();
    	 
   	 }
     
     
     
}
