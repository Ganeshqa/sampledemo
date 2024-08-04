package testngscript;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import com.google.common.io.Files;

public class CaptureScreenshot_Failed extends Commonfunctionclass {

	 @Test
	 public static void Google() throws IOException, InterruptedException {
		 
		  WebElement search=driver.findElement(By.name("q"));
		                    search.click();
		                    search.sendKeys("Selenium");
		                    search.click();
		                    
		                    driver.findElement(By.name("btnG")).click();
}
	 
	  @AfterMethod
	  public static void Screenshot(ITestResult result) {
		  
		    try {
		    	
		    	    if(ITestResult.FAILURE==result.getStatus()) {
		    	    	
		    	    	TakesScreenshot ts=(TakesScreenshot)driver;
	                	  
	                	  File source=ts.getScreenshotAs(OutputType.FILE);
	                	  
	                	  Files.copy(source,new File("D:\\selenium18\\SeleniumTraining\\screenshot\\Google.png"));
	                	  
		    	    }
		    }
		    catch(IOException e) {
		    	
		    	System.out.println(e.getMessage());
		    }
		    }
	  }

