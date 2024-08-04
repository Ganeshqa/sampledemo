package webdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Commonfunctionclass {
	
	  static WebDriver driver;
	  
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

}
