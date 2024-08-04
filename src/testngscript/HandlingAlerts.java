package testngscript;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class HandlingAlerts extends Commonfunctionclass {

	 @Test
	 public static void AlertMethod() throws InterruptedException {
		 
		 driver.findElement(By.linkText("Create a new account")).click();
		 Thread.sleep(3000);
		 driver.findElement(By.xpath("//*[starts-with(@name,'name')]")).sendKeys("Samuel");
		 driver.findElement(By.xpath("//*[starts-with(@name,'login')]")).sendKeys("Samuel.qa1");
		 driver.findElement(By.id("newpasswd")).sendKeys("Samuel@12345");
		 driver.findElement(By.id("Register")).click();
		 Thread.sleep(3000);
		 
		    if(IsAlertPresent()) {
		    	
		    	Reporter.log("Alert is present in an application",true);
		    	
		    	Alert obj=driver.switchTo().alert();
		    	String alertmessage= obj.getText();
		        System.out.println(alertmessage);
		           Thread.sleep(2000);
		           obj.accept();
		            
		    }
		    
		    else {
		    	
		    	Reporter.log("No such Alert is present in an application",true);
		    }
		    
		    driver.findElement(By.id("newpasswd1")).sendKeys("Samuel@12345");
		    driver.findElement(By.xpath("//*[starts-with(@name,'altemail')]")).sendKeys("ganesh.qa1@gmail.com");
		    
	 }
}
