package testngscript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Testng_priority {

	 static WebDriver driver;
		
	 @Test(priority=2)
	 public static void firefox() {  // 1
	    	
	    	System.setProperty("webdriver.gecko.driver","geckodriver.exe");
	    	driver=new FirefoxDriver();
	    	driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
	    	driver.manage().window().maximize();
	    	Reporter.log("successfully launching firefox browser",true);
	    	
	 }
	 
	 @Test(priority=3)
	 public static void dropdown() throws InterruptedException {  // 2
		 
		 driver.findElement(By.linkText("Create a new account")).click();
		 Thread.sleep(3000);
		 
		 Select day=new Select(driver.findElement(By.xpath("//*[starts-with(@name,'DOB_Day')]")));
		 
		     day.selectByValue("04");
		     
		 Select month=new Select(driver.findElement(By.xpath("//*[starts-with(@name,'DOB_Month')]")));
		 
		     month.selectByVisibleText("FEB");
		     
		 Select year=new Select(driver.findElement(By.xpath("//*[starts-with(@name,'DOB_Year')]")));
		 
		      year.selectByValue("1998");
		 		
		 
	 }
	 
	 @Test(priority=4)
	 public static void closebrowser() throws InterruptedException {  // 3
		 
		    Thread.sleep(5000);
		    
		    driver.quit();
		    
		    Reporter.log("successfully close the browser");
	 }
	 
	 @Test(priority=1)
	 public static void Test1() { // 2
		 
		  Assert.assertEquals(12,12);
		  
		  Reporter.log("expected value is matching with actual value",true);
}
	 
	 @Test(priority=0)
	 public static void Test2() {   // 1
		 
		 Assert.assertEquals("Hello world", "Hello");
		 
		 Reporter.log("expected value is not matching with actual value",true);
	 }
}
