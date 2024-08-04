package testngscript;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Handling_calendartable extends Commonfunctionclass {

	@Test
	public static void calendartable() throws InterruptedException {
		
    	driver.findElement(By.id("txtUsername")).sendKeys("Admin");
    	driver.findElement(By.id("txtPassword")).sendKeys("Qedge123!@#");
    	driver.findElement(By.id("btnLogin")).click();
    	driver.navigate().to("http://orangehrm.qedgetech.com/symfony/web/index.php");
    	Thread.sleep(3000);
    	driver.findElement(By.id("menu_leave_viewLeaveModule")).click();
    	WebElement leavefrom=driver.findElement(By.id("calFromDate"));
    	leavefrom.click();
    	Select month1=new Select(driver.findElement(By.className("ui-datepicker-month")));
    	month1.selectByVisibleText("Jul");
    	Select year1=new Select(driver.findElement(By.className("ui-datepicker-year")));
    	year1.selectByValue("2025");
    	calendardate("15");
    	Thread.sleep(3000);
    	WebElement leaveto=driver.findElement(By.id("calToDate"));
    	leaveto.click();
    	Select month2=new Select(driver.findElement(By.className("ui-datepicker-month")));
    	month2.selectByVisibleText("Aug");
    	Select year2=new Select(driver.findElement(By.className("ui-datepicker-year")));
    	year2.selectByValue("2025");
    	Thread.sleep(3000);
    	calendardate("25");
    	
    	
    	
	}
	
	 // implementing the method for calendardate
	
	   public static void calendardate(String actualdate) {
		   
		    List<WebElement> calendardates= driver.findElements(By.xpath("//*[@class='ui-datepicker-calendar']/tbody//td"));
	   
		      for(int i=0;i<calendardates.size();i++) {
		    	  
		    	  String day=   calendardates.get(i).getText();   //1,23,-- 25
		      
		    	     if(day.equalsIgnoreCase(actualdate)) {
		    	    	 
		    	    	  calendardates.get(i).click();
		    	    	  
		    	    	  break;
		    	     }
		      }
	   }
	
	
}
