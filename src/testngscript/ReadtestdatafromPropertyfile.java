package testngscript;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;
import java.util.Properties;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class ReadtestdatafromPropertyfile {

	   static WebDriver driver;
	
	@Test
	public static void Readtextfiledata() throws IOException, InterruptedException {
		
		  File f=new File("D:\\selenium18\\SeleniumTraining\\testdata.property");
		  FileInputStream fis=new FileInputStream(f);
		  Properties x=new Properties();
		  x.load(fis);
		  System.setProperty("webdriver.chrome.driver","Chromedriver.exe");
		  driver=new ChromeDriver();
		  driver.get(x.getProperty("appurl"));
		  driver.findElement(By.id("txtUsername")).sendKeys(x.getProperty("userid"));
	    	driver.findElement(By.id("txtPassword")).sendKeys(x.getProperty("password"));
	    	driver.findElement(By.id("btnLogin")).click();
	    	driver.navigate().to("http://orangehrm.qedgetech.com/symfony/web/index.php");
	    	driver.findElement(By.xpath("//*[contains(@href,'http://www.orangehrm.com')]")).click();
	    	Thread.sleep(3000);
	    	switchtotab(1);
	    	Reporter.log("title of 2nd tab is="+driver.getTitle(),true);
	    	Thread.sleep(5000);
	    	driver.findElement(By.cssSelector("div.d-flex:nth-child(3) > ul:nth-child(1) > li:nth-child(1) > a:nth-child(1) > button:nth-child(1)")).click();
	    	driver.findElement(By.name("FullName")).sendKeys(x.getProperty("fullname"));
	    	driver.findElement(By.name("Email")).sendKeys(x.getProperty("emailid"));
	    	driver.findElement(By.name("CompanyName")).sendKeys(x.getProperty("companyname"));
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
	
    public static void switchtotab(int index) {
    	
	     String window=null;
	
	     Set<String>tabs= driver.getWindowHandles();
	     
	     // Iterator class
	     
	       Iterator<String>obj=tabs.iterator();
	       
	       for(int i=0;i<=index;i++) {
	    	   
	    	   window= obj.next();
	       }
	       
	       driver.switchTo().window(window);
	       
	       
}
}
