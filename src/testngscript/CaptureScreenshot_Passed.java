package testngscript;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.google.common.io.Files;

public class CaptureScreenshot_Passed extends Commonfunctionclass {

	 @Test
	 public static void Google() throws IOException, InterruptedException {
		 
		  WebElement search=driver.findElement(By.name("q"));
		                    search.click();
		                    search.sendKeys("Selenium");
		                    search.click();
		                    
		                    driver.findElement(By.name("btnK")).click();
		                    
		                  Thread.sleep(3000);
		                  
		                  String expectedtitle=driver.getTitle();
		                  
		                  Reporter.log(expectedtitle,true);
		                  
		                  if(expectedtitle.equalsIgnoreCase("Selenium - Google Search")) {
		                	  
		                	  Reporter.log("expected title is matching with actual title",true);
		                	  
		                	  driver.findElement(By.xpath("//*[contains(@href,'https://www.selenium.dev/')]")).click();
		                	  
		                	  TakesScreenshot ts=(TakesScreenshot)driver;
		                	  
		                	  File source=ts.getScreenshotAs(OutputType.FILE);
		                	  
		                	  Files.copy(source,new File("D:\\selenium18\\SeleniumTraining\\screenshot\\selenium.png"));
		                	  
		                	  
		                	  
		                  }
		                  
		                  else {
		                	  
		                	  Reporter.log("expected title is not matching with actual title",true);
		                  }
		                  
		            
		 
	 }
}
