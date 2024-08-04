package testngscript;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

public class Commonfunctionclass {

	static WebDriver driver;
	  
	  @BeforeClass
	  @Parameters({"Browsername","url"})
	  public static void Launchbrowser(String Browsername,String url) {
		  
		     if(Browsername.equalsIgnoreCase("Firefox")) {
		    	 
		     	System.setProperty("webdriver.gecko.driver","geckodriver.exe");
		    	driver=new FirefoxDriver();
		    	driver.manage().window().maximize();
		     }
		     
		     else if(Browsername.equalsIgnoreCase("chrome")) {
		    	 
		     	System.setProperty("webdriver.chrome.driver","Chromedriver.exe");
		    	driver=new ChromeDriver();
		    	driver.manage().window().maximize();
		     }
		     
		     else if(Browsername.equalsIgnoreCase("Edge")) {
		    	 
		    	  	System.setProperty("webdriver.edge.driver","msedgedriver.exe");
			    	driver=new EdgeDriver();
			    	driver.manage().window().maximize();
		     }
		     
		     else if(Browsername.equalsIgnoreCase("IE")) {
		    	 
		    	  	System.setProperty("webdriver.ie.driver","IEDriverServer.exe");
			    	driver=new InternetExplorerDriver();
			    	driver.manage().window().maximize();
		     }
		     
		     else {
		    	 
		      	System.setProperty("webdriver.chrome.driver","Chromedriver.exe");
		    	driver=new ChromeDriver();
		    	driver.manage().window().maximize();
		     }
		       
		        driver.get(url);
		        
	  }
	  
	  // implementing the method for IsAlertPresent()
	  
	      public static boolean IsAlertPresent() {
	    	  
	    	  		
	    			try {
	    				driver.switchTo().alert();
	    				return true;
	    				
	    			} catch (NoAlertPresentException e) {
	    				return false;
	    			}
	    		}

	      public static boolean isTextPresent(String textToVerify) {	
	  		
	  		String bodyText;
	  		
	  		bodyText = driver.findElement(By.tagName("body")).getText(); 
	  		
	  		if (bodyText.contains(textToVerify)) {
	  			return true;
	  		} else {
	  			return false;
	  		}
	  	}
	    	     
	      

    /*  @AfterClass
	  public static void closebrowser() throws InterruptedException {
		  
		    Thread.sleep(5000);
		    
		    driver.quit();
	  }*/

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

