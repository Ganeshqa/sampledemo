package testngscript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Rediffmailscript {

	 static WebDriver driver;
	
	 @BeforeTest
	 public static void firefox() {  // 1
	    	
	    	System.setProperty("webdriver.gecko.driver","geckodriver.exe");
	    	driver=new FirefoxDriver();
	    	driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
	    	driver.manage().window().maximize();
	    	
	 }
	 
	 @Test
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
	 
	 @AfterTest
	 public static void closebrowser() throws InterruptedException {  // 3
		 
		    Thread.sleep(5000);
		    
		    driver.quit();
	 }
}
