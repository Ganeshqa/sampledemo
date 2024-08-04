package testngscript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Googleapp extends Commonfunctionclass {
	


	 @Test(priority=0)
	 public static void Google() {
		 
		 WebElement search=driver.findElement(By.name("q"));
		                   search.click();
		                   search.sendKeys("Selenium");
		                   search.click();
		                   
		   driver.findElement(By.name("btnK")).click();
		   
	 }
	 
	 @Test(priority=1)
	 public static void verifypagetitle() throws InterruptedException {
		 
		   String expectedtitle="Selenium - Google Search";
		   Thread.sleep(3000);
		   String actualtitle=driver.getTitle();
		   Reporter.log("title of web page is="+actualtitle);
		   
		       if(actualtitle.equalsIgnoreCase(expectedtitle)) {
		    	   
		    	     Reporter.log("expected title is matching with actual title",true);
                      
		    	               Thread.sleep(3000);
		    	               
		    	               driver.findElement(By.xpath("//*[contains(@href,'https://www.selenium.dev/')]")).click();
		       }
		       
		       else {
		    	   
		    	   Reporter.log("expected title is not matching with actual title",true);
		       }
	 }
}

/*
<!DOCTYPE suite SYSTEM "http://testng.org/testng-1.0.dtd" >
<suite name="TrainingTestSuite" annotations= "JDK" thread-count="2" parallel="tests">

 
 <test name="tesing the functionality orange hrms in chrome browser">
 
 <parameter name="Browsername" value="chrome"></parameter>
 <parameter name="url" value="https:www.google.com"></parameter>
  
  <classes>

    
	 <class name="testngscript.Googleapp"/> 
	 
     
  </classes>

</test>


 <test name="tesing the functionality orange hrms in firefox browser">
 
 <parameter name="Browsername" value="firefox"></parameter>
 <parameter name="url" value="https:www.google.com"></parameter>
  
  <classes>

    
	 <class name="testngscript.Googleapp"/> 
	 
     
  </classes>

</test>

 
</suite>

*/