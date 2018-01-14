package customListener;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Set;


import org.apache.commons.collections4.FactoryUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.IClass;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestNGMethod;
import org.testng.ITestResult;
import org.testng.Reporter;

import com.google.common.io.Files;

import TestBase.Baseclass;

public class Listener extends Baseclass implements ITestListener{
	/*WebDriver driver;
	
	public Listener(WebDriver driver){
		
		this.driver =driver;
	}
	*/
	

	
	

	public void onTestFailure(ITestResult result) {
		Calendar calendar = Calendar.getInstance();
		SimpleDateFormat formater = new SimpleDateFormat("dd_MM_yyyy_hh_mm_ss");
		String methodname = result.getName();
		
        if(!result.isSuccess()){
		File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

		String reportDirectory = new File(System.getProperty("user.dir")).getAbsolutePath() + "\\src\\main\\java\\screenshotfolder\\";
		File destFile = new File((String) reportDirectory +"\\failure_screenshots"+ methodname + "_" + formater.format(calendar.getTime()) + ".png");
		try {
			Files.copy(scrFile, destFile);
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		/*// This will help us to link the screen shot in testNG report
		Reporter.log(" <img src='" + destFile.getAbsolutePath() + "'  alt=image\"\" + height='100' width='100'/> ");		
		}*/
		String filePath = scrFile.toString();
		String path = "<img src=\"file://"+filePath+" alt=image\"\"" + "height='100' width='100'/>";
		Reporter.log(path);
        }
	}
		
	


	public void onTestStart(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	public void onTestSuccess(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		
	}

	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
		
	}

	


	
	
	
}
