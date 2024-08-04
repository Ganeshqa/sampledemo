package testngscript;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Handling_windows extends Commonfunctionclass {

	 @Test
	 public static void windowhandle() throws InterruptedException {
		 
		     String parentwindow=driver.getWindowHandle();
	 
		     Reporter.log("the parent window id is="+parentwindow,true);
		     
		     Thread.sleep(3000);
		     
		     driver.findElement(By.xpath("//*[contains(@href,'https://www.naukri.com/remote-jobs?src=discovery_trendingWdgt_homepage_srch')]")).click();
		     
		     Thread.sleep(3000);
		     
		     driver.switchTo().window(parentwindow);
		     
		     driver.findElement(By.xpath("//*[contains(@href,'https://www.naukri.com/mnc-jobs?src=discovery_trendingWdgt_homepage_srch')]")).click();
		     
		     Thread.sleep(3000);
		     
		     
		     // count no windows open
		     
		        Set<String>windowhandles= driver.getWindowHandles();
		        
		        Reporter.log("no of window handling is="+windowhandles.size(),true);
		        
		            for(String childwindow:windowhandles) {
		            	
		            	    if(!(parentwindow).equalsIgnoreCase(childwindow)) {
		            	    	
		            	    	 driver.switchTo().window(childwindow);
		            	    	 
		            	    	 Reporter.log("title of child window is="+driver.getTitle(),true);
		            	    	 
		            	    	 Thread.sleep(3000);
		            	    	 
		            	    	 driver.close();
		            	    }
		            }
		            
		              driver.switchTo().window(parentwindow);
		              
		              Reporter.log("title of parentwindow is="+driver.getTitle(),true);
		              
		              Thread.sleep(3000);
		              
		              WebElement skill=driver.findElement(By.xpath("//*[@placeholder='Enter skills / designations / companies']"));
		              
		              skill.click();
		              skill.sendKeys("selenium");
		              skill.click();
		              
		              WebElement exp=driver.findElement(By.xpath("//*[@placeholder='Select experience']"));
		              exp.click();
		              
		              Thread.sleep(3000);
		              
		              driver.findElement(By.xpath("/html/body/div[1]/div[7]/div/div/div[3]/div/div/div/div/div/div/div[1]/ul/li[2]")).click();
		              
		              WebElement location=driver.findElement(By.xpath("//*[@placeholder='Enter location']"));
	 
		               location.click();
		               location.sendKeys("Hyderabad");
		               location.click();
		               
	 }
	 
}


/*
 * <!DOCTYPE suite SYSTEM "http://testng.org/testng-1.0.dtd" >
<suite name="TrainingTestSuite" annotations= "JDK" thread-count="2" parallel="tests">

 
 <test name="tesing the functionality orange hrms in chrome browser">
 
 <parameter name="Browsername" value="firefox"></parameter>
 <parameter name="url" value="https://www.naukri.com/"></parameter>
  
  <classes>

    
	 <class name="testngscript.Handling_windows"/> 
	 
     
  </classes>

</test>

*/
