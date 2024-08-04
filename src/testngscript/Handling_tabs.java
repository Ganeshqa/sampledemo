package testngscript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Handling_tabs extends Commonfunctionclass {
	

	  
       @Test 
	  public static void Tabs() throws InterruptedException {
		  
		 
	    	driver.findElement(By.id("txtUsername")).sendKeys("Admin");
	    	driver.findElement(By.id("txtPassword")).sendKeys("Qedge123!@#");
	    	driver.findElement(By.id("btnLogin")).click();
	    	driver.navigate().to("http://orangehrm.qedgetech.com/symfony/web/index.php");
	    	driver.findElement(By.xpath("//*[contains(@href,'http://www.orangehrm.com')]")).click();
	    	Thread.sleep(3000);
	    	switchtotab(1);
	    	Reporter.log("title of 2nd tab is="+driver.getTitle(),true);
	    	Thread.sleep(5000);
	    	driver.findElement(By.cssSelector("div.d-flex:nth-child(3) > ul:nth-child(1) > li:nth-child(1) > a:nth-child(1) > button:nth-child(1)")).click();
	    	driver.findElement(By.name("FullName")).sendKeys("Samuel John");
	    	driver.findElement(By.name("Email")).sendKeys("samuel@abc.com");
	    	driver.findElement(By.name("CompanyName")).sendKeys("ABC Technologies");
	    	Thread.sleep(3000);
	    	switchtotab(0);
	    	Reporter.log("title of 1st tab is="+driver.getTitle(),true);
	    	driver.findElement(By.id("menu_pim_viewPimModule")).click();
	    	driver.findElement(By.id("btnAdd")).click();
	      	Thread.sleep(3000);
	    	driver.findElement(By.id("firstName")).sendKeys("Samuel");
	    	driver.findElement(By.id("lastName")).sendKeys("John");
	    	driver.findElement(By.id("btnSave")).click();
	    	Thread.sleep(3000);
	    	switchtotab(1);
	    	Reporter.log("title of 2nd tab is="+driver.getTitle(),true);
	     	Thread.sleep(3000);
	    	switchtotab(0);
	    	Reporter.log("title of 1st tab is="+driver.getTitle(),true);
	    	
	    	
	    	
	    	

}
}
