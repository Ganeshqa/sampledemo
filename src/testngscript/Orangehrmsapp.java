package testngscript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Orangehrmsapp {
	
	  static WebDriver driver;
	  
	  @BeforeMethod
	  public static void Launchbrowser() throws InterruptedException {
		  
		  	System.setProperty("webdriver.chrome.driver","chromedriver.exe");
	    	driver=new ChromeDriver();
	    	driver.get("http://orangehrm.qedgetech.com/symfony/web/index.php");
	    	driver.manage().window().maximize();
	    	driver.findElement(By.id("txtUsername")).sendKeys("Admin");
	    	driver.findElement(By.id("txtPassword")).sendKeys("Qedge123!@#");
	    	driver.findElement(By.id("btnLogin")).click();
	    	driver.navigate().to("http://orangehrm.qedgetech.com/symfony/web/index.php");
	    	  
	  }
	  
	  @Test(priority=0)
	  public static void Addbutton() throws InterruptedException {
		  
		     Thread.sleep(3000);
		     
		     String expectedurl="http://orangehrm.qedgetech.com/symfony/web/index.php/dashboard";
		     
		     String actualurl=driver.getCurrentUrl();
		     
		            if(expectedurl.equalsIgnoreCase(actualurl)) {
		            	
		            	driver.findElement(By.id("menu_admin_viewAdminModule")).click();
		            	driver.findElement(By.id("btnAdd")).click();
		            	Select role=new Select(driver.findElement(By.id("systemUser_userType")));
		            	role.selectByVisibleText("Admin");
		            	WebElement empname=driver.findElement(By.id("systemUser_employeeName_empName"));
		            	empname.sendKeys("Abhay P");
		            	empname.click();
		            	driver.findElement(By.id("systemUser_userName")).sendKeys("Abhay_pkumar");
		            	driver.findElement(By.id("systemUser_password")).sendKeys("AbhhayP@123");
		            	driver.findElement(By.id("systemUser_confirmPassword")).sendKeys("AbhhayP@123");
		                
		            	 Thread.sleep(3000);
			              
			              driver.findElement(By.name("btnSave")).click();
			              
			              Reporter.log("username created successfully",true);
	}
			          
			          else {
			        	  
			        	  Reporter.log("unable to create a username",true);
			          }
			          
		  }
		  @Test(priority=1)
		  public static void Searchbutton() throws InterruptedException {
			  
			   Thread.sleep(3000);
			  
			  driver.findElement(By.id("menu_admin_viewAdminModule")).click();
	    	  
	    	  Thread.sleep(3000);
	    	  
	    	  driver.findElement(By.name("searchSystemUser[userName]")).sendKeys("Abhay_pkumar");
	    	  
	    	  Thread.sleep(3000);
	    	  
	    	  driver.findElement(By.id("searchBtn")).click();
			  
		  }
		  @Test(priority=2)
		  public static void Resetbutton() throws InterruptedException {
			  
			  Searchbutton(); // calling the searchbutton method
			  
			  driver.findElement(By.id("resetBtn")).click();
		  }
		  @Test(priority=3)
		  public static void Deletebutton() throws InterruptedException {
			  
			  Searchbutton(); // calling the searchbutton method
			  
			  Thread.sleep(3000);
			  
			  WebElement checkbox=driver.findElement(By.id("ohrmList_chkSelectAll"));
			  
			         checkbox.click();
			         
			 WebElement deletebutton=driver.findElement(By.id("btnDelete"));
			         
			          if(checkbox.isSelected() && deletebutton.isEnabled()) {
			        	  
			        	  deletebutton.click();
			        	  
			        	  Thread.sleep(3000);
			        	  
			        	  driver.findElement(By.id("dialogDeleteBtn")).click();
			        	  
			        	  Reporter.log("username is deleted successfull",true);
			        	  
			        	  
			          }
			          
			          else {
			        	  
			        	  Reporter.log("unable to delete username",true);
			          }
		  }
		  
		  @AfterMethod
		  public static void Logout() throws InterruptedException {
			  
			  Thread.sleep(7000);
			  
			  driver.findElement(By.id("welcome")).click();
			  
			  Thread.sleep(3000);
			  
			  driver.findElement(By.xpath("//*[contains(@href,'/index.php/auth/logout')]")).click();
		  }
}

